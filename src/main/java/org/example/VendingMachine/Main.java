package org.example.VendingMachine;

import org.example.VendingMachine.domen.Bottle;
import org.example.VendingMachine.domen.HotDrink;
import org.example.VendingMachine.domen.Product;
import org.example.VendingMachine.services.CoinDespenser;
import org.example.VendingMachine.services.Display;
import org.example.VendingMachine.services.Holder;
import org.example.VendingMachine.services.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Lays", 132.22, 13);
        Product product2 = new Product(2, "chocolate", 55.20, 10);
        Product product3 = new Product(3, "nuts", 150.00, 8);
        Product product4 = new Bottle(4, "Coca-Cola", 103.00, 3, 1.0);
        Product product5 = new HotDrink(5, "Cappuccino", 150.00, 4, 80.0);
        Product product6 = new HotDrink(6, "Tea", 100.00, 5, 90.0);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        Holder holder = new Holder();
        Display display = new Display();
        CoinDespenser coinDespenser = new CoinDespenser();
        VendingMachine vendingMachine = new VendingMachine(holder, display, coinDespenser, products);
        for (Product product : vendingMachine.getProducts()
        ) {
            System.out.println(product);
        }
    }
}
