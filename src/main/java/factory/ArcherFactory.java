package factory;

import model.MilitaryUnit;
import model.MilitaryUnitFunctionality;

public class ArcherFactory implements MilitaryUnitFactory{

    public ArcherFactory() {
    }

    @Override
    public MilitaryUnitFunctionality createMilitaryUnit() {
        return new MilitaryUnit(50, 20);
    }
}
