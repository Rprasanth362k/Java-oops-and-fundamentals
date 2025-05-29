package control_Flow;

public class While {
   
	public static void main(String[] args) {
       
       apj_kalampark();
	
		}
	
	public static void    apj_kalampark()
	
	{
		 String [] name = {"arun","arul","abdul","arunkumar","anbilmaghes","akash","ayyapen"};
			int []   age = {12,13,14,15,16,17,18};
			int  parkagelimit=15;
			int i=0;
			
			while(i<age.length)
			{
			if(age[i]>=parkagelimit)
			{
				System.out.println(name[i]);
			}
			i++;
		
			}
		
	}

}
