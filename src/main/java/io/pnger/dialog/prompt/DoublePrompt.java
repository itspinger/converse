package io.pnger.dialog.prompt;

import org.bukkit.entity.Player;

import javax.annotation.Nullable;

public abstract class DoublePrompt extends NumberPrompt {

    @Nullable
    @Override
    public Prompt accept(Player player, Number number) {
        return this.accept(player, number.doubleValue());
    }

    @Nullable
    public abstract Prompt accept(Player player, double input);
}
