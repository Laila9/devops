package dt13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dt13.category.Category;

@Controller
public class CategoryController 
{
	public CategoryController()
	{
		System.out.println("Hello world");
	}

	@RequestMapping("/Category")
	public ModelAndView goToForm()
	{
		ModelAndView mv=new ModelAndView("Category");
		mv.addObject("ct",new Category());
		return mv;
		}
	
	@RequestMapping (value="/addCategory", method=RequestMethod.POST)
	public String SaveCategory(@ModelAttribute("ct")Category cat)
	{
		System.out.println(""+cat.getCategoryId());
		System.out.println(""+cat.getCategoryName());
		System.out.println(""+cat.getCategoryDescription());
		return "SaveCategory";
}
}

