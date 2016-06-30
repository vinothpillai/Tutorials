package learninnerclass;

public class StartExec {
	public static void main(String[] args){
		ComplexClass test = new ComplexClass();
		test.complexMethod();
		
		test.servicePart1(new Mechanic());
		
		ComplexClass.Part2 part2 = test.new Part2();
		part2.part2Method();
		
	}
}
