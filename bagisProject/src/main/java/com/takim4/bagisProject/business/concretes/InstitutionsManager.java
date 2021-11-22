package com.takim4.bagisProject.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takim4.bagisProject.business.abstarcts.InstitutionsService;
import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.ErrorResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.core.utilities.results.SuccessDataResult;
import com.takim4.bagisProject.core.utilities.results.SuccessResult;
import com.takim4.bagisProject.dataAccess.abstracts.InstitutionsDao;
import com.takim4.bagisProject.entities.concretes.Institutions;

@Service
public class InstitutionsManager implements InstitutionsService {
private InstitutionsDao institutionsDao;
	
	@Autowired
	 public InstitutionsManager(InstitutionsDao institutionsDao) {
		super();
		this.institutionsDao=institutionsDao;
	}
	
	@Override
	public DataResult<List<Institutions>>  getAll() {
	
		return new SuccessDataResult<List<Institutions>>
		(this.institutionsDao.findAll(),"  Institutions listed");
		
	}

	@Override
	public Result add(Institutions institutions) {
		this.institutionsDao.save(institutions);
		return new SuccessResult(" Institutions  added");
	}
	
	@Override
	public Result delete(Institutions institutions ) {
		this.institutionsDao.deleteById(institutions.getInstitutionsId());
		return new SuccessResult(" Institutions deleted successfully.");
	}

	@Override
	public Result update(Institutions institutions) {
		Optional<Institutions> getinstitutions = institutionsDao.findById(institutions.getInstitutionsId());
		  if(!getinstitutions.isPresent()) {
		         return new ErrorResult("User id not found");
		    	
		    }
	    this.institutionsDao.save(institutions);
	    
		return new SuccessResult(" Institutions updated");
	}

	@Override
	public DataResult<Institutions> getById(int id) {
	
		return new SuccessDataResult<Institutions>(this.institutionsDao.getById(id));
	}
}
