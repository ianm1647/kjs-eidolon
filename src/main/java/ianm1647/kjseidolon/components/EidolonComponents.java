package ianm1647.kjseidolon.components;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import dev.latvian.mods.kubejs.recipe.RecipeScriptContext;
import dev.latvian.mods.kubejs.recipe.component.RecipeComponentType;
import dev.latvian.mods.kubejs.recipe.component.SimpleRecipeComponent;
import dev.latvian.mods.kubejs.recipe.filter.RecipeMatchContext;
import dev.latvian.mods.kubejs.recipe.match.Replaceable;
import dev.latvian.mods.kubejs.recipe.match.ReplacementMatchInfo;
import dev.latvian.mods.rhino.type.TypeInfo;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;

public class EidolonComponents {
    public static RecipeComponentType<Steps> STEPS = RecipeComponentType.unit(ResourceLocation.fromNamespaceAndPath("eidolon_repraised", "steps"), StepsComponent::new);

    public record Steps(List<Ingredient> matches, int stirs) {
        public static Codec<Steps> CODEC = Codec.lazyInitialized(() -> RecordCodecBuilder.create((o) -> o.group(
                Ingredient.CODEC.listOf().fieldOf("items").forGetter(Steps::matches),
                Codec.INT.fieldOf("stirs").forGetter(Steps::stirs)
        ).apply(o, Steps::new)));

        public static Steps of(List<Ingredient> matches, int stirs) {
            return new Steps(matches, stirs);
        }
    }

    public static class StepsComponent extends SimpleRecipeComponent<Steps> implements Replaceable {

        public StepsComponent(RecipeComponentType<?> type) {
            super(type, Steps.CODEC, TypeInfo.of(Steps.class));
        }

        @Override
        public boolean matches(RecipeMatchContext cx, Steps value, ReplacementMatchInfo match) {
            return super.matches(cx, value, match);
        }

        @Override
        public Steps replace(RecipeScriptContext cx, Steps value, ReplacementMatchInfo match, Object with) {
            return matches(cx, value, match) ? (Steps) Replaceable.super.replaceThisWith(cx, with) : value;
        }
    }
}
