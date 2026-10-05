public class CharacterFactory {
    public static Character create(String gameClass) {
        return switch (gameClass) {
            case "Warrior" -> new Warrior();
            case "Wizard" -> new Wizard();
            case "Archer" -> new Archer();
            default -> throw new IllegalArgumentException(
                    "Unknown character class: " + gameClass
            );
        };
    }
}
