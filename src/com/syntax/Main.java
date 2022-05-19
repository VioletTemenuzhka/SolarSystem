package com.syntax;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SolarSystem FactorX = new SolarSystem();
        FactorX.sun ="1";
        FactorX.moon="4";
        FactorX.planet="2";
        FactorX.stars="10000";

        // adding features to our sun
        FeatureSun Xfact = new FeatureSun();
        Xfact.color ="green";
        Xfact.radius = "10000000000000km";
        Xfact.heat ="33443556666kj";
    }
}
