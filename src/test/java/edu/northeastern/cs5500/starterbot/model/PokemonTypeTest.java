package edu.northeastern.cs5500.starterbot.model;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

class PokemonTypeTest {

    @Test
    void testDoubleEffective() {
        PokemonType[] defenderTypes = new PokemonType[1];
        defenderTypes[0] = PokemonType.GRASS;
        assertThat(PokemonType.getEffectiveness(PokemonType.FIRE, defenderTypes))
                .isEqualTo(MoveEffectiveness.DOUBLE_EFFECT);
    }

    @Test
    void testHalfEffective() {
        PokemonType[] defenderTypes = new PokemonType[1];
        defenderTypes[0] = PokemonType.WATER;
        assertThat(PokemonType.getEffectiveness(PokemonType.FIRE, defenderTypes))
                .isEqualTo(MoveEffectiveness.HALF_EFFECT);
    }

    @Test
    void testFullEffective() {
        PokemonType[] defenderTypes = new PokemonType[1];
        defenderTypes[0] = PokemonType.FIRE;
        assertThat(PokemonType.getEffectiveness(PokemonType.NORMAL, defenderTypes))
                .isEqualTo(MoveEffectiveness.FULL_EFFECT);
    }
}
