
public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {0,2,1};
		int[] nums2= {3,4,5};
		System.out.println(findMedianSortedArrays(nums1,nums2));

	}
	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 	int n=nums1.length+nums2.length;
	        int[] a=new int[n];
	        for(int i=0;i<n;i++) {
	        	if(i<nums1.length)
	        		a[i]=nums1[i];
	        	else
	        		a[i]=nums2[nums2.length+i-n];
	        }
	       
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]<a[j]) {
						a[i]=a[i]+a[j]-(a[j]=a[i]);
					}
				}
			}
				
			if(n%2==0)
				return (a[n/2]+a[n/2-1])/2.0;
			else
				return a[n/2];
	    }

	
}
