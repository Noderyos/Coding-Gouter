package dev.noderyos.codinggouter;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodingGouter implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("codinggouter");

    @Override
    public void onInitialize() {
        ModObjects.registerObjects();
    }
}