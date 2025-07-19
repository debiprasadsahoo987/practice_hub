package com.example.SpringJDBCPractice;

import com.example.SpringJDBCPractice.model.Student;
import com.example.SpringJDBCPractice.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcPracticeApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setRollNo(104);
		student.setName("Tom");
		student.setMarks(45);

		StudentService studentService = context.getBean(StudentService.class);

		studentService.addStudent(student);

		List<Student> students = studentService.getStudents();
		System.out.println(students);
	}

}
