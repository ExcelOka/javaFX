package array;

public class ArrayEx1 {

    public static void main(String args[]) {
        
        long[] primeNum = new long[20];
        int[] even=new int[5];
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);
        
    	int[] score = new int[9];
    	int[] values = new int[10];
    	values[0] = 95;
        values[1] = 85;
        values[2] = 75;
        values[3] = 65;
        values[4] = 55;
        values[5] = 45;
        values[6] = 35;
        values[7] = 25;
        values[8] = 15;
        values[9] = 5;

        for (int i = 0; i < values.length; i++) {
            System.out.println("Score " + i + ": " + values[i]);
        }

    }

}
