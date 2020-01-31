package Proiect2;

public class LazyNumbersDetails {
	private int number;
	private int lastPrimeChecked;
	private boolean isLastPrime;
	
	
	public LazyNumbersDetails() {
		
	}
	
	public LazyNumbersDetails(int nr) {
		this.number = nr;
	}
	public int getNumber() {
		return number;
	}

	public void updateNumber(int number) {
		this.number = number;
	}
	
	// is Prime
	public int getLastPrimeChecked() {
		return lastPrimeChecked;
	}

	public void setLastPrimeChecked(int lastPrimeChecked) {
		this.lastPrimeChecked = lastPrimeChecked;
	}

	public boolean isLastPrime() {
		return isLastPrime;
	}

	public void setLastPrime(boolean isLastPrime) {
		this.isLastPrime = isLastPrime;
	}

	private boolean checkIfPrime() {
		int currentNumber = this.getNumber();
		if (currentNumber < 2) {
			return false;
		}
		for(int i = 2; i <=currentNumber / 2; i++) {
			if (currentNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isPrime() {
		if (this.getNumber() == this.getLastPrimeChecked()) {
			System.out.print("Is prime?/Cache: ");
			System.out.println(this.isLastPrime);
			return this.isLastPrime();
		}
		boolean result=this.checkIfPrime();
		System.out.print("Is prime? " + this.getNumber()+ " -> ");
		this.setLastPrimeChecked(this.getNumber());
		this.setLastPrime(result);
		System.out.println(result);
		return result;
	}
	
	// is perfect
	private int lastPerfectChecked;
	private boolean isLastPerfect;
	
	public int getLastPerfectChecked() {
		return lastPerfectChecked;
	}
	
	public void setLastPerfectChecked(int lastPerfectChecked) {
		this.lastPerfectChecked = lastPerfectChecked;
	}
	
	public boolean isLastPerfect() {
		return isLastPerfect;
	}
	
	public void setLastPerfect(boolean isLastPerfect) {
		this.isLastPerfect = isLastPerfect;
	}

	private boolean checkIfPerfect() {
		int currentNumber = this.getNumber();
		int sum = 0;
		for (int it = 1; it < currentNumber; it++) {
			if (currentNumber % it == 0) {
				sum += it;
			}
		}
		
		 if (sum != currentNumber) {
			 return false;
		 }
		
		 return true;
	}
		
	public boolean isPerfect() {
		if(this.getNumber() == this.getLastPerfectChecked()) {
			System.out.print("Is perfect?/Cache: ");
			System.out.println(this.isLastPerfect);
			return this.isLastPerfect();
		}
		boolean result1 = this.checkIfPerfect();
		System.out.print("Is perfect?: " + this.getNumber() + " -> ");
		this.setLastPerfectChecked(this.getNumber());
		this.setLastPerfect(result1);
		System.out.println(result1);
		return result1;
	}
	
	// is Magic?
	
	private int lastMagicChecked;
	private boolean isLastMagic;
	
	public int getLastMagicChecked() {
		return lastMagicChecked;
	}
	
	public void setLastMagicChecked(int lastMagicChecked) {
		this.lastMagicChecked = lastMagicChecked;
	}
	
	public boolean isLastMagic() {
		return isLastMagic;
	}
	
	public void setLastMagic(boolean isLastMagic) {
		this.isLastMagic = isLastMagic;
	}
	
	public  boolean checkedIsMagic(int n) {
		int sum = 0;
		int aux = n;
		 
		while (aux != 0) {
			sum += aux % 10;
			aux /= 10;
		}
		
		if (sum < 10) {
			if (sum == 3 || sum == 7 || sum == 9 ) {
				return true;
			}
			return false;
		}
		return checkedIsMagic(sum);
	}

	public boolean isMagic() {
		if (this.getNumber() == this.getLastMagicChecked()) {
			System.out.print("Is magic?/Cache: ");
			System.out.println(this.isLastMagic);
			return this.isLastMagic;
		}
		boolean result2 = this.checkedIsMagic(this.getNumber());
		System.out.print("Is magic?" + this.getNumber() + " -> ");
		this.setLastMagicChecked(this.getNumber());
		this.setLastMagic(result2);
		System.out.println(result2);
		return result2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
