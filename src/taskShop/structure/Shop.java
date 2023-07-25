package taskShop.structure;

import support.Utilities;
import taskShop.structure.exceptions.WrongCategoryNameException;
import taskShop.structure.exceptions.WrongProductNameException;
import taskShop.structure.exceptions.WrongUserLoginException;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Category> categoriesList;
    private ArrayList<User> usersList;

    public Shop() {
        this.categoriesList = new ArrayList<>();
        this.usersList = new ArrayList<>();
    }

    public void menu() {
        int choice;

        do {
            System.out.println("Choose action: \n" +
                    "1. Login\n" +
                    "2. Show Categories\n" +
                    "3. Show products by category name\n" +
                    "4. Select a product to add in cart \n" +
                    "5. Buy a product in the cart\n" +
                    "6. Exit");

            choice = Utilities.getConsoleNumber();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    showCategories();
                    System.out.println(getCategoriesList());
                    break;
                case 3:
                    try {
                        showCategories();
                        getCategoryByName().showProducts();
                    } catch (WrongCategoryNameException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        addProductToCart();
                    } catch (WrongCategoryNameException | WrongProductNameException | WrongUserLoginException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        buyProductInCart();
                    } catch (WrongUserLoginException | WrongProductNameException e) {
                        System.out.println(e.getMessage());
                    }

            }
        } while (choice != 6);
    }

    public void login() {
        System.out.println("Provide login");
        String login = Utilities.getConsoleString();
        System.out.println("Provide password");
        String password = Utilities.getConsoleString();
        System.out.println("User has been logged in successfully\n" +
                "Login: '" + login + "'" +
                "Password: '" + password + "'");
    }

    public Category getCategoryByName() throws WrongCategoryNameException {
        System.out.println("Provide category name");
        String categoryName = Utilities.getConsoleString();

        for (Category category : categoriesList
        ) {
            if (category.getName().equals(categoryName)) {
                return category;
            }
        }
        throw new WrongCategoryNameException("There is no such category with name: '" + categoryName + "'");
    }

    public User getUserByLogin() throws WrongUserLoginException {
        String login = Utilities.getConsoleString();

        for (User user : usersList
        ) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }

        throw new WrongUserLoginException("There is no user with login: '" + login + "'");
    }

    public ArrayList<Category> getCategoriesList() {
        return categoriesList;
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void showCategories() {
        System.out.println("Categories: ");
        int index = 1;
        for (Category category : categoriesList
        ) {
            System.out.println(index++ + ". " + category.getName());
        }
        System.out.println();
    }

    public void showUsers() {
        System.out.println("Users: ");
        int index = 1;
        for (User user : usersList
        ) {
            System.out.println(index++ + ". " + user.getLogin());
        }
        System.out.println();
    }

    public void addProductToCart() throws WrongCategoryNameException, WrongProductNameException, WrongUserLoginException {
        showCategories();
        Category newCategory = getCategoryByName();

        newCategory.showProducts();
        Product newProduct = newCategory.getProductByName();

        showUsers();
        System.out.println("Provide login of the user you want to add a product to");

        User newUser = getUserByLogin();
        newUser.getCart().getProductsListInTheCart().add(newProduct);
        System.out.println("Product: '" + newProduct.getName() + "' has been added to the user with login: '"
                + newUser.getLogin() + "'");
    }

    public void buyProductInCart() throws WrongUserLoginException, WrongProductNameException {
        showUsers();
        System.out.println("Provide user login");
        User newUser = getUserByLogin();

        if (newUser.getCart().getProductsListInTheCart().isEmpty()) {
            System.out.println("Cart is empty");
        }else {
            newUser.getCart().showProductsInCart();
            Product newProduct = newUser.getCart().getProductInCartByName();
            newUser.getCart().getProductsListInTheCart().remove(newProduct);
            System.out.println("Product: '" + newProduct.getName() + "' has been bought\n");
        }
    }
}
