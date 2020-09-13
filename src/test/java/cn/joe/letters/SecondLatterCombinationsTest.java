package cn.joe.letters;

import java.util.List;

import org.junit.Test;

public class SecondLatterCombinationsTest {

	/**
	 * simple 1.
	 */
	@Test
	public void test1() {

		SecondLatterCombinations secondLatterCombinations = new SecondLatterCombinations();

		int[] number = { 2, 3 };
		List<String> list = secondLatterCombinations.combinations(number);

		System.out.println("\r\nsimple element 1.: { 2, 3 }");

		list.stream().forEach(one -> System.out.print(one + " "));

	}

	/**
	 * simple 2.
	 */
	@Test
	public void test2() {

		SecondLatterCombinations secondLatterCombinations = new SecondLatterCombinations();

		int[] number = { 23, 46 };
		List<String> list = secondLatterCombinations.combinations(number);

		System.out.println("\r\nsimple element 2.: { 23, 46 }");

		list.stream().forEach(one -> System.out.print(one + " "));

	}

	/**
	 * one element
	 */
	@Test
	public void test3() {

		SecondLatterCombinations secondLatterCombinations = new SecondLatterCombinations();

		int[] number = { 9 };
		List<String> list = secondLatterCombinations.combinations(number);

		System.out.println("\r\none element: { 9 }");

		list.stream().forEach(one -> System.out.print(one + " "));

	}

	/**
	 * special elements
	 */
	@Test
	public void test4() {

		SecondLatterCombinations secondLatterCombinations = new SecondLatterCombinations();

		int[] number = { 0, 1 };
		List<String> list = secondLatterCombinations.combinations(number);

		System.out.println("\r\nspecial elements: { 0, 1 }");

		list.stream().forEach(one -> System.out.print(one + " "));

	}

	/**
	 * boundary elements
	 */
	@Test
	public void test5() {

		SecondLatterCombinations secondLatterCombinations = new SecondLatterCombinations();

		int[] number = { 0, 99 };
		List<String> list = secondLatterCombinations.combinations(number);

		System.out.println("\r\nboundary elements: { 0, 99 }");

		list.stream().forEach(one -> System.out.print(one + " "));

	}

	/**
	 * illegal elements 1.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test6() {

		SecondLatterCombinations secondLatterCombinations = new SecondLatterCombinations();

		int[] number = { -1, 0, 1, 2 };
		List<String> list = secondLatterCombinations.combinations(number);

		System.out.println("\r\nillegal elements 1.:  { -1, 0, 1, 2 }");

		list.stream().forEach(one -> System.out.print(one + " "));

	}

	/**
	 * illegal elements 2.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test7() {

		SecondLatterCombinations secondLatterCombinations = new SecondLatterCombinations();

		int[] number = { 0, 1, 2, 100 };
		List<String> list = secondLatterCombinations.combinations(number);

		System.out.println("\r\nillegal elements 2.:  { 0, 1, 2, 100 }");

		list.stream().forEach(one -> System.out.print(one + " "));

	}
}
