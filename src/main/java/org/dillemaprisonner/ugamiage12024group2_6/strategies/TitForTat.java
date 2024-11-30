package org.dillemaprisonner.ugamiage12024group2_6.strategies;

public class TitForTat implements Strategy {

    private Decision lastOpponentMove;

    public TitForTat(Decision lastOpponentMove) {
        this.lastOpponentMove = lastOpponentMove;
    }

    // Stratégie 1: Donnant donnant - Joue comme le dernier coup de l'adversaire
    @Override
    public Decision nextMove() {
        return lastOpponentMove;
    }

}
