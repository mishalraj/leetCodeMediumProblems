package string;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	
	 public static void generateParenthesisUtil(List<String>res, String s, int open, int close, int n){
         
	       if(s.length()==n*2)
	       {    res.add(s);
	         return;
	       }
	         
	         if(open<n)
	             generateParenthesisUtil(res,s+"(",open+1,close,n);
	         
	           if(close<open)
	             generateParenthesisUtil(res,s+")",open,close+1,n);
	     }
	    
	    
	    public static List<String> generateParenthesis(int n) {
	       
	        List<String>res= new ArrayList<>();
	        
	        generateParenthesisUtil(res,"",0,0,n);
	        return res;
	    }

	public static void main(String[] args) {
		
		int n=3;
		
		List<String> res= generateParenthesis(n);
		
		for(String s : res)
		{
			System.out.println(s);
		}
		
	}

}
