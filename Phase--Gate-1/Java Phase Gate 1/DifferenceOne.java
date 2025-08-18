import java.util.Arrays;
import java.util.Scanner;
public class DifferenceOne{
public static void main(String[] args){

System.out.println(encrypt());
System.out.println(decrypt());
}







public static int encrypt(){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter 4 digit number ");
int input = scanner.nextInt();

int digitOne = input % 10;
int divideOne = input / 10;
int digitTwo = divideOne % 10;
int divideTwo = divideOne / 10;
int digitThree = divideTwo % 10;
int divideThree = divideTwo / 10;
int digitFour = divideThree % 10;


int constant = 7;

int  firstDigit = digitOne + constant;
int secondDigit = digitTwo + constant;
int thirdDigit = digitThree + constant;
int FourthDigit = digitFour + constant;

int firstDiv = firstDigit % 10;
int secondDiv = secondDigit % 10;
int thirdDiv = thirdDigit % 10;
int fourthDiv = FourthDigit % 10;

int [] digit = new int[4];

digit[0] = thirdDiv;
digit[1] = firstDiv;
digit[2] = fourthDiv;
digit[3] = secondDiv;


int number = 0;
for (int count = 0; count < digit.length; count++){
number = number * 10 + digit[count];
}

return number;

}





















public static int decrypt(){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter 4 numbers");
int input = scanner.nextInt();


int digitOne = input % 10;
int divideOne = input / 10;
int digitTwo = divideOne % 10;
int divideTwo = divideOne / 10;
int digitThree = divideTwo % 10;
int divideThree = divideTwo / 10;
int digitFour = divideThree % 10;

int [] number = new int[4]; 

number[0] = digitTwo; 
number[1] = digitFour;
number[2] = digitOne;
number[3] = digitThree; 


for (int count = 0; count < number.length; count++){

if (number[count] + 10 - 7 > 10){
number[count] = (number[count] + 10 - 7) % 10;
}else{
number[count] += 10 - 7;
}
}

int digits = 0;
for (int counter = 0; counter < number.length; counter++){
digits = digits * 10 + number[counter];
}


return digits;
}

}