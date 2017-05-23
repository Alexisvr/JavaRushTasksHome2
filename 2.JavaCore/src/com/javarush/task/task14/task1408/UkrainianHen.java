package com.javarush.task.task14.task1408;

/**
 * Created by vorobev on 25.04.2017.
 */
public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 18;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}
