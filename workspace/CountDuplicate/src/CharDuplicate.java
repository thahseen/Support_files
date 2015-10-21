import java.util.HashMap;

public class CharDuplicate {

	
	public void countSort(String s){
		char[] cr =s.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(Character ch : cr){
			if(hm.containsKey(ch)){
				hm.put(ch,hm.get(ch)+1);
			}
			else{
				hm.put(ch, 1);			
		    }
		}

		for(Character h: hm.keySet() ){			
			if(hm.get(h) > 1){
				System.out.println(h + " => " + hm.get(h));
			}			
		}				
	}
	
	public static void main(String[] args) {
	 CharDuplicate cd= new CharDuplicate();
	 cd.countSort("appocalypse");
	}
}
