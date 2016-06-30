package mypackage1;

public class MaruthiCars extends PetrolCar /*implements MaruthiCarFunctionality*/{
	
	public void startCar(){
		//this.FillPetrol();
		super.startCar();
		
		//petrolCarFunctionality();
		
		//functionality specific to Maruthi cars
		System.out.println("Maruthi car started");
	}
	
	public void stopCar(){
		super.stopCar();
		
		petrolCarFunctionality();
		
		//functionality specific to Maruthi cars
		System.out.println("Maruthi car started");
	}
	
	public void checkEngineReady(){
		System.out.println("specific to Maruthi car");
	}
	
	public void petrolCarFunctionality(){
		System.out.println("functionality specific to Petrol car");
	}
}
