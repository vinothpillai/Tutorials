package mypackage1;


public abstract class PetrolCar implements CarFunctions{
	
	public void startCar(){
		System.out.println("While starting Car");
	}
	
	public void stopCar(){
		System.out.println("While stoping Car");
	}
	
	public void FillPetrol(){
		System.out.println("Filling Petrol");
	}
	
	public abstract void petrolCarFunctionality();
	
}
