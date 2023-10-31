package Sample;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
//		EvenNumbers test = new EvenNumbers();
//		test.displayEven();
		
//		MaxNumber test = new MaxNumber();
//		test.displayMax();
		
//		Grade test = new Grade();
//		test.checkGrade();
		
//		NameTriangle test = new NameTriangle();
//		test.displayName();
		
//		ReverseSecond test = new ReverseSecond();
//		test.displayReverseWord();
		
//		MixedCase test = new MixedCase();
//		test.displayMixed();
		
//		RemovePunctuation test = new RemovePunctuation();
//		test.noPunc();
		
//		SortingArray test = new SortingArray();
//		test.sortingstar();
//		test.sortingline();
		
		Buffered test = new Buffered();
		test.create("C:\\Users\\sheno\\Desktop\\newfile100.txt");
		test.write("C:\\Users\\sheno\\Desktop\\newfile100.txt");
		test.read("C:\\Users\\sheno\\Desktop\\newfile100.txt");
	}
}
