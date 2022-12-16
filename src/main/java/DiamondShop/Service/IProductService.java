package DiamondShop.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import DiamondShop.Dto.ProductDto;

@Service
public interface IProductService {
	public ProductDto GetProductById(long id);
	public List<ProductDto> GetProductByCategoryId(int id);
}
