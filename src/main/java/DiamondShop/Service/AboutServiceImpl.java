package DiamondShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.AboutDao;
import DiamondShop.Entity.About;
@Service
public class AboutServiceImpl implements IAboutService{
	@Autowired
	private AboutDao aboutDao;

	@Override
	public List<About> GetDataAbout() {
		return aboutDao.GetDataAbout();
	}

	@Override
	public About GetAboutById(int id) {
		List<About> listAbout = aboutDao.GetAboutById(id);
 		return listAbout.get(0);
	}

}
