package gon.cue.itemservice.services;

import gon.cue.itemservice.clients.IProductRest;
import gon.cue.itemservice.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("serviceFeign")
public class ItemServiceFeign implements ItemService {

    @Autowired
    private IProductRest productRest;

    @Override
    public List<Item> findAll() {
        return productRest.list().stream().map(product -> new Item(product, 1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer amount) {
        return new Item(productRest.detail(id), amount);
    }
}
