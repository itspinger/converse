package io.pnger.dialog.prompt;

import org.apache.commons.lang3.math.NumberUtils;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;

public abstract class NumberPrompt extends ValidationPrompt {

    @Override
    protected boolean isInputValid(Player player, String input) {
        return NumberUtils.isCreatable(input);
    }

    @Nullable
    @Override
    public Prompt accept(Player player, String input) {
        return this.accept(player, NumberUtils.createNumber(input));
    }

    @Nullable
    public abstract Prompt accept(Player player, Number number);
}
