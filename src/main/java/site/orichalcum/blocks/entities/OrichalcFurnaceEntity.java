package site.orichalcum.blocks.entities;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import site.orichalcum.items.inventory.ImplementedInventory;
import site.orichalcum.screen.OrichalcFurnaceScreenHandler;

public class OrichalcFurnaceEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {

    // 定义三个格子
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);

    public OrichalcFurnaceEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ORICHALC_FURNACE_ENTITY, pos, state);
    }

    // 显示名称
    @Override
    public Text getDisplayName() {
        return new TranslatableText("block.orichalcum.orichalc_furnace");
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        // 定义三个格子，返回
        return inventory;
    }

    // 保存存储状态
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
    }

    // 保存存储状态
    @Override
    public void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        super.writeNbt(nbt);
    }

    /*
     * @Override
     * public boolean canPlayerUse(PlayerEntity player) {
     * return pos.isWithinDistance(player.getBlockPos(), 4.5f);
     * }
     */
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inventory, PlayerEntity player) {
        return new OrichalcFurnaceScreenHandler(syncId, inventory, this);
    }

    /*
     * public static void tick(World world, BlockPos pos, BlockState state,
     * OrichalcFurnaceEntity entity) {
     * if (hasRecipe(entity) && world.isThundering() &&
     * hasNotReachedStackLimit(entity)) {
     * craftItem(entity);
     * 
     * if (!world.isClient()) {
     * // EntityType.LIGHTNING_BOLT.spawn((ServerWorld) world, null, null, null,
     * pos,
     * // SpawnReason.TRIGGERED, true, true);
     * }
     * }
     * }
     */

    /*
     * private static void craftItem(OrichalcFurnaceEntity entity) {
     * // entity.removeStack(0, 1);
     * // entity.removeStack(1, 1);
     * 
     * // entity.setStack(2, new ItemStack(ModItems.ORICHALCUM_ITEM,
     * // entity.getStack(2).getCount() + 1));
     * }
     */

    /*
     * private static boolean hasRecipe(OrichalcFurnaceEntity entity) {
     * // boolean hasItemInFirstSlot = entity.getStack(0).getItem() ==
     * // ModItems.IRON_WOOL;
     * // boolean hasItemInSecondSlot = entity.getStack(1).getItem() ==
     * // ModItems.PEPPER;
     * 
     * // return hasItemInFirstSlot && hasItemInSecondSlot;
     * return false;
     * }
     */

    /*
     * private static boolean hasNotReachedStackLimit(OrichalcFurnaceEntity entity)
     * {
     * // return entity.getStack(2).getCount() < entity.getStack(2).getMaxCount();
     * return false;
     * }
     */
}
