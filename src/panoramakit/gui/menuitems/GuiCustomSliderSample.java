/* 
 * This code isn't copyrighted. Do what you want with it. :) 
 */
package panoramakit.gui.menuitems;

import panoramakit.gui.screens.GuiSettingsScreen;

/**
 * @author dayanto
 */
public class GuiCustomSliderSample extends GuiCustomSlider
{
	
	public GuiCustomSliderSample(int id, int x, int y, GuiSettingsScreen settingsScreen, String baseString, float min, float max, float step, float value)
	{
		super(id, x, y, settingsScreen, baseString, min, max, step, value);
	}
	
	public void updateDisplayString() 
	{
		// modify the display string by adding an x after the value.
		displayString = String.format(baseString + ": %.1fx", getValue()); 
	}
}