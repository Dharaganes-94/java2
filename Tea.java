package Task10;

public class Tea {
	
	public void PrepareTea()
	{
		System.out.println("Prepares a basic Tea with Hot water and Tea leaves");
	}
	public void AddMilk()
	{
		System.out.println("Add milk to the basic Tea");

	}
	public void AddSugar()
	{
		System.out.println("Add Sugar to the basic Tea");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tea obj = new Tea();
		obj.PrepareTea();
		obj.AddMilk();
		obj.AddSugar();

	}

}
