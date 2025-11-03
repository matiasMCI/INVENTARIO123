package org.biginventory.item.model.entity;

public class Item {
     private int item_id;
     private static Integer cont = 0;
     private String nombre;
     private double precio;
     private int cantidad;

     public Item(String nombre, double precio, int cantidad) {
          this.item_id = ++cont;
          this.nombre = nombre;
          this.precio = precio;
          this.cantidad = cantidad;
     }

     public int getItem_id() {
          return item_id;
     }

     public void setItem_id(int item_id) {
          this.item_id = item_id;
     }

     public static Integer getCont() {
          return cont;
     }

     public static void setCont(Integer cont) {
          Item.cont = cont;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public double getPrecio() {
          return precio;
     }

     public void setPrecio(double precio) {
          this.precio = precio;
     }

     public int getCantidad() {
          return cantidad;
     }

     public void setCantidad(int cantidad) {
          this.cantidad = cantidad;
     }

     @Override
     public String toString() {
          return "Item{" +
                  "item_id=" + item_id +
                  ", nombre='" + nombre + '\'' +
                  ", precio=" + precio +
                  ", cantidad=" + cantidad +
                  '}';
     }
}
