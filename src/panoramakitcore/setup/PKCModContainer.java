package panoramakitcore.setup;

import java.util.Arrays;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.ModMetadata;

/**
 * PKCModContainer
 *  
 * @author dayanto
 * @license GNU Lesser General Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
public class PKCModContainer extends DummyModContainer 
{
	public PKCModContainer() 
	{
		super(new ModMetadata());
		ModMetadata myMeta = super.getMetadata();
		myMeta.authorList = Arrays.asList(new String[] { "Dayanto" });
		//myMeta.description = "";
		myMeta.modId = "panoramakitcore";
		myMeta.version = ">>See Panorma Kit version no.<<";
		myMeta.name = "Panorama Kit Core";
		myMeta.url = "http://www.minecraftforum.net/topic/792414-panorama-kit/";
	}
}