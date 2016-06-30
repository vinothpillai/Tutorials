package mypackage1;

public class LearnFinal {
	//member variable with final
	final int MTEST;

	//static final 
	static final int CTEST = 5;
	
	LearnFinal(){
		MTEST = 4;
	}
	
	int getFinalVal(){
		//test = 5; - will not allow
		return MTEST;
	}
}
