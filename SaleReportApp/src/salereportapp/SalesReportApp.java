package salesreport;
import java.util.Scanner;
public class SalesReportApp {
public static void main(String[] args) {
Scanner input = new Scanner(System.in
String[] products = {
"Cozy Nights Monarch",
"Restonic Barbados",
"Sealy Phuket"
};
int[][] sales = new int[3][3];
);
for (int row = 0; row < products.length; row++) {
for (int col = 0; col < 3; col++) {
System.out.print("Enter sales for month "
+ (col + 1) + " for "
+ products[row] + ": ");
sales[row][col] = input.nextInt();
}
System.out.println();
}
Product product = new Product(products, sales);
PrintProduct report = new PrintProduct(product);
report.PrintReport();
input.close();
}
}
