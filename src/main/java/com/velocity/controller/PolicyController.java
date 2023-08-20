package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Policy;
import com.velocity.service.PolicyService;

@RestController
@RequestMapping("/policy")
public class PolicyController {
	//design service layer classes
	
	@Autowired
	private PolicyService policyService;
	
	@GetMapping("/getAll")
	public List<Policy> getAllPolicy(){
		return policyService.getAll();
		
	}
	@PostMapping("/create-policy")
	public void createPolicy(@RequestBody Policy policy) {
		policyService.create(policy);
	}

	@PutMapping("/update-policy/(id)")
	public void updatePolicy(@PathVariable("id") long id, @RequestBody Policy policy) {
		policyService.update(id, policy);
	}
	@DeleteMapping("/delete-policy/(id)")
	public void deletePolicy(@PathVariable long id) {
		policyService.delete(id);
	}
	
	
}
