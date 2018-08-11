package day20.test;

public class Test {
	public static void main(String []args){
		int[]num={1,3,2,6,4};
		for(int i=0;i<num.length-1;i++){
			for(int j=0;j<num.length-1-i;j++){
				if (num[j]<num[j+1]){
					int tmp=num[j];
					num[j]=num[j+1];
					num[j+1]=tmp;
				}
			}
		}
		for (int i : num) {
			System.out.print(i+" ");
		}
		System.out.println();
		int[]num1={1,2,3,4,5,6};
		int query=3;
		int low=0;
		int high=num1.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(query==num1[mid]){
				System.out.println(num[mid]);
				break;
			}else if(query>num1[mid]){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
	}
}
