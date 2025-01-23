package net.hahava.sundried.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hahava.sundried.block.ModBlocks;
import net.hahava.sundried.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_DRILL, 1)
                .pattern(" I ")
                .pattern("GIG")
                .pattern("MMM")
                .input('I', Items.IRON_INGOT)
                .input('G', ModItems.IRON_GEAR)
                .input('M', ModItems.METAL_SCRAP)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(ModItems.IRON_GEAR), conditionsFromItem(ModItems.IRON_GEAR))
                .criterion(hasItem(ModItems.METAL_SCRAP), conditionsFromItem(ModItems.METAL_SCRAP))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.STEEL_DRILL)));

        //ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STURDY_BRICK, 3)
        //        .input(ModBlocks.CRACKED_BRICKS, 1)
        //        .offerTo(consumer, new Identifier(getRecipeName(ModItems.STURDY_BRICK)));
    }
}
