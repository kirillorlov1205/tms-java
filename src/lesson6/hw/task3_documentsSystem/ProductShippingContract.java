package lesson6.hw.task3_documentsSystem;

import java.util.Date;

public class ProductShippingContract extends Document {

    private String productType;
    private int productsQuantity;

    public ProductShippingContract(int documentNumber, Date documentDate, String productType, int productsQuantity) {
        super(documentNumber, documentDate);
        this.productType = productType;
        this.productsQuantity = productsQuantity;
    }

    public ProductShippingContract() {
    }

    @Override
    public String toString() {
        return "ProductShippingContract{" +
                "productType='" + productType + '\'' +
                ", productsQuantity=" + productsQuantity +
                '}';
    }
}
