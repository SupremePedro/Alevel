package ua.com.alevel.classworks.lesson10.geometry;

import ua.com.alevel.classworks.lesson11.enums.ColorProvider;
import ua.com.alevel.classworks.lesson11.enums.Colors;
import ua.com.alevel.classworks.lesson11.enums.singleton.DatabaseConnection;
import ua.com.alevel.classworks.lesson11.exception.Calculator;

import javax.xml.crypto.Data;

public class Runner {
    public static void main(String[] args) {
//        Rectangle rectangle;
//        System.out.println();
//
//        ColorProvider colorProvider = new ColorProvider(Colors.GREEN);
//        System.out.println(colorProvider);
//
//        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
//        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();

        Calculator calculator = new Calculator(12,4);
        calculator.getDivision();
        throw new Error();
        //System.out.println(calculator.getAnswer());

    }
}
