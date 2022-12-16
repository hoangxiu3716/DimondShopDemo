package DiamondShop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamondShop.Dto.PaginatesDto;
import DiamondShop.Service.CategoryServiceImpl;
import DiamondShop.Service.PaginatesServiceImpl;

@Controller
public class CategoryController extends BaseController{
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
	@Autowired
	private PaginatesServiceImpl paginatesServiceImpl;
	
	private int totalProduct = 9;
	
	@RequestMapping(value = "/san-pham/{id}")
	public ModelAndView Product(@PathVariable String id) {
		_mvShare.setViewName("user/product/category");
		int totalData = categoryServiceImpl.GetAllProductById(Integer.parseInt(id)).size();
		PaginatesDto paginatesDto = paginatesServiceImpl.GetInfoPaginates(totalData, totalProduct, 1);
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginateInfo", paginatesDto);
		_mvShare.addObject("productByPaginate", categoryServiceImpl.GetDataProductPaginate(Integer.parseInt(id), paginatesDto.getStart(), totalProduct));
		return _mvShare;
	}
	@RequestMapping(value = "/san-pham/{id}/{currentPage}")
	public ModelAndView Product(@PathVariable String id, @PathVariable String currentPage) {
		
		_mvShare.setViewName("user/product/category");
		int totalData = categoryServiceImpl.GetAllProductById(Integer.parseInt(id)).size();
		PaginatesDto paginatesDto = paginatesServiceImpl.GetInfoPaginates(totalData, totalProduct, Integer.parseInt(currentPage));
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginateInfo", paginatesDto);
		_mvShare.addObject("productByPaginate", categoryServiceImpl.GetDataProductPaginate(Integer.parseInt(id), paginatesDto.getStart(), totalProduct));
		return _mvShare;
	}
}
