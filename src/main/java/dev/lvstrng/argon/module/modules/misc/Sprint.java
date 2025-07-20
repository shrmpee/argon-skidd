package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.utils.EncryptedString;

public final class Sprint extends Module implements TickListener {
    public Sprint() {
        super(EncryptedString.of("Jogging Gooning"), EncryptedString.of("Keeps you sprinting at all times and gooning"), -1, Category.MISC);
    }

    @Override
    public void onEnable() {
        eventManager.add(TickListener.class, this);
        super.onEnable();
    }

    @Override
    public void onDisable() {
        eventManager.remove(TickListener.class, this);
        super.onDisable();
    }

    @Override
    public void onTick() {
        mc.player.setSprinting(mc.player.input.pressingForward);
    }
}
