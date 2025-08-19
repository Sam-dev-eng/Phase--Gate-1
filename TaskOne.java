import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter two integers");
int inputOne = scanner.nextInt();
int inputTwo = scanner.nextInt();
int squareInputOne = inputOne * inputOne;
int squareInputTwo = inputTwo * inputTwo;

System.out.println("Square of each Number is: " + squareInputOne +" and "+ squareInputTwo);    
System.out.printf("Sum of their Squares are: %d%n" , squareInputOne + squareInputTwo);
System.out.printf("Difference of the two squares are: %d%n", squareInputOne - squareInputTwo);


}



}