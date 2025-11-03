package org.biginventory.item.model.repository;

import org.biginventory.item.model.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        this.itemList.add(item);
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
