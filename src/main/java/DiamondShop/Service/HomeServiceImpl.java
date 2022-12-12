package DiamondShop.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.CategoriesDao;
import DiamondShop.Dao.MenuDao;
import DiamondShop.Dao.ProductDao;
import DiamondShop.Dao.SlidesDao;
import DiamondShop.Dto.ProductDto;
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
	@Autowired
	private ProductDao productDao;

	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}

	public List<Categories> GetDataCategories() {
		return categoriesDao.GetDataCategories();
	}
	public List<Menu> GetDataMenu() {
		return menuDao.GetDataMenu();
	}

	@Override
	public List<ProductDto> GetDataNewProduct() {
		List<ProductDto> listProduct = productDao.GetDataNewProduct();
		return listProduct;
	}
	@Override
	public List<ProductDto> GetDataHighLightProduct() {
		List<ProductDto> listProduct = productDao.GetDataHighLightProduct();
		return listProduct;
	}
}
