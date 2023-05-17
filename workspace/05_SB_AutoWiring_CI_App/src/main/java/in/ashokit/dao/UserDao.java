package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public UserDao() {
		System.out.println("User Dao :: Constuctor");// TODO Auto-generated constructor stub
	}
	public boolean saveUser(String uname,String email, String pwd) {
		System.out.println("Storing Record in database.....");
		return true;
	}
}
