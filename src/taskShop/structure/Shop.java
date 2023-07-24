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
                    "5. Покупка товаров, находящихся в корзине\n" +
                    "6. Exit");

            choice = Utilities.getConsoleNumber();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    showCategories();
//                    System.out.println(getCategoriesList());
                    break;
                case 3:
                    try {
                        System.out.println(getCategoryByName().getProductsList());
                    } catch (WrongCategoryNameException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        Category newCategory = getCategoryByName();
                        System.out.println(newCategory.getProductsList());

                        Product newProduct = newCategory.getProductByName();

                        System.out.println("Provide login of the user you want to add a product to");
                        getUserByLogin().getCart().getItemsListInTheBasket().add(newProduct);

                    } catch (WrongCategoryNameException | WrongProductNameException | WrongUserLoginException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
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
        int index = 1;
        for (Category category : categoriesList
             ) {
            System.out.println(index++ + ". " + category.getName() + "\n");
        }
    }
}
