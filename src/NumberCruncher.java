import java.util.Scanner;
import java.util.ArrayList;

public class NumberCruncher {
	private ArrayList<Integer> numberList = new ArrayList<Integer>();
	
	public void addNum(int num) {
		numberList.add(num);
	}
	
	public void printNumberList() {
		System.out.printf("The numbers are: [ %d, %d, %d, %d, %d ]", numberList.get(0), numberList.get(1), numberList.get(2), numberList.get(3), numberList.get(4));
	}
	
	public int findSum() {
		int sum = 0;
		for (int i = 0; i < numberList.size(); i++) {
			sum += numberList.get(i);
		}
		
		return sum;
	}
	
	public int findProduct() {
		int product = 1;
		for (int i = 0; i < numberList.size(); i++) {
			product *= numberList.get(i);
		}
		
		return product;
	}
	
	public int findMax() {
		int maxNum = numberList.get(0);
		for (int i = 0; i < numberList.size(); i++) {
			if (numberList.get(i) > maxNum) {
				maxNum = numberList.get(i);
			}
		}
		return maxNum;
	}
	
	public int findMin() {
		int minNum = numberList.get(0);
		for (int i = 0; i < numberList.size(); i++) {
			if (numberList.get(i) < minNum) {
				minNum = numberList.get(i);
			}
		}
		return minNum;
	}

	 public static void main(String[] arguments) {
		 Scanner userInput = new Scanner(System.in);
		 NumberCruncher myNumArray = new NumberCruncher();
		 
		 //Collect numbers and add to array
		 System.out.println("Please enter the 1st number: ");
		 myNumArray.addNum(Integer.parseInt(userInput.nextLine()));
		 System.out.println("Please enter the 2nd number: ");
		 myNumArray.addNum(Integer.parseInt(userInput.nextLine()));
		 System.out.println("Please enter the 3rd number: ");
		 myNumArray.addNum(Integer.parseInt(userInput.nextLine()));
		 System.out.println("Please enter the 4th number: ");
		 myNumArray.addNum(Integer.parseInt(userInput.nextLine()));
		 System.out.println("Please enter the 5th number: ");
		 myNumArray.addNum(Integer.parseInt(userInput.nextLine()));
		 
		 System.out.println();
		 myNumArray.printNumberList();
		 System.out.printf("\nThe sum of the numbers is: %d\n", myNumArray.findSum());
		 System.out.printf("\nThe product of the numbers is: %d\n", myNumArray.findProduct());
		 System.out.printf("\nThe largest number is: %d\n", myNumArray.findMax());
		 System.out.printf("\nThe smallest number is: %d\n", myNumArray.findMin());
	 }
}