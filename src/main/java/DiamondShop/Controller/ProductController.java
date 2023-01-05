package DiamondShop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamondShop.Service.IProductService;

@Controller
public class ProductController extends BaseController{
	@Autowired
	private IProductService _productService;
	@RequestMapping(value = { "chi-tiet-san-pham/{id}" })
	public ModelAndView Index(@PathVariable long id) {
		_mvShare.setViewName("user/product/product");
		_mvShare.addObject("product", _productService.GetProductById(id));
		int idCategoryId = _productService.GetProductById(id).getCategory_id();
		_mvShare.addObject("productByCategoryId", _productService.GetProductByCategoryId(idCategoryId));
		_mvShare.addObject("categories", _homeService.GetDataCategories());
		_mvShare.addObject("highLightProduct", _homeService.GetDataHighLightProduct());
		return _mvShare;
	}
	
}
