package io.pnger.dialog.prompt;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;

public abstract class PlayerPrompt extends ValidationPrompt {

    public PlayerPrompt() {
        super();
    }

    @Nullable
    @Override
    public Prompt accept(Player player, String input) {
        return this.accept(player, Bukkit.getPlayer(input));
    }

    @Nullable
    public abstract Prompt accept(Player sender, Player target);

    @Override
    protected boolean isInputValid(Player player, String input) {
        return Bukkit.getPlayer(input) != null;
    }
}
