package projrctjava;
class Account{
	int amount = 199456;
	public int deposit(int amount,int input) {
		
		amount = amount + input;
			System.out.println("New amount deposited is:" + amount);
		return 0;
	}
	 
    public int withdraw(int insert) {
    	if(insert>amount) {
    		try {
    			insert = insert/0;
    		}
    		catch(NumberFormatException ex) {
    			System.out.println("Amount isn't enough");
    		}
    	}
    	return 0;
	}
    
}
public class classx {
public static void main(){
		
		Account obj= new Account();
		System.out.println("Deposition First");
		obj.deposit(199456,4450);
		obj.withdraw(998745);
	}
}
