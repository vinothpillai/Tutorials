package learninnerclass;

public class ComplexClass {
	
	int mComplex;
	
	private class Part1{
		public void part1Method(){
			System.out.println("you reached part1Method");
		}
	}
	
	public interface ComplexInterface {
		public void myinterface();
	}
	
	public class Part2{
		public void part2Method(){
			System.out.println("You reached part2Method");
		}
	}
	
	public void complexMethod(){
		Part1 test = new Part1();
		test.part1Method();
	}
	
	//Passing one more object as argument
	public void servicePart1(Mechanic eng){
		eng.startServiceNow();
	}
	
}
