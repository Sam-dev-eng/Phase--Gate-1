import java.util.Scanner;
import java.util.ArrayList;
public class  GroceryManagerApp{
public static ArrayList<String> list = new ArrayList<String>();
public static void main(String[] args){


mainMenu();
}
public static void mainMenu(){
Scanner scanner = new Scanner(System.in);

String menu = """

Welcome To Your Grocery Store :) 

  What's on your mind Today

1-> Add items
2-> Remove items
3-> Show Available items
0-> Exit
""";
System.out.println(menu);
int input = scanner.nextInt();

switch(input){

case 1: 
	System.out.println("Enter the item u want to add");
	String userInput = scanner.next();
	addItem(userInput);		
break;

case 2:
	System.out.println("Which item do you want to remove");
	String removeInput = scanner.next();
	 removeItem(removeInput);		
break;

case 3: availableItem();

break;
case 0: System.out.println("Good Bye!! See you Next Time :)");



}

}


public static String addItem(String input){

String upperCase = input.toUpperCase();
list.add(upperCase);

Scanner scanner = new Scanner(System.in);	

System.out.printf("%s Successfully Added\n\npress 1 for main menu\n\npress 0 to exit\n", input);
int back = scanner.nextInt();
switch(back){
case 1: mainMenu();
break;
case 0: System.out.print("Goodbye");
break;
}
return upperCase;
}


public static String removeItem(String item){
Scanner scanner = new Scanner(System.in);

String upperCase = item.toUpperCase();
list.remove(upperCase);

System.out.printf("%s Successfully Removed\n\npress 1 for main menu\n\npress 0 to exit\n", item);
int back = scanner.nextInt();
switch(back){
case 1: mainMenu();
break;
case 0: System.out.print("Goodbye");
break;
}
return upperCase;
}



public static void availableItem(){
Scanner scanner = new Scanner (System.in);
System.out.println("Available lists are...");
	int counter = 0;
	for (int count = 0; count < list.size(); count++){
	counter++;
	System.out.printf("%d %s\n",counter,list.get(count));
}
System.out.print("press 1 for main menu\npress 0 to exit");
int back = scanner.nextInt();
switch(back){
case 1: mainMenu();
break;
case 0: System.out.print("Goodbye");
break;
}

	
}
















}




