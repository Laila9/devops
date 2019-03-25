package dt13.controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dt13.model.UserDetails;

@Controller
public class LoginController 

{
	@RequestMapping("/Login")
     ModelAndView elogin()
	{
	    ModelAndView mv=new ModelAndView("Login");
	   
	    return mv;
	}
	
	
	@RequestMapping("/on_login_success")
	public String onLoginSuccess(HttpSession session)
	{
		//get Authentication object

		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		//get login user
		String un=authentication.getName();
		session.setAttribute("uname", un);
		
		//get All authorities
	    Collection<GrantedAuthority> list=    (Collection<GrantedAuthority>)authentication.getAuthorities();
	    String page="";
	//check authorities with ROLE_USER and ROLE_ADMIN
	    for(GrantedAuthority authority:list)
	    {
	        if(authority.getAuthority().equals("ROLE_USER"))
	        {
	            page="GuestHome";
	        }
	        else
	        {
	            page="AdminHome";
	        }
	    }
	    return page;
	
}
	

}
