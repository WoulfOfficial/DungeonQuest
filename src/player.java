public class Player {

    String name;
    int hp;
    int attack;
    int defense;
    int gold;
    int level;

    public Player(String name) {
        this.name = name;
        this.hp = 100;
        this.attack = 15;
        this.defense = 5;
        this.gold = 0;
        this.level = 1;
    }

    public void showStats() {
        System.out.println("\n===== PLAYER STATS =====");
        System.out.println("Name    : " + name);
        System.out.println("HP      : " + hp);
        System.out.println("Attack  : " + attack);
        System.out.println("Defense : " + defense);
        System.out.println("Gold    : " + gold);
        System.out.println("Level   : " + level);
        System.out.println("========================");
    }
}
