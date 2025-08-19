import java.util.Arrays;
public class TaskTen{
public static void main(String[] args){


int [] number = {1,2,4,6,78,8};
System.out.print(Arrays.toString(reverseNumbers(number)));

}

public static int[] reverseNumbers(int [] number){

int largest = number[0];
int smallest = number[0];
for (int count = 0; count < number.length; count++){

if (number[count] > largest){
largest = number[count];
}
if (number[count] < smallest){
smallest = number[count];
}
}

return new int [] {largest , smallest};
}
}