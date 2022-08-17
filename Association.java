package Practice;

public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor p = new Processor();
	 	Battery b = new Battery();
		Display d = new Display();
		
		mobile M =new mobile("REDMI",p,b,d); //composition
		M.speed();
		M.time();
		M.view();
		System.out.println("--------------------------------");
		
		
		  mobile M1 =new mobile("SAMSUNG",null,null,null); 
		  M1.speed();
		  M1.time();
		  M1.view();
		  System.out.println("--------------------------------");
		 
		
	}

}

class Processor{
	String name ;
	String processor;
	Processor(){
		System.out.println("this is processor block");
	}
	
	Processor(String name,String processor) {		
	this();
	this.name =name ;
	this.processor=processor;//System.out.println("Snap dragon");
}
	
}
class Battery{
	int value;
	String type;
	Battery(){
		System.out.println("this is battery");
	}
	Battery(int value,String type){
		this();
		this.value = value;
		this.type = type;
	}
	
}
class Display{
	String model;
	double size;
	Display()
	{
		System.out.println("6 inch display");
	}
	Display(String model,double size){
		this();
		this.model=model;
		this.size=size;
		
	}
}
class mobile{
	String name;
	Processor p;
	Battery b;
	Display d;
	mobile(String name,Processor p,Battery b,Display d){
		this.name=name;
		this.p = p;
		this.b = b;
		this.d = d;
	}
	 void view() {
		System.out.println("HD display "+this.p.name);
		
	}
	 void time() {
		 System.out.println("4hr long time "+this.b.type);
		
	}
	void speed()
	{
		System.out.println("HD display "+this.p.processor);
		
	}
}
	
