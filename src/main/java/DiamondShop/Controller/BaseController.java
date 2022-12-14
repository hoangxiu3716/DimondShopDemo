package DiamondShop.Controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import DiamondShop.Service.AboutServiceImpl;
import DiamondShop.Service.HomeServiceImpl;
@Controller
public class BaseController {
	@Autowired
	HomeServiceImpl _homeService;
	@Autowired
	AboutServiceImpl aboutServiceImpl;
	public ModelAndView _mvShare = new ModelAndView();
	
	@PostConstruct
	public ModelAndView Init() {
		_mvShare.addObject("menu", _homeService.GetDataMenu());
		return _mvShare;
	}
	//test commit
}
