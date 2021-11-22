package com.takim4.bagisProject.business.abstarcts;

import java.util.List;

import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.entities.concretes.SpecialDay;

public interface SpecialDayService {
	DataResult<List<SpecialDay>>  getAll() ; 
	DataResult<SpecialDay> getById(int id);
    Result add(SpecialDay specialDay );
    Result delete (SpecialDay specialDay);
    Result update(SpecialDay specialDay);
}
