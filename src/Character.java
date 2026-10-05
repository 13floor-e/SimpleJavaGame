public abstract class Character {
    protected int hp;
    protected String weapon;
    protected int coins;

    public Character(int hp, String weapon, int coins) {
        this.hp = hp;
        this.weapon = weapon;
        this.coins = coins;
    }

    public int getHp() {
        return hp;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getCoins() {
        return coins;
    }

    public void reduceHp(int damage) {
        hp -= damage;

        if (hp < 0) {
            hp = 0;
        }
    }

    public void addCoins(int amount) {
        coins += amount;
    }
    public boolean isAlive() {
        return hp > 0;
    }
    public abstract String getCharacterClass();

    public void printStats(String nickname) {
        System.out.println("========== Character Stats ==========");
        System.out.println("Nickname: " + nickname);
        System.out.println("Class: " + getCharacterClass());
        System.out.println("Hp: " + getHp());
        System.out.println("Weapon: " + getWeapon());
        System.out.println("Coins: " + getCoins());
    }
}
