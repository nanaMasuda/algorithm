import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
			int size=sc.nextInt();
			int a[]=new int[size];
			int count=0;
			for(int j=0;j<size;j++){
				a[j]=sc.nextInt();
			}
			
			for(int k=0;k<size-1;k++){
				for(int m=0;m<size-k-1;m++){
					if(a[m]<a[m+1]){
						int temp=a[m];
						a[m+1]=a[m];
						a[m]=temp;
					}
					count=k+1;
				}
			}
			for(int b=0;b<size;b++){
				System.out.println(a[b]);
			}
		}
	}

}
