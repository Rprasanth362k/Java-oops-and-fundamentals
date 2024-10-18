package inheritance;

public class  Bb extends Aa
{
	
	int k;
	@Override
	public void show()
	{  super.show();
	  super.revsion("understand");
		System.out.println("it is b");
	}
	@Override
	public  void revsion(String revison,int va)
	{
		super.show();
		super.revsion(revison);
	
	}
	@Override
	protected void revsion1(String revison,int hours) {
		// TODO Auto-generated method stub
		
	}
	
	
	public Bb()
	{
		super();
		this.k=10;
		
	}
	
	public Bb(int a)
	
	{
		super(a);
		this.k=a;
		this.revsion1("ok goit",3);
		System.out.println(this.k);
	}
	public Bb(int i,int j,int k)
	{
		super(i,j);
		this.k=k;
	}
}