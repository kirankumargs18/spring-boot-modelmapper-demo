package com.globallogic;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.globallogic.dto.CourseDto;
import com.globallogic.dto.EmployeeDto;
import com.globallogic.dto.OrderDto;
import com.globallogic.dto.StudentDto;
import com.globallogic.entity.Course;
import com.globallogic.entity.Employee;
import com.globallogic.entity.Order;
import com.globallogic.entity.Student;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class SpringBootModelMapperDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootModelMapperDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * System.out.
		 * println("\n=================================MODEL MAPPER DEMO=================================="
		 * );
		 * 
		 * // get ModelMapper object ModelMapper modelMapper = new ModelMapper();
		 * 
		 * //modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.
		 * STANDARD);
		 * 
		 * // create Order objcet Order order = new
		 * Order("Kiran","Kumar","Kengeri","Bangalore");
		 * 
		 * // implicit mapping OrderDto orderDto = modelMapper.map(order,
		 * OrderDto.class); // this is not working here try explicit mapping
		 * 
		 * 
		 * modelMapper.typeMap(Order.class, OrderDto.class).addMappings(mapper -> {
		 * mapper.map(firstName -> order.getCustomer().getFirstName(),
		 * OrderDto::setFirstName); mapper.map(lastName ->
		 * order.getCustomer().getLastName(), OrderDto::setLastName); mapper.map(area ->
		 * order.getAddress().getArea(), OrderDto::setStreet); mapper.map(city ->
		 * order.getAddress().getCity(), OrderDto::setCity); });
		 * 
		 * 
		 * 
		 * System.out.println(orderDto);
		 */

		/*
		 * ModelMapper mapper = new ModelMapper();
		 * 
		 * // create objcets for Student and Course Course course = new Course();
		 * course.setId(1); course.setName("Java Programming");
		 * course.setInstructorName("James Gosling");
		 * 
		 * Student student = new Student(); student.setId(101);
		 * student.setName("Kiran Kumar G S"); student.setCourse(course);
		 * 
		 * // now let's use model mapper to convert student to student DTO
		 * 
		 * StudentDto studentDto = mapper.map(student, StudentDto.class); CourseDto
		 * courseDto=mapper.map(course, CourseDto.class);
		 * studentDto.setCourse(courseDto);
		 * 
		 * System.out.println("Student DTO : " + studentDto);
		 */
		
		ModelMapper modelMapper=new ModelMapper();
		
		Employee employee=new Employee();
		employee.setId(101);
		employee.setName("Naveen Kumar G S");
		employee.setDepartment("Development");
		employee.setAge(23);
		employee.setState("Karnataka");
		
		EmployeeDto employeeDto=modelMapper.map(employee, EmployeeDto.class);
		
		System.out.println(employeeDto);

	}

}
