package test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Mydate {
	public static void main(String[] args) {
		/*Locale.setDefault(Locale.CHINA);
		System.out.println(new Date());
		System.out.println(new Date().toString());
		//Date date = new Date();
		System.out.println(new GregorianCalendar().toString());
		GregorianCalendar time = new GregorianCalendar();
		int i = time.get(Calendar.DAY_OF_MONTH);
		int j = time.get(Calendar.MONDAY);
		time.set(Calendar.DAY_OF_MONTH,0);
		int k = time.get(Calendar.DAY_OF_WEEK);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		int firstDayOfWeek = time.getFirstDayOfWeek();*/
		//System.out.println(firstDayOfWeek);
		/*ok:
		for(int a=0;a<10;a++)	{
			for(int b=0;b<10;b++)	{
				System.out.println("i=" + a + ",j=" + b);
				if(b == 5) break ok;
			}
		} */
	int arr[][] = {{1,2,3},{4,5,6,7},{9}};
	boolean found = false;
	for(int i=0;i<arr.length && !found;i++)	{
			for(int j=0;j<arr[i].length;j++){
				System.out.println(i + " " + j);
				if(arr[i][j]  == 5) {
					found = true;
					break;
				}
			}
		} 
	short s2 = 1; s2 = (short) (s2 + 1);
	short s1 = 1; s1 += 1;
	System.out.println(s1);
	System.out.println(s2);
	int a=2<<2;
	System.out.println(a);
	

	

		
		
		
		
	}

}
