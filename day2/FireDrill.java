
public class FireDrill{
public static void main(String[] args){

System.out.println(TaskFive());

}

public static int TaskOne(int fathersAge, int sonAge){

if (sonAge * 2 < fathersAge){
return fathersAge - sonAge * 2;  
}
else{
return sonAge * 2 - fathersAge;
}
}

public static int average(int FirstNumber,int secondNumber,int thirdNumber){

int sum = FirstNumber + secondNumber + thirdNumber;
return sum / 3;

}

public static String grade(int score){

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


public static String TaskTwo(int numOne,int numTwo, int numThree){


int averageNum = average(numOne,numTwo,numThree);

String alpha = grade(averageNum);

return alpha;
}


public static String TaskThree(String []names){

int length = names.length;
int remain = length - 2;
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



public static boolean TaskFour(int milesPerGallon , int numberOfGallonLeft,int numberOfmilesAway){

return numberOfGallonLeft * milesPerGallon >= numberOfmilesAway;


}

public static int TaskFive(){

char alphabet = 'a';
char alphabetTwo = 'f';

return (int)alphabetTwo - (int)alphabet;  

}















}




