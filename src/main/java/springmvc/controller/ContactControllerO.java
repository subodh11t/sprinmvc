package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;


@Controller
public class ContactControllerO {
	
	@RequestMapping("/contactO")
	public String showform() {
		return "ContactFillO";
	}
	
	/*@RequestMapping(path="/processform",method= RequestMethod.POST)          //HttpServletRequest NOW NOT USING IN SPRING....TO USE.....@Requestparam("param") 
	public String processForm(HttpServletRequest httpservletrequest) {
		String emailVT= httpservletrequest.getParameter("emailV");
		System.out.println("emailV    "+emailVT);
		return "";
	}*/
	
	
	@RequestMapping(path="/processformO",method= RequestMethod.POST)                
	public String processForm(@RequestParam(name="emailV",required=true) String userEmail, @RequestParam("userNameV") String userName,@RequestParam("passwordV") String userpassword ,Model model) {
		
	/*	System.out.println(userEmail+"      "+userName+"      "+userpassword);*/  // this is the second way........with O name files collection....
		
		User user= new User();
		 user.setUserNameV(userName);
		 user.setEmailV(userEmail);
		 user.setPasswordV(userpassword);
 
		 model.addAttribute("user",user);
		return "successO";
	}

}

