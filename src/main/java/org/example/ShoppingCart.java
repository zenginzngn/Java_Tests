package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public boolean containsItem(String item) {
        return items.contains(item);
    }
}
