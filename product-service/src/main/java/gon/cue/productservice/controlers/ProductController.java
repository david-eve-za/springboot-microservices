package gon.cue.productservice.controlers;

import gon.cue.productservice.models.entity.Product;
import gon.cue.productservice.models.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/list")
    public List<Product> list(){
        return productService.findAll();
    }

    @GetMapping("/detail/${id}")
    public Product detail(@PathVariable Long id){
        return productService.findById(id);
    }
}
