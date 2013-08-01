package ml.boxes.tile.safe;

import ml.boxes.tile.TileEntitySafe;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatMessageComponent;

/**
 * A fall-back mechanism that will be loaded if a safe fails to save or load properly.
 * Shouldn't ever happen, but neither should NPEs
 * 
 * @author Matchlighter
 */
public class MechFallback extends SafeMechanism {

	protected NBTTagCompound loadedTag = new NBTTagCompound();
	
	public MechFallback(TileEntitySafe tsafe) {
		super(tsafe);
	}

	@Override
	public NBTTagCompound saveNBT() {
		return loadedTag;
	}

	@Override
	public void loadNBT(NBTTagCompound mechTag) {
		loadedTag = mechTag;
	}

	@Override
	public void beginUnlock(EntityPlayer epl) {
		epl.sendChatToPlayer(ChatMessageComponent.func_111066_d("\u00A77\u00A7oWarning: The safe has been corrupted and can no longer be locked properly!"));
		safe.unlock();
	}

	@Override
	public boolean canConnectWith(SafeMechanism tmech) {
		return true;
	}

	@Override
	public void render(RenderPass pass, boolean stacked) {
		
	}
}
