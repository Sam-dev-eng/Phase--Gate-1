function TaskOne(fathersAge, sonAge){

if (sonAge * 2 < fathersAge){
return fathersAge - sonAge * 2;  
}
else{
return sonAge * 2 - fathersAge;
}

}

//console.log(TaskOne(30,10))



function average(FirstNumber,secondNumber,thirdNumber){

let sum = FirstNumber + secondNumber + thirdNumber;
return sum / 3;

}

function grade(score){

if (score >= 90 && score <= 100){
return "A";
}else
if (score >= 80 && score < 90){
 return "B";
}else
if (score >= 70 && score < 80){
return "C";
}else
if (score >= 60 && score < 70){
return "D";
}else
if (score >= 0 && score < 60){
return "F";
}
return "invalid";
}


function TaskTwo(numOne,numTwo, numThree){


let averageNum = average(numOne,numTwo,numThree);

let alpha = grade(averageNum);

return alpha;
}






function TaskThree(names){

let length = names.length;
let remain = length - 2;
if (length == 0){ 
return "no one likes this"; 
}else
if (length == 1){
return names[0] + " like this";
}else
if (length == 2){
return names[0] +" and "+names[1]+" like this";
}

return names[0] + "," + names[1] + " and " + remain + " others like this";
}





names = ["Amaka", "Samuel","Daniel","Makaveli"];
console.log(TaskThree(names));


















