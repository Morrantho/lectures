package com.codingdojo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController
{

	@GetMapping("/")
	public String home()
	{
		String content="";
		for(int i=0;i<10;i++)
		{
			content+="<h1>Hello World "+i+"</h1>";
		}
		return content;
	}
	
	// /users?username=billy
	@GetMapping("/search")
	public String search( @RequestParam(value="username",required=false) String searchTerm )
	{
		return "<h1>You have searched for: "+searchTerm+"</h1>";
	}
	
	@GetMapping("/user/{user_id}")
	public String findUser( @PathVariable("user_id") Integer id )
	{
		
		return "<h1>You have searched for user #: "+id+"</h1>";
	}
	
	@GetMapping("/categories/{category_id}/products/{product_id}")
	public String findProduct
	(
		@PathVariable("category_id") Long cat_id,
		@PathVariable("product_id") Long prod_id
	)
	{
		return "You have selected category "+cat_id+" and product "+prod_id;
	}

	@GetMapping("/daikichi/{id}")
	public String daikichi(@PathVariable("id") int id)
	{
		if(id%2==0)
		{
			return "Even";
		}
		else
		{
			return "Odd";
		}
	}
};