package p1;

import java.io.File;
import java.io.PrintWriter;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("test ");
		
		System.out.println("new changes ");
		

		String names[] = {"mike","jenny","cinthia"};
		
		for (String name : names) {
			System.out.println(name);

		}
		try{
			File f = new File("abc.txt");
			PrintWriter pw = new PrintWriter(f);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
