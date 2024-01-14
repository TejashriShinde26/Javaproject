package mypack;

import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getTitle() + " by " + getAuthor() + " - Rs " + getPrice();
    }
}

class ShoppingCart {
    private Book[] items;
    private int itemCount;

    public ShoppingCart(int capacity) {
        this.items = new Book[capacity];
        this.itemCount = 0;
    }

    public void addItem(Book book) {
        if (itemCount < items.length) {
            items[itemCount++] = book;
        } else {
            System.out.println("Shopping cart is full. Cannot add more items.");
        }
    }

    public void removeItem(Book book) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equals(book)) {
                // Shift remaining elements to fill the gap
                for (int j = i; j < itemCount - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[itemCount - 1] = null; // Set the last element to null
                itemCount--;
                return;
            }
        }
        System.out.println("Book not found in the shopping cart.");
    }

    public Book[] getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0;
        for (Book book : items) {
            if (book != null) {
                total += book.getPrice();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Shopping Cart:\n");
        for (Book book : items) {
            if (book != null) {
                sb.append(book.toString()).append("\n");
            }
        }
        sb.append("Total: Rs ").append(calculateTotal());
        return sb.toString();
    }
}

class User {
    private String username;
    private ShoppingCart shoppingCart;

    public User(String username, int cartCapacity) {
        this.username = username;
        this.shoppingCart = new ShoppingCart(cartCapacity);
    }

    public String getUsername() {
        return username;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public String toString() {
        return getUsername();
    }
}

class OnlineBookstore {
    private Book[] availableBooks;
    private int bookCount;
    private User[] users;
    private int userCount;

    public OnlineBookstore(int bookCapacity, int userCapacity) {
        this.availableBooks = new Book[bookCapacity];
        this.bookCount = 0;
        this.users = new User[userCapacity];
        this.userCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < availableBooks.length) {
            availableBooks[bookCount++] = book;
        } else {
            System.out.println("Bookstore is full. Cannot add more books.");
        }
    }

    public void registerUser(User user) {
        if (userCount < users.length) {
            users[userCount++] = user;
        } else {
            System.out.println("User limit reached. Cannot register more users.");
        }
    }

    public Book[] getAvailableBooks() {
        return availableBooks;
    }

    public User[] getUsers() {
        return users;
    }
}

public class Main {
    public static void main(String[] args) {
        OnlineBookstore bookstore = new OnlineBookstore(10, 5);

        Book book1 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K Rolling", 100);
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", "J.K Rolling", 200);

        bookstore.addBook(book1);
        bookstore.addBook(book2);

        User user1 = new User("Tejashri", 3);

        bookstore.registerUser(user1);
       

        Scanner scanner = new Scanner(System.in);

        User loggedInUser = null;

        int choice;
        do {
            System.out.println("Online Bookstore Menu:");
            System.out.println("1. View Available Books");
            System.out.println("2. Log In");
            System.out.println("3. Purchase a Book");
            System.out.println("4. View Shopping Cart");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAvailableBooks(bookstore);
                    break;
                case 2:
                    loggedInUser = loginUser(bookstore, scanner);
                    break;
                case 3:
                    if (loggedInUser != null) {
                        purchaseBook(loggedInUser, bookstore, scanner);
                    } else {
                        System.out.println("Please log in before purchasing a book.");
                    }
                    break;
                case 4:
                    if (loggedInUser != null) {
                        displayShoppingCart(loggedInUser);
                    } else {
                        System.out.println("Please log in before viewing the shopping cart.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting the Online Bookstore. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void displayAvailableBooks(OnlineBookstore bookstore) {
        System.out.println("Available Books:");
        for (Book book : bookstore.getAvailableBooks()) {
            if (book != null) {
                System.out.println(book.toString());
            }
        }
        System.out.println();
    }

    private static User loginUser(OnlineBookstore bookstore, Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.next();

        for (User user : bookstore.getUsers()) {
            if (user != null && user.getUsername().equals(username)) {
                System.out.println("Login successful. Welcome, " + user.getUsername() + "!");
                return user;
            }
        }

        System.out.println("User not found. Please check your username and try again.");
        return null;
    }

    private static void purchaseBook(User user, OnlineBookstore bookstore, Scanner scanner) {
        displayAvailableBooks(bookstore);

        System.out.print("Enter the title of the book you want to purchase: ");
        scanner.nextLine(); // Consume the newline character
        String title = scanner.nextLine();

        for (Book book : bookstore.getAvailableBooks()) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                user.getShoppingCart().addItem(book);
                System.out.println("Book added to your shopping cart.");
                return;
            }
        }

        System.out.println("Book not found. Please check the title and try again.");
    }

    private static void displayShoppingCart(User user) {
        System.out.println(user.getUsername() + "'s Shopping Cart:");
        System.out.println(user.getShoppingCart().toString());
        System.out.println();
    }
}




