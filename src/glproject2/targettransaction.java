package glproject2;

import java.util.Scanner;

public class targettransaction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the days that your shop will open:");
		int Days = sc.nextInt();
		//the income which you get on the specific days
		int income[] = new int [Days];
		//THe income which you get on the specific days
		System.out.println("Enter the collection of each day:");
		for(int i=0;i< income.length;i++) {
			income[i] = sc.nextInt();
		}
		System.out.println("Enter the targets:");
		int totaltargets =sc.nextInt();
		int sum;
		int flag;
		for(int i=1;i<=totaltargets;i++) {
			sum =0;
			flag=0;
			System.out.println("enter the value of target:"+i);
			int target = sc.nextInt();
			
			for(int j =0;j <income.length;j++) {
				sum+=income[j];
				if(sum >=target) {
					System.out.println("Target has been achieved of the day:"+(j+1));
					flag=1;
					break;
				}
				
			}
			if(flag==0) {
				System.out.println("Target Has Been Not achieved");
			}
			
		}
		}

}
