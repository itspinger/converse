package io.pnger.dialog;

import java.util.UUID;

public class Dialog {

    private static final Dialog INSTANCE = new Dialog();

    // Make sure to not let anyone instantiate this
    private Dialog() {

    }

    public static Dialog getInstance() {
        return Dialog.INSTANCE;
    }

}
