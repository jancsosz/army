package state;

import decorator.FirstAttackDecorator;

public class FirstAttackState implements AttackState{
    private FirstAttackDecorator militaryUnit;

    public FirstAttackState(FirstAttackDecorator militaryUnit) {
        this.militaryUnit = militaryUnit;
    }

    @Override
    public int doDamage() {
        this.militaryUnit.setMilitaryUnitState(new AfterFirstAttackState(this.militaryUnit));
        return this.militaryUnit.getAttackPower() * 3;
    }
}
