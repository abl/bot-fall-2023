package edu.northeastern.cs5500.starterbot.repository;

import dagger.Module;
import dagger.Provides;
import edu.northeastern.cs5500.starterbot.model.Pokemon;
import edu.northeastern.cs5500.starterbot.model.TradeOffer;
import edu.northeastern.cs5500.starterbot.model.Trainer;
import edu.northeastern.cs5500.starterbot.model.UserPreference;

@Module
public class RepositoryModule {
    // NOTE: You can use the following lines if you'd like to store objects in memory.
    // NOTE: The presence of commented-out code in your project *will* result in a lowered grade.

    @Provides
    public GenericRepository<Pokemon> providePokemonRepository(
            MongoDBRepository<Pokemon> repository) {
        return repository;
    }

    @Provides
    public Class<Pokemon> providePokemon() {
        return Pokemon.class;
    }

    @Provides
    public GenericRepository<Trainer> provideTrainerRepository(
            MongoDBRepository<Trainer> repository) {
        return repository;
    }

    @Provides
    public Class<Trainer> provideTrainer() {
        return Trainer.class;
    }

    @Provides
    public GenericRepository<UserPreference> provideUserPreferencesRepository(
            MongoDBRepository<UserPreference> repository) {
        return repository;
    }

    @Provides
    public Class<TradeOffer> provideTradeOffer() {
        return TradeOffer.class;
    }

    @Provides
    public GenericRepository<TradeOffer> provideTradeOfferRepository(
            MongoDBRepository<TradeOffer> repository) {
        return repository;
    }

    @Provides
    public Class<UserPreference> provideUserPreference() {
        return UserPreference.class;
    }
}
