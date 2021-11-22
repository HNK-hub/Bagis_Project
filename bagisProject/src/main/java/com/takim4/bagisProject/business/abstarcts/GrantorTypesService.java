package com.takim4.bagisProject.business.abstarcts;

import java.util.List;

import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.entities.concretes.GrantorTypes;

public interface GrantorTypesService {
	DataResult<List<GrantorTypes>>  getAll() ; 
	DataResult<GrantorTypes> getById(int id);
    Result add(GrantorTypes GrantorTypes);
    Result delete (GrantorTypes GrantorTypes);
    Result update(GrantorTypes GrantorTypes);
}
