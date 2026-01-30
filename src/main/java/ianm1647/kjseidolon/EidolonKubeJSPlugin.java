package ianm1647.kjseidolon;

import dev.latvian.mods.kubejs.plugin.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.component.RecipeComponentTypeRegistry;
import dev.latvian.mods.kubejs.recipe.schema.RecipeFactoryRegistry;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchemaRegistry;
import dev.latvian.mods.kubejs.recipe.schema.UnknownKubeRecipe;
import dev.latvian.mods.kubejs.script.BindingRegistry;
import ianm1647.kjseidolon.components.EidolonComponents;
import ianm1647.kjseidolon.recipe.*;
import net.minecraft.resources.ResourceLocation;

public class EidolonKubeJSPlugin implements KubeJSPlugin {
    @Override
    public void registerRecipeComponents(RecipeComponentTypeRegistry registry) {
        registry.register(EidolonComponents.STEPS);
    }

    @Override
    public void registerRecipeFactories(RecipeFactoryRegistry registry) {
        registry.register(UnknownKubeRecipe.RECIPE_FACTORY);
    }

    @Override
    public void registerBindings(BindingRegistry registry) {
        registry.add("StepIngredients", EidolonComponents.Steps.class);
    }

    @Override
    public void registerRecipeSchemas(RecipeSchemaRegistry registry) {
        registry.register(ResourceLocation.parse("eidolon_repraised:crucible"), CrucibleRecipeJS.SCHEMA);
        registry.register(ResourceLocation.parse("eidolon_repraised:athame_foraging"), ForagingRecipeJS.SCHEMA);
        registry.register(ResourceLocation.parse("eidolon_repraised:ritual_brazier_command"), CommandRitualRecipeJS.SCHEMA);
        registry.register(ResourceLocation.parse("eidolon_repraised:ritual_brazier_crafting"), CraftingRitualRecipeJS.SCHEMA);
        registry.register(ResourceLocation.parse("eidolon_repraised:ritual_brazier_location"), LocateRitualRecipeJS.SCHEMA);
        registry.register(ResourceLocation.parse("eidolon_repraised:ritual_brazier_summoning"), SummonRitualRecipeJS.SCHEMA);
    }
}
