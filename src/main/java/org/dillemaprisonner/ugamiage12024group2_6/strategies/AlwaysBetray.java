package org.dillemaprisonner.ugamiage12024group2_6.strategies;


import lombok.Data;

@Data
public class AlwaysBetray implements Strategy {

    public AlwaysBetray() {
    }

    // Stratégie 10: Toujours trahir
    @Override
    public Decision nextMove() {
        return Decision.BETRAY;
    }
}
