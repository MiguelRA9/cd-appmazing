package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.IProductService;
import com.campusdual.appmazing.model.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/products")
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping
    public String testController(){
        return "Product controller works!";
    }

    @PostMapping
    public String testController(@RequestBody String name){
        return "Product controller works, "+ name + "!";
    }

    @GetMapping(value = "/testMethod")
    public String testControllerMethod(){
        return "Product controller method works!";
    }

    @PostMapping(value = "/get")
    public ProductDto queryProduct(@RequestBody ProductDto product){
        return this.productService.queryProduct(product);
    }

    @GetMapping(value = "/getAll")
    public List<ProductDto> queryAllProducts(){return this.productService.queryAllProducts();}

    @PostMapping(value = "/add")
    public int insertProduct(@RequestBody ProductDto productDto){return this.productService.insertProduct(productDto);}

    @PutMapping(value = "/update")
    public int updateProduct(@RequestBody ProductDto productDto){return this.productService.updateProduct(productDto);}

    @DeleteMapping(value = "/delete")
    public int deleteProduct(@RequestBody ProductDto productDto){return this.productService.deleteProduct(productDto);}
}
