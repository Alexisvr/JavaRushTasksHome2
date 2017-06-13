package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String productName;
        String price;
        String quantity;
        String id;


        switch (args[0]) {
            case "-c": {
                productName = args[1];
                if (args.length > 4) {
                    for (int i = 2; i < args.length - 2; i++) {
                        productName += " " + args[i];
                    }
                }
                price = args[args.length - 2];
                quantity = args[args.length - 1];
                AddProduct(productName, price, quantity, fileName);
                break;
            }
            case "-u": {
                id = args[1];
                productName = args[2];
                if (args.length > 5) {
                    for (int i = 3; i < args.length - 2; i++) {
                        productName += " " + args[i];
                    }
                }
                price = args[args.length - 2];
                quantity = args[args.length - 1];
                UpdateProduct(id, productName, price, quantity, fileName);
                break;
            }
            case "-d": {
                id = args[1];
                DeleteProduct(id, fileName);
                break;
            }
        }
    }


    private static void AddProduct(String productName, String price, String quantity, String fileName) throws IOException {

        Long id = GetMaxId(fileName) + 1;
        String fina;
        fina = "\r\n" + String.format("%-8d%-30s%-8s%-4s", id, productName, price, quantity);
        System.out.println(fina);
        FileInputStream file1 = new FileInputStream(fileName);
        byte[] d1 = new byte[file1.available() - 1];
        file1.read(d1);
        file1.close();
        FileOutputStream file = new FileOutputStream(fileName);
        file.write(d1);
        file.write(fina.getBytes());
        file.close();
    }

    private static void DeleteProduct(String id, String fileName) throws IOException {

        id = id.trim();
        BufferedReader fis = new BufferedReader(new FileReader(fileName));
        List all = new ArrayList<>();
        while (fis.ready()) {
            String s = fis.readLine();
            if (s.substring(0, 8).trim().equals(id)) ;
            else all.add(s);
        }
        fis.close();

        BufferedWriter fos = new BufferedWriter(new FileWriter(fileName));
        for (Object s : all) {
            fos.write(s + System.getProperty("line.separator"));
        }
        fos.close();

    }

    private static void UpdateProduct(String id, String productName, String price, String quantity, String fileName) throws IOException {
        if (productName.length() > 30)
            productName = productName.substring(0,30);
        else {
            while (productName.length() < 30)
                productName = productName + " ";
        }

        while (price.length() < 8)
            price = price + " ";

        while (quantity.length() < 4)
            quantity = quantity + " ";

        while (id.length() < 8)
            id = id+" ";

        BufferedReader fis = new BufferedReader(new FileReader(fileName));

        List all = new ArrayList<>();
        while (fis.ready()) {
            String s = fis.readLine();
            if (s.substring(0,8).equals(id))
                s = id + productName + price + quantity;
            all.add(s);
        }
        fis.close();

        BufferedWriter fos = new BufferedWriter(new FileWriter(fileName));

        for (Object s : all)
            fos.write (s + System.getProperty("line.separator"));
        fos.close();
    }

    private static long GetMaxId(String fileName) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(fileName));
        long maxId = 0;
        String line;
        while ((line = file.readLine()) != null) {
            line = line.split(" ")[0];
            if (line.length() > 8) {
                line = line.substring(0, 8);
            }
            long iD = Long.parseLong(line.trim());
            if (iD > maxId) {
                maxId = iD;
            }
        }
        file.close();
        return maxId;
    }
}

