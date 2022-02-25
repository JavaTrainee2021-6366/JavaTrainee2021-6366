package mainpkg;

import java.util.Scanner;

import mainpkg.DBSample;
import db_connection.JDBC_Connection;

public class MainClass {

	public static void main(String[] args) {
		
		int id;
		String name;
		String contact;
		String email;
		Scanner sn=new Scanner(System.in);
		JDBC_Connection.db();
		DBSample obj=new DBSample();
		System.out.println("1.for insert values in table");
		System.out.println("2.for select query");
		System.out.println("3.for delete:");
		System.out.println("4.for update:");
		System.out.println("5.Exit");
		System.out.println("Enter your choice:");
		int select=sn.nextInt();
		
		switch(select){
		
		case 1:
			System.out.println("Enter id:");
			id=sn.nextInt();
			System.out.println("Enter name:");
			name=sn.next();
			System.out.println("Enter contact:");
			contact=sn.next();
			System.out.println("Enter email:");
			email=sn.next();
			
			obj.insert(id, name, contact, email);
			break;
			
		case 2:
			System.out.println("Enter id:");
			id=sn.nextInt();
			System.out.println("Enter contact:");
			contact=sn.next();
			
			obj.select(id,contact);
			break;
			
		case 3:
			System.out.println("Enter id:");
			id=sn.nextInt();
			
			obj.delete(id);
			break;
			
		case 4:
			System.out.println("enter id:");
			id=sn.nextInt();
			System.out.println("Enter email:");
			email=sn.next();
			
			obj.update(id, email);
			break;
		
		case 5:
			System.out.println("thank you.....");
		}
		

	}

}
