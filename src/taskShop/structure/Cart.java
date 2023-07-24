package taskShop.structure;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> itemsListInTheBasket;

    public Cart() {
        this.itemsListInTheBasket = new ArrayList<>();
    }

    public ArrayList<Product> getItemsListInTheBasket() {
        return itemsListInTheBasket;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "itemsListInTheBasket=" + itemsListInTheBasket +
                '}';
    }
}
