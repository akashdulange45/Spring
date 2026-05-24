package in.ad.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotal() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public void clear() {
        items.clear();
    }
}
