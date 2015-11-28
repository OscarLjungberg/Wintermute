package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wintermute {

	public static void main(String[] args) {
		System.out.println("and still he’d see the matrix in his sleep, bright lattices of logic unfolding across that colorless void. . . ");
		String name = "";
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       try {
	        name = br.readLine();
	       } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	       }
	       System.out.println("Hi " + name);
	}  

}
