package dt13.controller;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import dt13.dao.ProductDao;
import dt13.model.Product;


@Controller

public class ProductController {
	
@Autowired
ProductDao daoImpl;
		@RequestMapping("/products")
		public ModelAndView goToForm()
		{
			ModelAndView mv=new ModelAndView("products");
			mv.addObject("pr",new Product());
			return mv;
			}
		
		@RequestMapping (value="/addProduct", method=RequestMethod.POST)
		public String saveProduct(@ModelAttribute("pr")Product pro)
		{
			
			System.out.println(pro);
			System.out.println(""+pro.getProductId());
			System.out.println(""+pro.getProductName());
			System.out.println(""+pro.getProductPrice());
			pro.setProductId((int)(Math.random()*10000));
			
			try
            {
            MultipartFile image=pro.getImage();
        byte imageInbytes[] =   image.getBytes();
        
        String path="D://JavaPrograms/eshop/src/main/webapp/Resources/proimg/";
        path=path+pro.getProductId()+".png";
        System.out.println("img---------------"+image);
        if(image!=null)
        {
            System.out.println("img---------------"+image);
            File file=new File(path);
            FileOutputStream  fos= new FileOutputStream(file);
            BufferedOutputStream  bos=new BufferedOutputStream(fos);
            bos.write(imageInbytes);
bos.close();            
            
            //image.transferTo(new File(path));
        }
            }
        
        catch(Exception e)
        
        {
        	
        }
        
			daoImpl.addProduct(pro);
			System.out.println("this is product");
			return "AdminHome";
			
	}
		@RequestMapping ("/AdminHome")
		public String ah()
		{
			return "AdminHome";
		}
		//v
		@RequestMapping("/v")
        public ModelAndView getProducts()
        {
			 List<Product> productList=daoImpl.getProducts();
			 
          ModelAndView mv=new ModelAndView("ViewProducts","pro",productList);
        ///get data from database and hold it in list
           
          mv.addObject(productList);
           System.out.println(productList);
            return mv;
        }
		
		

		
		@GetMapping("/ViewProducts")
		public ModelAndView showSingleProduct(@RequestParam("proId") int ProductId)
		{
			Product p=daoImpl.getProduct(ProductId);	 
		ModelAndView mv=new ModelAndView("Single","products",p);
		
       return mv;
		}

		@RequestMapping("/AdminProducts")
        public ModelAndView adminProducts()
        {
			 List<Product> productList=daoImpl.getProducts();
			 
          ModelAndView mv=new ModelAndView("AdminProducts");
        ///get data from database and hold it in list
           
          mv.addObject("productList",productList);
           System.out.println(productList);
            return mv;
        }
		
		}

