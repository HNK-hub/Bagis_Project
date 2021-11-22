package com.takim4.bagisProject.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.takim4.bagisProject.business.abstarcts.SpecialDayService;
import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.entities.concretes.SpecialDay;

@CrossOrigin // react 

@RestController
@RequestMapping("/api/specialDay")
public class SpecialDayController {
	private SpecialDayService specialDayService;
	 @Autowired
	   public SpecialDayController(SpecialDayService specialDayService) {
		   this.specialDayService=specialDayService; 
	   }
	   @GetMapping("/getAll")
	   public DataResult<List<SpecialDay>>  getAll() {
		   return  this.specialDayService.getAll();
	   }
	   @GetMapping("/getById")
	     public DataResult<SpecialDay> getById(@RequestParam int id) {
		return this.specialDayService.getById(id);
		}
	   @PostMapping("/add")
	   public Result add(@RequestBody SpecialDay specialDay) {
		   return this.specialDayService.add(specialDay);
		   
	   }
	   @DeleteMapping("/delete")
		public Result delete(@RequestBody SpecialDay  specialDay) {
			return this.specialDayService.delete(specialDay);

		}
	   @PostMapping("/update")
	     public Result update(@RequestBody SpecialDay  specialDay) {
		return this.specialDayService.update(specialDay);
	   
    }
}
