import java.util.Arrays;
import java.util.Scanner;
public class MiniParkingSystem{
public static int [] carSpaces = new int [20];
public static void main (String[] args){

mainMenu();

}

public static void mainMenu(){
Scanner scanner = new Scanner(System.in);
System.out.println("Welcome to our parking Space\n\n");

String theMainMenu = """
Press -->

1 -> Book a space

2 -> Remove Space

3 -> Exit """;
System.out.println(theMainMenu);
int userInput = scanner.nextInt();

switch(userInput){
case 1: promptAddSpace();
break;
case 2: promptRemoveSpace();
break;

case 3: System.out.println("GoodBye fam");
break;

default: System.out.println("Invalid");

}
}





public static void promptAddSpace(){
Scanner scanner = new Scanner (System.in);
	System.out.println(numberOfSpaces(carSpaces));
	System.out.println("Before we proceesd do u want to Know the available spaces-> (yes/no)");
	String input = scanner.next();
	String lowerCase = input.toLowerCase();

	switch(lowerCase){
case "yes": 
		positionOfspaces(carSpaces);
		System.out.println("\n\nPlease Kindle Choose the NUMBER you want to occupy");
		int numinput = scanner.nextInt();
		System.out.print(addspaces(numinput));
		int contnue = 0;
		do{
		System.out.println("\nWould u like to choose another NUMbER\n\nPress\n1-> yes\n\n2-> no??");
		contnue = scanner.nextInt();
		if (contnue == 1){
		System.out.println("Choose a number you will like to occupy");
		int secInput = scanner.nextInt();
		System.out.print(addspaces(secInput));
		}	
				}while(contnue != 2);	
 		
		String backMenu = """
 Press->
1 -> Back to main menu
2-> Check available Spaces 
3-> exit
""";
System.out.println(backMenu);
int backInput = scanner.nextInt();
switch(backInput){
case 1: mainMenu();
case 2: System.out.println(numberOfSpaces(carSpaces));
	System.out.println("Press 1 for main menu or 0 to exit");
	backInput = scanner.nextInt();
	switch(backInput){
	case 1: mainMenu();
	case 2: System.out.println("GoodBye fam"); 		
			}
case 3: System.out.println("Bye for now");

}

break;
case "no": System.out.print("Okey Goodbye I hope to see you next Time");
break;

default: System.out.print("Invalid Input");
}


}








public static void promptRemoveSpace(){
Scanner scanner = new Scanner(System.in);
 System.out.println("Thanks for parking with us\n\ninput the NUMBER of space u want to Remove");
int spaceNumber = scanner.nextInt();
System.out.print(removeSpaces(spaceNumber));



String backMenu = """
 Press->
1 -> Back to main menu
2-> Check available Spaces 
3-> exit
""";
System.out.println(backMenu);
int backInput = scanner.nextInt();
switch(backInput){
case 1: mainMenu();
case 2: System.out.println(numberOfSpaces(carSpaces));
	System.out.println("Press 1 for main menu or 0 to exit");
	backInput = scanner.nextInt();
	switch(backInput){
	case 1: mainMenu();
	case 2: System.out.println("GoodBye fam"); 		
			}
case 3: System.out.println("Bye for now");

}


}













public static String numberOfSpaces(int[] cars){

int counter = 0;
int index = 0;
for(int count = 0; count < cars.length; count++){
if (cars[count] == 0){
counter++;
}
}
if (counter == 0){
return "Theres no space left";
}
return "There are "+counter+" spaces left for now";
}


public static void positionOfspaces(int [] availableSpaces){
System.out.println("The available spaces are: \nspace:");
for (int countIndex = 0; countIndex < availableSpaces.length; countIndex++){ 
if (availableSpaces[countIndex] == 0){
System.out.print(countIndex +" "); 

}
}
}
public static String addspaces(int input){

if (carSpaces[input] == 0){
carSpaces[input] = 1;
}
else{
return "The spaces is already occupied";
}
return "Congrates You can go ahead";
}

public static String removeSpaces(int input){

carSpaces[input] = 0;

return "Removed Sucessfully!!";
}


}  

















