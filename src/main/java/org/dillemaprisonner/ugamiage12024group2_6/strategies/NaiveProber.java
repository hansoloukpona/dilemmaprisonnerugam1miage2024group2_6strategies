package org.dillemaprisonner.ugamiage12024group2_6.strategies;

import lombok.Data;

import java.security.SecureRandom;

@Data
public class NaiveProber implements Strategy {

    private SecureRandom random = new SecureRandom();

    private Decision lastOpponentMove;

    public NaiveProber(Decision lastOpponentMove) {
        this.lastOpponentMove = lastOpponentMove;
    }

    // Stratégie 5: Sondeur naïf
    @Override
    public Decision nextMove() {
        return random.nextDouble() < 0.1 ? Decision.BETRAY : lastOpponentMove;
    }
}
