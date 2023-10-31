package Sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Buffered {

	public void create(String path) throws IOException{
		File file = new File(path);
		if(file.createNewFile()) {
			System.out.println("File Created!");
		} else {
			System.out.println("File Already Exists");
		}
	}
	
	public void write(String path) throws IOException{
		try {
			FileWriter file = new FileWriter(path, true);
			Scanner sc = new Scanner(System.in);
			String line;
			System.out.println("Enter your new line into the file below!");
			BufferedWriter bw = new BufferedWriter(file);
			line = sc.nextLine();
			bw.append(line);
			bw.close();
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void read(String path) throws IOException{
		char[] array = new char[1000];
		
		try {
			FileReader file = new FileReader(path);
			BufferedReader br = new BufferedReader(file);
			br.read(array);
			System.out.println("Your content is below:");
			System.out.println(array);
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
