package Java.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("LoginController/")
	public ModelAndView loginShow(){
		ModelAndView login = new ModelAndView("Login");
		return login;
	}
}