package in.nadeem;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.nadeem.entity.Employee;
import in.nadeem.repository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmpRepository empRepository = context.getBean(EmpRepository.class);

		List<Employee> findByEmpName = empRepository.findByEmpName("Nadeem");
		System.out.println(findByEmpName);
		System.out.println("=========================================================================================");

		List<Employee> findByEmpSal = empRepository.findByEmpSal(3300);
		System.out.println(findByEmpSal);
		System.out.println("=========================================================================================");

		List<Employee> findByEmpNameAndEmpSal = empRepository.findByEmpNameAndEmpSal("Nadeem", 2200);
		System.out.println(findByEmpNameAndEmpSal);
		System.out.println("=========================================================================================");

		List<Employee> findByEmpSalGreaterThan = empRepository.findByEmpSalGreaterThan(15000);
		findByEmpSalGreaterThan.forEach(emp -> {
			System.out.println(emp);
		});

		System.out.println("=========================================================================================");

		List<Employee> findByEmpNameIn = empRepository.findByEmpNameIn(Arrays.asList("Nadeem", "Ahmad", "Rasid"));
		findByEmpNameIn.forEach(emp -> {
			System.out.println(emp);
		});

		System.out.println("=========================================================================================");

		Integer findEmpSalByName = empRepository.findEmpSalByName("Nadeem");
		System.out.println("Saray :: " + findEmpSalByName);

		System.out.println("=========================================================================================");

		//long count = empRepository.count();
		//System.out.println("Total count is " + empRepository.getCount());
	}

}
