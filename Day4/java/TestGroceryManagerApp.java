import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestGroceryManagerApp{



@Test
public void testForAddidngFunction(){

//Arrange
String item = "mango";
//Act
GroceryManagerApp list = new GroceryManagerApp();
int result = list.addItem(item);
//Assert

assertEquals(result , "Thanks for using my function");


}

}