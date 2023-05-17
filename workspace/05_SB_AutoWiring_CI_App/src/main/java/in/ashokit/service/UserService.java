package in.ashokit.service;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;

@Service
public class UserService {
	
	private UserDao userDao=null;
											
//	@Autowired
	public UserService(UserDao userDao) {
		super();
		System.out.println("1 - parameter constructor");
		this.userDao = userDao;
	}
	
	public UserService() {
		super();
		System.out.println("0 - parameter constructor");// TODO Auto-generated constructor stub
}
	public void registerUser() {
		boolean isSaved = userDao.saveUser("Nadeem", "nadeemrit08@gmail.com", "roorkee123");
		if(isSaved) {
			System.out.println("Record Saved");
		}else {
			System.out.println("Failed to save");
		}
	}



	
}
// UserService user=new UserService();