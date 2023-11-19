package edu.northeastern.cs5500.starterbot.model;

import lombok.Data;
import org.bson.types.ObjectId;

@Data
public class NPCBattle {
    ObjectId myPokemon;
    ObjectId enemyPokemon;
}
