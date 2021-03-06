package com.springAngular.westeros.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springAngular.westeros.domain.Category;

@RestController
@RequestMapping(value="/category")
public class CategoryResource {
	

	@RequestMapping(method=RequestMethod.GET)
	public List<Category> listar() {
		
		Category cat1 = new Category(1,"Graph");
		Category cat2 = new Category(2,"Node");
		Category cat3 = new Category(3,"Edge"); 
		
		List<Category> list = new ArrayList<>();
		
		list.add(cat1);
		list.add(cat2);
		list.add(cat3);
		
		
		return list;
	}

}
