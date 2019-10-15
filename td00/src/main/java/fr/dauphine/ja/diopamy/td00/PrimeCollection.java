package fr.dauphine.ja.diopamy.td00;

import java.util.ArrayList;
import java.util.Random;

public class PrimeCollection

{
    
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    public PrimeCollection() {
    	
    }
    
    public  double  initRandom(int n,int m) {
    	int x = 0;
    	Random obj = new Random();
    	for (int i = 0; i<m;i++) {
    		 x = obj.nextInt(n);
    		 numbers.add(x);
    		
    	}
		return x;
    }
    	   	    	
    static boolean isPrime( int p) {
    	for (int i=2; i <p;i++) {
    		if (p%i== 0) 
    			return false;	
    	}
    	return true;
    	
    }
    public void printPrimes() {
    	int i=0;
    	if(isPrime(i)== true);
    	numbers.get(i);
  	}
   
    		
    	
    		
    		
    		
    			
    	
    	
   
    		
    	
    
    
}


    



