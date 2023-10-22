package Java_Code;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
	public static void main(String[] args) {
		int [] array= {1,2,3,4,5,6};
		shuffle(array);
		System.out.println("shuffled array:"+Arrays.toString(array));
	}
	public static void shuffle(int [] ary) {
		int n=ary.length;
		Random ramdom=new Random();
		for(int i=n-1;i>0;i--) {
			int j=ramdom.nextInt(i+2);
			int temp=ary[i];
			ary[i]=ary[j];
			ary[j]=temp;
		}
	}

}
