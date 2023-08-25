package com.velocity.model;


@Entity
public class Policy {

	private long id;
	private String policyName;
	private Integer policyAge;
	private String policyDes;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public Integer getPolicyAge() {
		return policyAge;
	}
	public void setPolicyAge(Integer policyAge) {
		this.policyAge = policyAge;
	}
	public String getPolicyDes() {
		return policyDes;
	}
	public void setPolicyDes(String policyDes) {
		this.policyDes = policyDes;
	}
	
}
