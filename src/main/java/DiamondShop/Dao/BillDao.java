package DiamondShop.Dao;

import org.springframework.stereotype.Repository;

import DiamondShop.Entity.Bill;
import DiamondShop.Entity.BillDetail;
@Repository
public class BillDao extends BaseDao{
	public int AddBill(Bill bill) {
		StringBuffer  varname1 = new StringBuffer();
		varname1.append("INSERT INTO bill ");
		varname1.append("( ");
		varname1.append("    `user`, `phone`, `displayName`, `address`, `total`, `quanty`, `note` ");
		varname1.append(") ");
		varname1.append("VALUES ");
		varname1.append("( ");
		varname1.append("    '"+bill.getUser()+"', ");
		varname1.append("    '"+bill.getPhone()+"', ");
		varname1.append("    '"+bill.getDisplayName()+"', ");
		varname1.append("    '"+bill.getAddress()+"', ");
		varname1.append("    "+bill.getTotal()+", ");
		varname1.append("    "+bill.getQuanty()+", ");
		varname1.append("    '"+bill.getNote()+"' ");
		varname1.append(");");
		int insert = _jdbcTemplate.update(varname1.toString());
		return insert;
	}
	public long GetIdLastBill() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT MAX(id) FROM bill;");
		long id = _jdbcTemplate.queryForObject(sql.toString(), new Object[] {}, Long.class);
		return id;
	}
	public int AddBillDetail(BillDetail billDetail) {
		StringBuffer  varname1 = new StringBuffer();
		varname1.append("INSERT INTO billdetail ");
		varname1.append("( ");
		varname1.append("    product_id, ");
		varname1.append("    bill_id, ");
		varname1.append("    quanty, ");
		varname1.append("    total ");
		varname1.append(") ");
		varname1.append("VALUES ");
		varname1.append("( ");
		varname1.append("    "+billDetail.getProduct_id()+", ");
		varname1.append("    "+billDetail.getQuanty()+", ");
		varname1.append("    "+billDetail.getTotal()+" ");
		varname1.append(")");
		int insert = _jdbcTemplate.update(varname1.toString());
		return insert;
	}
}
