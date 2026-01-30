package ianm1647.kjseidolon.recipe;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.IngredientComponent;
import dev.latvian.mods.kubejs.recipe.component.ItemStackComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public interface ForagingRecipeJS {
    RecipeKey<ItemStack> RESULT = ItemStackComponent.ITEM_STACK.instance().outputKey("output");
    RecipeKey<Ingredient> BLOCK = IngredientComponent.INGREDIENT.instance().inputKey("block");

    RecipeSchema SCHEMA = new RecipeSchema(RESULT, BLOCK);

}
