
public class Eighty {
	public static void main(String[] args) {
		int a[]= {1,1,1,1,1,1,1,1,2,2,2,2,3,4,5,6,4,4,4};
		removeDuplicates(a);
		
	}
	
	   public static int removeDuplicates(int[] nums) {
	    	int count=1,k=1;
	    	for(int i=0;i<nums.length-1;i++) {
	    		if(nums[i]==nums[i+1])
	    			count++;
	    		else
	    			count =1;
	    		if(count<=2)
	    			nums[k++]=nums[i+1];
	    	}
	    	System.out.println(java.util.Arrays.toString(nums));
	    	System.out.println(k);
			return 0;
	    }
	    public static int removeDuplicates2(int[] nums) {
	    	int k=1;
	        for(int i=0;i<nums.length-3;i++){
	            if(nums[i]==nums[i+1]){
	                if(nums[i]==nums[i+2]){
	                    nums[i+2]=nums[i+3];
	                    k++;
	                }
	            }
	        }
	        System.out.println(java.util.Arrays.toString(nums));
	        System.out.println(k-3);
	        return 0;
	    }
	}
	

