package edu.northeastern.cs5500.starterbot.command;

import java.util.Objects;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import net.dv8tion.jda.api.interactions.components.selections.StringSelectMenu;

@Slf4j
public class DropdownCommand implements SlashCommandHandler, StringSelectHandler {

    static final String NAME = "dropdown";

    @Inject
    public DropdownCommand() {
        // Empty and public for Dagger
    }

    @Override
    @Nonnull
    public String getName() {
        return NAME;
    }

    @Override
    @Nonnull
    public CommandData getCommandData() {
        return Commands.slash(getName(), "Demonstrate a dropdown interaction");
    }

    @Override
    public void onSlashCommandInteraction(@Nonnull SlashCommandInteractionEvent event) {
        log.info("event: /dropdown");

        StringSelectMenu menu =
                StringSelectMenu.create("dropdown")
                        .setPlaceholder(
                                "Choose your class") // shows the placeholder indicating what this
                        // menu is for
                        .addOption(
                                "Arcane Mage",
                                String.format("%s:mage-arcane", "pokemonbattleidgoeshere"))
                        .addOption("Fire Mage", "mage-fire")
                        .addOption("Frost Mage", "mage-frost")
                        .build();

        event.reply("Please pick your class below")
                .setEphemeral(true)
                .addActionRow(menu)
                .addActionRow(
                        Button.primary("dropdown:ok", "OK"),
                        Button.danger("dropdown:cancel", "Cancel"))
                .queue();
    }

    @Override
    public void onStringSelectInteraction(@Nonnull StringSelectInteractionEvent event) {
        final String response = event.getInteraction().getValues().get(0);
        String[] fields = response.split(":");
        String pokemonBattleId = fields[0];
        String selection = fields[1];
        Objects.requireNonNull(response);
        event.reply(response).queue();
    }
}
