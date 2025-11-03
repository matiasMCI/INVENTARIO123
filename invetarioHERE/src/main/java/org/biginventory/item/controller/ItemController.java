package org.biginventory.item.controller;

import org.biginventory.item.model.repository.ItemRepository;
import org.biginventory.item.model.entity.Item;
import org.biginventory.item.view.ItemView;

import javax.swing.*;

public class ItemController {
    private final ItemRepository itemRepository;
    private final ItemView itemView;

    public ItemController(ItemRepository itemRepository, ItemView itemView) {
        this.itemRepository = itemRepository;
        this.itemView = itemView;

        // Agregar acción al botón
        this.itemView.getBtnAgregar().addActionListener(e -> crearItem());
    }

    public void crearItem() {
        try {
            Item nuevoItem = itemView.cargar();
            itemRepository.addItem(nuevoItem);
            itemView.mostrar(itemRepository.getItemList());
            itemView.limpiarCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar ítem: " + ex.getMessage());
        }
    }
}
