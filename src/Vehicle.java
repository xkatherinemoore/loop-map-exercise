import java.util.Scanner;
import java.util.HashMap;

public class Vehicle {

	HashMap<String, String> vehicleInv = new HashMap<String, String>();
	
	//Add inventory <model, make>
	public void addInv(String model, String make) {
		vehicleInv.put(model, make);
	}
	
	//Delete inventory
	public void deleteInv(String model) {
		vehicleInv.remove(model);
	}
	
	//Get make from model input
	public String getMake(String model) {
		return vehicleInv.get(model);
	}
	
	public void findVehicle(String model) {
		String make = this.getMake(model);
		if (make == null) {
			System.out.printf("\nSorry! It looks like we don't have the %s available.\n", model);
		} else {
			System.out.printf("\n You're looking for a %s %s? We have some available!", make, model);
		}
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Vehicle ourVehicleInv = new Vehicle();
		
		//Add cars to inventory
		ourVehicleInv.addInv("R8", "Audi");
		ourVehicleInv.addInv("Prius", "Toyota");
		ourVehicleInv.addInv("Forte", "Kia");
		ourVehicleInv.addInv("Civic", "Honda");
		ourVehicleInv.addInv("Wrangler", "Jeep");
		ourVehicleInv.addInv("Fiesta", "Ford");
		
		System.out.println("Hello! What model car are you looking for?");
		ourVehicleInv.findVehicle(userInput.nextLine());
	}
}
