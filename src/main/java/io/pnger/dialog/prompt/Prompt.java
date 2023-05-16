package io.pnger.dialog.prompt;

import io.pnger.dialog.message.PromptText;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface Prompt {

    /**
     * This method returns the {@link PromptText} that is
     * sent to the player on validation of the prompt.
     *
     * @param player the player
     * @return the prompt text
     */

    @Nonnull
    PromptText getPromptText(Player player);

    /**
     * This method returns a prompt based on the input
     * of the user.
     *
     * @param input the input to accept
     * @return the next prompt, or null if end of conversation
     */

    @Nullable
    Prompt acceptInput(Player player, String input);

}
