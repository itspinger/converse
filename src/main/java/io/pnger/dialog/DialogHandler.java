package io.pnger.dialog;

import io.pnger.dialog.user.DialogPlayer;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class DialogHandler {

    private final Map<UUID, DialogPlayer> users;

    public DialogHandler() {
        this.users = new ConcurrentHashMap<>();
    }

    /**
     * This method returns a {@link DialogPlayer} with the
     * specified user id.
     *
     * @param id the user id
     * @return the dialog player
     */

    public DialogPlayer getPlayer(UUID id) {
        return this.users.get(id);
    }
}
