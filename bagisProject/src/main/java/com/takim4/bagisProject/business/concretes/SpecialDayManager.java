package com.takim4.bagisProject.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takim4.bagisProject.business.abstarcts.SpecialDayService;
import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.ErrorResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.core.utilities.results.SuccessDataResult;
import com.takim4.bagisProject.core.utilities.results.SuccessResult;
import com.takim4.bagisProject.dataAccess.abstracts.SpecialDayDao;
import com.takim4.bagisProject.entities.concretes.SpecialDay;


@Service
public class SpecialDayManager implements SpecialDayService {

private SpecialDayDao specialDayDao;
	
	@Autowired
	 public SpecialDayManager(SpecialDayDao specialDayDao) {
		super();
		this.specialDayDao=specialDayDao;
	}
	
	public DataResult<List<SpecialDay>>  getAll() {
		return new SuccessDataResult<List<SpecialDay>>
		(this.specialDayDao.findAll(),"SpecialDay listed");
	}

	@Override
	public Result add(SpecialDay specialDay) {
		this.specialDayDao.save(specialDay);
		return new SuccessResult("SpecialDay added");
	}
	
	@Override
	public Result delete(SpecialDay specialDay) {
		this.specialDayDao.deleteById(specialDay.getSpecialDayId());
		return new SuccessResult("SpecialDay deleted successfully.");
	}

	@Override
	public Result update(SpecialDay specialDay) {
		Optional<SpecialDay> getspecialDay = specialDayDao.findById(specialDay.getSpecialDayId());
		  if(!getspecialDay.isPresent()) {
		         return new ErrorResult("User id not found");
		    	
		    }
	    this.specialDayDao.save(specialDay);
	    
		return new SuccessResult(" SpecialDay updated");
	}

	@Override
	public DataResult<SpecialDay> getById(int id) {
	
		return new SuccessDataResult<SpecialDay>(this.specialDayDao.getById(id));
	}
}
