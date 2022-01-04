import java.time.LocalDate;

import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Adapters.MernisServiceAdapter;
import Concrete.GameSaleManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
	        Player player = new Player(1, "İrem", "COŞKUN", LocalDate.of(1998,01,25), "TCNO");
	        Game game = new Game(1, "Ice Tower", 80);
	        Campaign campaign = new Campaign(1,"Big Campaign",10);

	        IPlayerService playerService= new PlayerManager(new MernisServiceAdapter());
	        playerService.add(player);



	        GameSaleManager gameSaleManager = new GameSaleManager();
	        gameSaleManager.sell(game,player,campaign);

	}

}
