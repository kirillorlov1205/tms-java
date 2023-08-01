package practice.taskShop.structure;

public class User {

    private String login;
    private String password;
    private Cart cart;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + cart +
                '}';
    }
}
