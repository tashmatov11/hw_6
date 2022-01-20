package com.peaksoft;

import Table.City;
import Table.Country;
import Table.Mayor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Project: hw_6
 * Author: Tashmatov Bektur
 * Date: 19.01.2022 (19:48)
 */

public class db {
    private final static String url = "jdbc:postgresql://localhost:5432/hw_6";
    private final static String user = "postgres";
    private final static String password = "qwe123";

    public static Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static List<Country> Country() {
        ArrayList<Country> country = new ArrayList<>();
        String SQL = "SELECT * FROM country";
        try (Connection connection = connection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                country.add(new Country(
                        rs.getInt("id"),
                        rs.getString("country"),
                        rs.getString("president"),
                        rs.getString("kod")));
            }
            return country;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static List<City> City() {
        ArrayList<City> city = new ArrayList<>();
        String SQL = "SELECT * FROM city";
        try (Connection connection = connection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                city.add(new City(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("naselenie"),
                        rs.getString("ploshad")));
            }
            return city;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static List<Mayor> Mayor() {
        ArrayList<Mayor> mayor = new ArrayList<>();
        String SQL = "SELECT * FROM mayor";
        try (Connection connection = connection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                mayor.add(new Mayor(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("gender"),
                        rs.getString("date_of_birth"),
                        rs.getString("phone_num")));
            }
            return mayor;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
