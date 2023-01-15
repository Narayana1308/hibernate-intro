package user_eb9;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserCRUD {
	public void saveUser(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		System.out.println("Successfully added");
	}

	public boolean logIn(String password, int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//EntityTransaction entityTransaction = entityManager.getTransaction();
		User user = entityManager.find(User.class, id);
		if (user.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

	public void socialMedia(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user1 = entityManager.find(User.class, user.getId());
		user1.setFacebookPassword(user.getFacebookPassword());
		user1.setInstagramPassword(user.getInstagramPassword());
		user1.setSnapchatPassword(user.getSnapchatPassword());
		user1.setTwitterPassword(user.getTwitterPassword());
		user1.setWhatsappPassword(user.getWhatsappPassword());
		// user.setFacebookPassword(user.getPassword());
		entityTransaction.begin();
//		if(user1.getPassword().equals(password)) {
		//System.out.println("connnn");
		entityManager.merge(user1);

		entityTransaction.commit();
		System.out.println("Successfully added");
	}

	public void deleteUser(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user = entityManager.find(User.class, id);
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();
		System.out.println("Deleted");
	}
	public void updateFacebook(int id,String facebook) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user=entityManager.find(User.class,id );
		user.setFacebookPassword(facebook);
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
	}
	public void updateInstagram(int id,String instagram) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user=entityManager.find(User.class,id );
		user.setInstagramPassword(instagram);
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
	}
	public void updateTwitter(int id,String twitter) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user=entityManager.find(User.class,id );
		user.setTwitterPassword(twitter);
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
	}
	public void updateSnapchat(int id,String snapchat) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user=entityManager.find(User.class,id );
		user.setSnapchatPassword(snapchat);
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
	}
	public void updateWhatsapp(int id,String whatsapp) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user=entityManager.find(User.class,id );
		user.setWhatsappPassword(whatsapp);
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
	}
	public void getUserDEtails(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//EntityTransaction entityTransaction = entityManager.getTransaction();
		User user=entityManager.find(User.class, id);
		System.out.println(user);
	}

}
