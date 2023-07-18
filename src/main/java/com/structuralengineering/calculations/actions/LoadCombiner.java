package com.structuralengineering.calculations.actions;

public class LoadCombiner {

    public static class ULS {
        public static double permanentActionOnly(double g) {
            return 1.35 * g;
        }

        public static double permanentAndImposedAction(double g, double q) {
            return 1.2 * g + 1.5 * q;
        }

        public static double permanentAndLongTermImposedAction(double g, double q, double longTermFactor) {
            return 1.2 * g + 1.5 * longTermFactor * q;
        }

        public static double permanentWindAndImposedAction(double g, double q, double ultimateWind, double combinationFactor) {
            return 1.2 * g + ultimateWind + combinationFactor * q;
        }

        public static double permanentAndWindActionReversal(double g, double ultimateWind) {
            return 0.9 * g + ultimateWind;
        }

        public static double permanentEarthquakeAndImposedAction(double g, double q, double ultimateEarthquake, double combinationFactor) {
            return g + ultimateEarthquake + combinationFactor * q;
        }

        public static double permanentImposedActionAndLiquidSnowOrEarth(double g, double q, double liquidSnowOrEarth, double combinationFactor) {
            return 1.2 * g + liquidSnowOrEarth + combinationFactor * q;
        }
    }

    public static class SLS {
        public static double permanentAndImposedAction(double g, double q) {
            return g + q;
        }

        public static double permanentAndFactoredImposedAction(double g, double q, double factor) {
            return g + factor * q;
        }

        public static double permanentWindAndFactoredImposedAction(double g, double q, double serviceWind, double factor) {
            return g + serviceWind + factor * q;
        }

        public static double permanentEarthquakeAndImposedAction(double g, double q, double serviceEarthquake, double factor) {
            return g + serviceEarthquake + factor * q;
        }

        public static double permanentImposedActionAndLiquidSnowOrEarth(double g, double q, double liquidSnowOrEarth, double factor) {
            return g + liquidSnowOrEarth + factor * q;
        }
    }

    public static class Stability {
        public static double stabilising (double g) {
            return 0.9 * g;
        }
        // NOTE: Destabilising combinations are the same as ULS
    }

    public static class Liquid {
        // NOTE: for well-defined liquids, add self-weight to permanent load
        //       for poorly defined, add SW to live load

        public static double wellDefinedStaticLiquidPressure (double flp) {
            return 1.2 * flp;
        }

        public static double poorlyDefinedStaticLiquidPressure (double flp) {
            return 1.5 * flp;
        }

        public static double rainwaterPonding (double fpnd) {
            return 1.2 * fpnd;
        }

        public static double groundWater (double fgw) {
            return 1.2 * fgw;
        }
    }

    public static class Earth {
        public static double nonULSMethodology (double fe) {
            return 1.5 * fe;
        }
    }
}
