package Proiect2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LazyNumbersDetails lazyNumber = new LazyNumbersDetails();
		int number = 0;
		
		System.out.println("Input number:");
		number = sc.nextInt();
		lazyNumber = new LazyNumbersDetails(number);
		
		//System.out.println(lazyNumber.checkedIsMagic(number));
		while (number > 0) {
			lazyNumber.isPerfect();
			lazyNumber.isPerfect();
			lazyNumber.isPrime();
			lazyNumber.isPrime();
			lazyNumber.isMagic();
			lazyNumber.isMagic();
		
			System.out.println("Input number:");
			number = sc.nextInt();
			lazyNumber.updateNumber(number);
		}
		
		System.out.println();
		lazyNumber.updateNumber(10);
		lazyNumber.updateNumber(17);
		lazyNumber.isPrime();
		lazyNumber.isPrime();
		lazyNumber.updateNumber(28);
		lazyNumber.isPerfect();
		lazyNumber.isPrime();
		lazyNumber.isPerfect();
		lazyNumber.isMagic();
		lazyNumber.isPrime();
		lazyNumber.updateNumber(12);
		lazyNumber.isMagic();
		lazyNumber.isMagic();
		
		sc.close();
	}
	
	
}
