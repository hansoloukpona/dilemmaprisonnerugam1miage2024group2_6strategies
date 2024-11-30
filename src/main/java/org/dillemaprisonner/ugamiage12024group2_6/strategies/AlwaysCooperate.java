package org.dillemaprisonner.ugamiage12024group2_6.strategies;

import lombok.Data;

@Data
public class AlwaysCooperate implements Strategy {

    public AlwaysCooperate() {
    }

    @Override
    public Decision nextMove() {
        return Decision.COOPERATE;
    }

}
