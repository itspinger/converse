package io.pnger.dialog.prompt;

import org.bukkit.entity.Player;

import javax.annotation.Nullable;

public abstract class ValidationPrompt implements Prompt {

    @Nullable
    public abstract Prompt accept(Player player, String input);

    /**
     * This method checks if the specified input is valid
     * and returns the corresponding method value.
     *
     * @param player the player
     * @param input the input
     * @return the validation result
     */

    protected abstract boolean isInputValid(Player player, String input);

    @Nullable
    @Override
    public Prompt acceptInput(Player player, String input) {
        if (!this.isInputValid(player, input)) {
            return this;
        }

        return this.accept(player, input);
    }

}
