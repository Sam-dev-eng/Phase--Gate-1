public class TaskNine{
public static void main(String[] args){


int [] number = {1,2,4,6,78,8};
System.out.printf("%d is the reverse of all the numbers",reverseNumbers(number));

}

public static int[] reverseNumbers(int [] number){

int []reverse = new int [number.length];
int count = number.length-1;
for (; count < 0; count--){

 for (int counter = 0; counter < number.length; counter++){
 reverse[counter] = number[count];
}
}
return reverse;
}
}