public class TaskNine{
public static void main(String[] args){


int [] number = {1,2,4,6,78,8};
System.out.printf("%d is the reverse of all the numbers",reverseNumbers(number));

}

public static int[] reverseNumbers(int [] number){

int []reverse = new int [number.length];
int num = 0;
for (int count = number.length-1; count > 0; count--){
reverse[count] = number[count];
System.out.println(num);
}

return reverse;
}
}