package src.Units.Defensa;

public class ArrowTower extends DefenseUnit {
    public ArrowTower() {
        super(ARMOR_ARROWTOWER, BASE_DAMAGE_ARROWTOWER, BASE_HP_ARROWTOWER);
    }
    @Override public int attack() { return baseDamage; }
    @Override public int getWoodCost() { return WOOD_COST_ARROWTOWER; }
    @Override public int getIronCost() { return IRON_COST_ARROWTOWER; }
    @Override public int getChanceGeneratingWaste() { return CHANCE_GENERATING_WASTE_ARROWTOWER; }
    @Override public int getChanceAttackAgain() { return CHANCE_ATTACK_AGAIN_ARROWTOWER; }
}