package org.biginventory.menu.view;
import org.biginventory.item.view.ItemView;

import javax.swing.*;
import java.awt.*;

public class MenuView extends JFrame {


    public MenuView(){

    setTitle("Menu principal");
    setSize(1280, 720);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    JPanel panelMenu = new JPanel(new GridLayout(3, 3, 10, 10));
    panelMenu.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton btnItems = new JButton("Items");
        JButton btnUsuarios = new JButton("Gestión de usuarios");
        JButton btnSalir = new JButton("Salir");

    btnItems.addActionListener(e->{
        try{
        this.setVisible(false);
        new ItemView(this);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error al cargar");
        }
    });
    btnUsuarios.addActionListener(e->{
        JOptionPane.showMessageDialog(this,"Abrir gestion de usuarios");
    });
    btnSalir.addActionListener(e->{
        int confirmar = JOptionPane.showConfirmDialog(this,
                "Seguro que desea salir?", "Confirmar salida",JOptionPane.YES_NO_OPTION);
        if (confirmar == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    });
    panelMenu.add(btnItems);
    panelMenu.add(btnUsuarios);
    panelMenu.add(btnSalir);
    add(panelMenu, BorderLayout.CENTER);

        setVisible(true);

    }

}
