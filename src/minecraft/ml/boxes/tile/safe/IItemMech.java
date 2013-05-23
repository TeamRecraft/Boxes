package ml.boxes.tile.safe;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public interface IItemMech {

	/**
	 * Should return the full class name of the Mechanism to apply to the safe.
	 * e.g. ml.boxes.tile.safe.MechCombo (Class.getName())
	 */
	public String getMechID(InventoryCrafting inv, ItemStack mechStack, ItemStack safeStack);
	
	/**
	 * Should transfer any necessary NBT settings from the mechStack to the safeStack.
	 */
	public void onSafeCraftedWith(InventoryCrafting inv, ItemStack mechStack, ItemStack safeStack);
	
	public ItemStack getMechStackFromNBT(NBTTagCompound tag);
}