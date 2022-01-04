package Concrete;

import Abstract.IGameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements IGameSaleService {

	@Override
	public void sell(Game game, Player player, Campaign campaign) {
		double lastPrice = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100);

        System.out.println("Player Name: "+player.getFirstName());
        System.out.println("Game Name: "+game.getGameName());
        System.out.println("Game Price: "+game.getPrice());
        System.out.println("Campaign Name: "+campaign.getCampaignName());
        System.out.println("Campaign Discount: %"+campaign.getDiscount());
        System.out.println("Last Price: "+lastPrice);
	}

}
