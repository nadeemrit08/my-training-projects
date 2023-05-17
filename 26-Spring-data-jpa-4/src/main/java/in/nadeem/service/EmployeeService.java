package in.nadeem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nadeem.entity.Employee;
import in.nadeem.repository.EmpRepository;

@Service
public class EmployeeService {

	@Autowired // Filed injection
	private EmpRepository empRepo;

	public EmployeeService(EmpRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}

	@Transactional(rollbackFor = Exception.class)
	public void saveData() {
		Employee emp = new Employee();
		emp.setEmpId(201);
		emp.setEmpName("nadeem");
		emp.setEmpSal(30000);
		empRepo.save(emp);

	}
}
