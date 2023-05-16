package io.pnger.dialog.message;

import org.bukkit.entity.Player;

public class ChatMessage implements PromptText {

    private final String message;

    public ChatMessage(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage(Player player) {
        player.sendMessage(this.message);
    }

    public String getMessage() {
        return this.message;
    }
}
