package Concrete;

import Abstract.IPlayerCheckService;
import Entities.Player;

public class PlayerCheckService implements IPlayerCheckService {

	@Override
	public boolean checkfRealPerson(Player player) {
		return true;
	}

}
