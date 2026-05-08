package src.Units.Ataque;

import src.Interfaces.MilitaryUnit;
import src.Interfaces.Variables;


public abstract class AttackUnit implements MilitaryUnit, Variables {
    protected int armor, baseDamage, baseLife, actualLife, experience;

    public AttackUnit(int armor, int baseDamage, int baseLife) {
        this.armor = armor;
        this.baseDamage = baseDamage;
        this.baseLife = baseLife;
        this.actualLife = baseLife;
        this.experience = 0;
    }

    @Override
    public void takeDamage(int receivedDamage) {
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
    @Override
    public int getExperience() { return experience; }
    @Override
    public void setExperience(int n) { this.experience = n; }
    @Override
    public void resetArmor() { /* Implementar si hay mejora de herrería */ }
    @Override
    public int getManaCost() { return 0; } // Las de ataque no suelen usar maná
}