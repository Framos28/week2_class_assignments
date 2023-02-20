/*The East Coast sales division of a company generates 62 percent of total sales based on the percentage
* write a program that will predict how much the east coast division will generate if the company has 4.6 million
* in sales this year.*/

public class task3 {
    public static void main(String[] args) {
        double percentage=0.62,sales=4.6;
        double predictedSales=sales*percentage;
        System.out.printf("\nThe East Coast Sales Division produced: $ "+predictedSales+" Million dollars.");

    }

}
