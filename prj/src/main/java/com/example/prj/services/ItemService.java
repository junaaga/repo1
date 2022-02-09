package com.example.prj.services;

import com.example.prj.models.Item;
import com.example.prj.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;
    public List<Item> findAll() {
        return itemRepository.findAll();
    }


    public Item findById(Long id) {
        Optional<Item> u = itemRepository.findById(id);
        if (u.isPresent()) {
            return u.get();
        } else {
            return null;
        }
    }
    // Save

    public void save(Item item) {
        itemRepository.save(item);

    }
    // Delete
    public void deleteById(Long id) {
        itemRepository.deleteById(id);
    }
}
