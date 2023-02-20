/*Kathryn bought 600 shares of stock at a price of 21.77 per share. She must pay her stockbroker a 2 percent commission
* for the transaction. Write a program that calculates and displays the following */
public class task5 {
    public static void main(String[] args) {
        double stockPrice=21.77,brokerFee=.02,stockPurchasePrice,commissionPrice,totalPaid;
        int amountBought=600;

        stockPurchasePrice = stockPrice*amountBought;
        commissionPrice = stockPurchasePrice*brokerFee;
        totalPaid = stockPurchasePrice+commissionPrice;

        System.out.println("\nKathryn bought "+amountBought+ " shares of stock.");

        System.out.printf("\nKathryn's cost for the shares was: $%.2f ",stockPurchasePrice);

        System.out.printf("\nKathryn's broker fees were: $%.2f ",commissionPrice);

        System.out.printf("\nKathryn's total price was: $%.2f ",totalPaid);


    }
}
