package glproject21;

public class InsertionSort {

	public void sort(int[] currency) {
		int temp,j;
		for(int k=1;k<currency.length;k++) {
			temp = currency[k];
			j =k-1;
			while(j >=0 && temp >=currency[j]) {
				currency[j+1] = currency[j];
				j--;
			}
			currency[j+1] = temp;
		}
		
	}

}
