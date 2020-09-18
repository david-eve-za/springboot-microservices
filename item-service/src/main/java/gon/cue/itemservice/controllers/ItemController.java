package gon.cue.itemservice.controllers;

import gon.cue.itemservice.models.Item;
import gon.cue.itemservice.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    @Qualifier("serviceFeign")
    private ItemService itemService;

    @GetMapping("/list")
    public List<Item> list(){
        return itemService.findAll();
    }

    @GetMapping("/detail/{id}/amount/{amount}")
    public Item detail(@PathVariable Long id,@PathVariable Integer amount){
        return itemService.findById(id, amount);
    }
}
