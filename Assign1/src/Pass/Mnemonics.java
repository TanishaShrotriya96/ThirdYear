package Pass;

public class Mnemonics {

	String name;
	String opcode;
	int len;

	
	public Mnemonics(){

		name=null;
		opcode=null;
		len=0;
		
	}
	
	public String toString(){
		return name + " " + opcode +" " + len + " \n";
		
	}
}
