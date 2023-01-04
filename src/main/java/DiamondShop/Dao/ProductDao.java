package DiamondShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamondShop.Dto.ProductDto;
import DiamondShop.Dto.ProductDtoMapper;

@Repository
public class ProductDao extends BaseDao{
	
	private final boolean YES = true;
	private final boolean NO = false;
	
	private StringBuffer SqlString() {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("	p.id as product_id, ");
		sql.append("	p.category_id, ");
		sql.append("	p.size, ");
		sql.append("	p.name, ");
		sql.append("	p.price, ");
		sql.append("	p.sale, ");
		sql.append("	p.title, ");
		sql.append("	p.highlight, ");
		sql.append("	p.new_product, ");
		sql.append("	p.detail, ");
		sql.append("	c.id as id_color, ");
		sql.append("	c.name as name_color, ");
		sql.append("	c.code as code_color, ");
		sql.append("	c.img, ");
		sql.append("	p.created_at, ");
		sql.append("	p.updated_at ");
		sql.append("FROM ");
		sql.append("product AS p ");
		sql.append("INNER JOIN ");
		sql.append("colors AS c ");
		sql.append("ON p.id = c.product_id ");
		
		return sql;
	}
	private String SqlProduct(boolean newProduct, boolean highlight) {
		StringBuffer  sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		if(highlight) {
			sql.append("AND p.highlight = true ");
		}
		if(newProduct) {
			sql.append("AND p.new_product = true ");
		}
//		sql.append("GROUP BY p.id, c.product_id ");
		sql.append("ORDER BY RAND()");
		if(highlight){
			sql.append("LIMIT 9");
		}
		if(newProduct){
			sql.append("LIMIT 12");
		}
		return sql.toString();
	}
	private StringBuffer SqlProductById(int id) {
		StringBuffer  sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND category_id = "+id+" ");
		return sql;
	}
	
	private String SqlProductPaginate(int id, int start, int totalPage) {
		StringBuffer  sql = SqlProductById(id);
		sql.append("LIMIT " + start + ", " +totalPage);
//		sql.append("LIMIT " + totalPage);
		return sql.toString();
	}
	
	public List<ProductDto> GetDataHighLightProduct() {
		String sql = SqlProduct(NO, YES);
		List<ProductDto> listProduct = _jdbcTemplate.query(sql, new ProductDtoMapper());
				return listProduct;
	}
	public List<ProductDto> GetDataNewProduct() {
		String sql = SqlProduct(YES, NO);
		List<ProductDto> listProduct = _jdbcTemplate.query(sql, new ProductDtoMapper());
				return listProduct;
	}
	public List<ProductDto> GetAllProductById(int id) {
		String sql = SqlProductById(id).toString();
		List<ProductDto> listProduct = _jdbcTemplate.query(sql, new ProductDtoMapper());
				return listProduct;
	}
	public List<ProductDto> GetDataProductPaginate(int id, int start, int totalPage) {
		StringBuffer sqlGetDataById = SqlProductById(id);
		List<ProductDto> listProductById = _jdbcTemplate.query(sqlGetDataById.toString(), new ProductDtoMapper());
		List<ProductDto> listProduct = new ArrayList<>();
		if (listProductById.size() > 0) {
			String sql = SqlProductPaginate(id, start, totalPage);
			listProduct = _jdbcTemplate.query(sql, new ProductDtoMapper());
		}
		return listProduct;
	}
	private String SqlOneProductById(long id) {
		StringBuffer  sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND p.id = "+id+" ");
		sql.append("LIMIT 1 ");
		return sql.toString();
	}
	public List<ProductDto> GetProductById(long id) {
		String sql = SqlOneProductById(id);
		List<ProductDto> listProduct = _jdbcTemplate.query(sql, new ProductDtoMapper());
		return listProduct;
	}
	public ProductDto FindProductById(long id) {
		String sql = SqlOneProductById(id);
		ProductDto product = _jdbcTemplate.queryForObject(sql, new ProductDtoMapper());
		return product;
	}
}

