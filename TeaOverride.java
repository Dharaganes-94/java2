package Task10;

class  BasicTea
{
	void PrepareTea()
	{
		System.out.println(" Basic Tea is prepared with the ingredients hot water and tea leaves");
	}
}
class BlackTea extends BasicTea
{
	void PrepareTea()
	{
		System.out.println("Black Tea Ingredients are Milk , hotWater,Sugar and its brweing time is 2-3 mins");

	}
}
class GreenTea extends BasicTea
{
	void PrepareTea()
	{
		System.out.println("Green Tea Ingredients are Milk ,hotWater,Sugar and green tea leaves and its brweing time is 1-2 mins");

	}
}
class BrownTea extends BasicTea
{
	void PrepareTea()
	{
		System.out.println("Brown Tea Ingredients are Milk ,hotWater,Sugar and its brweing time is 3-5 mins");

	}
}


public class TeaOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     BlackTea obj = new BlackTea();
     obj.PrepareTea();
     
     GreenTea obj1 = new GreenTea();
     obj1.PrepareTea();
     
     BrownTea obj2 = new BrownTea();
     obj2.PrepareTea();
     
     
	}

}
