package factory;

import decorator.ArmedDecorator;
import decorator.FirstAttackDecorator;
import model.MilitaryUnit;
import model.IMilitaryUnit;

public class HeavyCavalryFactory implements MilitaryUnitFactory{

    public HeavyCavalryFactory() {
    }

    @Override
    public IMilitaryUnit createMilitaryUnit() {
        return new FirstAttackDecorator(new ArmedDecorator(new MilitaryUnit(150, 20)));
    }
}
