package com.takim4.bagisProject.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takim4.bagisProject.business.abstarcts.GrantorService;
import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.ErrorResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.core.utilities.results.SuccessDataResult;
import com.takim4.bagisProject.core.utilities.results.SuccessResult;
import com.takim4.bagisProject.dataAccess.abstracts.GrantorDao;
import com.takim4.bagisProject.entities.concretes.Grantor;

 @Service
public class GrantorManager implements GrantorService {
private GrantorDao grantorDao;
	
	@Autowired
	 public GrantorManager(GrantorDao grantorDao) {
		super();
		this.grantorDao=grantorDao;
	}
	
	@Override
	public DataResult<List<Grantor>>  getAll() {
	
		return new SuccessDataResult<List<Grantor>>
		(this.grantorDao.findAll(),"grantor listed");
		
	}

	@Override
	public Result add(Grantor grantor) {
		this.grantorDao.save(grantor);
		return new SuccessResult("grantor added");
	}
	
	@Override
	public Result delete(Grantor grantor) {
		this.grantorDao.deleteById(grantor.getGrantorId());
		return new SuccessResult("grantor deleted successfully.");
	}

	@Override
	public Result update(Grantor grantor) {
		Optional<Grantor> getGrantor = grantorDao.findById(grantor.getGrantorId());
		  if(!getGrantor.isPresent()) {
		         return new ErrorResult("User id not found");
		    	
		    }
	    this.grantorDao.save(grantor);
	    
		return new SuccessResult("grantor updated");
	}

	@Override
	public DataResult<Grantor> getById(int id) {
	
		return new SuccessDataResult<Grantor>(this.grantorDao.getById(id));
	}
}
