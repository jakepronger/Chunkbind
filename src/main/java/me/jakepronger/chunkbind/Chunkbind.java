package me.jakepronger.chunkbind;

import me.jakepronger.spine.Spine;
import me.jakepronger.spine.managers.RegistryManager;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Chunkbind extends JavaPlugin {

    private Spine spine;
    private RegistryManager registry;
    private Chunkbind instance;

    @Override
    public void onEnable() {
        instance = this;
        spine = new Spine(instance);

        registry = spine.getRegistry();

        registry.listener(PlayerJoinEvent.class, this::onJoin);
    }

    @Override
    public void onDisable() {

    }

    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        //player.setWorldBorder();
    }

}
