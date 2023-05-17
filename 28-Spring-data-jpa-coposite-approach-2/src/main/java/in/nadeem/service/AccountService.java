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
		Account account = new Account();
		account.setBranchName("SBI");
		account.setMinBal(500);
		account.setAccId(103);
		account.setAccType("SAVINGS");
		account.setHolderName("IBM");
		
		accRepo.save(account);
	}
	
	
	public void getDataUsingPK() {

		AccountPK pk = new AccountPK();
		pk.setAccId(102);
		pk.setAccType("SAVINGS");
		pk.setHolderName("IBM");

		java.util.Optional<Account> findById = accRepo.findById(pk);
		if (findById.isPresent()) {
			System.out.println(findById.get());
		}
	}
}
