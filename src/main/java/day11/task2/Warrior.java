package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private int physAtt;

    public Warrior() {
        this.physAtt = 30;
        this.health = 100;
        this.physDef = 8;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health = (hero.health - physAtt) + hero.physDef;

        if (hero.health < 0) {
            hero.health = 0;
        }
    }

    @Override
    public void physDef() {
        this.health += physDef;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
