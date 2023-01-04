package DiamondShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperAbout implements RowMapper<About>{

	@Override
	public About mapRow(ResultSet rs, int rowNum) throws SQLException {
		About about = new About();
		about.setId(rs.getInt("id"));
		about.setName(rs.getString("name"));
		about.setDescription(rs.getString("description"));
		about.setDetail(rs.getString("detail"));
		return about;
	}
}
