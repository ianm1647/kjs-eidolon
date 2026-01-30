package ianm1647.kjseidolon.recipe;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemStackComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import ianm1647.kjseidolon.components.EidolonComponents;
import net.minecraft.world.item.ItemStack;

import java.util.List;


public interface CrucibleRecipeJS {
    RecipeKey<ItemStack> RESULT = ItemStackComponent.ITEM_STACK.outputKey("result");
    RecipeKey<List<EidolonComponents.Steps>> STEPS = EidolonComponents.STEPS.instance().asList().inputKey("steps");

    RecipeSchema SCHEMA = new RecipeSchema(RESULT, STEPS);
}
