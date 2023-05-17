package in.nadeem.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.nadeem.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Serializable> {

	public List<Employee> findByEmpName(String name);

	public List<Employee> findByEmpSal(int sal);

	public List<Employee> findByEmpNameAndEmpSal(String name, Integer salary);

	public List<Employee> findByEmpSalGreaterThan(Integer salary);

	public List<Employee> findByEmpNameIn(List<String> names);

	@Query("select empSal from Employee where empName=:name")
	public Integer findEmpSalByName(String name);

	@Query(value = "select count(*) from emp_tbl", nativeQuery = true)
	public Integer getCount(); 

}
