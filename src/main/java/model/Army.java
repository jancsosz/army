package model;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private final List<IMilitaryUnit> armyList = new ArrayList<>();

    public void addUnit(IMilitaryUnit militaryUnit) {
        this.armyList.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (IMilitaryUnit unit: this.armyList) {
            unit.sufferDamage(damage);
            if (unit.getHealthPoints() < 25) {
                this.armyList.remove(unit);
            }
        }
    }

    public int getArmyDamage() {
        return this.armyList.stream()
                .mapToInt(IMilitaryUnit::doDamage)
                .sum();
    }

    public int getArmySize() {
        return this.armyList.size();
    }
}
