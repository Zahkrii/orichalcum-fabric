package site.orichalcum.blocks.entities;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import site.orichalcum.OrichalcumMod;
import site.orichalcum.blocks.ModBlocks;

public class ModBlockEntities {

    public static BlockEntityType<OrichalcFurnaceEntity> ORICHALC_FURNACE_ENTITY = Registry.register(
            Registry.BLOCK_ENTITY_TYPE, new Identifier(OrichalcumMod.MOD_ID, "orichalc_furnace"),
            FabricBlockEntityTypeBuilder.create(OrichalcFurnaceEntity::new, ModBlocks.ORICHALC_FURNACE).build(null));

    public static void RegisterModBlockEntities() {
        OrichalcumMod.LOGGER.info("Registering Block Entities for " + OrichalcumMod.MOD_ID);
    }
}
