package com.api.version;

/* Save this in a file called Main.java to compile and test it */

/* 
   Example file showing how to write a program that reads
   input from `input.txt` in the current directory
   and writes output to `output.txt` in the current directory
*/

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */

public class Main {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> array =
	            new ArrayList<ArrayList<Integer>>();
	        for(int i=0; i<10000; i++) {
	            try {
	                array.add(new ArrayList<Integer>(1000000));
	            } catch (OutOfMemoryError e) {
	                System.out.println(i);
	                break;
	            }
	        }
		
	}


	interface X {
	       String f();
	}
	class X1 implements X {
	       @Override
	       public String f() {
	              return "x1";
	       }
	}
	class X2 implements X {
	       @Override
	       public String f() {
	              return "x2";
	       }
	}
	class C {
	       public  X createX (String itype) {
	       if (itype.equalsIgnoreCase ("X1")){
	              return new X1();
	       } else if(itype.equalsIgnoreCase ("X2")){
	              return new X2();
	       } else {
	           throw new IllegalArgumentException("No such type");
	       }
	}

}

}