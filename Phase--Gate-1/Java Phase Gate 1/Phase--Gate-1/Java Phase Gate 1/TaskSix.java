public class TaskSix{
public static void main(String[] args){


int [] number = {2,3,5,3,5,6,3,8};
System.out.printf("%d is the largest number",isLargest(number));

}

public static int isLargest(int [] number){

int largest = number[0];

for (int count = 0; count < number.length; count++){

if (number[count] > largest){
largest = number[count];
}
}
return largest;
}
}