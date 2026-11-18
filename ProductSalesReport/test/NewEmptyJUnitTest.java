package salesreport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ProductTest {
private Product createProduct() {
String[] names = {
"Cozy Nights Monarch",
"Restonic Barbados",
"Sealy Phuket"
};
int[][] sales = {
{25, 18, 20},
{15, 10, 12},
{18, 15, 20}
};
return new Product(names, sales);
}
@Test
public void 
GetTotalProductSales_WithValidData_ReturnsCo
rrectValue() {
Product product = createProduct();
assertEquals(153, 
product.GetTotalProductsSold());
}
@Test
public void 
GetAverageSales_WithValidData_ReturnsCorrect
Value() {
Product product = createProduct();
assertEquals(17.0,
product.GetAverageProductsSold(), 0.001);
}
}