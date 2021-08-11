import  java.util.Set;
import java.util.Iterator;
import java.util.HashSet;
public class BigInteger {
	public static void main(String[] args){
		Set<String> set= new HashSet();
		set.add("1");
		set.add("1");
		set.add("6");
		Iterator itr=set.iterator();
		while(itr.hasNext()){
           String str=""+itr.next();
           System.out.println(str);
		}
	}

}
