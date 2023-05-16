package io.pnger.dialog.prompt;

import org.bukkit.entity.Player;

import javax.annotation.Nullable;

public abstract class ShortPrompt extends NumberPrompt {

    @Nullable
    @Override
    public Prompt accept(Player player, Number number) {
        return this.accept(player, number.shortValue());
    }

    @Nullable
    public abstract Prompt accept(Player player, short input);
}
