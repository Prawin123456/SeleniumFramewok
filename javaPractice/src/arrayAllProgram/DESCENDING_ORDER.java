package arrayAllProgram;

public class DESCENDING_ORDER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a= {1,4,7,8,5,2,3,6,9};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("array in descending order");
		for(int num:a) {
			System.out.println(num + " ");
		}

	}

}
