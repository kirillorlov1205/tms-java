package taskShop.structure;

import support.Utilities;
import taskShop.structure.exceptions.WrongProductNameException;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> productsList;

    public Category(String name) {
        this.name = name;
        this.productsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public Product getProductByName() throws WrongProductNameException {

        System.out.println("Provide product name what you wanna add to the cart");
        String productName = Utilities.getConsoleString();

        for (Product product : productsList
        ) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }

        throw new WrongProductNameException("There is no product with name: '" + productName + "'");
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", itemsList=" + productsList +
                '}';
    }
}
