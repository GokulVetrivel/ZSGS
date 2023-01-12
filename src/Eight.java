
public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi(""));

	}
	 public static int myAtoi(String s) {
	        String str="";
	        
	        long n;
	        boolean bool=true;
	        for(int i=0;i<s.length();i++){
	        	
	            if((s.charAt(i)==' ' && bool) || s.charAt(i)=='+' || s.charAt(i)=='-' || (s.charAt(i)>=48 && s.charAt(i)<=57)) {
	               if(!(s.charAt(i)==' ')) {
	            	str+=s.charAt(i);
	            	System.out.println(str);
	            	bool=false;
	               }
	            }
	           else
	            	break;
	         }
	       
	       try {
	        n= Long.parseLong(str);
	       }
	       catch(Exception e){
	    	   return 0;
	       }
	      
	       if(n<Integer.MIN_VALUE)
	    	   return Integer.MIN_VALUE;
	       if(n>Integer.MAX_VALUE)
	    	   return Integer.MAX_VALUE;
	      
	       
	       return (int)n;
	    }

}
