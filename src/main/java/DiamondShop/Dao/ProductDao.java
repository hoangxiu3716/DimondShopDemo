package DiamondShop.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import DiamondShop.Dto.ProductDto;
import DiamondShop.Dto.ProductDtoMapper;

@Repository
public class ProductDao extends BaseDao{
	
	private String SqlString() {
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
		sql.append("ON p.id = c.product_id");
		return sql.toString();
	}
	
	public List<ProductDto> GetDataProduct() {
		String sql = SqlString();
		List<ProductDto> listProduct = _jdbcTemplate.query(sql, new ProductDtoMapper());
				return listProduct;
	}
}
