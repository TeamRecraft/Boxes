package ml.boxes.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ml.core.texture.maps.BasicCustomTextureMap.IIconProvider;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

@SideOnly(Side.CLIENT)
public class Icons implements IIconProvider {

	public static Icon LOCK;
	
	@Override
	public void registerIcons(IconRegister ireg) {
		LOCK = ireg.registerIcon("Boxes:lock");
	}

}
