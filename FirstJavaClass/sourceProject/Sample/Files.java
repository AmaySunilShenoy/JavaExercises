package Sample;

import java.io.*;
import java.util.Scanner;

public class Files {
	public static void main(String[] args) throws IOException {
		File fileobj1 = new File("C:\\Users\\sheno\\Desktop\\newfile.txt");
		try {
			if (fileobj1.createNewFile()) {
				System.out.println("Newfile created!");
			} else {
				System.out.println("Already exists");
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		
		FileWriter filewrite = new FileWriter("C:\\Users\\sheno\\Desktop\\newfile.txt");
		filewrite.write("Finally some content" + "\n");
		filewrite.append("Appending second line!" + "\n");
		filewrite.write("This is a 3rd line!");
		filewrite.close();
	
	Scanner sc = new Scanner(System.in);
	FileWriter file = new FileWriter("C:\\Users\\sheno\\Desktop\\newfile1.txt");
	
	String data = "";
	BufferedWriter bf = null;
	try {
		System.out.println("Enter the content:");
		bf = new BufferedWriter(file);
		while(!data.contentEquals("/")) {
			data = sc.nextLine();
			bf.write(data, 0, data.length());
			bf.newLine();
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	bf.close();
	sc.close();
	
//	To read a file
	
	
	char[] array = new char[100];
	try {
		FileReader readFile = new FileReader("C:\\Users\\sheno\\Desktop\\newfile1.txt");
		readFile.read(array);
		System.out.println("Data in the file:");
		System.out.println(array);
		readFile.close();
	} catch (Exception e) {
		e.getStackTrace();
	}
	
//	To delete a file
	
	File fileDelete = new File("C:\\Users\\sheno\\Desktop\\newfile1.txt");
	
	boolean value = fileDelete.delete();
	
	if (value) {
		System.out.println("The file is deleted");
	} else {
		System.out.println("The file is not deleted");
	}
}
}
