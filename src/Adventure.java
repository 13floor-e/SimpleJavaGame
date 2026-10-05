import java.util.List;
import java.util.Scanner;

public class Adventure {

    private final Character character; // поля
    private final String nickname;
    private final List<Quest> quests;

    public Adventure( // конструктор
            Character character,
            String nickname
    ) {
        this.character = character;
        this.nickname = nickname;

        this.quests = List.of(
                new Battle(),
                new CoinsAdventure(),
                new Trap()
        );
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("========== Adventure ==========");
        System.out.println(
                "Character  "
                        + character.getCharacterClass()
                        + " going to adventure."
        );

        for (int i = 0; i < quests.size(); i++) {
            Quest quest = quests.get(i);

            System.out.println();
            System.out.println(
                    (i + 1) + ". " + quest.getName()
            );

            System.out.println("1 - complete quest");
            System.out.println("2 - skip quest");
            System.out.print("> ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) { // если 1 то завершаем квест
                quest.complete(character);

                System.out.println();
                character.printStats(nickname); // вывод статы

                if (!character.isAlive()) { // если умер
                    System.out.println();
                    System.out.println(
                            "Character is dead. "
                                    + "Advenure is end."
                    );
                    return;
                }
            } else {
                System.out.println("Quest skips.");
            }
        }

        System.out.println();
        System.out.println("All quests are complete!");
        character.printStats(nickname); // Звершили, печать статы
    }
}
