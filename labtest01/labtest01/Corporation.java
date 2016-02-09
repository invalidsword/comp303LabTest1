package labtest01;
//jjgghh
import java.util.HashMap;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public class Corporation
{
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	private static Corporation corp = null;
	
	private Corporation()
	{
		
	}
	
	public static Corporation getCorpInstance()
	{
		if (corp == null)
		{
			corp = new Corporation();
		}
		
		return corp;
	}
	
	public void addInventory(String pInventoryName, Inventory pInventory)
	{
		
		corp.aInventories.put(pInventoryName, pInventory);
	}
	
}
