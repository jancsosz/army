package decorator;

import model.MilitaryUnitFunctionality;
import state.AttackState;
import state.FirstAttackState;

public class FirstAttackDecorator extends AddonDecorator {

    private AttackState state;

    public FirstAttackDecorator(MilitaryUnitFunctionality militaryUnit) {
        super(militaryUnit);
        this.state = new FirstAttackState(this);
    }

    public void setMilitaryUnitState(AttackState state) {
        this.state = state;
    }

    @Override
    public int doDamage() {
        return this.state.doDamage();
    }
}
