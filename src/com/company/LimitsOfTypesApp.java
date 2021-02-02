package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LimitsOfTypesApp {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("What is the type of primitive?");
        String type = br.readLine();

        switch (type.toLowerCase()) {
            case "byte":
                byte minByte = Byte.MIN_VALUE;
                byte maxByte = Byte.MAX_VALUE;

                System.out.println("Min Byte value = " + minByte);
                System.out.println("Max Byte value = " + maxByte);
                break;
            case "int":
                int minInt = Integer.MIN_VALUE;
                int maxInt = Integer.MAX_VALUE;
                System.out.println("Min Int value = " + minInt);
                System.out.println("Max Int value = " + maxInt);
                break;
            case "float":
                float minFloat = Float.MIN_VALUE;
                float maxFloat = Float.MAX_VALUE;

                System.out.println("Min Float value = " + minFloat);
                System.out.println("Max Float value = " + maxFloat);
                break;

            case "short":
                short minShort = Short.MIN_VALUE;
                short maxShort = Short.MAX_VALUE;
                System.out.println("Min Short value = " + minShort);
                System.out.println("Max Short value = " + maxShort);
                break;

            case "char":
                char minChar = Character.MIN_VALUE;
                char maxChar = Character.MAX_VALUE;
                System.out.println("Min Char value = " + minChar);
                System.out.println("Max Char value = " + maxChar);
                break;
            case "long":
                long minLong = Long.MIN_VALUE;
                long maxLong = Long.MIN_VALUE;
                System.out.println("Min Long value = " + minLong);
                System.out.println("Max Long value = " + maxLong);
                break;
            case "double":
                double minDouble = Double.MIN_VALUE;
                double maxDouble = Double.MAX_VALUE;
                System.out.println("Min Double value = " + minDouble);
                System.out.println("Max Double value = " + maxDouble);
            default:
                System.out.println("Incorrect input");


        }
    }
}


