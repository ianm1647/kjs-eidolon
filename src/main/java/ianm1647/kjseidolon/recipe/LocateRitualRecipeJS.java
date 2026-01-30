package ianm1647.kjseidolon.recipe;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.IngredientComponent;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.component.StringComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;

public interface LocateRitualRecipeJS {
    RecipeKey<String> RESULT = StringComponent.STRING.instance().outputKey("structure");

    RecipeKey<List<Ingredient>> REAGENT = IngredientComponent.INGREDIENT.instance().asList().inputKey("reagent");
    RecipeKey<List<Ingredient>> PEDESTAL_ITEMS = IngredientComponent.INGREDIENT.instance().asList().inputKey("pedestal_items");
    RecipeKey<List<Ingredient>> FOCUS_ITEMS = IngredientComponent.INGREDIENT.instance().asList().inputKey("focus_items");

    RecipeKey<Float> HEALTH_REQUIREMENT = NumberComponent.FLOAT.otherKey("health_requirement").optional(0.0F);

    RecipeSchema SCHEMA = new RecipeSchema(RESULT, REAGENT, PEDESTAL_ITEMS, FOCUS_ITEMS, HEALTH_REQUIREMENT);

}
