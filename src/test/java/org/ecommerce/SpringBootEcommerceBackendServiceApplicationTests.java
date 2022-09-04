package org.ecommerce;

import java.util.List;

import org.ecommerce.model.Category;
import org.ecommerce.model.Product;
import org.ecommerce.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SpringBootEcommerceBackendServiceApplicationTests {

	@Autowired
	private ProductRepository productRepo;
	
	
	@Test
	public void findAllMethodTest()
	{
		List<Product> productList=productRepo.findAll();
		assertNotNull(productList);	
		
	}
	
	
	//test of add product functionality
	
	@Test
	public void testAddProductMethod()
	{
		Product product=new Product();
		
		product.setProductName("demo product");
		product.setProductDescription("demo product");
		product.setProductPrice(2000);
		product.setProductQuantity(3);
		
		Category category=new Category();
		category.setCategoryId(1);
		
		
		product.setCategory(category);

		
		assertNotNull(productRepo.save(product));
	}
	
	
	
	
	

}
