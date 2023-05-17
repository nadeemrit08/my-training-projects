package in.nadeem.repository;

import org.springframework.data.repository.CrudRepository;

import in.nadeem.entity.Account;
import in.nadeem.entity.AccountPK;

public interface AccountReposity extends CrudRepository<Account, AccountPK> {

}
