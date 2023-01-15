package Student_eb9;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		StudentCRUD crud=new StudentCRUD();
		boolean exit=true;
		do {
			System.out.println("Enter the choice \n1 for save student details\n2 for update student name\n3 for delete student details\n4 for get student details\n5 for exit");
			int choice=scanner.nextInt();
			Student student=new Student();
			switch(choice) {
			case 1:{
				System.out.println("Enter the student id");
				int id=scanner.nextInt();
				System.out.println("Enter Student Name");
				String name=scanner.next();
				System.out.println("Enter father name ");
				String fatherName=scanner.next();
				System.out.println("Enter mother name");
				String motherName=scanner.next();
				System.out.println("Enter address");
				String address=scanner.next();
				System.out.println("Enter total marks");
				double totalMarks=scanner.nextDouble();
				System.out.println("Enter percentage");
				double percentage=scanner.nextDouble();
				student.setAddress(address);
				student.setId(id);
				student.setFatherName(fatherName);
				student.setMotherName(motherName);
				student.setName(name);
				student.setMarks(totalMarks);
				student.setPercentage(percentage);
				crud.saveStudent(student);
				
			}break;
			case 2:{
				System.out.println("Enter student id");
				int id=scanner.nextInt();
				System.out.println("Enter the name to be updated");
				String name=scanner.next();
				try {
					crud.updateStudent(name, id);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Entered id is not there in Database");
				}
				
				
			}break;
			case 3:{
				System.out.println("Enter the student id");
				int id =scanner.nextInt();
				crud.deleteStudent(id);
			}break;
			case 4:{
				System.out.println("Enter the student id to display details");
				int id=scanner.nextInt();
				crud.getStudentDetails(id);
			}break;
			case 5:{
				exit=false;
			}break;
			default:{
				System.out.println("Invalid choice ");
			}
			}
			
		} while (exit);
		System.out.println("Thank you....!!");

	}

}
