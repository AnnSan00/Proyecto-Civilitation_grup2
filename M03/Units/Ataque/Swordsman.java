package src.Units.Ataque;

public class Swordsman extends AttackUnit {
    public Swordsman() {
        super(ARMOR_SWORDSMAN, BASE_DAMAGE_SWORDSMAN, BASE_HP_SWORDSMAN);
    }
    @Override public int attack() { return baseDamage + (experience * 2); }
    @Override public int getFoodCost() { return FOOD_COST_SWORDSMAN; }
    @Override public int getWoodCost() { return WOOD_COST_SWORDSMAN; }
    @Override public int getIronCost() { return IRON_COST_SWORDSMAN; }
    @Override public int getChanceGeneratingWaste() { return CHANCE_GENERATING_WASTE_SWORDSMAN; }
    @Override public int getChanceAttackAgain() { return CHANCE_ATTACK_AGAIN_SWORDSMAN; }
}