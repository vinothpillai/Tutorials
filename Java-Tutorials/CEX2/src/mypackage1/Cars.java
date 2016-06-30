package mypackage1;

//To demonstrate Class variables

public class Cars {
	//Class variables
	static final int WHEEL_COUNT = 4;
	
	//Member data
	private String mColor;
	private int mFuelLevel;
	private int mRegNumber;
	
	Cars(String color,int regNum,int fuelLevel){
		mColor = color;
		mRegNumber = regNum;
		mFuelLevel = fuelLevel;
	}
	
	String getColor(){
		return mColor;
	}
	int getFuelLevel(){
		return mFuelLevel;
	}
	int getRegNumber(){
		return mRegNumber;
	}
	
	public void setFuelLevel(int fuel){
		mFuelLevel = fuel;
	}
	
	private boolean isFuelOK(){
		if(mFuelLevel > 10){
			return true;
		}else{
			return false;
		}
		
	}
	
	protected void checkWaterLevel(){
		System.out.println("you reached checkWaterLevel");
	}
	
	public void startCar(){
		if(isFuelOK()){
			System.out.println("Car can be started now");
		}else{
			System.out.println("Car cannot be started now");
		}
	}
	
	static void testMethod(){
		//this.isFuelOK();
		Cars test = new Cars("white",5,15);
		test.isFuelOK();
	}
}
