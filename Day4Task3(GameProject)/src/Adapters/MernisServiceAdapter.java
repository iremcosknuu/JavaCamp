package Adapters;

import Abstract.IPlayerCheckService;
import Entities.Player;
import MernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService{

	@Override
	public boolean checkfRealPerson(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(player.getNationaltyId()), player.getFirstName().toUpperCase(),
					player.getLastName().toUpperCase(), player.getBirthOfDate().getYear());
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return false;
	}

}
