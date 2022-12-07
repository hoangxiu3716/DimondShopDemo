package DiamondShop.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.CategoriesDao;
import DiamondShop.Dao.MenuDao;
import DiamondShop.Dao.SlidesDao;
import DiamondShop.Entity.Categories;
import DiamondShop.Entity.Menu;
import DiamondShop.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategoriesDao categoriesDao;
	@Autowired
	private MenuDao menuDao;

	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}

	public List<Categories> GetDataCategories() {
		return categoriesDao.GetDataCategories();
	}
	public List<Menu> GetDataMenu() {
		return menuDao.GetDataMenu();
	}
}
