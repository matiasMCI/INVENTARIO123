package org.biginventory.item.model.repository;

import org.biginventory.item.model.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        this.itemList.add(item);
    }
    public void deleteItem(int id){
        for (Item item : itemList)
        {
            if (item.getItem_id() == id)
            {
            this.itemList.remove(item);
            return;
            }
        System.out.println("No esta");
        }
    }


    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
