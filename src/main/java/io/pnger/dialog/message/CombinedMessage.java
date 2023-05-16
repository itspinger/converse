package io.pnger.dialog.message;

import org.bukkit.entity.Player;

public class CombinedMessage implements PromptText {

    private final TitleMessage title;
    private final ChatMessage chat;

    public CombinedMessage(TitleMessage title, ChatMessage chat) {
        this.title = title;
        this.chat = chat;
    }

    @Override
    public void sendMessage(Player player) {
        this.title.sendMessage(player);
        this.chat.sendMessage(player);
    }

    public TitleMessage getTitleMessage() {
        return this.title;
    }

    public ChatMessage getChatMessage() {
        return this.chat;
    }
}
