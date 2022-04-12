package model;

public interface IMilitaryUnit {
    void setHealthPoints(int healthPoints);
    int getAttackPower();
    int getHealthPoints();
    int doDamage();
    void sufferDamage(int damage);
}
