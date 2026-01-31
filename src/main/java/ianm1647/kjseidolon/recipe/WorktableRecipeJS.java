package ianm1647.kjseidolon.recipe;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import dev.latvian.mods.kubejs.util.IntBounds;
import dev.latvian.mods.kubejs.util.TinyMap;
import net.minecraft.world.item.ItemStack;

import java.util.List;

public interface WorktableRecipeJS {
    RecipeKey<ItemStack> RESULT = ItemStackComponent.ITEM_STACK.outputKey("result");

    RecipeKey<List<String>> PATTERN = StringComponent.STRING.instance().asList().otherKey("pattern");
    RecipeKey<List<String>> REAGENTS = StringComponent.STRING.instance().asList().otherKey("reagents");

    RecipeKey<? extends TinyMap<Character, ?>> KEY =
            MapRecipeComponent.of(CharacterComponent.CHARACTER.instance(), IngredientComponent.INGREDIENT.instance(), IntBounds.DEFAULT).otherKey("key");

    RecipeSchema SCHEMA = new RecipeSchema(RESULT, PATTERN, REAGENTS, KEY);
}
