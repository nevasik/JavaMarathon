package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private int physAtt;
    private int magicAtt;

    public Magician() {
        this.health = 100;
        this.physAtt = 5;
        this.magicAtt = 20;
        this.magicDef = 80 / 100;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health = hero.health - magicAtt + hero.magicDef;
        if (hero.health < 0) {
            hero.health = 0;
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health -= physAtt;
        if (hero.health < 0) {
            hero.health = 0;
        }
    }

    @Override
    public void magicDef() {
        this.health += magicDef;

        if (health > 100) {
            this.health = 100;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
