package com.takim4.bagisProject.business.abstarcts;

import java.util.List;

import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.entities.concretes.UnusedItem;

public interface UnusedItemService {
	DataResult<List<UnusedItem>>  getAll() ; 
	DataResult<UnusedItem> getById(int id);
    Result add(UnusedItem unusedItem  );
    Result delete (UnusedItem unusedItem);
    Result update(UnusedItem unusedItem);
}
