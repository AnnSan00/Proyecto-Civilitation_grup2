package src.Units.Especial;

public class Magician extends SpecialUnit {
    public Magician() {
        super(ARMOR_MAGICIAN, BASE_DAMAGE_MAGICIAN, BASE_HP_MAGICIAN, MANA_MAGICIAN);
    }
    @Override public int attack() { return baseDamage; }
    @Override public int getFoodCost() { return FOOD_COST_MAGICIAN; }
    @Override public int getWoodCost() { return WOOD_COST_MAGICIAN; }
    @Override public int getIronCost() { return IRON_COST_MAGICIAN; }
    @Override public int getManaCost() { return MANA_COST_MAGICIAN; }
    @Override public int getChanceGeneratingWaste() { return CHANCE_GENERATING_WASTE_MAGICIAN; }
    @Override public int getChanceAttackAgain() { return CHANCE_ATTACK_AGAIN_MAGICIAN; }
}