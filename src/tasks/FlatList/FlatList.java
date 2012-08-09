import java.util.LinkedList;
import java.util.List;
 
public final class FlatList {
 
	public static List<Object> flatten(List<?> list) {
		List<Object> retVal = new LinkedList<Object>();
		flatten(list, retVal);
		return retVal;
	}
 
	public static void flatten(List<?> fromTreeList, List<Object> toFlatList) {
		for (Object item : fromTreeList) {
			if (item instanceof List<?>) {
				flatten((List<?>) item, toFlatList);
			} else {
				toFlatList.add(item);
			}
		}
	}

	public static void main(String[] args) {
		List<Object> flat = new ArrayList<Object>();

		List<Object> tree = new ArrayList<Object>();
		tree.add();	
	}
}