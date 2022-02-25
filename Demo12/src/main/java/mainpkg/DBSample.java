package mainpkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db_connection.JDBC_Connection;

public class DBSample {
	
	   Connection con;
		
    public DBSample() {
		   
		   
	con = JDBC_Connection.db();
}
	   
	   void insert(int id, String name, String contact, String email) {
		  
		   try {
			  
		   PreparedStatement pd = con
					.prepareStatement("Insert into student values(id, name, contact, email) values(?,?,?,?)");
					   
		            pd.setInt(1, id);
					pd.setString(2, name);
					pd.setString(3, contact);
					pd.setString(4, email);
					
				  pd.executeUpdate();
				  {
					  System.out.println("Successfully Inserted");
				  }
				  
				} catch (Exception e) {
					System.out.println(e);
				}
	   }

        void select(int id, String contact) {
             try {
	      PreparedStatement pd = con.prepareStatement(
                "select * from student where id = '" + id + "' " + "and contact = '" + contact + "' ");
	           ResultSet rs = pd.executeQuery();

	     while (rs.next()) {
		int rn = rs.getInt(1);
		String name = rs.getString(2);
		String cont = rs.getString(3);
		String email = rs.getString(4);

		System.out.println("Values Are::" + name);

	}
	 
           } catch (Exception e) {
	              System.out.println(e);
        }
   }
        public void delete(int id){
    		try{
    			PreparedStatement pd=con.prepareStatement("delete from course where id='"+id+ "'");
    			pd.executeUpdate();
    		}catch(Exception e){
    			System.out.println(e);
    		}
        }

         public void update(int id, String email) {
	
	  try {
		 PreparedStatement pd = con.prepareStatement("update course set id='"+id+"' "
														+"where id='"+email+"' ");
		int i = pd.executeUpdate();
		
		if(i>0) {
			System.out.println("Successful");
		}else {
			System.out.println("check with your query");
		}
		
	   }catch (Exception e) {
		 System.out.println(e);
	    }
         }
}
         
