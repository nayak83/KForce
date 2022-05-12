package com.generali.burritoorderingservice.repository;

import java.util.List;

public interface ObjectRepository<T> {
	
	public int save(List<T> t);
	public List<T> retrieve(Integer id);

}
