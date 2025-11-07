package org.biginventory.menu.controller;

import org.biginventory.menu.model.repository.MenuRepository;
import org.biginventory.menu.view.MenuView;

public class MenuController {
    private  final MenuRepository menuRepository;
    private  final MenuView menuView;

    public MenuController(MenuRepository menuRepository, MenuView menuView) {
        this.menuRepository = menuRepository;
        this.menuView = menuView;
    }
}
