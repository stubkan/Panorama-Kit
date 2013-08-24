/* 
 * This code isn't copyrighted. Do what you want with it. :) 
 */
package panoramakit.gui.settings;

/**
 * Setting
 * 
 * @author dayanto
 */
public abstract class Setting {
	public String id;
	
	public Setting(String id) {
		this.id = id;
	}
	
	public String getID() {
		return id;
	}
	
	public abstract String getValueAsString();
	
	public abstract void setValueFromString(String value);
	
	public abstract String getDisplayString();
}