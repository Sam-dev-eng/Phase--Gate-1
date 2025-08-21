import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
public class TesterGroceryManagerApp{



@Test
public void testForAddFunction(){

//Arrange
String item = "mango";
//Act
GroceryManagerApp list = new GroceryManagerApp();
String result = list.addItem(item);
//Assert

assertNotEquals(result , "mango");


}



@Test
public void testForResultFunction(){

//Arrange
String item = "tomatoes";
//Act
GroceryManagerApp list = new GroceryManagerApp();
String result = list.addItem(item);
//Assert

assertNotEquals(result , "tomatoes");


}












@Test
public void testForAddidngFunction(){

//Arrange
String item = "mango";
//Act
GroceryManagerApp list = new GroceryManagerApp();
String result = list.addItem(item);
//Assert

assertEquals(result , "MANGO");


}

@Test
public void testForIfTheFunctoinTakesToUpperCase(){

//Arrange
String item = "tomatoes";
//Act
GroceryManagerApp list = new GroceryManagerApp();
String result = list.addItem(item);
//Assert

assertEquals(result , "TOMATOES");


}



@Test
public void testForRemovingFunction(){

//Arrange
String item = "tomatoes";
//Act
GroceryManagerApp list = new GroceryManagerApp();
String result = list.removeItem(item);
//Assert

assertEquals(result , "TOMATOES");


}

@Test
public void testIfRemovingFunctionReturnCapitalletters(){

//Arrange
String item = "pepper";
//Act
GroceryManagerApp list = new GroceryManagerApp();
String result = list.removeItem(item);
//Assert

assertEquals(result , "PEPPER");


}







}