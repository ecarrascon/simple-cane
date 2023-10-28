package com.ecarrascon.simplecane;

import com.ecarrascon.simplecane.block.BlocksRegistry;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleCane implements ModInitializer {
	public static final String MOD_ID = "simplecane";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		BlocksRegistry.registerBlocks();

		LOGGER.info("Done");
	}
}