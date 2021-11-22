package com.takim4.bagisProject.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takim4.bagisProject.business.abstarcts.GrantorTypesService;
import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.ErrorResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.core.utilities.results.SuccessDataResult;
import com.takim4.bagisProject.core.utilities.results.SuccessResult;
import com.takim4.bagisProject.dataAccess.abstracts.GrantorTypesDao;
import com.takim4.bagisProject.entities.concretes.GrantorTypes;

@Service
public class GrantorTypesManager implements GrantorTypesService {
private GrantorTypesDao grantorTypesDao;
	
	@Autowired
	 public GrantorTypesManager(GrantorTypesDao grantorTypesDao) {
		super();
		this.grantorTypesDao=grantorTypesDao;
	}
	
	@Override
	public DataResult<List<GrantorTypes>>  getAll() {
	
		return new SuccessDataResult<List<GrantorTypes>>
		(this.grantorTypesDao.findAll(),"grantorTypes listed");
		
	}

	@Override
	public Result add(GrantorTypes grantorTypes) {
		this.grantorTypesDao.save(grantorTypes);
		return new SuccessResult("grantorTypes added");
	}
	
	@Override
	public Result delete(GrantorTypes grantorTypes ) {
		this.grantorTypesDao.deleteById(grantorTypes.getGrantorTypesId());
		return new SuccessResult("grantorTypes deleted successfully.");
	}

	@Override
	public Result update(GrantorTypes grantorTypes) {
		Optional<GrantorTypes> getgrantortype= grantorTypesDao.findById(grantorTypes.getGrantorTypesId());
		  if(!getgrantortype.isPresent()) {
		         return new ErrorResult("User id not found");
		    	
		    }
	    this.grantorTypesDao.save(grantorTypes);
	    
		return new SuccessResult("grantorTypes updated");
	}

	@Override
	public DataResult<GrantorTypes> getById(int id) {
	
		return new SuccessDataResult<GrantorTypes>(this.grantorTypesDao.getById(id));
	}

}
