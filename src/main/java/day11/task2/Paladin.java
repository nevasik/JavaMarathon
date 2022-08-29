package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private int physAtt;

    public Paladin() {
        this.physAtt = 15;
        this.health = 100;
        this.physDef = 15;
        this.magicDef = 4;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health -= physAtt;

        if (hero.health < 0) {
            hero.health = 0;
        }
    }

    @Override
    public void physDef() {
        this.health += physDef;
    }

    @Override
    public void magicDef() {
        this.health += magicDef;
    }

    @Override
    public void healHimself() {
        this.health += 25;

        if (health > 100) {
            this.health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 10;

        if (hero.health > 100) {
            hero.health = 100;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
