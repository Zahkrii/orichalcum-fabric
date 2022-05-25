package site.orichalcum.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import site.orichalcum.OrichalcumMod;
import site.orichalcum.blocks.entities.OrichalcFurnaceEntity;

public class OrichalcFurnace extends BlockWithEntity {

    public static final Identifier ID = new Identifier(OrichalcumMod.MOD_ID, "orichalc_furnace");

    public OrichalcFurnace(Settings settings) {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
            BlockHitResult hit) {

        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);

            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory);
            }
        }
        return ActionResult.SUCCESS;
    }

    // 退出后将物品散落在地上
    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof OrichalcFurnaceEntity) {
                ItemScatterer.spawn(world, pos, (OrichalcFurnaceEntity) blockEntity);
                world.updateComparators(pos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new OrichalcFurnaceEntity(pos, state);
    }

    /*
     * @Nullable
     * 
     * @Override
     * public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world,
     * BlockState state,
     * BlockEntityType<T> type) {
     * return checkType(type, ModBlockEntities.ORICHALC_FURNACE_ENTITY,
     * OrichalcFurnaceEntity::tick);
     * }
     */
}
