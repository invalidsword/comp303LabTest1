package labtest01;

public class Main
{

	public static void main(String[] args)
	{
		Item broccoli = new Item("Broccoli", 3323, 99);
		Item pear = new Item("Pear", 3311, 20);
		Item tomatoe = new Item("Tomatoe", 2120, 50);
		
		System.out.println(broccoli.equals(pear));
		
		Inventory storage = new Inventory("storage");
		storage.stock(broccoli, 5);
		storage.stock(pear, 9);
		storage.stock(tomatoe, 20);
		
		System.out.println(storage.pAvailable(broccoli));
		
		Corporation onlyCorp = Corporation.getCorpInstance();
		onlyCorp.addInventory(storage.getName(), storage);
		
		InventoryIterator iterator = new InventoryIterator(storage);
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

}
