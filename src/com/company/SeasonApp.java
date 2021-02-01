package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonApp {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("What is the month?");
        String currentMonth = br.readLine();

        switch (currentMonth.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                System.out.println(FourSeasons.WINTER);
                break;

            case "march":
            case "april":
            case "may":
                System.out.println(FourSeasons.SPRING);
                break;
            case "june":
            case "jule":
            case "august":
                System.out.println(FourSeasons.SUMMER);
                break;
            case "september":
            case "october":
            case "november":
                System.out.println(FourSeasons.AUTUMN);
                break;
            default:
                System.out.println("Incorrect input");
        }
    }
}