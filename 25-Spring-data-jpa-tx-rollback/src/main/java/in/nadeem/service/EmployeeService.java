package in.nadeem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nadeem.entity.Address;
import in.nadeem.entity.Employee;
import in.nadeem.repository.AddresRepositry;
import in.nadeem.repository.EmpRepository;

@Service
public class EmployeeService {

	@Autowired // Filed injection
	private EmpRepository empRepo;
	@Autowired
	private AddresRepositry addrRepo;

	/*
	 * constructor injection public EmployeeService(EmpRepository empRepo,
	 * AddresRepositry addrRepo) { super(); this.empRepo = empRepo; this.addrRepo =
	 * addrRepo; }
	 */

	@Transactional(rollbackFor = Exception.class) 
	public void saveData() {
		Employee emp = new Employee();
		emp.setEmpId(203);
		emp.setEmpName("ABC");
		emp.setEmpSal(25000);
		empRepo.save(emp);

		Address addr = new Address();
		addr.setAddId(503);
		addr.setEmpId(203);
		addr.setCity("UP11");
		addr.setState("UP");
		addr.setCountry("India");
		addrRepo.save(addr);
	}
}
