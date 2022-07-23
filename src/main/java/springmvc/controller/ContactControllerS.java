package springmvc.controller;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import springmvc.model.User;


@Controller
public class ContactControllerS {
	
	@ModelAttribute               // if comman content is used many times in all jsp or required pages then use @ModelAttribute annotation..this will call fisrt by default ...
	public void commanContent(Mode m) {
/*		m.addAttribute("Header","this is header content");
		m.addAttribute("Desc","this is Desc Content");*/
		
		// and use this header and desc..........by expression languge in all page ...
		
	}
	
	@RequestMapping("/contactS")
	public String showform(Model m) {
		return "ContactFillS";
	}
	
	/*@RequestMapping(path="/processform",method= RequestMethod.POST)          //HttpServletRequest NOW NOT USING IN SPRING....TO USE.....@Requestparam("param") 
	public String processForm(HttpServletRequest httpservletrequest) {
		String emailVT= httpservletrequest.getParameter("emailV");
		System.out.println("emailV    "+emailVT);
		return "";
	}*/
	
	
	@RequestMapping(path="/processformS",method= RequestMethod.POST)       
	
	public String processForm(@ModelAttribute User user , Model model) {
		System.out.println(user);
		// model.addAttribute("user",user);
		return "successS";
	}

}

