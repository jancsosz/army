package state;

import decorator.ShieldDecorator;
import model.MilitaryUnitFunctionality;

public class UnShieldedState implements DefenceState {
    private ShieldDecorator militaryUnit;

    UnShieldedState(ShieldDecorator militaryUnit) {
        this.militaryUnit = militaryUnit;
    }

    @Override
    public void sufferDamage(int damage) {
        this.militaryUnit.setHealthPoints(this.militaryUnit.getHealthPoints() - damage);
    }
}
