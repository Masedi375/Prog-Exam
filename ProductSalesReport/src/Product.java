package salesreport;
public class Product implements IProducts {
private String[] productNames;
private int[][] sales;
public Product(String[] productNames, int[][] 
sales) {
this.productNames = productNames;
this.sales = sales;
}
@Override
public int GetTotalProductsSold() {
int total = 0;
for (int row = 0; row < sales.length; row++) {
for (int col = 0; col < sales[row].length; col++) {
total += sales[row][col];
}
}
return total;
}
@Override
public double GetAverageProductsSold() {
int count = 0;
for (int row = 0; row < sales.length; row++) {
count += sales[row].length;
}
if (count == 0) {
return 0;
}
return (double) GetTotalProductsSold() / count;
}
@Override
public String GetMostPopularProduct() {
int highestTotal = -1;
String popularProduct = "";
for (int row = 0; row < sales.length; row++) {
int productTotal = 0;
for (int col = 0; col < sales[row].length; col++) {
productTotal += sales[row][col];
}
if (productTotal > highestTotal) {
highestTotal = productTotal;
popularProduct = productNames[row];
}
}
return popularProduct;
        
        }
} 

