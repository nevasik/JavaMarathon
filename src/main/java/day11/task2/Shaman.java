package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {
    private int physAtt;
    private int magicAtt;

    public Shaman() {
        this.health = 100;
        this.magicAtt = 15;
        this.physAtt = 10;
        this.magicDef = 20 / 100;
        this.physDef = 20 / 100;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health -= magicAtt;
        if (hero.health < 0) {
            hero.health = 0;
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health = hero.health - physAtt + hero.physDef;
        if (hero.health < 0) {
            hero.health = 0;
        }
    }

    @Override
    public void healHimself() {
        this.health += 50;
        if (health > 100) {
            health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 30;
        if (hero.health > 100) {
            hero.health = 100;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
