package src.Units.Especial;

import src.Interfaces.MilitaryUnit;
import src.Interfaces.Variables;

public abstract class SpecialUnit implements MilitaryUnit, Variables {
    protected int armor, baseDamage, baseLife, actualLife, mana;

    public SpecialUnit(int armor, int baseDamage, int baseLife, int mana) {
        this.armor = armor;
        this.baseDamage = baseDamage;
        this.baseLife = baseLife;
        this.actualLife = baseLife;
        this.mana = mana;
    }

    @Override
    public void takeDamage(int receivedDamage) {
        int damageAfterArmor = receivedDamage - this.armor;
        if (damageAfterArmor < 0) damageAfterArmor = 0;
        this.actualLife -= damageAfterArmor;
    }

    @Override
    public int getActualLife() { return actualLife; }
    @Override
    public void setActualLife(int life) { this.actualLife = life; }
    @Override
    public int getActualArmor() { return armor; }
    
    // Los especiales no suelen tener experiencia de combate física
    @Override public void setExperience(int n) {}
    @Override public int getExperience() { return 0; }
    @Override public void resetArmor() {}
}