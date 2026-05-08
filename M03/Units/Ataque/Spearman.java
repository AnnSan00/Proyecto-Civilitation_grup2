package Units.Ataque; // 1. Quitamos el 'src.' inicial (en Java no se pone)

import Interfaces.Variables;
import Units.AttackUnit; // 2. Referencia correcta al padre

public class Spearman extends AttackUnit {

    public Spearman() {
        // Estos valores vienen de Variables
        super(ARMOR_SPEARMAN, BASE_DAMAGE_SPEARMAN, BASE_HP_SPEARMAN);
    }

    @Override
    public int attack() {
        return baseDamage + (experience * PLUS_ATTACK_UNIT_PER_EXPERIENCE_POINT);
    }

    @Override public int getFoodCost() { return FOOD_COST_SPEARMAN; }
    @Override public int getWoodCost() { return WOOD_COST_SPEARMAN; }
    @Override public int getIronCost() { return IRON_COST_SPEARMAN; }
    @Override public int getChanceGeneratingWaste() { return CHANCE_GENERATNG_WASTE_SPEARMAN; }
    @Override public int getChanceAttackAgain() { return CHANCE_ATTACK_AGAIN_SPEARMAN; }
}