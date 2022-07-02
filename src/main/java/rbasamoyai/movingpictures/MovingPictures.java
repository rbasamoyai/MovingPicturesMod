package rbasamoyai.movingpictures;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MovingPictures.MOD_ID)
public class MovingPictures {

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "movingpictures";
	
	public MovingPictures() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
	}
	
}
