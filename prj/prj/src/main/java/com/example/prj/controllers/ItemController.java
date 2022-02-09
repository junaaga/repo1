package com.example.prj.controllers;

import com.example.prj.models.Item;
import com.example.prj.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;


    @GetMapping("/list")
    public String listItems(Model theModel) {

        List<Item> theItem = itemService.findAll();
        theModel.addAttribute("items", theItem);

        return "items/inventoryItem";
    }

    @GetMapping("/showAddItemForm")
    public String addItem(Model theModel) {

        Item theItem = new Item();
        theModel.addAttribute("item", theItem);

        return "items/addItem";
    }

    @GetMapping("/showUpdateItemForm")
    public String showUpdateShoeForm(@RequestParam("itemId") Long id, Model theModel) {
        Item theItem = itemService.findById(id);
        theModel.addAttribute("item", theItem);
        return "items/addItem";
    }


    @PostMapping("/save")
    public String save(@ModelAttribute("item") Item theItem) {

        itemService.save(theItem);
        return "redirect:/items/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("itemId") Long id) {

        itemService.deleteById(id);
        return "redirect:/items/list";

    }


}
