package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			
			e.printStackTrace();
		}	
		return true;
	}

}
