package org.dillemaprisonner.ugamiage12024group2_6.strategies;

import lombok.Data;

import java.util.ArrayList;

@Data
public class GrimTrigger implements Strategy {

    ArrayList<Decision> opponentMoveHistoric;

    public GrimTrigger(ArrayList<Decision> opponentMoveHistoric) {
        this.opponentMoveHistoric = opponentMoveHistoric;
    }

    // Stratégie 12: Rancunier - Coopère jusqu'à la première trahison, puis toujours trahir
    @Override
    public Decision nextMove() {

        if (haveMyOpponentOnceBetray()) {
            return Decision.BETRAY;
        }
        return Decision.COOPERATE;
    }

    private boolean haveMyOpponentOnceBetray() {
        return  opponentMoveHistoric.stream().anyMatch(decision -> decision == Decision.BETRAY);
    }

}
