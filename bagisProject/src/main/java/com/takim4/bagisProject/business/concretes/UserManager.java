package com.takim4.bagisProject.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takim4.bagisProject.business.abstarcts.UserService;
import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.ErrorResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.core.utilities.results.SuccessDataResult;
import com.takim4.bagisProject.core.utilities.results.SuccessResult;
import com.takim4.bagisProject.dataAccess.abstracts.UserDao;
import com.takim4.bagisProject.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(), "Users in the system are listed ✓");
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.getByEmail(email), "Email found");
	}

	@Override
	public DataResult<User> getById(int id) {
		return new SuccessDataResult<User>(this.userDao.getById(id));
	}

	@Override
	public Result add(User user) {
		
		this.userDao.save(user);
		return new SuccessResult("The User has been added to the system ✓");
		
	}

	@Override
	public Result update(User user) {
		Optional<User> getUser = userDao.findById(user.getId());
		  if(!getUser.isPresent()) {
		         return new ErrorResult("User id not found");
		    	
		    }
	    this.userDao.save(user);
	    
		return new SuccessResult("User information updated");
	}

	@Override
	public Result delete(User user) {
		this.userDao.deleteById(user.getId());
		return new SuccessResult("User deleted successfully");
	}
	}


