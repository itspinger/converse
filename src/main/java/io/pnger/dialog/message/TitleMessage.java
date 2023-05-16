package io.pnger.dialog.message;

import org.bukkit.entity.Player;

public class TitleMessage implements PromptText {

    private final String title;
    private final String subtitle;

    public TitleMessage(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    @Override
    public void sendMessage(Player player) {
        player.sendTitle(this.title, this.subtitle, 30, 600, 0);
    }

    public String getTitle() {
        return this.title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }
}
