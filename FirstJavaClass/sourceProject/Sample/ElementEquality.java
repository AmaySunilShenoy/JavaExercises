package Sample;

import java.util.HashSet;

public class ElementEquality {
		public void numberEquality() {
			int[] arr1 = { 1, 3, 4, 5, 4 };
			
			int[] arr2 = { 1, 2, 3, 4, 5 };
			
			System.out.print("Common Elements:");

			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {
						System.out.print(arr1[i]+" ");
					}
				}
			}

		}
		
		 public void stringEquality(){
				
		       String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
		 
		       String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
		      
		 
		       HashSet<String> set = new HashSet<String>();
		       
		       System.out.println("");
		 
		        for (int i = 0; i < array1.length; i++)
		        {
		            for (int j = 0; j < array2.length; j++)
		            {
		                if(array1[i].equals(array2[j]))
		                {
		                    set.add(array1[i]);
		                }
		            }
		        }
		 
		        System.out.println("Common element : "+(set));
		    }
		 
		 public static void main(String[] args) {
			    ElementEquality test = new ElementEquality();
			    test.numberEquality();
			    test.stringEquality();
			}
}
