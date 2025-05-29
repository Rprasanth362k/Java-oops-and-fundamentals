package inheritance;

public class Inherit_Aa_toBb
{
	public  static void main(String[] args )
	{
	Aa a = new Bb(1,2,3);
	Bb b = (Bb) a;
	((Bb)a).show();
	a.show();
	b.show();
	

}
}