package DiamondShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Entity.About;

@Service
public interface IAboutService {
	@Autowired
	public List<About> GetDataAbout();
	public About GetAboutById(int id);
}
