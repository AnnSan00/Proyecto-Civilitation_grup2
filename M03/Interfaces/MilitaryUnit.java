package src.Interfaces;


public interface MilitaryUnit {
    int attack();
    void takeDamage(int receivedDamage);
    int getActualArmor();
    int getFoodCost();
    int getWoodCost();
    int getIronCost();
    int getManaCost();
    int getChanceGeneratingWaste();
    int getChanceAttackAgain();
    void resetArmor();
    void setExperience(int n);
    int getExperience();
    
    // Añadimos estos para que los moldes puedan gestionar la vida
    int getActualLife();
    void setActualLife(int life);
}
