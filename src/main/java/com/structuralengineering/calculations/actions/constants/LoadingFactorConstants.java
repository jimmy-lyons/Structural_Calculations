package com.structuralengineering.calculations.actions.constants;

public class LoadingFactorConstants {
    public static class ShortTerm {
        // Distributed Loads
        public static final double RESIDENTIAL = 0.7;
        public static final double OFFICE = 0.7;
        public static final double PARKING = 0.7;
        public static final double RETAIL = 0.7;
        public static final double STORAGE = 1;
        public static final double OTHER = 1;
        public static final double ROOFS_WITH_ACTIVITIES = 0.7;
        public static final double ROOFS_GENERAL = 0.7;

        // Concentrated Loads
        public static final double CONCENTRATED_LOADS = 1;
    }

    public static class LongTerm {
        // Distributed Loads
        public static final double RESIDENTIAL = 0.4;
        public static final double OFFICE = 0.4;
        public static final double PARKING = 0.4;
        public static final double RETAIL = 0.4;
        public static final double STORAGE = 0.6;
        public static final double OTHER = 0.6;
        public static final double ROOFS_WITH_ACTIVITIES = 0.4;
        public static final double ROOFS_GENERAL = 0;

        // Concentrated Loads
        public static final double CONCENTRATED_FLOORS_GENERAL = 0.6;
        public static final double CONCENTRATED_FLOORS_RESIDENTIAL = 0.4;
        public static final double CONCENTRATED_ROOFS_WITH_ACTIVITIES = 0.6;
        public static final double CONCENTRATED_ROOFS_GENERAL = 0;
        public static final double CONCENTRATED_BALUSTRADES = 0;
        public static final double CONCENTRATED_MACHINERY = 1;
    }

    public static class Combination {
        // Distributed Loads
        public static final double RESIDENTIAL = 0.4;
        public static final double OFFICE = 0.4;
        public static final double PARKING = 0.4;
        public static final double RETAIL = 0.4;
        public static final double STORAGE = 0.6;
        public static final double OTHER = 0.6;
        public static final double ROOFS_WITH_ACTIVITIES = 0.4;
        public static final double ROOFS_GENERAL = 0;

        // Concentrated Loads
        public static final double CONCENTRATED_FLOORS_GENERAL = 0.4;
        public static final double CONCENTRATED_FLOORS_RESIDENTIAL = 0.4;
        public static final double CONCENTRATED_ROOFS_WITH_ACTIVITIES = 0.4;
        public static final double CONCENTRATED_ROOFS_GENERAL = 0;
        public static final double CONCENTRATED_BALUSTRADES = 0;
        public static final double CONCENTRATED_MACHINERY = 1.2;
    }
}
