package in.nadeem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_ADDR_TBL")
public class Address {

	@Id
	@Column(name = "ADDR_ID")
	private Integer addId;

	private String city;
	private String state;
	private String country;

	@Column(name = "EMP_ID")
	private Integer empId;

	public Integer getAddId() {
		return addId;
	}

	public void setAddId(Integer addId) {
		this.addId = addId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", state=" + state + ", country=" + country + ", empId="
				+ empId + "]";
	}

}
