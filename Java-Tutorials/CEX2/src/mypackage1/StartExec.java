package mypackage1;

/* static, final and this.
 * extends, implements
 */
public class StartExec {
	public static void main(String[] args){
		
		Cars indica = new Cars("blue",1915,5);
		indica.startCar();
		indica.checkWaterLevel();
		//indica.isFuelOK();
		
		indica.setFuelLevel(15);
		indica.startCar();
		
		//indica.mFuelLevel = 20; -- will give error as mFuelLevel is private
		
		//Access Class data
		System.out.println("Wheel count is :"+Cars.WHEEL_COUNT);
		
		//Final class 
		LearnFinal myFinal = new LearnFinal();
		
		//print class variable
		System.out.println(LearnFinal.CTEST);
		
		//print member variable
		System.out.println(myFinal.MTEST);
	}
}
