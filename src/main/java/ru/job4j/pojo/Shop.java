package ru.job4j.pojo;

import ru.job4j.profession.Programmer;

import java.awt.*;

public class Shop {
    static public void delete(Product[] product, int index) {
        int length = product.length;
        if (index >= 0 && index < length) {
            if (index != length - 1) {
                for (int step1 = index; step1 < length - 1; step1++) {
                    product[step1] = product[step1 + 1];
                }
                product[length - 1] = null;
            } else {
                product[length - 1] = null;
            }
        }
    }
    static public void printArray(Product[] product) {
        for (Product buff : product) {
            if (buff != null) {
                System.out.println(buff.getName() + " : " + buff.getCount());
            } else {
                System.out.println("null");
            }
        }
    }



    static public void main(String[] args) {
       Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[4] = new Product("Egg", 19);

        printArray(products);
        delete(products, 0);
        System.out.println("______________");
        printArray(products);
        System.out.println(" ");

        Product[] products1 = new Product[8];
        products1[0] = new Product("Milk", 0);
        products1[1] = new Product("Bread", 1);
        products1[2] = new Product("Egg", 2);
        products1[5] = new Product("Bread", 5);
        products1[7] = new Product("Egg", 7);

        printArray(products1);
        System.out.println("_______________");
        delete(products1, 0);
        printArray(products1);
        System.out.println("_______________");
        delete(products1, 0);
        printArray(products1);
        System.out.println("_______________");
        delete(products1, 0);
        printArray(products1);
        System.out.println("_______________");
        delete(products1, 2);
        printArray(products1);

    }
}
