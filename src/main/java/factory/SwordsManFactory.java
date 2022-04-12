package factory;

import decorator.ShieldDecorator;
import model.MilitaryUnit;
import model.IMilitaryUnit;

public class SwordsManFactory implements MilitaryUnitFactory {

    public SwordsManFactory() {
    }

    @Override
    public IMilitaryUnit createMilitaryUnit() {
        return new ShieldDecorator(new MilitaryUnit(100, 10));
    }
}
