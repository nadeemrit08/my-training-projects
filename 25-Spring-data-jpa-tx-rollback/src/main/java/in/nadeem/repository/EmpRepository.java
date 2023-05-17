package in.nadeem.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nadeem.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Serializable> {

}
