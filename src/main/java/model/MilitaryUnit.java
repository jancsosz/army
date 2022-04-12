package model;

import lombok.Data;

@Data
public class MilitaryUnit implements IMilitaryUnit {

    private int healthPoints;
    private int attackPower;

    public MilitaryUnit(int healthPoints, int attackPower) {
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
    }

    @Override
    public int doDamage() {
        return this.attackPower;
    }

    @Override
    public void sufferDamage(int damage) {
        this.healthPoints -= damage;
    }
}
