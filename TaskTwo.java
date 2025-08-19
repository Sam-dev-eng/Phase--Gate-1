import java.util.Scanner;
public class TaskTwo{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter three integers");
int inputOne = scanner.nextInt();

int product = 1;
int sum = 0;
int average = 0;
int largest = inputOne;
int smallest = inputOne;

for(int count = 0; count < 2; count++){
System.out.println("Enter three integers");
int inputTwo = scanner.nextInt();
sum += inputTwo;
product *= inputTwo;


if (inputTwo > largest){
largest = inputTwo;
}
if (inputTwo < smallest){
smallest = inputTwo;
}
}

System.out.printf("Sum of the numbers are: %d%n", sum + inputOne );
System.out.printf("Product of the numbers are: %d%n", product * inputOne );
System.out.printf("Largest number is: %d%n", largest);
System.out.printf("Smallest number is: %d%n", smallest);

}


}