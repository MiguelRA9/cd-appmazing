package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.ProductDto;

import java.util.List;

public interface IProductService {
    //CRUD Operations
    ProductDto queryProduct(ProductDto product);
    List<ProductDto> queryAllProducts();
    int insertProduct(ProductDto product);
    int updateProduct(ProductDto product);
    int deleteProduct(ProductDto product);

}
