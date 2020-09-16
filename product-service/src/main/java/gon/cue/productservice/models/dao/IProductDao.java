package gon.cue.productservice.models.dao;

import gon.cue.productservice.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductDao extends CrudRepository<Product,Long> {
}
