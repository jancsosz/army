package decorator;

import model.IMilitaryUnit;
import state.DefenceState;
import state.ShieldedState;

public class ShieldDecorator extends AddonDecorator {

    private DefenceState state;

    public ShieldDecorator(IMilitaryUnit militaryUnit) {
        super(militaryUnit);
        this.state = new ShieldedState(this);
    }

    public void setMilitaryUnitState(DefenceState state) {
        this.state = state;
    }

    @Override
    public void sufferDamage(int damage) {
        this.state.sufferDamage(damage);
    }
}
