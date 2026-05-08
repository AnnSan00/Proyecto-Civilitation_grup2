package src.Units.Defensa;

import src.Interfaces.MilitaryUnit;
import src.Interfaces.Variables;

public abstract class DefenseUnit implements MilitaryUnit, Variables {
    protected int armor, baseDamage, baseLife, actualLife;

    public DefenseUnit(int armor, int baseDamage, int baseLife) {
        this.armor = armor;
        this.baseDamage = baseDamage;
        this.baseLife = baseLife;
        this.actualLife = baseLife;
    }

    @Override
    public void takeDamage(int receivedDamage) {
        // Las torres suelen absorber mejor el daño (según el PDF)
        int damageAfterArmor = receivedDamage - this.armor;
        if (damageAfterArmor < 0) damageAfterArmor = 0;
        this.actualLife -= damageAfterArmor;
    }

    @Override
    public int getActualArmor() { return armor; }
    @Override
    public int getActualLife() { return actualLife; }
    @Override
    public void setActualLife(int life) { this.actualLife = life; }
    
    // Las torres NO tienen experiencia ni gastan Maná ni comida
    @Override public void setExperience(int n) {}
    @Override public int getExperience() { return 0; }
    @Override public int getManaCost() { return 0; }
    @Override public int getFoodCost() { return 0; }
    @Override public void resetArmor() {}
}