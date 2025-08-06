package application;

import java.util.Date;
import java.util.List;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Main {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=========================== TEST 1: Seller findById() ==============================");
		Seller seller = sellerDao.findById(7);
		System.out.println(seller);

		System.out.println();
		System.out.println(
				"=========================== TEST 2: Seller findByDepartment() ==============================");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);

		System.out.println();
		System.out.println("=========================== TEST 3: Seller findAll() ==============================");
		list = sellerDao.findAll();
		list.forEach(System.out::println);

		System.out.println();
		System.out.println("=========================== TEST 4: Seller insert() ==============================");
		Seller newSeller = new Seller(null, "Evandro", "evandro@gmail.com", new Date(), 4444.44, department);
		sellerDao.insert(newSeller);
		System.out.println("INSERTED! NEW ID = " + newSeller.getId());

	}

}
