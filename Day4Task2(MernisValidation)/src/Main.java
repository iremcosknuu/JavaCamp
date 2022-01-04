import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concreate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"İrem","COŞKUN",1998,"TCKIMLIKNO"));

	}

}
