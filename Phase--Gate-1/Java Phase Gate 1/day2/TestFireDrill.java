import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFireDrill{

@Test
public void TestIftheresultIsCorrect(){

//Arrange
int sonAge = 10;
int FatherAge = 25;

//Act
FireDrill drill = new FireDrill();
int result = drill.TaskOne(FatherAge, sonAge); 
//Assert
assertEquals(result , 5);


}

@Test
public void TestIfTheTwiceIsGreaterThanTheFathersage(){

//Arrange
int sonAge = 15;
int FatherAge = 25;

//Act
FireDrill drill = new FireDrill();
int result = drill.TaskOne(FatherAge, sonAge); 
//Assert
assertEquals(result , 5);


}

@Test
public void TestIfTheTwiceIsLessThanTheFatersAge(){

//Arrange
int sonAge = 10;
int FatherAge = 30;

//Act
FireDrill drill = new FireDrill();
int result = drill.TaskOne(FatherAge, sonAge); 
//Assert
assertEquals(result , 10);
}

@Test
public void TestIfTheTwiceIsLessEqualToFathersAge(){

//Arrange
int sonAge = 15;
int FatherAge = 30;

//Act
FireDrill drill = new FireDrill();
int result = drill.TaskOne(FatherAge, sonAge); 
//Assert
assertEquals(result , 0);
}

@Test
public void TestforAverage(){

//Arrange
int firstNum = 60;
int secondNum = 30;
int thirdNum = 90;
//Act
FireDrill drill = new FireDrill();
int result = drill.average(firstNum, secondNum, thirdNum); 
//Assert
assertEquals(result , 60);
}

@Test
public void TestforGrade(){

//Arrange
int score = 90;
//Act
FireDrill drill = new FireDrill();
String result = drill.grade(score); 
//Assert
assertEquals(result , "A");
}


@Test
public void TestforGradeC(){

//Arrange
int score = 75;
//Act
FireDrill drill = new FireDrill();
String result = drill.grade(score); 
//Assert
assertEquals(result , "C");
}


@Test
public void TestforGradeF(){

//Arrange
int score = 20;
//Act
FireDrill drill = new FireDrill();
String result = drill.grade(score); 
//Assert
assertEquals(result , "F");
}


@Test
public void TestforTaskTwo(){

//Arrange
int firstNum = 60;
int secondNum = 30;
int thirdNum = 90;
//Act
FireDrill drill = new FireDrill();
String result = drill.TaskTwo(firstNum, secondNum, thirdNum); 
//Assert
assertEquals(result , "D");
}

@Test
public void TestTaskTwoForDecimal(){

//Arrange
int firstNum = 600;
int secondNum = 30;
int thirdNum = 40;
//Act
FireDrill drill = new FireDrill();
String result = drill.TaskTwo(firstNum, secondNum, thirdNum); 
//Assert
assertEquals(result , "invalid");
}


@Test
public void TestForMoreThanThreeNamesInTaskThree(){

//Arrange
String [] names = {"chika", "Emma","bustavo"};
//Act
FireDrill drill = new FireDrill();
String result = drill.TaskThree(names); 
//Assert
assertEquals(result , "chika,Emma and 1 others like this");
}




@Test
public void TestForTwoNamesInTaskThree(){

//Arrange
String [] names = {"chika", "Emma"};
//Act
FireDrill drill = new FireDrill();
String result = drill.TaskThree(names); 
//Assert
assertEquals(result , "chika and Emma like this");
}



@Test
public void TestForOneNamesInTaskThree(){

//Arrange
String [] names = {"chika"};
//Act
FireDrill drill = new FireDrill();
String result = drill.TaskThree(names); 
//Assert
assertEquals(result , "chika like this");
}

@Test
public void TestForNoNamesInTaskThree(){

//Arrange
String [] names = {};
//Act
FireDrill drill = new FireDrill();
String result = drill.TaskThree(names); 
//Assert
assertEquals(result , "no one likes this");
}











}