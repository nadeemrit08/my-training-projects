package in.nadeem.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import in.nadeem.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Serializable> {

}
