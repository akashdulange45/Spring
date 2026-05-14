package in.ad.MavenProject2;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import in.ad.mappers.StudentRowMapper;
import in.ad.resources.SpringConfigFile;
import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
//    	String stdroll = "103";
//    	String stdname = "suraj";
//    	String stdmarks = "100";
    	
    	
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbctemplete =   context.getBean(JdbcTemplate.class);
      
       ////-------------Insert Operation-------------
        
//        String sql_query = "INSERT INTO student VALUES(?,?,?)";
//        int count =  jdbctemplete.update(sql_query,stdroll,stdname,stdmarks );
//       if (count > 0) {
//		System.out.println("Insertion Successfull");
//	}else {
//		System.out.println("Insertion failed");
//	}
       
       ////-----------Update Operation-----------------
        
//        String marks = "92.12";
//        String rollno = "103";
//        String updatequery ="UPDATE student SET stdmarks=? WHERE stdroll=? ";
//         int count =jdbctemplete.update(updatequery,marks,rollno);
//         if (count>0) {
//			System.out.println("Updation Successfull");
//		}else {
//			System.out.println("Updation Failed");
//		}
        
        ////-----------Delete Operation------------
        
//        String rollno = "102";
//        
//        String deletequery = "DELETE FROM student WHERE stdroll=?";
//       int count = jdbctemplete.update(deletequery,rollno);
//       if (count>0) {
//			System.out.println("Deletion Successfull");
//		}else {
//			System.out.println("Deletion Failed");
//		}
        
        ////--------------Selection Operation-----------
        
        String selectquery = "SELECT * FROM student";
        List<Student> stdList = jdbctemplete.query(selectquery, new StudentRowMapper());
       for(Student std : stdList) {
    	   System.out.println("Roll No : " + std.getRollno());
    	   System.out.println("Name : " + std.getName());
    	   System.out.println(" Marks : " + std.getMarks());
    	   
       }
       
    }
}
