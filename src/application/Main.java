package application;

import java.util.Date;

import entities.Department;
import entities.Seller;

public class Main {

	public static void main(String[] args) {

		Department obj = new Department(1, "Tecnologia da Informação");
		System.out.println(obj.toString());

		Seller seller = new Seller(12, "Irineu", "irineu@gmail.com", new Date(), 2143.99, obj);
		System.out.println(seller.toString());
	}

}
