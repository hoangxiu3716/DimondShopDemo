package DiamondShop.Dao;

import org.springframework.stereotype.Repository;

import DiamondShop.Dto.ProductDto;
import DiamondShop.Dto.ProductDtoMapper;
import DiamondShop.Entity.MapperUser;
import DiamondShop.Entity.User;
@Repository
public class UserDao extends BaseDao{
	public int AddAccount(User user) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO user ");
		sql.append("( ");
		sql.append("	user, ");
		sql.append("	password, ");
		sql.append("	displayName, ");
		sql.append("	address ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("	'"+user.getUser()+"', ");
		sql.append("	'"+user.getPassword()+"', ");
		sql.append("	'"+user.getDisplayName()+"', ");
		sql.append("	'"+user.getAddress()+"' ");
		sql.append(")");
		
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	public User GetUserByAcc(User user) {
		String sql = "SELECT * FROM user WHERE user = '"+user.getUser()+"'";
		User result = _jdbcTemplate.queryForObject(sql, new MapperUser());
		return result;
	}
}
