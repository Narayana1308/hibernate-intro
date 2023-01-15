package user_eb9;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean condition=true;
		User user=new User();
		UserCRUD crud=new UserCRUD();
		do {
			System.out.println("Enter the choice \n1 for save user details\n2 for log in\n3 for delete\n4 for get user details\n 5 for exit ");
			int choice=scanner.nextInt();
			switch(choice){
			case 1:{
				System.out.println("Enter the user id");
				int id=scanner.nextInt();
				user.setId(id);
				System.out.println("Enter the name");
				String name=scanner.next();
				user.setName(name);
				System.out.println("Enter email");
				String email=scanner.next();
				user.setEmail(email);
				System.out.println("Enter the password");
				String password=scanner.next();
				user.setPassword(password);
				System.out.println("Enter the phone");
				long phone=scanner.nextLong();
				user.setPhone(phone);
//				user.setFacebookPassword("null");
//				user.setInstagramPassword("null");
//				user.setSnapchatPassword("null");
//				user.setTwitterPassword("null");
//				user.setWhatsappPassword("null");
				crud.saveUser(user);
				
			}break;
			case 2:{
				System.out.println("Enter user id");
				int id=scanner.nextInt();
				System.out.println("Enter your password");
				String password=scanner.next();
				boolean result=crud.logIn(password, id);
				if(result==true) {
					System.out.println("Log in successfully");
					if(null!=user.getFacebookPassword()) {
				            
				            user.setId(id);
				            System.out.println("Enter your passwoprd");
				            String password1=scanner.next();
				            user.setPassword(password1);
							System.out.println("Enter face book passwrod ");
							String facebookPassword=scanner.next();
							System.out.println("Enter instagram password");
							String instagramPassword=scanner.next();
							System.out.println("Enter twitter password");
							String twitterPassword=scanner.next();
							System.out.println("Enter snapchat password");
							String snapPassword=scanner.next();
							System.out.println("Enter WhatsApp passwrod");
							String whatsappPassword=scanner.next();
							user.setFacebookPassword(facebookPassword);
                            user.setInstagramPassword(instagramPassword);
                            user.setSnapchatPassword(snapPassword);
                            user.setTwitterPassword(twitterPassword);
                            user.setWhatsappPassword(whatsappPassword);
                            
                            crud.socialMedia(user);
                            //crud.getUserDEtails(id1);
                            
							
					
					}
					if(user.getFacebookPassword()!=null) {
						boolean result1=true;
						do {
							System.out.println("Do want to change your password \n1 for face book password\n2 for instagram password \n3 for Twitter password \n4 for snapchat password \n5 for whatsapp password \n6 for main menu");
							int i=scanner.nextInt();
							switch(i) {
							case 1:{
								System.out.println("enter id");
								int id2=scanner.nextInt();
								user.setId(id2);
								System.out.println("enter new password");
								String facebook=scanner.next();
								user.setFacebookPassword(facebook);
								crud.updateFacebook(id2, facebook);
							}break;
							case 2:{
								System.out.println("enter id");
								int id2=scanner.nextInt();
								user.setId(id2);
								System.out.println("enter new password");
								String instagram=scanner.next();
								user.setInstagramPassword(instagram);
								crud.updateInstagram(id2, instagram);
								
							}break;
							case 3:{
								System.out.println("enter id");
								int id2=scanner.nextInt();
								user.setId(id2);
								System.out.println("enter new password");
								String twitter=scanner.next();
								user.setTwitterPassword(twitter);
								crud.updateTwitter(id2, twitter);
								
							}break;
							case 4:{
								System.out.println("enter id");
								int id2=scanner.nextInt();
								user.setId(id2);
								System.out.println("enter new password");
								String snapchat=scanner.next();
								user.setSnapchatPassword(snapchat);
								crud.updateFacebook(id2, snapchat);
								
							}break;
							case 5:{
								System.out.println("enter id");
								int id2=scanner.nextInt();
								user.setId(id2);
								System.out.println("enter new password");
								String whatsapp=scanner.next();
								user.setWhatsappPassword(whatsapp);
								crud.updateWhatsapp(id2, whatsapp);
								
							}break;
							case 6:{
								result1=false;
							}break;
							default:{
								System.out.println("invalid choice");
							}
							
							}
						} while (result1);
					}
				}
				else {
					System.out.println("enter correct user id and password");
				}
			
			}break;
			case 3:{
				System.out.println("Enter id");
				int id=scanner.nextInt();
				crud.deleteUser(id);
				
			}break;
			case 4:{	
				System.out.println("Enter the id");
				int id=scanner.nextInt();
				crud.getUserDEtails(id);
				
			}break;
			case 5:{
				condition=false;
			}break;
			default:{
				System.out.println("invalid choice");
			}
			}
		} while (condition);
		System.out.println("Thank you.....!!!!");

	}

}
