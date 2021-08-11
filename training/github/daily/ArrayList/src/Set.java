import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


public class Set{
	public static void main(String[] args){
		Map<String,String> mp = new HashMap<>();
		mp.put("products", "A");
		mp.put("products", "C");
		mp.put("products", "c");
		System.out.println(mp);
		System.out.println(mp.size());
		
		Iterator itr=mp.keySet().iterator();
		while(itr.hasNext()){
			String key=(String) itr.next();
			System.out.println(key+"---"+mp.get(key));
			
		}
	}
	
}


