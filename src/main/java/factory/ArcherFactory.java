package factory;

import model.MilitaryUnit;
import model.IMilitaryUnit;

public class ArcherFactory implements MilitaryUnitFactory{

    public ArcherFactory() {
    }

    @Override
    public IMilitaryUnit createMilitaryUnit() {
        return new MilitaryUnit(50, 20);
    }
}
