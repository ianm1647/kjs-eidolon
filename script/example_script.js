//priority 150

ServerEvents.recipes(event => {

event.recipes.eidolon_repraised.ritual_brazier_crafting(
    'minecraft:granite', //item output
    'minecraft:dirt', //reagent
    [ 'minecraft:enchanted_golden_apple', 'eidolon_repraised:shadow_gem' ], //pedestal items
    'minecraft:cobblestone', //focus items
    50.0, //health requirement
    true //keep nbt
)

event.recipes.eidolon_repraised.ritual_brazier_summoning(
    'minecraft:cow', //entity output
    'minecraft:dirt', //reagent
    [ 'minecraft:enchanted_golden_apple', 'eidolon_repraised:shadow_gem' ], //pedestal items
    'minecraft:cobblestone', //focus items
    1, //count
    10.0 //health requirement
)

event.recipes.eidolon_repraised.ritual_brazier_location(
    'minecraft:stronghold', //entity output
    'minecraft:diamond', //reagent
    [ 'minecraft:shulker_shell', 'minecraft:netherite_ingot' ], //pedestal items
    'minecraft:obsidian', //focus items
    25.0 //health requirement
)

event.recipes.eidolon_repraised.crucible(
    'minecraft:dirt', //output
    [
        StepIngredients.of(['minecraft:cobblestone', 'minecraft:diamond'], 1), //1st step, 2 inputs, and 1 stir
        StepIngredients.of(['minecraft:carrot'], 2) //2nd step, 1 input, 2 stirs
    ]
)

event.recipes.eidolon_repraised.athame_foraging(
    'minecraft:wheat_seeds', //output
    'minecraft:cobblestone' //block input
)

})