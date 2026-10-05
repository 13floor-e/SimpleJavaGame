public class Trap implements Quest {

    @Override
    public String getName() {
        return "Escape the trap";
    }

    @Override
    public void complete(Character character) {
        int damage = 20;

        character.reduceHp(damage);

        System.out.println(
                "You fal into trap, and you loose "
                        + damage
                        + " HP."
        );
    }
}