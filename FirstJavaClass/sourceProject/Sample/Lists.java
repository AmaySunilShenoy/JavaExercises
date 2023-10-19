package Sample;

import java.util.ArrayList;
import java.util.List;

public class Lists {
		
		String value = "This is a string sentence";
		List<String> couleurs = new ArrayList<String>();

	    
		public void stringExercise() {
		    couleurs.add("Green");
		    couleurs.add("Blue");
		    couleurs.add("Orange");
		    
		for(String i : couleurs){
			System.out.print(i + "\n");
		}

		System.out.println(value.toLowerCase());
		System.out.println(value.toUpperCase());
		}

		public static void main(String[] args) {
		    Lists test = new Lists();
		    test.stringExercise(); 
		}
	}
