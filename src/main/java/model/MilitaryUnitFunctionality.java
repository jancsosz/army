package model;

public interface MilitaryUnitFunctionality {
    void setHealthPoints(int healthPoints);
    int getAttackPower();
    int getHealthPoints();
    int doDamage();
    void sufferDamage(int damage);
}
