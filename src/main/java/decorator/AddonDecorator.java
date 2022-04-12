package decorator;

import model.IMilitaryUnit;

abstract class AddonDecorator implements IMilitaryUnit {
    IMilitaryUnit militaryUnit;

    public AddonDecorator(IMilitaryUnit militaryUnit) {
        this.militaryUnit = militaryUnit;
    }

    @Override
    public void setHealthPoints(int healthPoints) {
        this.militaryUnit.setHealthPoints(healthPoints);
    }

    @Override
    public int getAttackPower() {
        return this.militaryUnit.getAttackPower();
    }

    @Override
    public int getHealthPoints() {
        return this.militaryUnit.getHealthPoints();
    }

    @Override
    public int doDamage() {
        return this.militaryUnit.doDamage();
    }

    @Override
    public void sufferDamage(int damage) {
        this.militaryUnit.sufferDamage(damage);
    }
}
