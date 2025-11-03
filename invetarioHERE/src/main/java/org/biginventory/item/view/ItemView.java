package org.biginventory.item.view;

import org.biginventory.item.model.entity.Item;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class ItemView extends JFrame {
    private JTextField txtNombre;
    private JTextField txtPrecio;
    private JTextField txtCantidad;
    private JButton btnAgregar;
    private JTable tabla;
    private DefaultTableModel modeloTabla;

    public ItemView() {
        setTitle("Inventario de Ítems");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior con formulario
        JPanel panelFormulario = new JPanel(new GridLayout(4, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Agregar nuevo ítem"));

        panelFormulario.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelFormulario.add(txtNombre);

        panelFormulario.add(new JLabel("Precio:"));
        txtPrecio = new JTextField();
        panelFormulario.add(txtPrecio);

        panelFormulario.add(new JLabel("Cantidad:"));
        txtCantidad = new JTextField();
        panelFormulario.add(txtCantidad);

        btnAgregar = new JButton("Agregar ítem");
        panelFormulario.add(btnAgregar);

        add(panelFormulario, BorderLayout.SOUTH);

        // Tabla para mostrar ítems
        modeloTabla = new DefaultTableModel(new Object[]{"ID", "Nombre", "Precio", "Cantidad"}, 0);
        tabla = new JTable(modeloTabla);
        add(new JScrollPane(tabla), BorderLayout.CENTER);

        setVisible(true);
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public Item cargar() {
        String nombre = txtNombre.getText();
        double precio = Double.parseDouble(txtPrecio.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());

        return new Item(nombre, precio, cantidad);
    }

    public void mostrar(List<Item> itemList) {
        modeloTabla.setRowCount(0); // limpiar tabla
        for (Item item : itemList) {
            modeloTabla.addRow(new Object[]{
                    item.getItem_id(),
                    item.getNombre(),
                    item.getPrecio(),
                    item.getCantidad()
            });
        }
    }

    public void limpiarCampos() {
        txtNombre.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");
    }
}

