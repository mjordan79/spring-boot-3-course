package it.digitalnucleus.springhibernatedemo;

import it.digitalnucleus.springhibernatedemo.dao.StudentDAO;
import it.digitalnucleus.springhibernatedemo.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringHibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateDemoApplication.class, args);
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object ...");
		Student student = new Student("Renato", "Perini", "renato.perini@gmail.com");
		System.out.println("Saving the student ...");
		studentDAO.save(student);
		System.out.println("Saved student. Generated ID: " + student.getId());
	}

    /*
     * Spring Boot will call the run() method of all beans implementing the CommandLineRunner Functional Interface
     * after the application context has been loaded.
     */
	@Bean
	public CommandLineRunner commandLineRunner(@Qualifier("studentDAOImpl") StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
    }
}
