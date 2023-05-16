package io.pnger.dialog.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ConversationListener implements Listener {

    @EventHandler
    public void onAsyncChat(AsyncPlayerChatEvent event) {
        // Cancel the broadcast if the player
        // That is sending the message is in a conversation queue
    }


}
