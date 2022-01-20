package com.peaksoft;

import Table.City;

import java.util.List;
import java.util.Scanner;

/**
 * Project: hw_6
 * Author: Tashmatov Bektur
 * Date: 19.01.2022 (19:47)
 */

public class App {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main( String[] args ){
        System.out.println("| id | country   | president               | kod |");
        System.out.println("+————+———————————+—————————————————————————+—————+");
        System.out.println(db.Country());
        System.out.println("\n| id | city    | naselenie | ploshad  |");
        System.out.println("+————+—————————+———————————+——————————+");
        System.out.println(db.City());
        System.out.println("\n| id | first_name | last_name  | gender | date_of_birth | phone_num        |");
        System.out.println("+————+————————————+————————————+————————+———————————————+——————————————————+");
        System.out.println(db.Mayor());
        pattern(db.City());
    }

    public static void pattern(List<City> city){
        while(true){
            System.out.println(ANSI_GREEN + "\nВведите id города для просмотра" + ANSI_RESET);
            System.out.println(ANSI_RED + "Введите - для завершения" + ANSI_RESET);
            try {
                Scanner scanner = new Scanner(System.in);
                String id = scanner.nextLine();
                if (id.equals("-")) {
                    System.exit(0);
                }
                System.out.println("| id | city    | naselenie | ploshad  |");
                System.out.println("+————+—————————+———————————+——————————+");
                System.out.printf("|%-4s", city.get(Integer.parseInt(id) - 1).getId());
                System.out.printf("|%-9s", city.get(Integer.parseInt(id) - 1).getName());
                System.out.printf("|%-11s", city.get(Integer.parseInt(id) - 1).getNaselenie());
                System.out.printf("|%-10s", city.get(Integer.parseInt(id) - 1).getPloshad());
                System.out.printf("|");
                System.out.println();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
