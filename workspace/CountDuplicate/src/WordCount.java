

public class WordCount {
    
	public void  sortWord(String s){
    	int c=0;
    	int len = s.length();
        char[] cs = s.toCharArray();
       
       
        for(int i=0;i<len;i++){
        	if(cs[0]==' '){System.out.println("Please enter a string");i++;}
        	cs[i]=s.charAt(i);		
        	if(((cs[i]!= ' '&& i >0) &&(cs[i-1]==' '))||((cs[0]!=' ')&&i==0 ))
        		c++;
        }
        System.out.println("There are "+c+ " words");
    }
        
    	
    
	public static void main(String[] args) {
		
		String s= "This is a test format. This is what this is";
		WordCount wc = new WordCount();
		wc.sortWord(s);
		
		

	}

}
