package state;

import decorator.FirstAttackDecorator;

public class AfterFirstAttackState implements AttackState{
    private FirstAttackDecorator militaryUnit;

    AfterFirstAttackState(FirstAttackDecorator militaryUnit) {
        this.militaryUnit = militaryUnit;
    }

    @Override
    public int doDamage() {
        return this.militaryUnit.getAttackPower();
    }
}
