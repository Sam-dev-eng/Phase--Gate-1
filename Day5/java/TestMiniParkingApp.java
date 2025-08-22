import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestMiniParkingApp{


@Test
public void testForNumberOfSpaces(){

//Arrange
int [] numberOfCars = {1,0,1,1,1,0,0,0,0,1};
//Act
MiniParkingSystem cars = new MiniParkingSystem();
String result = cars.numberOfSpaces(numberOfCars);
//Assert

assertEquals(result , "There are 5 spaces left for now");


}


@Test
public void testForNumberOfNoSpaces(){

//Arrange
int [] numberOfCars = {1,1,1,1,1,1,1,1,1,1};
//Act
MiniParkingSystem cars = new MiniParkingSystem();
String result = cars.numberOfSpaces(numberOfCars);
//Assert

assertEquals(result , "Theres no space left");


}


@Test
public void testForAddSpaceFunctionSpaces(){

//Arrange
int spaceOfCars = 2;
//Act
MiniParkingSystem cars = new MiniParkingSystem();
String result = cars.addspaces(spaceOfCars);
//Assert

assertEquals(result , "Congrates You can go ahead");


}




@Test
public void testForRemoveSpaces(){

//Arrange
int spaceOfCars = 2;
//Act
MiniParkingSystem cars = new MiniParkingSystem();
String result = cars.removeSpaces(spaceOfCars);
//Assert

assertEquals(result , "Removed Sucessfully!!");


}


























}







