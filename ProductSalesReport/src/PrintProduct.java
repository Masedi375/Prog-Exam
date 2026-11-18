package salesreport;
public class PrintProduct {
private Product product;
public PrintProduct(Product product) {
this.product = product;
}
public void PrintTotalProductSales() {
System.out.println("TOTAL PRODUCT SALES: "
+ product.GetTotalProductsSold());
}
public void PrintAverageProductSales() {
System.out.println("AVERAGE PRODUCT SALES: "
+ product.GetAverageProductsSold());
}
public void PrintMostPopularProduct() {
System.out.println("MOST POPULAR PRODUCT: "
+ product.GetMostPopularProduct());
}
public void PrintReport() {
System.out.println("PRODUCT SALES REPORT - 2026\");

System.out.println("********************************\");

PrintTotalProductSales();
PrintAverageProductSales();
PrintMostPopularProduct();
}
}
