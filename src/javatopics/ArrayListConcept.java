package javatopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
// raw AL--- allow any type of data
//1st way to declare AL
		ArrayList al = new ArrayList();
		System.out.println(al.size());// by default value is '0'
		System.out.println(al);// directly fetchable--[]---empty list--by default
		al.add(100);
		al.add(200);
		al.add(300);
		al.add("Pooja");
		al.add(null);
		al.add("Pooja");
		al.add(25.77);
		al.add("25.56.76");
		al.add('A');
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(8));
//System.out.println(ar.get(-1));//IOBE--no concept of -ve index
//System.out.println(ar.get(11));//IOBE
		System.out.println(al.get(3));
		al.add(true);
		al.add('F');
		System.out.println(al.size());// AL is growing factor---duplicate values are allowed

		ArrayList week = new ArrayList(7);
		week.add("sunday");
		week.add("monday");
		week.add("tuesday");
		week.add("wednesday");
		week.add("thursday");
		week.add("friday");
		week.add("saturday");
		System.out.println(week.size());
		week.add("mon");
		System.out.println(week.size());

//2nd way of declaring AL with generic---Right side generic is not compulsory to define
//by default it take from left side after jdk 8 & above version
		ArrayList<Integer> Intlist = new ArrayList<Integer>();
//it allow only integer value---explicitly defined
		System.out.println(Intlist);
		System.out.println(Intlist.size());
		Intlist.add(100);
		Intlist.add(200);
		Intlist.add(300);
		Intlist.add(400);
		// marks.add(400.0);--type mismatch

		System.out.println(Intlist);
		System.out.println(Intlist.size());
		System.out.println("-------");
		ArrayList<Double> Doulist = new ArrayList<Double>();
		Doulist.add(10.0);
		Doulist.add(100.0);
		Doulist.add(230.0);
		Doulist.add(410.0);
		Doulist.add(780.0);
		System.out.println(Doulist);
		System.out.println(Doulist.size());
		System.out.println("-------");
		ArrayList<String> Stringlist = new ArrayList<String>();
		System.out.println(Stringlist.size());
		System.out.println(Stringlist);
		Stringlist.add("Pooja");
		Stringlist.add("Pink");
		Stringlist.add("Surya");
		Stringlist.add("Shiv");
		System.out.println(Stringlist.size());
		System.out.println(Stringlist);
		System.out.println("--------");
		ArrayList<Object> objectlist = new ArrayList<Object>();
		objectlist.add(100);
		objectlist.add('A');
		objectlist.add(true);
		objectlist.add(null);
		objectlist.add("Zoyi");
		objectlist.add(100.0);
		objectlist.add("21-09-1990");
		objectlist.add(25.89f);
		objectlist.add("29.49.99");
		objectlist.add(1817838L);
		System.out.println(objectlist);
		System.out.println(objectlist.size());
		System.out.println("--------");
		ArrayList<Float> floatlist = new ArrayList<Float>();
		floatlist.add(34.67f);
		floatlist.add(23.67f);
		floatlist.add(67.23f);
		floatlist.add(78.67f);
		System.out.println(floatlist);
		System.out.println(floatlist.size());
		System.out.println("--------");
		ArrayList<Long> longlist = new ArrayList<Long>();
		longlist.add(1245L);
		longlist.add(7558L);
		longlist.add(324L);
		longlist.add(7990L);
		longlist.add(98890L);
		System.out.println(longlist);
		System.out.println(longlist.size());
		System.out.println("----------");
		ArrayList<Boolean> boollist = new ArrayList<Boolean>();
		boollist.add(true);
		boollist.add(false);
		boollist.add(null);
		System.out.println(boollist);
		System.out.println(boollist.size());
		System.out.println("------------");
//if we have idea of how many values we can add in that case we can predefine it 
		ArrayList<Integer> intlist = new ArrayList<Integer>(3);
		System.out.println(intlist);
		System.out.println(intlist.size());
		intlist.add(75);
		intlist.add(378);
		intlist.add(200);
		intlist.add(300);
		intlist.add(600);
		intlist.add(500);
		intlist.add(12);// after index 2 or size -3 : load factor calculation works
		System.out.println(intlist);
		System.out.println(intlist.size());
		System.out.println("------------");
//iteration the AL:using For Loop
		for (int i = 0; i < intlist.size(); i++) {
			System.out.println(intlist.get(i));
		}
		System.out.println("===========");
		for (int e : intlist) {
			System.out.println(e);
		}
		System.out.println("************");
//reverse order
		for (int i = intlist.size() - 1; i >= 0; i--) {
			System.out.println(intlist.get(i));
		}
		System.out.println("============");
//reverse loop using for each
		int count = intlist.size() - 1;
		for (Integer e : intlist) {
			e = count;
			System.out.println(intlist.get(e));
			count--;
		}
		System.out.println("-------------");
		ArrayList<Byte> bytelist = new ArrayList<Byte>();
		bytelist.add((byte) 1);
		bytelist.add((byte) 100);
		bytelist.add((byte) 32);
		bytelist.add((byte) 102);
		bytelist.add((byte) 98);
		System.out.println(bytelist);
		System.out.println(bytelist.get(0));
		System.out.println(bytelist.get(2));
		System.out.println(bytelist.get(3));
		System.out.println("--------------");
		ArrayList<Short> shortlist = new ArrayList<Short>();
		shortlist.add((short) 180);
		shortlist.add((short) 10000);
		shortlist.add((short) 576568);
		shortlist.add((short) 977663);
		shortlist.add((short) -38229);
		System.out.println(shortlist);
		System.out.println(shortlist.get(4));
		System.out.println(shortlist.get(2));
		System.out.println("---------------");
		ArrayList<Character> charlist = new ArrayList<Character>();
		charlist.add('A');
		charlist.add('b');
		charlist.add('f');
		charlist.add('x');
		charlist.add('z');
		System.out.println(charlist);
		System.out.println(charlist.size());
		System.out.println("---------------");
//3rd way of declaring AL----aslist
		ArrayList<String> langlist = new ArrayList<String>(Arrays.asList("java", "python", "c#", "c++"));
		System.out.println(langlist.size());
		System.out.println(langlist);
		langlist.add("javascript");
		langlist.add(null);
		System.out.println(langlist.size());
		System.out.println(langlist);
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 50, 7000, 828, 45345));
		nums.add(0);
		nums.add(900);
		System.out.println(nums.size());
		System.out.println(nums);
//another way of declaring AL
		ArrayList<String> names = new ArrayList<String>() {
			{
				add("Deepak");
				add("Naresh");
				add("Manoj");
				add("Jatin");
				add("Sunny");
				add("Anshul");
				add("Naveen");
			}
		};
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.get(5));// retrieve
		System.out.println(names.set(6, "Rahul"));// update----data lost
		names.add(2, "Sachin");
		System.out.println(names);
		names.remove(7);// to remove
		System.out.println(names);
//to reverse the name
		for (int i = names.size() - 1; i >= 0; i--) {
			System.out.println(names.get(i));
		}
		System.out.println("--------");
		Collections.reverse(names);// collection is in built class in java
		System.out.println(names);
		names.add(7, "Shiv");
		System.out.println(names);
		Collections.swap(names, 1, 7);
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);

		List<String> newList = Collections.emptyList();// immutable list
//newList.add("Pooja");
		System.out.println(newList);
//newList.add("Priya");// UnsupportedOperationException
	}

}
