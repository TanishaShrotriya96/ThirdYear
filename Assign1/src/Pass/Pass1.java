package Pass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Pass1 {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		String data = readFileAsString("/home/ccoew/3476/Assign1/src/input");
		String[] s = data.split("\\W");
		 
		ArrayList<String> str = new ArrayList<String>();
		for(String e : s){
		    if(!e.isEmpty()){    
			 str.add(e);
		    }
		    
	    }
	
		System.out.println(str.toString());
		
		
	    String mnemo = readFileAsString("/home/ccoew/3476/Assign1/src/mnemonics");
	    String[] mnem = mnemo.split("\\s");
	    
	    ArrayList<String> mnemonics = new ArrayList<String>();
		
	    for(String e : mnem){
		    
	    	if(!e.isEmpty()){
		    	 mnemonics.add(e);
		    }
		    
	    }
		
		System.out.println(mnemonics.toString());
		
		
		Mnemonics m;
		ArrayList<Mnemonics> ref = new ArrayList<Mnemonics>();
		for(Mnemonics x : ref) {
			m=new Mnemonics();
		    for(String e : mnemonics) {
				if(mnemonics.indexOf(e)%3==0) {
					m.name=e;
				}
				else if(mnemonics.indexOf(e)%3==1) {
					m.opcode=e;
				}
				else {
					m.len=Integer.parseInt(e);
				}
				ref.add(m);
		    }
		}
		System.out.println(ref.toString());
			
	
		
		
		
		
		
	    for(String w :str) {
			
		}

	}


	
	public static String readFileAsString(String fileName)throws Exception
	{
	 String data = "";
	 data = new String(Files.readAllBytes(Paths.get(fileName)));
	 return data;
	}
	
	public static void write(String path,String update){
		try {
			FileWriter file = new FileWriter(path,true);
			file.write(update);
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
