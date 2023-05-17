package in.nadeem.service;

import org.springframework.stereotype.Service;

import in.nadeem.entity.Account;
import in.nadeem.entity.AccountPK;
import in.nadeem.repository.AccountReposity;

@Service
public class AccountService {

	private AccountReposity accRepo;

	public AccountService(AccountReposity accRepo) {
		super();
		this.accRepo = accRepo;
	}

	public void saveData() {
		AccountPK pk = new AccountPK();
		pk.setAccId(103);
		pk.setAccType("CURRENT");
		pk.setHolderName("TCS");

		Account account = new Account();
		account.setBranchName("PNB");
		account.setMinBal(10000);

		account.setAccountPK(pk); // setting pk class object to entity class object
		accRepo.save(account);
	}

}
