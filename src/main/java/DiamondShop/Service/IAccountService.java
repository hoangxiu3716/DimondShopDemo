package DiamondShop.Service;

import org.springframework.stereotype.Service;

import DiamondShop.Entity.User;

@Service
public interface IAccountService {
	public int AddAccount(User user);
	public User CheckAccount(User user);
}
