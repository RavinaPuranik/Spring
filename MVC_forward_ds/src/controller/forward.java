package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;


public class forward  {
//use of MultiAction Controller

	public ModelAndView empSave(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		Map<String,String> m=new HashMap<String,String>();
		m.put("msg","MultiActionController emp save...name: " +name+"email "+email);
		ModelAndView mav=new ModelAndView("success",m);
		return mav;
	}
	
	public ModelAndView empUpdate(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String id=req.getParameter("id");
		Map<String,String> m=new HashMap<String,String>();
		m.put("msg","MultiActionController emp update...name: " +name+"email "+email+"id "+id);
		ModelAndView mav=new ModelAndView("success",m);
		return mav;
	}

}
