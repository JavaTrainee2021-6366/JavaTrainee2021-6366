package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int choice = 0;
		
		while(choice !=3) {
			
			System.out.println("Enter 1- for Library \n Enter 2- for Books");
			choice = obj.nextInt();
			
			if (choice == 1) {
				Library obj1 = new Library();
				  System.out.println("Enter student's name");
				  obj1.name = obj.nextLine(); obj1.name = obj.nextLine();
				  System.out.println("Enter the father's name");
				  obj1.fname = obj.nextLine();
				  System.out.println("Enter university id");
				  obj1.uni_id = obj.nextLine();
				  System.out.println("Enter the User id");
				  obj1.uid = obj.nextLine();
				  System.out.println("In which semester do you study");
				  obj1.sem = obj.nextInt();
				  
				  obj1.getdata(obj1.name, obj1.fname, obj1.uid, obj1.uni_id, obj1.sem);
				  obj1.setdata();
			}
			
			else if (choice == 2) {
				Books obj2 = new Books();
				obj2.chemistry();
				obj2.physics();
				obj2.biology();
			}
			
			else if (choice == 3)  {
				System.out.println("Process finished with exit code 0"); 
			}
		}
	}
}

