package ru.job4j.pojo;

import java.awt.*;

public class Shop {
    static public Product delete(Product[] product, int index) {
        Product prDelet = product[index];
        product[index] = null;
        boolean flagStopSort = false;
        for (int step1 = 0; step1 < product.length; step1++) {
            if (flagStopSort) {
                break;
            }
            if (product[step1] == null) {
                for (int step2 = step1; step2 < product.length; step2++) {
                    if (product[step2] != null) {
                        product[step1] = product[step2];
                        product[step2] = null;
                        flagStopSort = false;
                        break;
                    } else {
                        flagStopSort = true;
                    }
                }
            }
        }
        return prDelet;
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
        products[2] = new Product("Egg", 19);

        printArray(products);
        delete(products, 1);
        printArray(products);
        System.out.println(" ");

        Product[] products1 = new Product[8];
        products1[0] = new Product("Milk", 0);
        products1[1] = new Product("Bread", 1);
        products1[2] = new Product("Egg", 2);
        products1[5] = new Product("Bread", 5);
        products1[7] = new Product("Egg", 7);

        printArray(products1);
        System.out.println(" ");
        delete(products1, 5);
        printArray(products1);


    }
}
