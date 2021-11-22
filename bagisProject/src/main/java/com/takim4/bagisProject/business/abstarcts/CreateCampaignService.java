package com.takim4.bagisProject.business.abstarcts;

import java.util.List;

import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.entities.concretes.CreateCampaign;

public interface CreateCampaignService {
	DataResult<List<CreateCampaign>>  getAll() ; 
	DataResult<CreateCampaign> getById(int id);
    Result add(CreateCampaign campaign);
    Result delete (CreateCampaign campaign);
    Result update(CreateCampaign campaign);
}
