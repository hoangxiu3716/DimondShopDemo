package DiamondShop.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DiamondShop.Dto.CartDto;
import DiamondShop.Dto.ProductDto;
@Repository
public class CartDao extends BaseDao{
	@Autowired
	ProductDao productDao = new ProductDao();
	public HashMap<Long, CartDto> AddCart(long id, HashMap<Long, CartDto> cart) {
		CartDto itemCart = new CartDto();
		ProductDto product = productDao.FindProductById(id);
		if (product != null) {
			itemCart.setProduct(product);
			itemCart.setQuanty(1);
			itemCart.setTotalPrice(product.getPrice());
		}
		cart.put(id, itemCart);
		return cart;
	}
	public HashMap<Long, CartDto> EditCart(long id, int quanty, HashMap<Long, CartDto> cart) {
		CartDto itemCart = new CartDto();
		if(cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(quanty);
			itemCart.setTotalPrice(quanty * itemCart.getProduct().getPrice());
		}
		cart.put(id, itemCart);
		return cart;
	}
	public HashMap<Long, CartDto> DeleteCart(long id, HashMap<Long, CartDto> cart) {
		if(cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}
	public int TotalQuanty(HashMap<Long, CartDto> cart) {
		int totalQuanty = 0;
		for (Map.Entry<Long, CartDto> itemCart : cart.entrySet()) {
			totalQuanty += itemCart.getValue().getQuanty();
		}
		return totalQuanty;
	}
	public double TotalPrice(HashMap<Long, CartDto> cart) {
		double totalPrice = 0;
		for (Map.Entry<Long, CartDto> itemCart : cart.entrySet()) {
			totalPrice += itemCart.getValue().getTotalPrice();
		}	
		return totalPrice;
	}
}
