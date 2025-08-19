public class TaskEight{
public static void main(String[] args){


int [] number = {1,2,4,6,78,8};
System.out.printf("%d is the sum of all the numbers",sumOfNumbers(number));

}

public static int sumOfNumbers(int [] number){

int sum = 0;
for (int count = 0; count < number.length; count++){
sum += number[count];
}
return sum;
}
}