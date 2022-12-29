package DiamondShop.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.BillDao;
import DiamondShop.Dto.BillDto;
import DiamondShop.Dto.CartDto;
import DiamondShop.Entity.Bill;
import DiamondShop.Entity.BillDetail;
@Service
public class BillServiceImpl implements IBillService{
	@Autowired
	private BillDao billDao;
	
	public int AddBill(Bill bill) {
		return billDao.AddBill(bill);
	}

	
	public void AddBillDetail(HashMap<Long, CartDto> carts) {
		
		long idBill = billDao.GetIdLastBill();
		
		for(Map.Entry<Long, CartDto> itemCart : carts.entrySet()) {
			BillDetail billDetail = new BillDetail();
			billDetail.setBill_id(idBill);
			billDetail.setProduct_id(itemCart.getValue().getProduct().getProduct_id());
			billDetail.setQuanty(itemCart.getValue().getQuanty());
			billDetail.setTotal(itemCart.getValue().getTotalPrice());
			billDao.AddBillDetail(billDetail);
		}
	}

}
