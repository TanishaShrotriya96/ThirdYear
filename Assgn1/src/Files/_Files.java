package Files;

//Java Program to illustrate reading from text file
//as string in Java
import java.nio.file.*;
import java.util.*;

public class _Files {

public static String readFileAsString(String fileName)throws Exception
{
 String data = "";
 data = new String(Files.readAllBytes(Paths.get(fileName)));
 return data;
}

public static void main(String[] args) throws Exception
{
 String data = readFileAsString("/home/ccoew/3476-master/Assgn1/src/one.txt");
 System.out.print(data);
 String[] s = data.split("\\W");

 
 ArrayList<String> str = new ArrayList<String>();
 for(String e : s){
	 str.add(e);
 }
 System.out.print(str.toString());
 int counter = 3;
	
 for(String w :str) {
	 if(!w.equals(" ")) {
	 if(w.matches("\\d*")||w.matches("\\D")||w.matches(".REG+")&&counter!=3)
	 { 
		 System.out.print(w+" ");

		 if(counter==1){
			 System.out.print(counter+" ");
		     counter=3;				 
		 }

		 if(counter==2){
			 System.out.print(counter+" ");
		     counter--;				 
		 }

		 
	 }
	 else {
		 

		 System.out.print(w+" ");
	     
		 if(counter==1){
			 
			 System.out.print(counter+" ");
		     counter=2;				 
		 }

		 else if(counter==3){
			 System.out.println(counter+" ");
		     counter--;				 
		 }
	 }
	 
	 }
 }
 
}

}