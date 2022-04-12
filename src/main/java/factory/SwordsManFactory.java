package factory;

import decorator.ShieldDecorator;
import model.MilitaryUnit;
import model.MilitaryUnitFunctionality;

public class SwordsManFactory implements MilitaryUnitFactory {

    public SwordsManFactory() {
    }

    @Override
    public MilitaryUnitFunctionality createMilitaryUnit() {
        return new ShieldDecorator(new MilitaryUnit(100, 10));
    }
}
