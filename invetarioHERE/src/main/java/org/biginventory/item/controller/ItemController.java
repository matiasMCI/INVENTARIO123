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
        this.itemView.getBtnBorrar().addActionListener(e-> borrarItem());

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
    public void borrarItem() {
        int filaSeleccionada = itemView.getTabla().getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un ítem para borrar.");
            return;
        }

        int id = (int) itemView.getTabla().getValueAt(filaSeleccionada, 0);

        itemRepository.deleteItem(id);
        itemView.mostrar(itemRepository.getItemList());
        JOptionPane.showMessageDialog(null, "Ítem eliminado correctamente.");
    }
}
