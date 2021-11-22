package com.takim4.bagisProject.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.takim4.bagisProject.business.abstarcts.UnusedItemService;
import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.ErrorResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.core.utilities.results.SuccessDataResult;
import com.takim4.bagisProject.core.utilities.results.SuccessResult;
import com.takim4.bagisProject.dataAccess.abstracts.UnusedItemTypeDao;
import com.takim4.bagisProject.entities.concretes.UnusedItem;

public class UnusedItemManager implements UnusedItemService{
private UnusedItemTypeDao unusedItemTypeDao;
@Autowired
public UnusedItemManager(UnusedItemTypeDao unusedItemTypeDao) {
	super();
	this.unusedItemTypeDao=unusedItemTypeDao;
}

@Override
public DataResult<List<UnusedItem>>  getAll() {

	return new SuccessDataResult<List<UnusedItem>>
	(this.unusedItemTypeDao.findAll(),"UnusedItem listed");
	
}

@Override
public Result add(UnusedItem unusedItem) {
	this.unusedItemTypeDao.save(unusedItem);
	return new SuccessResult("grantorTypes added");
}

@Override
public Result delete(UnusedItem unusedItem ) {
	this.unusedItemTypeDao.deleteById(unusedItem.getUnusedItemTypeid());
	return new SuccessResult("grantorTypes deleted successfully.");
}

@Override
public Result update(UnusedItem unusedItem) {
	Optional<UnusedItem> getunusedItem= unusedItemTypeDao.findById(unusedItem.getUnusedItemTypeid());
	  if(!getunusedItem.isPresent()) {
	         return new ErrorResult("User id not found");
	    	
	    }
   this.unusedItemTypeDao.save(unusedItem);
   
	return new SuccessResult("grantorTypes updated");
}

@Override
public DataResult<UnusedItem> getById(int id) {

	return new SuccessDataResult<UnusedItem>(this.unusedItemTypeDao.getById(id));
}
}
