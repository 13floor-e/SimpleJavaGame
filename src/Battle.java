public class Battle implements Quest{ // реализация методов Adventure
    @Override
    public String getName() {
        return "Battle with Monster";
    }

    @Override
    public void complete(Character character) {
        System.out.println("You was attacked by Monster!");

        int damage = 15;
        character.reduceHp(damage);

        System.out.println(
                "Monster will be defeated, but you loose "
                        + damage
                        + " HP."
        );
    }
}
