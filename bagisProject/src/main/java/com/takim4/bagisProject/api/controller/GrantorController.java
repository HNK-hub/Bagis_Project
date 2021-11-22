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

import com.takim4.bagisProject.business.abstarcts.GrantorService;
import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.entities.concretes.Grantor;
@CrossOrigin // react 

@RestController
@RequestMapping("/api/specialDays")
public class GrantorController {
	private GrantorService grantorService;
	 @Autowired
	   public GrantorController(GrantorService grantorService) {
		   this.grantorService=grantorService; 
	   }
	   @GetMapping("/getAll")
	   public DataResult<List<Grantor>>  getAll() {
		   return  this.grantorService.getAll();
	   }
	   @GetMapping("/getById")
	     public DataResult<Grantor> getById(@RequestParam int id) {
		return this.grantorService.getById(id);
		}
	   @PostMapping("/add")
	   public Result add(@RequestBody Grantor grantor) {
		   return this.grantorService.add(grantor);
		   
	   }
	   @DeleteMapping("/delete")
		public Result delete(@RequestBody Grantor grantor) {
			return this.grantorService.delete(grantor);

		}
	   @PostMapping("/update")
	     public Result update(@RequestBody Grantor grantor) {
		return this.grantorService.update(grantor);
	   
     }
}
