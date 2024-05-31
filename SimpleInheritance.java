package boi.com;
class Account 
{
	String name="Prakash";
	int Account_no=12345;
	int balance=10000;
	public void display()
	{
		System.out.println("\nEMP Account Numbrer:"+Account_no+"\nEmpname:"+name+"\nAvailbale balance:"+balance);
	}
	
}
class FDAccount extends Account
{
	int loan_amount=1000;
	public void displayloan()
	{
		int available_bal=balance-loan_amount;
		System.out.println("\nMy laon amount is:"+available_bal);
	}

}
public class SimpleInheritance {
	public static void main(String[] args) 
	{
		FDAccount emp1= new FDAccount();
		emp1.displayloan();
		emp1.display();
		
}

}
