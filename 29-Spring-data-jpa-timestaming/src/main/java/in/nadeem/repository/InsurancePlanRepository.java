package in.nadeem.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nadeem.entity.InsurencePlan;

public interface InsurancePlanRepository extends JpaRepository<InsurencePlan, Serializable> {

}
