package in.nadeem.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "BANK_ACCOUNTS")
@IdClass(AccountPK.class)
public class Account {

	@Column(name = "BRANCH_NAME")
	private String branchName;

	@Column(name = "MIN_BAL")
	private Integer minBal;

	@EmbeddedId
	private AccountPK accountPK;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Integer getMinBal() {
		return minBal;
	}

	public void setMinBal(Integer minBal) {
		this.minBal = minBal;
	}

	public AccountPK getAccountPK() {
		return accountPK;
	}

	public void setAccountPK(AccountPK accountPK) {
		this.accountPK = accountPK;
	}

}
