package decorator;

import model.MilitaryUnitFunctionality;
import state.DefenceState;
import state.ShieldedState;

public class ShieldDecorator extends AddonDecorator {

    private DefenceState state;

    public ShieldDecorator(MilitaryUnitFunctionality militaryUnit) {
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
