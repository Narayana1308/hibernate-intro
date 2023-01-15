package Student_eb9;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentDetailsAll {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		javax.persistence.Query query=entityManager.createQuery("SELECT s from Student s");
		List<Student> list=query.getResultList();
		System.out.println(list);

	}

}
