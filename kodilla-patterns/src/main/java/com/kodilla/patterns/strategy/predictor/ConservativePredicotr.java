package com.kodilla.patterns.strategy.predictor;

import com.kodilla.patterns.strategy.BuyPredictor;

public class ConservativePredicotr implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}
