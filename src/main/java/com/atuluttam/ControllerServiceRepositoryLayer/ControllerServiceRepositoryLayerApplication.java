package com.atuluttam.ControllerServiceRepositoryLayer;

import com.atuluttam.ControllerServiceRepositoryLayer.Service.studentService;
import com.atuluttam.ControllerServiceRepositoryLayer.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ControllerServiceRepositoryLayerApplication {

	public static void main(String[] args) {
	ApplicationContext ctx =  SpringApplication.run(ControllerServiceRepositoryLayerApplication.class, args);


	    Student st = ctx.getBean(Student.class);
		studentService service = ctx.getBean(studentService.class);
		service.addStudent(st);
		st.doAssignment();
	}

}
