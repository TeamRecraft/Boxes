package ml.boxes.network.packets;

import java.io.IOException;

import com.google.common.io.ByteArrayDataInput;

import cpw.mods.fml.common.network.Player;

import ml.boxes.tile.TileEntitySafe;
import ml.core.network.MLPacket;

public class PacketComboEntered extends MLPacket {

	public int tex;
	public int tey;
	public int tez;
	
	public int[] combo;
	
	public PacketComboEntered(Player pl, TileEntitySafe tes, int[] combo) {
		super(pl);
		chunkDataPacket = false;
		
		tex = tes.xCoord;
		tey = tes.yCoord;
		tez = tes.zCoord;
		
		this.combo = combo;
		
		writeInt(tex);
		writeInt(tey);
		writeInt(tez);
		
		writeInt(combo.length);
		for (int i : combo){
			writeInt(i);
		}
	}
	
	public PacketComboEntered(Player pl, ByteArrayDataInput data) {
		super(pl, data);
		
		tex = data.readInt();
		tey = data.readInt();
		tez = data.readInt();
		
		int len = data.readInt();
		combo = new int[len];
		for (int i=0; i<len; i++){
			combo[i] = data.readInt();
		}
	}
	
	@Override
	public void handleClientSide() throws IOException {}

	@Override
	public void handleServerSide() throws IOException {
		// TODO Auto-generated method stub

	}

}
