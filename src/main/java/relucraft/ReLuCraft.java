package relucraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static relucraft.item.ModItems.registerModItems;

public class ReLuCraft implements ModInitializer {
	public static final String MOD_ID = "relucraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		registerModItems();
	}
}