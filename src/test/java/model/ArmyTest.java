package model;

import factory.ArcherFactory;
import factory.HeavyCavalryFactory;
import factory.SwordsManFactory;
import junit.framework.TestCase;
import decorator.ArmedDecorator;

public class ArmyTest extends TestCase {

    IMilitaryUnit heavyCavalry;
    IMilitaryUnit archer;
    IMilitaryUnit swordsMan;

    Army army;

    public void setUp() {
        heavyCavalry = new HeavyCavalryFactory().createMilitaryUnit();
        archer = new ArcherFactory().createMilitaryUnit();
        swordsMan = new ArmedDecorator(new SwordsManFactory().createMilitaryUnit());

        army = new Army();

        army.addUnit(heavyCavalry);
        army.addUnit(archer);
        army.addUnit(swordsMan);
    }

    public void testAddUnit() {
        army = new Army();

        army.addUnit(heavyCavalry);
        assertEquals(1, army.getArmySize());
    }

    public void testDamageAll() {
        this.army.damageAll(20);

        assertEquals(140, heavyCavalry.getHealthPoints());
        assertEquals(100, swordsMan.getHealthPoints());
        assertEquals(30, archer.getHealthPoints());
    }

    public void testGetArmyDamage() {
        assertEquals(90, army.getArmyDamage());
    }

    public void testGetArmySize() {
        assertEquals(3, army.getArmySize());
    }

    public void testDamageAllShouldRemoveUnitWhenHealthPointIsUnder25() {
        army.damageAll(25);

        assertEquals(3, army.getArmySize());

        army.damageAll(1);

        assertEquals(2, army.getArmySize());
    }

    public void testHeavyCavalryShouldHaveTripleAttackPowerWhenFirstAttack() {
        assertEquals(60, heavyCavalry.doDamage());
    }

    public void testHeavyCavalryShouldHaveSingleAttackPowerWhenFirstAttackIsDone() {
        heavyCavalry.doDamage();

        assertEquals(20, heavyCavalry.doDamage());
    }

    public void testHeavyCavalryShouldSufferHalfDamage() {
        heavyCavalry.sufferDamage(10);

        assertEquals(145, heavyCavalry.getHealthPoints());
    }

    public void testSwordsManShouldNotGetDamageWhenArmedAndFirstAttack() {
        swordsMan.sufferDamage(10);

        assertEquals(100, swordsMan.getHealthPoints());
    }

    public void testSwordsManShouldGetHalfDamageWhenArmedAndFirstAttackIsDone() {
        swordsMan.sufferDamage(10);
        swordsMan.sufferDamage(20);

        assertEquals(90, swordsMan.getHealthPoints());
    }

    public void testSwordsManShouldGetTotalDamageWhenUnarmedAndFirstAttackIsDone() {
        IMilitaryUnit unarmedSwordsMan = new SwordsManFactory().createMilitaryUnit();

        unarmedSwordsMan.sufferDamage(10);
        unarmedSwordsMan.sufferDamage(10);

        assertEquals(90, unarmedSwordsMan.getHealthPoints());

    }

    /*public void testCloneMilitaryUintShouldReturnNewObjectWithEqualValues() {
        MilitaryUnit unit1 = new HeavyCavalry(150, 20, true);
        MilitaryUnit unit3 = unit1.clone();

        assertEquals(unit1, unit3);
        assertNotSame(unit1, unit3);
    }*/
}