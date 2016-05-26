package datamodel;

import java.util.HashMap;
import java.util.Map;

public enum DaoItems {
	instance;
	  private Map<String, Item> contentProvider = new HashMap<String, Item>();
	//EJERCICIO: Crear algunos items por defecto para las pruebas.
	  private DaoItems() {
		  Item item1 = new Item("item1","SOY1000",1000);
		  Item item2 = new Item("item2","SOY2000",2000);
	  contentProvider.put("item1",item1);
	  contentProvider.put("item2", item2) ;
      
	    
	  }
	  public Map<String, Item> getModel(){
	    return contentProvider;
	  }
}
