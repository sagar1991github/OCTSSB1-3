package com.velocity.service;

import java.util.List;

import com.velocity.model.Policy;

public interface PolicyService {
	 List<Policy> getAll();
     void create (Policy policy);
     void update (long id ,Policy policy);
     void delete(long id);
}
