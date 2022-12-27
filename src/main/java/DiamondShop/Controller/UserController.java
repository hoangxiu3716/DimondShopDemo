package DiamondShop.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamondShop.Entity.User;
import DiamondShop.Service.AccountServiceImpl;

@Controller
public class UserController extends BaseController{
	@Autowired
	AccountServiceImpl accountServiceImpl = new AccountServiceImpl();
	
	@RequestMapping(value = "/dang-ky", method = RequestMethod.GET)
	public ModelAndView Register() {
		_mvShare.setViewName("user/account/register");
		_mvShare.addObject("user", new User());
		return _mvShare;
	}
	
	@RequestMapping(value = "/dang-ky", method = RequestMethod.POST)
	public ModelAndView CreateAcc(@ModelAttribute("user") User user) {
		int count = accountServiceImpl.AddAccount(user);
		if(count > 0) {
			_mvShare.addObject("status", "Đăng ký tài khoản thành công!");
		}
		else {
			_mvShare.addObject("status", "Đăng ký tài khoản thất bại!");
		}
		_mvShare.setViewName("user/account/register");
		_mvShare.addObject("status", true);
		return _mvShare;
	}
	@RequestMapping(value = "/dang-nhap", method = RequestMethod.POST)
	public ModelAndView Login(HttpSession session, @ModelAttribute("user") User user) {
		user = accountServiceImpl.CheckAccount(user);
		if(user != null) {
			_mvShare.setViewName("redirect:trang-chu");
			session.setAttribute("LoginInfo", user);
		}else {
			_mvShare.addObject("statusLogin", "Đăng ký tài khoản thất bại!");
		}
		return _mvShare;
	}
	@RequestMapping(value = "/dang-xuat", method = RequestMethod.GET)
	public String Login(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("LoginInfo");
		return "redirect:"+request.getHeader("Referer");
	}
}
