package javatopics;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		Object empinfo[] = new Object[6];
//in object array we can insert variety of data
//object is non primitive by default value is null
//object is super/parent class for all the class --it can hold any type of data either byte/short/int/long/float/double/boolean/char
		empinfo[0] = "Pooja";
		empinfo[1] = 'f';
		empinfo[2] = 32;
		empinfo[3] = "21-05-1990";
		empinfo[4] = true;
		empinfo[5] = 35.88;
		System.out.println(Arrays.toString(empinfo));
		for (int i = 0; i < empinfo.length; i++) {
			System.out.println(i + " = " + empinfo[i]);
		}
		System.out.println("------------------------------------------");
		// for each loop we can maintain our own index here
		int count = 0;
		for (Object e : empinfo) {
			System.out.println(count + " = " + e);
			count++;// it is not a part of for each loop, an extra variable we have to create
		}
//Difference between for loop & for each loop 
//1) syntax difference for loop ==> using index; for each loop ==> not using index.
//2) for loop is slightly better in performance as compare to for each loop.		

	}

}
