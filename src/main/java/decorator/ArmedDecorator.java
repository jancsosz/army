package decorator;

import model.MilitaryUnitFunctionality;

public class ArmedDecorator extends AddonDecorator {

    public ArmedDecorator(MilitaryUnitFunctionality militaryUnit) {
        super(militaryUnit);
    }

    @Override
    public void sufferDamage(int damage) {
        this.militaryUnit.sufferDamage(damage/2);
    }
}
