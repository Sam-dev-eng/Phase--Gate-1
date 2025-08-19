import java.util.Scanner;
public class TastThree{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number to check if its divisibel by three");
int input = scanner.nextInt();

if (input % 3 == 0){
System.out.printf("%d is divisible by 3", input);
}else{
System.out.printf("%d is not divisible by 3", input);

}
}


}