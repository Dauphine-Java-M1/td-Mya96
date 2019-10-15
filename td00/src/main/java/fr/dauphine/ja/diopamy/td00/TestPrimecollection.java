package fr.dauphine.ja.diopamy.td00;

public class TestPrimecollection {
	public static void main(String [] args) {
		PrimeCollection tab = new PrimeCollection();
		tab.initRandom(100, 1000);
		tab.printPrimes();
		}

}
