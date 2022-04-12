package model;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private final List<MilitaryUnitFunctionality> armyList = new ArrayList<>();

    public void addUnit(MilitaryUnitFunctionality militaryUnit) {
        this.armyList.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (MilitaryUnitFunctionality unit: this.armyList) {
            unit.sufferDamage(damage);
            if (unit.getHealthPoints() < 25) {
                this.armyList.remove(unit);
            }
        };
    }

    public int getArmyDamage() {
        return this.armyList.stream()
                .mapToInt(MilitaryUnitFunctionality::doDamage)
                .sum();
    }

    public int getArmySize() {
        return this.armyList.size();
    }
}
