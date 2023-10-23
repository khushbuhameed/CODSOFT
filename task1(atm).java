package "java";
import java.util.HashMap;
import java.util.Scanner;
public class ATM {
	
	public static void main(String[] args) {
		ATMop obj = new ATMop();
		
	}

}

class Data{
	float balance;
	
}
 class ATMop{
	 float balance;
	 Scanner s= new Scanner(System.in);	
	 HashMap<Integer, Data> map = new HashMap<>();
	 
	ATMop(){
		System.out.println("Welcom to Our ATM");
		System.out.println("********************************************************");
		op();
	}
	
	public void op() {
		System.out.println("Enter your PIN Code");
		System.out.println("********************************************************");
		int pincode = s.nextInt();
		
		if(map.containsKey(pincode) == true) {
			Data obj = map.get(pincode);
			menu(obj);
		}
		else {
			System.out.println("please create account first");
			System.out.println("Set Your PIN Code");
			int pin= s.nextInt();
			Data obj = new Data();
			map.put(pin , obj);
			menu(obj);
		}
	}
	public void menu(Data obj) {
	
	 System.out.println("please enter valid number:");
	 System.out.println("1, Check balance");
	 System.out.println("2, Deposit Money");
	 System.out.println("3, Withdraw Money");
	 System.out.println("4, Check Another Account");
	 System.out.println("5, Exit");
	 
	 int k = s.nextInt();
	 
	 if(k == 1) {
		 Check_balance(obj);
	 }
	 else if(k == 2) {
		 deposit(obj);
	 }
	 else if(k == 3) {
		 withdraw(obj);
	 }
	 else if(k == 4) {
		 op();
	 }
	 else if(k == 5) {
		 System.out.println("Have A Good Day.. Thank You!!");
	 }
	 else {
		 System.out.println("please Enter Valid Number");
		 menu(obj);
	 }
	 
	}
	
	public void Check_balance(Data obj) {
	System.out.println("********************************************************");
		System.out.println("Your Balance  is" + obj.balance);
		System.out.println("********************************************************");
		menu(obj);
	}
	
	public void deposit(Data obj) {
		System.out.println("Enter Your Amount:");
		float a = s.nextFloat();
		obj.balance = obj.balance + a;
		System.out.println("Amount deposit Succeesfully..!! ");
		System.out.println("********************************************************");
		menu(obj);
	}
	
	public void withdraw(Data obj) {
		System.out.println("Enter Your Amount:");
		float a = s.nextFloat();
		if(obj.balance >= a) {
			obj.balance = obj.balance - a;
			System.out.println("Amount withdraw Succeesfully...!!");
		}else {
		
		System.out.println("Insufficient balance ");
		}
		menu(obj);
	}
  
	
}
