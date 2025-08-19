import java.util.Arrays;
public class TaskThirteen{

public static void main(String[] args){

int [] num = {40,35,49,57,61,44,100,0,4,1};


int secondLargest = num[0];
int largest = num[0];
for (int i = 0; i < num.length; i++){

if (num[i] > largest){
secondLargest = largest;
largest = num[i];  
}else
if ( num[i] > secondLargest && largest != num[i]){
secondLargest = num[i];
}

}
System.out.println(secondLargest);
System.out.println(largest);




}
}