package hibernate_eb9;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee =entityManager.find(Employee.class, 104);
		employee.setId(104);
		employee.setAddress("ramaaa");
		employee.setName("lokesh");
		employee.setPhone(98877);
		employee.setSalary(20000);
		
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		

	}

}
