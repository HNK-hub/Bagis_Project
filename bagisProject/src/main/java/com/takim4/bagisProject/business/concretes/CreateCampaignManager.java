package com.takim4.bagisProject.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takim4.bagisProject.business.abstarcts.CreateCampaignService;
import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.ErrorResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.core.utilities.results.SuccessDataResult;
import com.takim4.bagisProject.core.utilities.results.SuccessResult;
import com.takim4.bagisProject.dataAccess.abstracts.CreateCampaignDao;
import com.takim4.bagisProject.entities.concretes.CreateCampaign;
@Service
public class CreateCampaignManager implements CreateCampaignService{

private CreateCampaignDao createCampaignDao;
	
	@Autowired
	 public CreateCampaignManager(CreateCampaignDao createCampaignDao) {
		super();
		this.createCampaignDao=createCampaignDao;
	}
	
	@Override
	public DataResult<List<CreateCampaign>>  getAll() {
	
		return new SuccessDataResult<List<CreateCampaign>>
		(this.createCampaignDao.findAll(),"CreateCampaign listed");
		
	}

	@Override
	public Result add(CreateCampaign createCampaign) {
		this.createCampaignDao.save(createCampaign);
		return new SuccessResult("CreateCampaign added");
	}
	
	@Override
	public Result delete(CreateCampaign createCampaign) {
		this.createCampaignDao.deleteById(createCampaign.getCreateCampaignId());
		return new SuccessResult("CreateCampaign deleted successfully.");
	}

	@Override
	public Result update(CreateCampaign createCampaign) {
		Optional<CreateCampaign> getGrantor = createCampaignDao.findById(createCampaign.getCreateCampaignId());
		  if(!getGrantor.isPresent()) {
		         return new ErrorResult("CreateCampaign id not found");
		    	
		    }
	    this.createCampaignDao.save(createCampaign);
	    
		return new SuccessResult("CreateCampaign updated");
	}

	@Override
	public DataResult<CreateCampaign> getById(int id) {
	
		return new SuccessDataResult<CreateCampaign>(this.createCampaignDao.getById(id));
	}

	
}
