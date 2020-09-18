package gon.cue.itemservice.clients;

import gon.cue.itemservice.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product-service")
public interface IProductRest {

    @GetMapping("/list")
    public List<Product> list();

    @GetMapping("/detail/{id}")
    public Product detail(@PathVariable Long id);

}
