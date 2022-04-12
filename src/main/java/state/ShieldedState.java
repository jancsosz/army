package state;

import decorator.ShieldDecorator;
import model.MilitaryUnitFunctionality;

public class ShieldedState implements DefenceState {
    private ShieldDecorator militaryUnit;

    public ShieldedState(ShieldDecorator militaryUnit) {
        this.militaryUnit = militaryUnit;
    }

    @Override
    public void sufferDamage(int damage) {
        this.militaryUnit.setMilitaryUnitState(new UnShieldedState(this.militaryUnit));
    }
}
