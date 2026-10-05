public class Registration {
    private String name;
    private String game_class;

    public String GetClass(){
        return game_class;
    }

    public String GetName(){
        return name;

    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetClass(String gc) {
        this.game_class = gc;
    }

    void GetStats(String name, String game_class){
        System.out.println("==========Character Stats============");
        //System.out.println(game_class);
        switch (game_class){
            case "Warrior":
                System.out.println("Name: " + name);
                Warrior w = new Warrior();
                System.out.println("Class: Warrior");
                System.out.println("Hp: " + w.getHp());
                System.out.println("Weapon: " + w.getWeapon());
                System.out.println("Coins: " + w.getCoins());
                break;
            case "Wizard":
                System.out.println("Name: " + name);
                Wizard wz = new Wizard();
                System.out.println("Class: Wizard");
                System.out.println("Hp: " + wz.getHp());
                System.out.println("Weapon: " + wz.getWeapon());
                System.out.println("Coins: " + wz.getCoins());
                break;
            case "Archer":
                System.out.println("Name: " + name);
                Archer a = new Archer();
                System.out.println("Class: Archer");
                System.out.println("Hp: " + a.getHp());
                System.out.println("Weapon: " + a.getWeapon());
                System.out.println("Coins: " + a.getCoins());
                break;
        }
    }

}
