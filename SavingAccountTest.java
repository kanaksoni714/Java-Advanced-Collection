import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class SavingAccountTest {

	@Test
	public void test() {
		SavingAccount client1= new SavingAccount(11111, 1110, "Kanak", false);
		SavingAccount client2= new SavingAccount(11111, 1110, "Soni", false);
		SavingAccount client3= new SavingAccount(11111, 1110, "Gore", false);
		SavingAccount client4= new SavingAccount(11111, 1110, "Paralskar", false);
		SavingAccount client5= new SavingAccount(11111, 1110, "kadlag", false);
		System.out.println(client1);
		System.out.println(client2);
		System.out.println(client3);
		System.out.println(client4);
		System.out.println(client5);


	}
	@Test
	public void test1() {
		List<String> list = new ArrayList<String>();
		System.out.println(list);


	}
	@Test
	public void test2() {
		List<String> list = new ArrayList<String>();
		{list.forEach(number->System.out.println(list));   }

	}
}