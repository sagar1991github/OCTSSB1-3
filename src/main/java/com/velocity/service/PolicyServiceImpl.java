package com.velocity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.velocity.model.Policy;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	List<Policy>policyInfo = new ArrayList<>();
	
	public PolicyServiceImpl() {
		Policy policy= new Policy();
		policy.setId(01);
		policy.setPolicyName("Health Policy");
		policy.setPolicyAge(25);
		policy.setPolicyDes("Policy");
		
		Policy policy1= new Policy();
		policy1.setId(02);
		policy1.setPolicyName("Term Policy");
		policy1.setPolicyAge(25);
		policy1.setPolicyDes("Policy");
				
		policyInfo.add(policy1);
		policyInfo.add(policy);
	}

	@Override
	public List<Policy> getAll() {
		// TODO Auto-generated method stub
		return this.policyInfo;
	}

	@Override
	public void create(Policy policy) {
		policyInfo.add(policy);
		
	}

	@Override
	public void update(long id, Policy policy) {
		for(Policy p : policyInfo ) {
			if(p.getId()== id) {
				p.setPolicyName(policy.getPolicyName());
				p.setPolicyAge(policy.getPolicyAge());
				p.setPolicyDes(policy.getPolicyDes());
			}
		}
		
	}

	@Override
	public void delete(long id) {
     
		for(Policy p : policyInfo) {
			if(p.getId() == id) {
				policyInfo.remove(p);
			}
		}
		
	}

}
