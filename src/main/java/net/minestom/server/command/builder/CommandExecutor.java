package net.minestom.server.command.builder;

import net.minestom.server.command.CommandSender;
import org.jetbrains.annotations.NotNull;

/**
 * Callback executed once a syntax has been found for a {@link Command}.
 * <p>
 * Warning: it could be the default executor from {@link Command#getDefaultExecutor()} if not null.
 */
@FunctionalInterface
public interface CommandExecutor {
    void apply(@NotNull CommandSender source, @NotNull Arguments args);
}