package astatic_this;

public class College {
	String name;
	String dept;
	double percentage;
	
	
	
	College(String name,String dept,double percentage)

	//College(String na,String dep,double per)
	{
		this.name=name; //no ambiguity...
	//  name=name; //ambiguity...
	//	name=na;  //no ambiguity...
		this.dept=dept;
	//	dept=dept; //ambiguity...
	//	dept=dep; //no ambiguity...
		this.percentage=percentage;
	//	percentage=percentage; //ambiguity...
	//	percentage=per; //no ambiguity...
		
	}
	
	void display()
	{
		System.out.println("Name:" +name+", Dept: "+dept+", Percentage: "+percentage);
	}

	public static void main(String[] args) {
		
		College obj1 = new College("Prasanth","Bsc-Cs",76.6);
		
		obj1.display();


	}

}
