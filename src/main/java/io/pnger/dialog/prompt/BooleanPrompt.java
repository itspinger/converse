package io.pnger.dialog.prompt;

import com.google.common.collect.ImmutableSet;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;
import java.util.Locale;
import java.util.Set;

public abstract class BooleanPrompt extends ValidationPrompt {

    private static final Set<String> TRUE_INPUTS;
    private static final Set<String> FALSE_INPUTS;
    private static final Set<String> VALID_INPUTS;

    static {
        TRUE_INPUTS = ImmutableSet.of("true", "on", "yes", "y", "1", "right");
        FALSE_INPUTS = ImmutableSet.of("false", "off", "no", "n", "0", "wrong");
        VALID_INPUTS = ImmutableSet.<String>builder().addAll(TRUE_INPUTS).addAll(FALSE_INPUTS).build();
    }

    @Override
    protected boolean isInputValid(Player player, String input) {
        return VALID_INPUTS.contains(input.toLowerCase(Locale.ROOT));
    }

    @Nullable
    @Override
    public Prompt accept(Player player, String input) {
        return this.accept(player, TRUE_INPUTS.contains(input.toLowerCase(Locale.ROOT)));
    }

    @Nullable
    public abstract Prompt accept(Player player, boolean input);
}
