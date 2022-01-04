package Concrete;

import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Entities.Player;

public class PlayerManager implements IPlayerService {
	
	private IPlayerCheckService _playerCheckService;
	
	public PlayerManager(IPlayerCheckService playerCheckService) {
		this._playerCheckService=playerCheckService;
	}

	@Override
	public void add(Player player) {
		if(_playerCheckService.checkfRealPerson(player)) {
			System.out.println("Player added: "+player.getFirstName());
		}else {
			System.out.println("Player is not real person!!");
		}
	}

	@Override
	public void update(Player player) {
		System.out.println("Player updated: "+player.getFirstName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Player deleted: "+player.getFirstName());
		
	}

}
