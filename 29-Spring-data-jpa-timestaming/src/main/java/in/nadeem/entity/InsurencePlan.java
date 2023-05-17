package in.nadeem.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "INSURENCE_PLANS")
public class InsurencePlan {

	@Id
	@GeneratedValue
	private Integer planId;
	private String planName;
	private String planStatus;

	@CreationTimestamp

	@Column(updatable = false)
	private LocalDate createdDate;

	@UpdateTimestamp

	@Column(insertable = false)
	private Date updatedDate;

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "InsurencePlan [planId=" + planId + ", planName=" + planName + ", planStatus=" + planStatus
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

}
