package gon.cue.itemservice.services;

import java.util.List;

import gon.cue.itemservice.models.Item;

public interface ItemService {
	public List<Item> findAll();

	public Item findById(Long id, Integer amount);

}
