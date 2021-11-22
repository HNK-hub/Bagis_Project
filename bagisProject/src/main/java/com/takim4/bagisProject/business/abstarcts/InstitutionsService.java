package com.takim4.bagisProject.business.abstarcts;

import java.util.List;

import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.entities.concretes.Institutions;

public interface InstitutionsService {
	DataResult<List<Institutions>>  getAll() ; 
	DataResult<Institutions> getById(int id);
    Result add(Institutions institutions );
    Result delete (Institutions institutions);
    Result update(Institutions institutions);
}
