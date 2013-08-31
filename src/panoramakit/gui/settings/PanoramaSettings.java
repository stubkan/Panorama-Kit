/* 
 * This code isn't copyrighted. Do what you want with it. :) 
 */
package panoramakit.gui.settings;

import java.util.ArrayList;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import panoramakit.mod.PanoramaKit;

/** 
 * @author dayanto
 */
public class PanoramaSettings
{
	private final PanoramaKit pk = PanoramaKit.instance;
	
	private final Configuration config = pk.getConfig();
	
	private static final int DEF_PANORAMA_WIDTH = 2000;
	private static final int DEF_PANORAMA_HEIGHT = 800;
	private static final double DEF_SAMPLE_SIZE = 1.0;
	
	private Property panoramaWidth;
	private Property panoramaHeight;
	private Property sampleSize;
	private static float orientation;
	private static float angle;
	
	public ArrayList<Class<GuiScreen>> imageMenuLinks = new ArrayList<Class<GuiScreen>>();
	
	public PanoramaSettings()
	{
		panoramaWidth = config.get("panorama", "width", DEF_PANORAMA_WIDTH);
		panoramaHeight = config.get("panorama", "height", DEF_PANORAMA_HEIGHT);
		sampleSize = config.get("panorama", "samplesize", DEF_SAMPLE_SIZE);
	}
	
	public PanoramaSettings(float playerRotation)
	{
		this();
		orientation = ((playerRotation % 360) + 360) % 360;
		angle = 0;
	}
	
	public int getPanoramaWidth()
	{
		return panoramaWidth.getInt(DEF_PANORAMA_WIDTH);
	}
	public void setPanoramaWidth(int width)
	{
		panoramaWidth.set(width);
	}
	
	public int getPanoramaHeight()
	{
		return panoramaHeight.getInt(DEF_PANORAMA_HEIGHT);
	}
	public void setPanoramaHeight(int height)
	{
		panoramaHeight.set(height);
	}
	
	public float getSampleSize()
	{
		return (float)sampleSize.getDouble(DEF_SAMPLE_SIZE);
	}
	public void setSampleSize(float size)
	{
		sampleSize.set(size);
	}
	
	public float getOrientation()
	{
		return orientation;
	}
	public void setOrientation(float orientation)
	{
		PanoramaSettings.orientation = orientation;
	}
	
	public float getAngle()
	{
		return angle;
	}
	public void setAngle(float angle)
	{
		PanoramaSettings.angle = angle;
	}
	
	
}
