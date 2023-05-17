package in.nadeem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nadeem.entity.InsurencePlan;
import in.nadeem.repository.InsurancePlanRepository;

@Service
public class InsurancePlanService {

	@Autowired
	private InsurancePlanRepository  planRepo;
	
	public void savePlan() {
		InsurencePlan plan = new InsurencePlan();
		plan.setPlanName("SNAP");
		plan.setPlanStatus("DN");
	
		planRepo.save(plan);
	}
}
