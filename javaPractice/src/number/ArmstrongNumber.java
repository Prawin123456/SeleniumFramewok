package number;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /* int n=153;
     int sum=0;
     int count=0;
     int copy=n;
     while(n>0) {
    	 n=n/10;
    	 count++;
          }
        n=copy;
     
    	 while(n>0) {
    	    int power=1;
    		int d=n%10;
    	    for(int i=1;i<=count;i++) {
    		power=power*d;
    	 }
    	 sum=sum+power;
    	 n=n/10;
    	 }
     if(sum==copy) {
    	 System.out.println("armstrong number");
     }
     else {
    	 System.out.println("not armstrong number");
     }
	}

}*/
		int n=153;
		int copy=n;
		int sum=0;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		n=copy;
		while(n>0) {
			int d=n%10;
			int power=1;
			for(int i=1;i<=count;i++) {
				power=power*d;
			}
			sum=sum+power;
			n=n/10;
		}
		if(sum==copy) {
			System.out.println("arm");
		}
		else {
			System.out.println("not");
		}
	}
}


