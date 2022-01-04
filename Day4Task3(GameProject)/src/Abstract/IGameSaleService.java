package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface IGameSaleService {

	void sell(Game game,Player player,Campaign campaign);
}
