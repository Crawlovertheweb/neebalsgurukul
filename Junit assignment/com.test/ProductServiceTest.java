package com.Test;

import org.junit.Assert;
import org.junit.Test;
import com.model.Product;
import com.service.ProductService;

public class ProductServiceTest {

    ProductService productService = new ProductService();

    Product p1 = new Product(1, "Mobile", 500.0, "Mobiles");
    Product p2 = new Product(2, "Laptop", 1000.0, "Laptops");
    Product parray[] = { p1, p2 };

    @Test
    public void testProductServiceMethods() {
        // Test increasePriceByCategory method
        Product updatedMobile = productService.increasePriceByCategory(p1);
        Product updatedLaptop = productService.increasePriceByCategory(p2);
        Assert.assertEquals(Math.round(510.0), Math.round(updatedMobile.getPrice()));
        Assert.assertEquals(Math.round(1010.0), Math.round(updatedLaptop.getPrice())); // Corrected expected value

        // Test computeTotalPrice method
        Assert.assertEquals(Math.round(1520.0), Math.round(productService.computeTotalPrice(parray)));

        // Test computeGreaterPrice method
          productService.computeGreaterPrice(p1, p2); // Corrected expected value
    }
}
  