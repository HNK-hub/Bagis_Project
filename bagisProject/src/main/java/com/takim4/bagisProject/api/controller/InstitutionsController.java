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

import com.takim4.bagisProject.business.abstarcts.InstitutionsService;
import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.entities.concretes.Institutions;
@CrossOrigin

@RestController
@RequestMapping("/api/institutions")
public class InstitutionsController {
	private InstitutionsService institutionsService;
	 @Autowired
	   public InstitutionsController(InstitutionsService institutionsService) {

		 this.institutionsService =institutionsService;
	   }
	   
	   @GetMapping("/getAll")
	   public DataResult<List<Institutions>>  getAll() {
		   return  this.institutionsService.getAll();
	   }
	   @GetMapping("/getById")
	     public DataResult<Institutions> getById(@RequestParam int id) {
		return this.institutionsService.getById(id);
		}
	   @PostMapping("/add")
	   public Result add(@RequestBody Institutions institutions) {
		   return this.institutionsService.add(institutions);
		   
	   }
	   @DeleteMapping("/delete")
		public Result delete(@RequestBody Institutions institutions) {
			return this.institutionsService.delete(institutions);

		}
	   @PostMapping("/update")
	     public Result update(@RequestBody Institutions institutions) {
		return this.institutionsService.update(institutions);
	   
     }
}
