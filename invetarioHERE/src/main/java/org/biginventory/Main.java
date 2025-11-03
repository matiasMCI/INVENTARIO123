package org.biginventory;

import org.biginventory.item.controller.ItemController;
import org.biginventory.item.model.repository.ItemRepository;
import org.biginventory.item.view.ItemView;

public class Main {
    public static void main(String[] args) {
        ItemRepository itemRepository = new ItemRepository();
        ItemView itemView = new ItemView();
        new ItemController(itemRepository, itemView);
    }
}
