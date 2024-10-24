enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}


enum Direction {
    NORTH, EAST, SOUTH, WEST
}


enum Season {
    WINTER, SPRING, SUMMER, FALL
}


enum Planet {
    MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE
}

enum Color {
    RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE
}


enum Status {
    ACTIVE, INACTIVE, PENDING, COMPLETED
}


enum VehicleType {
    CAR, TRUCK, MOTORCYCLE, BICYCLE, BUS
}


enum Fruit {
    APPLE, BANANA, ORANGE, GRAPE, WATERMELON
}


enum ProgrammingLanguage {
    JAVA, PYTHON, C, CPLUSPLUS, JAVASCRIPT
}


enum MusicGenre {
    ROCK, POP, JAZZ, CLASSICAL, HIPHOP
}

public class Enum {
    public static void main(String[] args) {
        
        Day today = Day.WEDNESDAY;
        Direction myDirection = Direction.NORTH;
        Season currentSeason = Season.SUMMER;
        Planet myPlanet = Planet.EARTH;
        Color favoriteColor = Color.BLUE;
        Status currentStatus = Status.ACTIVE;
        VehicleType myVehicle = VehicleType.CAR;
        Fruit myFavoriteFruit = Fruit.APPLE;
        ProgrammingLanguage myLanguage = ProgrammingLanguage.JAVA;
        MusicGenre myMusicGenre = MusicGenre.ROCK;

        
        System.out.println("Today is: " + today);
        System.out.println("Direction: " + myDirection);
        System.out.println("Current Season: " + currentSeason);
        System.out.println("My Planet: " + myPlanet);
        System.out.println("Favorite Color: " + favoriteColor);
        System.out.println("Current Status: " + currentStatus);
        System.out.println("My Vehicle: " + myVehicle);
        System.out.println("Favorite Fruit: " + myFavoriteFruit);
        System.out.println("Programming Language: " + myLanguage);
        System.out.println("Music Genre: " + myMusicGenre);
    }
}
