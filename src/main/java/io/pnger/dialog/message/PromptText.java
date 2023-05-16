package io.pnger.dialog.message;

import org.bukkit.entity.Player;

public interface PromptText {

    static PromptText title(String title, String subtitle) {
        return new TitleMessage(title, subtitle);
    }

    static PromptText chat(String message) {
        return new ChatMessage(message);
    }

    static PromptText chatTitle(String title, String subtitle, String message) {
        return new CombinedMessage(new TitleMessage(title, subtitle), new ChatMessage(message));
    }

    /**
     * This method sends the message of this dialog
     * to the specified player.
     *
     * @param player the player
     */

    void sendMessage(Player player);

}
