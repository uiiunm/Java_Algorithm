package 자바자료구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//string 정렬, binary search 구현
//1단계: string, 2단계: string 객체,  Person 객체들의 list\
public class Chap1_ArrayString {
	public static String[] removeElement1(String[] arr, String item) {
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		list.remove(item);
		return list.toArray(String[]::new);
	}

	public static void main(String[] args) {

//		String a = "Hello", b = "World";
//		String tmp = a;
//		a = b; b = tmp;
//		System.out.println(a);
//		System.out.println(b);

		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");
		list.add("런던");
		list.add("로마");
		list.add("방콕");
		list.add("북경");
		list.add("도쿄");
		list.add("서울");
		list.add(1, "LA");

		// sort - 오름차순으로 정렬, 내림차순으로 정렬, 중복 제거하는 코딩
		System.out.println("collection.sort()::");
		Collections.sort(list);
		for (String city : list)
			System.out.println(city);

		String cities[] = new String[0];
		cities = list.toArray(cities);

		for (int i = 0; i < cities.length; i++) {
			for (int j = i + 1; j < cities.length; j++)
				if ((cities[i].compareTo(cities[j])) > 1) {
					String tmp = cities[i];
					cities[i] = cities[j];
					cities[j] = tmp;

				}
		}

//		System.out.println("정렬후::");
//
//		for (String city : cities)
//			System.out.println(city);
//		for (int x = 0; x < cities.length; x++) 
//			for (int y = x + 1; y < cities.length; y++)
//				System.out.println();

		// 중복제거
		System.out.println("중복제거::");

		ArrayList<String> ct = new ArrayList<String>(Arrays.asList(cities));
		int count = cities.length;
		for (int x = 0; x < count; x++) {
			for (int y = x + 1; y < count; y++) {
				if ((ct.get(x)).equals(ct.get(y)) == true) {
					ct.remove(y);
					count--;
				}
			}
		}
		for (String city : ct)
			System.out.println(city);
//		TreeSet<String> TreeSet = new TreeSet<>(Arrays.asList(cities));
//		String[] resultcities = TreeSet.toArray(new String[0]);
//		System.out.println(Arrays.toString(resultcities));
	}
}