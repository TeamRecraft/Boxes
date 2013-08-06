package ml.boxes;

import ml.core.texture.maps.BasicCustomTextureMap;
import ml.core.texture.maps.BasicCustomTextureMap.IIconProvider;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class Icons implements IIconProvider {

	public static Icon LOCK;
	
	@Override
	public void registerIcons(IconRegister ireg) {
		LOCK = ireg.registerIcon("Boxes:lock");
	}

}