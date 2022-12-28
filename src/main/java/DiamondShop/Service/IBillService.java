package DiamondShop.Service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import DiamondShop.Dto.BillDto;
import DiamondShop.Dto.CartDto;
import DiamondShop.Entity.Bill;

@Service
public interface IBillService {
	public int AddBill(Bill bill);
	public void AddBillDetail(HashMap<Long, CartDto> carts);
}
