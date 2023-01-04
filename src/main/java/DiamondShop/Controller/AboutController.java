package DiamondShop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AboutController extends BaseController{
	
	@RequestMapping(value = "/about")
	public ModelAndView About() {
		_mvShare.addObject("about", aboutServiceImpl.GetDataAbout());
		_mvShare.addObject("highLightProduct", _homeService.GetDataHighLightProduct());
		_mvShare.setViewName("user/about/about");
		return _mvShare;
	}
	@RequestMapping(value = "/about/{id}")
	public ModelAndView AboutDetail(@PathVariable int id) {
		_mvShare.addObject("about", aboutServiceImpl.GetDataAbout());
		_mvShare.addObject("highLightProduct", _homeService.GetDataHighLightProduct());
		_mvShare.addObject("aboutDetail", aboutServiceImpl.GetAboutById(id));
		_mvShare.setViewName("user/about/aboutDetail");
		return _mvShare;
	}
}
