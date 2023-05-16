package io.pnger.dialog.prompt;

import org.bukkit.entity.Player;

import javax.annotation.Nullable;

public abstract class LongPrompt extends NumberPrompt {

    @Nullable
    @Override
    public Prompt accept(Player player, Number number) {
        return this.accept(player, number.longValue());
    }

    @Nullable
    public abstract Prompt accept(Player player, long input);
}
