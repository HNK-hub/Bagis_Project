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

import com.takim4.bagisProject.business.abstarcts.CreateCampaignService;
import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.entities.concretes.CreateCampaign;

@CrossOrigin // react 

@RestController
@RequestMapping("/api/createCampaign")
public class CreateCampaignController {

	private CreateCampaignService createCampaignService;
	 @Autowired
	   public CreateCampaignController(CreateCampaignService createCampaignService) {
		   this.createCampaignService=createCampaignService; 
	   }
	   @GetMapping("/getAll")
	   public DataResult<List<CreateCampaign>>  getAll() {
		   return  this.createCampaignService.getAll();
	   }
	   @GetMapping("/getById")
	     public DataResult<CreateCampaign> getById(@RequestParam int id) {
		return this.createCampaignService.getById(id);
		}
	   @PostMapping("/add")
	   public Result add(@RequestBody CreateCampaign createCampaign) {
		   return this.createCampaignService.add(createCampaign);
		   
	   }
	   @DeleteMapping("/delete")
		public Result delete(@RequestBody CreateCampaign createCampaign) {
			return this.createCampaignService.delete(createCampaign);

		}
	   @PostMapping("/update")
	     public Result update(@RequestBody CreateCampaign createCampaign) {
		return this.createCampaignService.update(createCampaign);
	   
    }
}
