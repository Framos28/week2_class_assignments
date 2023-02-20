/*Write a program that will ask the user to enter the amount of a purchase. The program should then compute the state
* and the county sales tax. Assmue the state tax is 4 percent and the county is 3 percent. The program should display
* the amount of the purchase, the state tax, county sales tax, total sales tax, and the total cost of the sale.*/

import javax.swing.*;

public class task4 {
    public static void main(String[] args) {

        double purchasePrice,stateSalesTax=.04,countySalesTax=.02,afterState,afterCounty,totalTax,finalAmount;
        String input;

        input=JOptionPane.showInputDialog("Please enter the amount of the item purchased");
        purchasePrice=Double.parseDouble(input);//converts string value from input into a double

        afterState=purchasePrice*stateSalesTax;
        afterCounty=purchasePrice*countySalesTax;
        totalTax=afterState+afterCounty;
        finalAmount=totalTax+purchasePrice;


        System.out.printf("\nThe price for the item purchased is $%.2f", purchasePrice);
        System.out.printf("\nThe State Tax for the item purchased is $%.2f", afterState);
        System.out.printf("\nThe County Tax for the item purchased is $%.2f", afterCounty);
        System.out.printf("\nThe Total Tax for the item purchased is $%.2f", totalTax);
        System.out.printf("\nThe Final Price for the item purchased is $%.2f", finalAmount);


    }
}
