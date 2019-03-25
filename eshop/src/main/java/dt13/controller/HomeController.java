package dt13.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import dt13.dao.UserDao;
import dt13.model.UserDetails;

@Controller

public class HomeController {
	@Autowired
    UserDao userDao;


	@Autowired
	UserDao daoImpl;
	
public HomeController()
{
	System.out.println("hoell");
}
	
	@RequestMapping("/Home")
	String Admin()
	{
	//ProductDaoImpl DaoImpl=new ProductDaoImpl();
	//pdaoImpl.addProduct(new Product());
	return "AdminHome";
	}
	
@RequestMapping("/Register")
public ModelAndView register()
{
    ModelAndView mv=new ModelAndView("Register");
    mv.addObject("User",new UserDetails());
    return mv;
}

@RequestMapping(value="/AddUser",method=RequestMethod.POST)
public String adduser(@ModelAttribute("User") UserDetails userdetails)
{
	System.out.println(userdetails.getEmail());
	System.out.println(userdetails.getPassword());
	System.out.println(userdetails.getMobile());
	System.out.println(userdetails.getRole());
	daoImpl.addUserDetails(userdetails);
	return "redirect:/";
	
}




}

