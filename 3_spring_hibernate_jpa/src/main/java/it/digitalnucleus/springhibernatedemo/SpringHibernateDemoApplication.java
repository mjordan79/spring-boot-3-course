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

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating 4 students ...");
		Student s1 = new Student("Renato", "Perini", "renato.perini@gmail.com");
		Student s2 = new Student("Giovanni", "Gallo", "james.gosling@sun.com");
		Student s3 = new Student("Mark", "Reinholds", "mark.reinholds@oracle.com");
		Student s4 = new Student("Brian", "Goetz", "brian.goetz@oracle.com");
		studentDAO.save(s1);
		studentDAO.save(s2);
		studentDAO.save(s3);
		studentDAO.save(s4);
	}

	private void findStudent(StudentDAO studentDAO) {
		System.out.println("Finding students ...");
		int i = 0;
		Student found;
		do {
			i++;
			found = studentDAO.findById(i);
			if (found != null) System.out.println("Found: " + found);
		} while (found != null);
	}

    /*
     * Spring Boot will call the run() method of all beans implementing the CommandLineRunner Functional Interface
     * after the application context has been loaded.
     */
	@Bean
	public CommandLineRunner commandLineRunner(@Qualifier("studentDAOImpl") StudentDAO studentDAO) {
		return runner -> {
			createMultipleStudents(studentDAO);
			findStudent(studentDAO);
		};
    }
}
