package in.nadeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.nadeem.repository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmpRepository empRepository = context.getBean(EmpRepository.class);

		/*
		 * System.out.println(" Impl Class :: " + empRepository.getClass().getName());
		 * 
		 * Employee employee = new Employee(); employee.setEmpId(106);
		 * employee.setEmpName("naeem"); employee.setEmpSal(65000);
		 * 
		 * empRepository.save(employee);
		 * 
		 * ProductRepository productRepository =
		 * context.getBean(ProductRepository.class);
		 * System.out.println(" Products Class :: " +
		 * productRepository.getClass().getName());
		 * 
		 * Product product = new Product(); product.setProductId(203);
		 * product.setProductName("coffe"); product.setProductPrice(6050);
		 * 
		 * productRepository.save(product);
		 * 
		 * System.out.println("++++++++++++Record Saved+++++++++++++++");
		 * 
		 * 
		 */

		/*
		 * Employee e1 = new Employee(110, "hassu", 2000); Employee e2 = new
		 * Employee(111, "ty", 3000); Employee e3 = new Employee(112, "rana", 4000);
		 * 
		 * java.util.List<Employee> emps = new ArrayList<>(); emps.add(e1);
		 * emps.add(e2); emps.add(e3);
		 * 
		 * empRepository.saveAll(emps);
		 * 
		 */

		/*
		 * Optional<Employee> findById = empRepository.findById(140); if
		 * (findById.isPresent()) { System.out.println(findById.get()); }else {
		 * System.out.println("Record is not available"); }
		 * 
		 */

		/*
		 * java.util.List<Serializable> empIds = new ArrayList<>(); empIds.add(101);
		 * empIds.add(102); empIds.add(103);
		 * 
		 * Iterable<Employee> emps = empRepository.findAllById(empIds); emps.forEach(emp
		 * -> { System.out.println(emp); });
		 * 
		 */

		/*
		 * Iterable<Employee> findAll = empRepository.findAll(); findAll.forEach(emp ->
		 * System.out.println(emp));
		 */

		/*
		 * long count = empRepository.count();
		 * System.out.println("Total Records Available :: " + count);
		 */

		/*
		 * boolean isAvailable = empRepository.existsById(104);
		 * System.out.println("Emp Available :: " + isAvailable);
		 */
		
		empRepository.deleteById(112);
		System.out.println("Record Delete");

	}

}
