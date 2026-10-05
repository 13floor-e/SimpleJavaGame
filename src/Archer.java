//public class Archer extends GetStatistics{
//    private int hp = 60;
//    private String weapon = "Long Bow";
//    private int coins = 70;
//    @Override
//    public int GetHp(){
//        return hp;
//    }
//    @Override
//    public String GetWeapon() {
//        return weapon;
//    }
//    @Override
//    public int GetCoins() {
//        return coins;
//    }
//}
public class Archer extends Character {

    public Archer() {
        super(100, "Bow", 0);
    }

    @Override
    public String getCharacterClass() {
        return "Archer";
    }
}
