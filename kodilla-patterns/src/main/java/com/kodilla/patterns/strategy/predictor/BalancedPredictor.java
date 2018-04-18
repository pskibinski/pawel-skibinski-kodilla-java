package com.kodilla.patterns.strategy.predictor;

import com.kodilla.patterns.strategy.BuyPredictor;

public class BalancedPredictor implements BuyPredictor {

    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared units of Found XYZ";
    }
}
