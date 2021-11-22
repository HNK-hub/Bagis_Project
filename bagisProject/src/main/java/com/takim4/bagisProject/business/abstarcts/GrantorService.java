package com.takim4.bagisProject.business.abstarcts;

import java.util.List;

import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.entities.concretes.Grantor;

public interface GrantorService {
	DataResult<List<Grantor>>  getAll() ; 
	DataResult<Grantor> getById(int id);
    Result add(Grantor grantor );
    Result delete (Grantor grantor);
    Result update(Grantor grantor);
}
