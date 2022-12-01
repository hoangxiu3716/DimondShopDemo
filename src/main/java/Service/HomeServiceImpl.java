package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.SlidesDao;
import DiamondShop.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDao slidesDao;

	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}
}
