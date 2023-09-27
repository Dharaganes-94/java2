package Task10;

class Tea2
{
	public void brew()
	{
		System.out.println("Brewing Tea");
	}
}
class GreenTea2 extends Tea2
{
	public void brew()
	{
		System.out.println("Brewing Green Tea");
	}
}
class BlackTea2 extends Tea2
{
	public void brew()
	{
		System.out.println("Brewing Black Tea");
	}
	
}
class HerbalTea2 extends Tea2
{
	public void brew()
	{
	    System.out.println("Brewing Herbal Tea");
	}
}

public class TeaArrayObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Tea2[] T = new Tea2[4];
        T[0]=new Tea2();
        T[1]=new GreenTea2();
        T[2]=new BlackTea2();
        T[3]=new HerbalTea2();

        for (int i = 0; i < T.length; i++) 
        {
            System.out.print(T[i] + " ");
        }        	
        	
        	
        }
	}


