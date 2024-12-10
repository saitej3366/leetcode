import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        Locale us = Locale.US;
    NumberFormat usFormat = NumberFormat.getCurrencyInstance(us);
    String usFormatted = usFormat.format(payment);

    // India Locale
    Locale india = new Locale("en", "IN");
    NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(india);
    String indiaFormatted = indiaFormat.format(payment);

    // China Locale
    Locale china = Locale.CHINA;
    NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(china);
    String chinaFormatted = chinaFormat.format(payment);

    // France Locale
    Locale france = Locale.FRANCE;
    NumberFormat franceFormat = NumberFormat.getCurrencyInstance(france);
    String franceFormatted = franceFormat.format(payment);

    // Print results
    System.out.println("US: " + usFormatted);
    System.out.println("India: " + indiaFormatted);
    System.out.println("China: " + chinaFormatted);
    System.out.println("France: " + franceFormatted);
    }
}
