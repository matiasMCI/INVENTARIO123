package org.biginventory;

import org.biginventory.item.controller.ItemController;
import org.biginventory.item.model.repository.ItemRepository;
import org.biginventory.item.view.ItemView;
import org.biginventory.menu.controller.MenuController;
import org.biginventory.menu.model.repository.MenuRepository;
import org.biginventory.menu.view.MenuView;

public class Main {
    public static void main(String[] args) {

        MenuView menuView = new MenuView();
        MenuRepository menuRepository = new MenuRepository();

        new MenuController(menuRepository,menuView);
    }
}
