package com.aalegz.springdemo;

public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    @Override
    public String getFortune() {
        return data[(int) (Math.random()*data.length)];
    }
}
