package xyz.blryface.theunflattening;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TheUnflattening implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("theunflattening");
	@Override
	public void onInitialize() {

		LOGGER.info("Deflattening your game...");

	}
}