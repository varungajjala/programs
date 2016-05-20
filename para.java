import java.util.*;

public class para{

	public static boolean isValid(String s) {
        	Stack<String> st = new Stack<String>();
        	if(s.length() % 2 == 1){
            		return false;
        	}else{
            		for(int i=0; i<s.length(); i++){
                		if(st.isEmpty()){
                    			st.push(String.valueOf(s.charAt(i)));
                		}else if(checkMatch(st.peek(), String.valueOf(s.charAt(i)))){
                        		st.pop();
                		}else{
                 	   		st.push(String.valueOf(s.charAt(i)));
                		}
            		}
        	}
        
        	if(st.isEmpty()){
            		return true;
        	}
        
        	return false;
    	}
    
    	public static boolean checkMatch(String a, String b){
        	if ( a.equals("(") && b.equals(")")){
            		return true;
        	}else if( a.equals("{") && b.equals("}")){
            		return true;
       		}else if (a.equals("[") && b.equals("]")){
            		return true;
        	}
        
        	return false;
    	}

	public static void main(String args[]){
		String s = "{{}()[][{{{()}}}]";
		System.out.println(isValid(s));
	}
}
