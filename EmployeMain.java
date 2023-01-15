package hibernate_eb9;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeMain {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee=new Employee();
		employee.setId(102);
		employee.setName("Prabhas");
		employee.setAddress("bangulur");
		employee.setPhone(988778767);
		employee.setSalary(20000);
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();

	}

}
