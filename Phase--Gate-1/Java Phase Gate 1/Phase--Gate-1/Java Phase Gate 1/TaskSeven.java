public class TaskSeven{
public static void main(String[] args){


int [] number = {0,3,5,3,5,6,3,8};
System.out.printf("%d is the smallest number",isSmallest (number));

}

public static int isSmallest (int [] number){

int smallest = number[0];

for (int count = 0; count < number.length; count++){

if (number[count] < smallest ){
smallest = number[count];
}
}
return smallest;
}
}