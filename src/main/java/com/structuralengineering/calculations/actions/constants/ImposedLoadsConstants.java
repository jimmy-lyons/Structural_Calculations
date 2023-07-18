package com.structuralengineering.calculations.actions.constants;

public final class ImposedLoadsConstants {

    // Loads are in kN/m2
    public static class Area {

        // A1: Domestic and residential activities, self-contained dwellings
        public static final double A1_GENERAL = 1.5;
        public static final double A1_PRIVATE_BALCONY = 2;
        public static final double A1_STAIRS = 2;
        public static final double A1_ROOF = 0.5;

        // A2: Domestic and residential activities, Other
        public static final double A2_GENERAL = 2;
        public static final double A2_COMMUNAL_KITCHENS = 3;
        public static final double A2_COMMUNAL_BALCONY = 4;

        // B: Offices and work areas not covered elsewhere
        public static final double B_OPERATING_THEATRE = 3;
        public static final double B_XRAY_ROOM = 3;
        public static final double B_UTILITY_ROOM = 3;
        public static final double B_NON_STORAGE_LIGHT_INDUSTRIAL = 3;
        public static final double B_OFFICE = 3;
        public static final double B_COMMUNAL_KITCHEN = 3;
        public static final double B_INSTITUTIONAL_KITCHEN = 5;
        public static final double B_LAUNDRY = 3;
        public static final double B_LABORATORY = 3;
        public static final double B_FACTORY = 5;
        public static final double B_BALCONY = 4;

        // C1: Areas where people may congregate, Areas with tables
        public static final double C1_CAFE_RESTAURANT = 2;
        public static final double C1_READING_ROOM_NO_BOOK_STORAGE = 2.5;
        public static final double C1_CLASSROOM = 3;

        // C2: Areas where people may congregate, Areas with fixed seats
        public static final double C2_INSTITUTIONAL_ASSEMBLY = 3; // e.g. lecture theatre
        public static final double C2_PUBLIC_ASSEMBLY = 4; // e.g. conference centre, theatre, auditoria
        public static final double C2_PLACES_OF_WORSHIP = 4;

        // C3: Areas where people may congregate, Areas without obstacles for moving people
        public static final double C3_CORRIDORS_WITHOUT_WHEELED_VEHICLES = 4;
        public static final double C3_CORRIDORS_WITH_WHEELED_VEHICLES = 5;
        public static final double C3_GROUND_LEVEL_FOOTPATH_OR_PLAZA = 5;
        public static final double C3_MUSEUM = 4;
        public static final double C3_BALCONY = 4;

        // C4: Areas where people may congregate, Areas with possible physical activities
        public static final double C4_GYMNASIA_OR_STUDIO = 5;
        public static final double C4_DRILL_HALL = 5;

        // C5: Areas where people may congregate, Areas susceptible to overcrowding
        public static final double C5_ASSEMBLY_AREA_WITHOUT_FIXED_SEATING = 5; // e.g. concert halls, bars etc
        public static final double C5_STAGES = 7.5;

        // D: Shopping areas
        public static final double D_SHOP_FLOORS = 4;

        // E: Warehousing and storage
        public static final double E_LIBRARIES = 4;
        public static final double E_OFFICE_STORAGE = 5;
        public static final double E_PLANT_ROOM = 5;

        // F: Light vehicle traffic
        public static final double F_VEHICLES_BELOW_2500KG = 2.5;

        // G: Medium vehicle traffic
        public static final double G_VEHICLES_ABOVE2500KG_BELOW_10000KG = 5;
    }

    // Loads are in kN
    public static class Point {

        // A1: Domestic and residential activities, self-contained dwellings
        public static final double A1_GENERAL = 1.8;
        public static final double A1_STAIRS = 2.7;
        public static final double A1_ROOF = 1.4;

        // A2: Domestic and residential activities, Other
        public static final double A2_GENERAL = 1.8;
        public static final double A2_KITCHENS = 2.7;

        // B: Offices and work areas not covered elsewhere
        public static final double B_OPERATING_THEATRE = 4.5;
        public static final double B_XRAY_ROOM = 4.5;
        public static final double B_UTILITY_ROOM = 4.5;
        public static final double B_NON_STORAGE_LIGHT_INDUSTRIAL = 3.5;
        public static final double B_OFFICE = 2.7;
        public static final double B_COMMUNAL_KITCHENS = 2.7;
        public static final double B_INSTITUTIONAL_KITCHEN = 4.5;
        public static final double B_LAUNDRY = 4.5;
        public static final double B_LABORATORY = 4.5;
        public static final double B_FACTORY = 4.5;
        public static final double B_BALCONY = 1.8;

        // C1: Areas where people may congregate, Areas with tables
        public static final double C1_CAFE_RESTAURANT = 2.7;
        public static final double C1_READING_ROOM_NO_BOOK_STORAGE = 4.5;
        public static final double C1_CLASSROOM = 2.7;

        // C2: Areas where people may congregate, Areas with fixed seats
        public static final double C2_INSTITUTIONAL_ASSEMBLY = 2.7; // e.g. lecture theatre
        public static final double C2_PUBLIC_ASSEMBLY = 2.7; // e.g. conference centre, theatre, auditoria
        public static final double C2_PLACES_OF_WORSHIP = 2.7;

        // C3: Areas where people may congregate, Areas without obstacles for moving people
        public static final double C3_CORRIDORS_WITHOUT_WHEELED_VEHICLES = 4.5;
        public static final double C3_CORRIDORS_WITH_WHEELED_VEHICLES = 5;
        public static final double C3_GROUND_LEVEL_FOOTPATH_OR_PLAZA = 31;
        public static final double C3_MUSEUM = 4.5;
        public static final double C3_BALCONY = 4;

        // C4: Areas where people may congregate, Areas with possible physical activities
        public static final double C4_GYMNASIA_OR_STUDIO = 3.6;
        public static final double C4_DRILL_HALL = 9;

        // C5: Areas where people may congregate, Areas susceptible to overcrowding
        public static final double C5_ASSEMBLY_AREA_WITHOUT_FIXED_SEATING = 3.6; // e.g. concert halls, bars etc
        public static final double C5_STAGES = 4.5;

        // D: Shopping areas
        public static final double D_SHOP_FLOORS = 3.6;

        // E: Warehousing and storage
        public static final double E_LIBRARIES = 4.5;
        public static final double E_OFFICE_STORAGE = 4.5;
        public static final double E_PLANT_ROOM = 4.5;

        // F: Light vehicle traffic
        public static final double F_VEHICLES_BELOW_2500KG = 13;

        // G: Medium vehicle traffic
        public static final double G_VEHICLES_ABOVE2500KG_BELOW_10000KG = 31;
    }

    // Loads are in kN/m
    public static class Linear {
        // A1: Domestic and residential activities, self-contained dwellings
        public static final double A1_PRIVATE_BALCONY = 1.8;

        // A2: Domestic and residential activities, Other
        public static final double A2_COMMUNAL_BALCONY = 1.8;

        // B: Offices and work areas not covered elsewhere
        public static final double B_FLY_GALLERY = 4.5;
    }
}
