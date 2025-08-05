package model.dao;

import java.util.List;

import entities.Department;

public interface Seller {

	void insert(Seller obj);

	void update(Seller obj);

	void deleteById(Integer id);

	Seller findByAll(Integer id);

	List<Seller> fingAll();
}
