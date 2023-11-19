package edu.northeastern.cs5500.starterbot.controller;

import edu.northeastern.cs5500.starterbot.model.NPCBattle;
import edu.northeastern.cs5500.starterbot.model.PokemonMove;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class NPCBattleController {
    @Inject PokedexController pokedexController;
    @Inject PokemonController pokemonController;

    @Inject
    public NPCBattleController() {
        // defined and empty for Dagger
    }

    NPCBattle startBattle(int pokedexNumber1, int pokedexNumber2) {
        return null;
    }

    NPCBattle getCurrentBattle(String discordMemberId) {
        return null;
    }

    /**
     * Attempt to apply the given move to the user's current battle; returns the new state of the
     * battle.
     *
     * @param discordMemberId
     * @param move
     * @return
     */
    NPCBattle applyMove(String discordMemberId, PokemonMove move) {
        NPCBattle battle = getCurrentBattle(discordMemberId);

        // pokemonController.applyDamage(battle.getEnemyPokemon(), battle.getMyPokemon(), move);

        // MoveEffectiveness effectiveness = theirPokemonSpecies.getEffectiveness(move.getType());
        // int damage = (int) ((myPokemon.getAttack() - theirPokemon.getDefense()) *
        // effectiveness.getEffectiveness());

        // theirPokemon.setCurrentHp(theirPokemon.getCurrentHp() - damage);

        return battle;
    }
}
