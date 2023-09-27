package Task10;

public class Account {
	
	int AccountBalance;
	int Withdrawl;
	int Deposit;

 Account()
 {
	System.out.println("The Default constructor");
}
 
  public Account(int w,int d)
  {
	  Withdrawl =w;
	  Deposit = d;
	  System.out.println("The amount withdrawl is "+w+"The amount Deposited is "+d);
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account obj = new Account(5000,1000);
		

	}

}
