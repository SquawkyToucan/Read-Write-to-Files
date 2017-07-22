package Stuff;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReader {
	public static void main(String[] args) {
		File file = new File("stuff.txt");
		try {
			PrintWriter out = new PrintWriter(file);
			out.println("Wo de jiejie tai nankan lu");
			out.println("Annyeonghaseyo.");
			out.close();
			Scanner in = new Scanner(file);
			while(in.hasNextLine()) {
				System.out.println(in.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
	
