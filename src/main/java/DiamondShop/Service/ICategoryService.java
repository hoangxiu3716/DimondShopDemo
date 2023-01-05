package DiamondShop.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import DiamondShop.Dto.ProductDto;
@Service
public interface ICategoryService {
//	public List<ProductDto> GetDataProductPaginate(int start, int end);
	public List<ProductDto> GetAllProductById(int id);
	List<ProductDto> GetDataProductPaginate(int id, int start, int totalPage);
	public List<ProductDto> GetAllProductBySearch(String search);
	List<ProductDto> GetDataProductPaginateBySearch(String search, int start, int totalPage);
}
