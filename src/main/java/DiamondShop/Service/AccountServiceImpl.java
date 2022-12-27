package DiamondShop.Service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.UserDao;
import DiamondShop.Entity.User;

@Service
public class AccountServiceImpl implements IAccountService{
	@Autowired
	UserDao userDao = new UserDao();
	
	public int AddAccount(User user) {
		
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
		
		return userDao.AddAccount(user);
	}
}
