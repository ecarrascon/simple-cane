package com.ecarrascon.simplecane;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleCane implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("simplecane");
	public static final String MOD_ID = "simplecane";

	@Override
	public void onInitialize() {


		LOGGER.info("Done");
	}
}