const prompt = require('prompt-sync')();
let list = []

function mainMenu(){
let menu = prompt(`
Welcome To Your Grocery Store :) 

  What's on your mind Today

1-> Add items
2-> Remove items
3-> Show Available items
0-> Exit
`);

switch(menu){

case 1: addItem();	
break;

case 2:removeItem()		
break;

case 3: availableItem();

break;
case 0: console.log("Good Bye!! See you Next Time :)");

}
}





function addItem(){

let userInput = prompt("Enter the item u want to add");
let upperCase = userInput.toUpperCase();
list.push(upperCase);
console.log(`${userInput} Successfully Added`);
let back = prompt("press 1 for main menu\n\npress 0 to exit\n")
switch(back){
case 1: mainMenu();
break;
case 0: console.log("Goodbye");
break;
}
}





function removeItem(){
let removeInput = prompt("Which item do you want to remove");
let upperCase = removeInput.toUpperCase();
list.remove(upperCase);

console.log(f`${removeInput} Successfully Removed`);
let back = prompt("press 1 for main menu\n\npress 0 to exit\n")
switch(back){
case 1: mainMenu();
break;
case 0: console.log("Goodbye");
break;
}
}






function availableItem(){
console.log("Available lists are...");
	let counter = 0;
	for (let count = 0; count < list.length; count++){
	counter++;
	console.log(f`${counter }{list[count]}`);
		}
let back = prompt("press 1 for main menu\npress 0 to exit");
switch(back){
case 1: mainMenu();
break;
case 0: console.log("Goodbye");
break;
}
}

mainMenu();