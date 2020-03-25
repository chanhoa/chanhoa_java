package lession2;

public class PrimeListWithBreak {
    public static void main(String[] args) {
        int upperbound = 100;
        for ( int number = 2; number <= upperbound; ++number){
            //Not a prime , if there is a factor between 2 and sqrt (number)
            int maxFactor = (int)Math.sqrt(number);
            boolean isPrime = true;
            for (int factor = 2 ; factor <= maxFactor; ++factor){
                if (number %factor == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.println(number + " is a prime");
        }
    }
}





