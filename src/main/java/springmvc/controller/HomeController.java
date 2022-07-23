package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
/*@RequestMapping("/main")*/              // this is also way to use requsetm mapping on class.... means   url is- /main/help
public class HomeController {
	
	
	@RequestMapping("/home")                                 
	public String home() {	
	System.out.println("this is home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about");
		return "about";	
	}
	
	@RequestMapping("/modal")
	public String modal(Model model){
		System.out.println("this is modal........");
		model.addAttribute("name", "subodh");	
		
	/*	List<String> srt= new ArrayList<String>();
		srt.add("hiiiiii");
		srt.add("aman");
		model.addAttribute("list",srt);*/
		return "modal";	
	}
	 
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView  modelAndView =new ModelAndView();
		modelAndView.addObject("name","Subodh Tripathi");
		modelAndView.addObject("roll",63254);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("date",now);
		modelAndView.setViewName("help");		
		return modelAndView;
	}

	@RequestMapping(path="/jspl",method=RequestMethod.GET)    // this is way to use path url with method
/*	@RequestMapping("/jspl")*/
	public ModelAndView jspl() {
		ModelAndView  modelAndView1 =new ModelAndView();
		modelAndView1.addObject("name","Subodh Tripathi");
		modelAndView1.addObject("roll",63254);
		LocalDateTime now = LocalDateTime.now();
		modelAndView1.addObject("date",now);
		List<Integer> list= new ArrayList<Integer>();
		list.add(1111);
		list.add(22222);
		list.add(333333);
		list.add(4444);
		modelAndView1.addObject("marks",list);
		modelAndView1.setViewName("jspl");		
		return modelAndView1;
	}
}
