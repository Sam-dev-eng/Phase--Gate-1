
let carSpaces = []
for(let count = 0; count < 20; count++){
carSpaces.push(0)
}

function  mainMenu(){
console.log("Welcome to our parking Space\n\n");

let input = prompt(` 
Press -->

1 -> Book a space

2 -> Remove Space

3 -> Exit `);


switch(input){
case 1: promptAddSpace();
break;
case 2: promptRemoveSpace();
break;

case 3: System.out.println("GoodBye fam");
break;

default: System.out.println("Invalid");

}
}





function promptAddSpace(){

	console.log(numberOfSpaces(carSpaces));
	input = prompt("Before we proceesd do u want to Know the available spaces-> (yes/no)");
	
	let lowerCase = input.lower();

	switch(lowerCase){
case "yes": 
		positionOfspaces(carSpaces);
		input = prompt("\n\nPlease Kindle Choose the NUMBER you want to occupy");
		
		console.log(addspaces(numinput));
		let contnue = 0;
		do{
		contnue = prompt("\nWould u like to choose another NUMbER\n\nPress\n1-> yes\n\n2-> no??");
		
		if (contnue == 1){
		secInput = prompt("Choose a number you will like to occupy");
		
		console.log(addspaces(secInput));
		}	
				}while(contnue != 2);	
 		
		backMenu  = prompt(`
 Press->
1 -> Back to main menu
2-> Check available Spaces 
3-> exit
`)


switch(backInput){
case 1: mainMenu();
case 2: console.log(numberOfSpaces(carSpaces));
	backInput = prompt("Press 1 for main menu or 0 to exit");
	switch(backInput){
	case 1: mainMenu();
	case 2: console.log("GoodBye fam"); 		
			}
case 3: console.log("Bye for now");

}

break;
case "no": console.log("Okey Goodbye I hope to see you next Time");
break;

default: console.log("Invalid Input");
}


}








function promptRemoveSpace(){
spaceNumber = prompt("Thanks for parking with us\n\ninput the NUMBER of space u want to Remove");
console.log(removeSpaces(spaceNumber));



 backInput = prompt(`
 Press->
1 -> Back to main menu
2-> Check available Spaces 
3-> exit
`)

switch(backInput){
case 1: mainMenu();
case 2: console.log(numberOfSpaces(carSpaces));
	backInput = prompt("Press 1 for main menu or 0 to exit");
	
	switch(backInput){
	case 1: mainMenu();
	case 2: console.log("GoodBye fam"); 		
			}
case 3: console.log("Bye for now");

}


}













function numberOfSpaces(cars){

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


function positionOfspaces(availableSpaces){
console.log("The available spaces are: \nspace:");
for (int countIndex = 0; countIndex < availableSpaces.length; countIndex++){ 
if (availableSpaces[countIndex] == 0){
console.log(countIndex +" "); 

}
}
}
function String addspaces(input){

if (carSpaces[input] == 0){
carSpaces[input] = 1;
}
else{
return "The spaces is already occupied";
}
return "Congrates You can go ahead";
}

function removeSpaces(int input){

carSpaces[input] = 0;

return "Removed Sucessfully!!";
}


}  

















