package DiamondShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.ProductDao;
import DiamondShop.Dto.ProductDto;
@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	ProductDao productDao = new ProductDao();
	
	public ProductDto GetProductById(long id) {
		List<ProductDto> listProduct = productDao.GetProductById(id);
		return listProduct.get(0);
	}

	@Override
	public List<ProductDto> GetProductByCategoryId(int id) {
		return productDao.GetAllProductById(id);
	}
}
