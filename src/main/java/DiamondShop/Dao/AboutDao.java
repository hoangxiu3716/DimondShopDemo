package DiamondShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamondShop.Entity.About;
import DiamondShop.Entity.MapperAbout;

@Repository
public class AboutDao extends BaseDao{
	public List<About> GetDataAbout() {
		List<About> list = new ArrayList<About>();
		String sql = "SELECT * FROM about";
		list = _jdbcTemplate.query(sql, new MapperAbout());
		return list;
	}
	public List<About> GetAboutById(int id) {
		String sql = "SELECT * FROM about where id = "+id+" ";
		List<About> listAbout = _jdbcTemplate.query(sql, new MapperAbout());
		return listAbout;
	}
}
