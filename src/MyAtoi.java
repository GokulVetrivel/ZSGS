
public class MyAtoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("   400000000000000000000000000000000000000000000000000000000 2"));

	}
	 public static int myAtoi(String s) {
         if(s.length()==0)
			 return 0;
        long n=0;
		 int j=0,r=0;
		 boolean bool=false,arith=false;
	        for(int i=0;i<s.length();i++) {
	        	
	        		if((s.charAt(i)==' ') || (s.charAt(i)>=48 && s.charAt(i)<=57)|| s.charAt(i)=='+' || s.charAt(i)=='-') {
	        			if((bool && s.charAt(i)==' '))  
	        				break;
	        			if(arith && (s.charAt(i)=='-' || s.charAt(i)=='+'))  
	        				break;
	        			if(s.charAt(i)=='-') {
	        				j=i;
	        				arith=true;
	        			}
	        			if(s.charAt(i)=='+')
	        				arith=true;
                        if(bool && s.charAt(i)==' ')
	        				 return 0;
	        			if(s.charAt(i)=='+' || s.charAt(i)=='-')
	        				bool =true;  
	        			if(s.charAt(i)!=' ' && s.charAt(i)!='+' && s.charAt(i)!='-') {

	        			r=s.charAt(i)-48;
	        			n=(n*10)+r;	
	        			if(s.charAt(j)=='-')	
	        			if(-n<=(Integer.MIN_VALUE)) {
	        				return Integer.MIN_VALUE;
	        				
	        			}
	        			if(n>(Integer.MAX_VALUE))
	        				return Integer.MAX_VALUE;
	        			bool= true;
                        arith=true;
	        			}
	        			}
	        		else
	        			break;
	        		
	        }
	        
	        if(s.charAt(j)=='-')	
	        		return (int) -n;
	       
	        
	       return (int)n;
	    }

}
