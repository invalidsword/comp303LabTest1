package labtest01;

import java.util.Set;

public class InventoryIterator implements Iterator
{
	private Inventory aInventory;
	private Item[] keys; //keys are of type Item
	private int currentKey;
	
	public InventoryIterator(Inventory pInventory)
	{
		aInventory = pInventory;
		int numKeys = pInventory.getHashMap().size();
		keys = pInventory.getHashMap().keySet().toArray(new Item[numKeys]);
		currentKey = 0;
	}
	
	public int next()
	{
		int value = aInventory.getHashMap().get(keys[currentKey]);
		currentKey++; //do a check first
		return value;
	}
	
	public boolean hasNext()
	{
		return currentKey < keys.length;
	}

}
