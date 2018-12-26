import java.util.ArrayList;
import java.util.List;

/*1)Create a Class SavingAccount with field’s acc_balance, acc_ID, accountHoldername, isSalaryAccount. 
 * Also add setter and getter methods with business method like withdraw and deposit.
a.	Create 5 different object of SavingAccount and add them into ArrayList, now iterate the arraylist and display
 all SavingAccount’s object one by one.
b.	Now save the ArrayList which contains SavingAccount’s object into a file
 and read the file and display all savingAccount Object one by one.
c.	Create class BankAccountList which will maintain SavingAccount objects. 
Ensure that this class should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID)  
**/

public class SavingAccount {
	private int accountBalance; private int accountID; private String accountHoldername;private boolean isSalaryAccount;
	
	public SavingAccount(int accountBalance, int accountID, String accountHoldername,boolean isSalaryAccount) {
		super();
		this.accountBalance = accountBalance;
		this.accountID = accountID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}

	public int getaccountBalance() {
		return accountBalance;
	}

	public int getaccountID() {
		return accountID;
	}

	public String getAccountHoldername() {
		return accountHoldername;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

public void arraylist() {

	List<String> list = new ArrayList<String>();
	list.add("AccountId");
	list.add("AccountHolderName");
	list.add("AccountBalance");
	list.add("BranchName");
	list.add("BranchManagerName");
	
}


@Override
public String toString() {
	return "SavingAccount [acc_balance=" + accountBalance + ", acc_ID=" + accountID
			+ ", accountHoldername=" + accountHoldername + ", isSalaryAccount="
			+ isSalaryAccount + "]";
}
}