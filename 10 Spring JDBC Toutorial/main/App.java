package com.tka.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.tka.bean.Student;
import com.tka.config.SpringConfigFile;
import com.tka.rowmapper.StudentRowMapper;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
//we need bean of JdbcTemplate because CRUD operation is perform with the help of  this class. 
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

//	1. Insert Data into Table (Insert Operation)
//		
//		int studentRoll = 101;
//		String studentName = "Striver";
//		int studentMarks = 239;

//		
//		String insertSqlQuery = "INSERT into Student VALUES(?,?,?);";

//		int count = jdbcTemplate.update(insertSqlQuery, studentRoll, studentName, studentMarks);
//		update method return value in integer.

//		if (count > 0) {
//			System.out.println("Data Inserted Succesfully.");
//		} else {
//			System.out.println("Insetion Failed.");
//		}

//	2. Update Data into Table

//		int studentRoll = 101;
//	 	String updatedstudentName = "Sneha";
//
//		String updateQuery = "UPDATE Student SET name=? where rollNo=?";
//		int count = jdbcTemplate.update(updateQuery, updatedstudentName, studentRoll);
//
//		if (count > 0) {
//			System.out.println("Data Updated Succesfully.");
//		} else {
//			System.out.println(" Updated Failed.");
//		}

//		3.Delete Operation
//
//		int rollNo1 = 102;
//		String deleteQuery = "DELETE from Student where rollNo=?";
//		int count = jdbcTemplate.update(deleteQuery,rollNo1);
//		
//		
//		if (count > 0) {
//			System.out.println("Data Deleted Succesfully.");
//		} else {
//			System.out.println("Failed to Delete Data");
//		}

// 4. Select Operation

//		String select_from_database = "select * from student";
//		List<Student> list = jdbcTemplate.query(select_from_database, new StudentRowMapper());
//
//		for (Student stud : list) {
//			System.out.println("Roll No :"+stud.getRollNo());
//			System.out.println("Name :"+stud.getName());
//			System.out.println("Marks :"+stud.getMarks());
//			System.out.println("********************************************");
//		}

//		5. Select Operation on where clause
		int rollNo = 1;
		String query = "select * from student where rollNo=?";
		Student stud = jdbcTemplate.queryForObject(query, new StudentRowMapper(), rollNo);

		if (rollNo== stud.getRollNo()) {
			System.out.println("rollNo :" + stud.getRollNo());
			System.out.println("Name :" + stud.getMarks());
			System.out.println("Marks :" + stud.getName());

		}
	}
}
