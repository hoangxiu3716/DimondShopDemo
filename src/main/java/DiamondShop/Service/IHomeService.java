package DiamondShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dto.ProductDto;
import DiamondShop.Entity.Categories;
import DiamondShop.Entity.Menu;
import DiamondShop.Entity.Slides;

@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();
	public List<Categories> GetDataCategories();
	public List<Menu> GetDataMenu();
	public List<ProductDto> GetDataNewProduct();
	public List<ProductDto> GetDataHighLightProduct();
}
