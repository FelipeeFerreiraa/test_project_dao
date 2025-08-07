package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Main2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);

		System.out.println("=========================== TEST 1: Department findById() ==============================");
		Department dep = departmentDao.findById(7);
		System.out.println(dep);

		System.out.println();
		System.out.println("=========================== TEST 2: Department findAll() ==============================");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		list.forEach(System.out::println);

		System.out.println();
		System.out.println("=========================== TEST 3: Department insert() ==============================");
		Department newDep = new Department(null, "Atendimento");
		departmentDao.insert(newDep);
		System.out.println("INSERTED! NEW ID = " + newDep.getId());

		System.out.println();
		System.out.println("=========================== TEST 4: Department update() ==============================");
		newDep = departmentDao.findById(3);
		newDep.setName("Recuperação de Crédito");
		departmentDao.update(newDep);
		System.out.println("UPDATE COMPLETED");

		System.out.println();
		System.out.println("=========================== TEST 5: Department delete() ==============================");
		System.out.println("INFORME UM ID PARA O TESTE DE DELEÇÃO: ");
		departmentDao.deleteById(sc.nextInt());
		System.out.println("DELETE COMPLETED");

		sc.close();

	}

}
