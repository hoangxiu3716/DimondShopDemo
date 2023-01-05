package DiamondShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.ProductDao;
import DiamondShop.Dto.ProductDto;
@Service
public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<ProductDto> GetAllProductById(int id) {
		List<ProductDto> dtos = productDao.GetAllProductById(id);
		return dtos;
	}
	@Override
	public List<ProductDto> GetDataProductPaginate(int id, int start, int totalPage) {
		List<ProductDto> productDtos = productDao.GetDataProductPaginate(id, start, totalPage);
		return productDtos;
	}
	@Override
	public List<ProductDto> GetAllProductBySearch(String search) {
		List<ProductDto> dtos = productDao.GetAllProductByString(search);
		return dtos;
	}
	@Override
	public List<ProductDto> GetDataProductPaginateBySearch(String search, int start, int totalPage) {
		List<ProductDto> productDtos = productDao.GetDataProductPaginateBySearch(search, start, totalPage);
		return productDtos;
	}
}
