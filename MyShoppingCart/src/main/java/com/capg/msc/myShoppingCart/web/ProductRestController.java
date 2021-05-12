package com.capg.msc.myShoppingCart.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.msc.myShoppingCart.beans.Product;
import com.capg.msc.myShoppingCart.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/home")
	public String homeRequest() {
		return "Welcome To My Shopping Cart";
	}
	
	@PostMapping("/product")
	public Product insertProduct(@RequestBody Product product) {
		service.saveProduct(product);
		return product;
	}
	
	@GetMapping("/product")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@PutMapping("/product")
	public Product doUpdate(@RequestBody Product product) {
		return service.updateProduct(product);
	}
    @GetMapping("/product/delete/{id}")
    public List<Product> doDelete(@PathVariable int id) {
    	List<Product> list = service.deleteProductById(id);
    	return list;
    }
    @GetMapping("/products/{category}")
	public List<Product> getAllProductsByCategory(@PathVariable String category)
	{
		return service.getAllProductsByCategory(category);
	}
	
	@GetMapping("/products/{category}/{range1}/{range2}")
	public List<Product> getAllProductsByCategoryAndPrice(@PathVariable String category,
			@PathVariable int range1,@PathVariable int range2)
	{
		return service.getAllProductsByCategoryAndPrice(category, range1, range2);
	}
    
}
