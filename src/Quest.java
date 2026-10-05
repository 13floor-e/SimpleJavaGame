public interface Quest { // набор методов обяз. к реализации
//    private final Character character;
//    private final List<Quest> quests;
//
//    public Adventure(Character character) {
//        this.character = character;
//
//        CharacterClass type = CharacterClass.valueOf(
//                character.getCharacterClass()
//        );
//
//        this.quests = QuestFactory.createQuests(type);
//    }
//
//    public void completeQuest(int number) {
//        if (number < 1 || number > quests.size()) {
//            System.out.println("Квест не найден");
//            return;
//        }
//
//        Quest quest = quests.get(number - 1);
//        quest.complete(character);
//
//        System.out.println();
//        System.out.println("Текущая статистика:");
//        character.getStatistic();
//    }
String getName();

    void complete(Character character);
}
