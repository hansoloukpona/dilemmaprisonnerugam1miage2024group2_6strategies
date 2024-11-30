package org.dillemaprisonner.ugamiage12024group2_6.strategies;

import lombok.Data;

import java.security.SecureRandom;

@Data
public class NaivePeacemaker implements Strategy {

    private SecureRandom random = new SecureRandom();

    private Decision lastOpponentMove;

    public NaivePeacemaker(Decision lastOpponentMove) {
        this.lastOpponentMove = lastOpponentMove;
    }

    // Stratégie 7: Pacificateur naïf
    @Override
    public Decision nextMove() {
        return random.nextDouble() < 0.1 ? Decision.COOPERATE : lastOpponentMove;
    }
}
