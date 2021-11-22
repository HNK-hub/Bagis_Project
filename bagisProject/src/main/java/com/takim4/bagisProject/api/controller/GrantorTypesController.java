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

import com.takim4.bagisProject.business.abstarcts.GrantorTypesService;
import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.entities.concretes.GrantorTypes;

@RestController
@RequestMapping("/api/grantorTypes")
@CrossOrigin
public class GrantorTypesController {

	   private GrantorTypesService grantorTypesService;
	   
	   @Autowired
	   public GrantorTypesController(GrantorTypesService grantorTypesService) {
		   this.grantorTypesService=grantorTypesService;
		   
	   }
	   
	   @GetMapping("/getAll")
	   public DataResult<List<GrantorTypes>>  getAll() {
		   return  this.grantorTypesService.getAll();
	   }
	   @GetMapping("/getById")
	     public DataResult<GrantorTypes> getById(@RequestParam int id) {
		return this.grantorTypesService.getById(id);
		}
	   @PostMapping("/add")
	   public Result add(@RequestBody GrantorTypes grantorTypes) {
		   return this.grantorTypesService.add(grantorTypes);
		   
	   }
	   @DeleteMapping("/delete")
		public Result delete(@RequestBody GrantorTypes grantorTypes) {
			return this.grantorTypesService.delete(grantorTypes);

		}
	   @PostMapping("/update")
	     public Result update(@RequestBody GrantorTypes grantorTypes) {
		return this.grantorTypesService.update(grantorTypes);
	   
    }
}
