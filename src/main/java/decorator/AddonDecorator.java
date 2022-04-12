package decorator;

import model.MilitaryUnitFunctionality;

abstract class AddonDecorator implements MilitaryUnitFunctionality {
    MilitaryUnitFunctionality militaryUnit;

    public AddonDecorator(MilitaryUnitFunctionality militaryUnit) {
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
