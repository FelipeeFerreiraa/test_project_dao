package model.dao;

import java.util.List;

import entities.Department;

public interface DepartmentDao {

	void insert(Department obj);

	void update(Department obj);

	void deleteById(Integer id);

	Department findByAll(Integer id);

	List<Department> fingAll();
}
