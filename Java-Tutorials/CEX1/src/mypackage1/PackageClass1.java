package mypackage1;

import mypackage2.PackageClass2;

public class PackageClass1 {

	public static void main(String[] args){
		PackageClass2 test = new PackageClass2();
		System.out.println(test.sayHello());
	}
}
