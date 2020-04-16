package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;
//using abstract controller
public class HelloController extends AbstractController {

	
	@Override
	
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name=req.getParameter("name");
		ModelAndView mav;
		mav=new ModelAndView("success");
		mav.addObject("msg", "Hello..with parameterized view controller.."+name);
		return mav;
	}

}
