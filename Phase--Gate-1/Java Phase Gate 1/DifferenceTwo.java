<<<<<<< HEAD
// P(t) = P0 * (1+r)**t

public class DifferenceTwo{
public static void main(String[] args){



//yearly increase rate is 0.85%
double currentIncreaseRate = 0.0085;
double currentPopulation = 8024000000L;
double time = 75;
double OneYear = 1;
double populationOverTime = currentPopulation * (Math.pow((1 + currentIncreaseRate),time)); 
for (int count = 1; count <= 75; count++){
double populationNextYear = currentPopulation * Math.pow((1 + currentIncreaseRate),count); 
double yearlyPopulation = populationNextYear - currentPopulation; 
System.out.printf("population increament for %d years %.3f%n",count ,yearlyPopulation);
}
//System.out.println(populationOverTime);
}

=======
// P(t) = P0 * (1+r)**t

public class DifferenceTwo{
public static void main(String[] args){



//yearly increase rate is 0.85%
double currentIncreaseRate = 0.0085;
double currentPopulation = 8024000000L;
double time = 75;
double OneYear = 1;
double populationOverTime = currentPopulation * Math.pow((1 + currentIncreaseRate),time); 
for (int count = 1; count <= 75; count++){
double populationNextYear = currentPopulation * Math.pow((1 + currentIncreaseRate),count); 
double yearlyPopulation = populationNextYear - currentPopulation; 
System.out.printf("population increament for %d years %.3f%n",count ,yearlyPopulation);
}
//System.out.println(populationOverTime);
}

>>>>>>> 033516504541899b7181c01850d8901dbd5c575f
} 