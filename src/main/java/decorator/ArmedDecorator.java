package decorator;

import model.IMilitaryUnit;

public class ArmedDecorator extends AddonDecorator {

    public ArmedDecorator(IMilitaryUnit militaryUnit) {
        super(militaryUnit);
    }

    @Override
    public void sufferDamage(int damage) {
        this.militaryUnit.sufferDamage(damage/2);
    }
}
