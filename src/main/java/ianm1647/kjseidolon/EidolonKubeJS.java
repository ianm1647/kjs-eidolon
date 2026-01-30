package ianm1647.kjseidolon;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EidolonKubeJS.MODID)
public class EidolonKubeJS {
    public static final String MODID = "kjseidolon";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public EidolonKubeJS(IEventBus bus) {
        NeoForge.EVENT_BUS.register(this);
    }

    public static ResourceLocation loc(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}
}
