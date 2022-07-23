package springmvc.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showform() {
		return "ContactFill";
	}
	
	/*@RequestMapping(path="/processform",method= RequestMethod.POST)          //HttpServletRequest NOW NOT USING IN SPRING....TO USE.....@Requestparam("param") 
	public String processForm(HttpServletRequest httpservletrequest) {
		String emailVT= httpservletrequest.getParameter("emailV");
		System.out.println("emailV    "+emailVT);
		return "";
	}*/
	
	
	@RequestMapping(path="/processform",method= RequestMethod.POST)                
	public String processForm(@RequestParam(name="emailV",required=true) String userEmail, @RequestParam("userNameV") String userName,@RequestParam("passwordV") String userpassword ,Model model) {
		
		System.out.println(userEmail+"      "+userName+"      "+userpassword);
		model.addAttribute("email",userEmail);
		model.addAttribute("username",userName);
		model.addAttribute("pass",userpassword);
		return "success";
	}

}
