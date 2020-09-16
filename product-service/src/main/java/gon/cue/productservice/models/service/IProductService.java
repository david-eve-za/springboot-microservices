package gon.cue.productservice.models.service;

import gon.cue.productservice.models.entity.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll();
    public  Product findById(Long id);
}
