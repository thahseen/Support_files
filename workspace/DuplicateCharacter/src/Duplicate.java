import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate {

	public  void DuplicateCharString(String s){
		
		Map<Character,Integer> dm = new HashMap<Character,Integer>();
		char[] c= s.toCharArray();
		for(Character ch :c){
			if(dm.containsKey(ch)){
				dm.put(ch, dm.get(ch)+1);
			}
			else{
				dm.put(ch, 1);
			}
		}
		
		Set<Character> keys =dm.keySet();
		for(Character ch:keys){
			if(dm.get(ch)>1){
				System.out.println( ch+ "-"+ dm.get(ch));
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duplicate d = new Duplicate();
       d.DuplicateCharString("raseel");
	}

}
