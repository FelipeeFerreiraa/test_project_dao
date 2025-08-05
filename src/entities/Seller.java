package entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class Seller {

	private Integer id;
	private String name, email;
	private LocalDateTime birthDate;
	private Double baseSalary;

	private Department department;

	// ------------ CONSTRUCTORS
	public Seller() {
	}

	public Seller(Integer id, String name, String email, LocalDateTime birthDate, Double baseSalary,
			Department department) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	// ------------ GETs
	public String getName() {
		return name;
	}

	public LocalDateTime getBirthDate() {
		return birthDate;
	}

	public String getEmail() {
		return email;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public Integer getId() {
		return this.id;
	}

	public Department getDepartment() {
		return department;
	}

	// ------------ SETs
	public void setId(Integer id) {
		this.id = id;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	// ------------ METODS
	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", baseSalary="
				+ baseSalary + "]";
	}

}
