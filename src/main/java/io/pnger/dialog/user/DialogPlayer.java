package io.pnger.dialog.user;

import io.pnger.dialog.Conversation;

import java.util.LinkedList;
import java.util.UUID;

public class DialogPlayer {

    private final UUID id;
    private final LinkedList<Conversation> queue;

    /**
     *
     *
     * @param id
     */

    public DialogPlayer(UUID id) {
        this.id = id;
        this.queue = new LinkedList<>();
    }

    public synchronized boolean isConversing() {
        return !this.queue.isEmpty();
    }

}
