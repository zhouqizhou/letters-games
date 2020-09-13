package cn.joe.letters;

import java.util.List;

import org.junit.Test;

public class SimpleLatterCombinationsTest {

	/**
	 * simple
	 */
	@Test
	public void test1() {

		SimpleLatterCombinations simpleLatterCombinations = new SimpleLatterCombinations();

		int[] number = { 2, 3 };
		List<String> list = simpleLatterCombinations.combinations(number);

		System.out.println("\r\nsimple element: { 2, 3 }");

		list.stream().forEach(one -> System.out.print(one + " "));

	}

	/**
	 * one element
	 */
	@Test
	public void test2() {

		SimpleLatterCombinations simpleLatterCombinations = new SimpleLatterCombinations();

		int[] number = { 9 };
		List<String> list = simpleLatterCombinations.combinations(number);

		System.out.println("\r\none element: { 9 }");

		list.stream().forEach(one -> System.out.print(one + " "));

	}

	/**
	 * special elements
	 */
	@Test
	public void test3() {

		SimpleLatterCombinations simpleLatterCombinations = new SimpleLatterCombinations();

		int[] number = { 0, 1 };
		List<String> list = simpleLatterCombinations.combinations(number);

		System.out.println("\r\nspecial elements: { 0, 1 }");

		list.stream().forEach(one -> System.out.print(one + " "));

	}

	/**
	 * boundary elements
	 */
	@Test
	public void test4() {

		SimpleLatterCombinations simpleLatterCombinations = new SimpleLatterCombinations();

		int[] number = { 0, 9 };
		List<String> list = simpleLatterCombinations.combinations(number);

		System.out.println("\r\nboundary elements: { 0, 9 }");

		list.stream().forEach(one -> System.out.print(one + " "));

	}

	/**
	 * illegal elements 1.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test5() {

		SimpleLatterCombinations simpleLatterCombinations = new SimpleLatterCombinations();

		int[] number = { -1, 0, 1, 2 };
		List<String> list = simpleLatterCombinations.combinations(number);

		System.out.println("\r\nillegal elements 1.:  { -1, 0, 1, 2 }");

		list.stream().forEach(one -> System.out.print(one + " "));

	}

	/**
	 * illegal elements 2.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test6() {

		SimpleLatterCombinations simpleLatterCombinations = new SimpleLatterCombinations();

		int[] number = { 0, 1, 2, 10 };
		List<String> list = simpleLatterCombinations.combinations(number);

		System.out.println("\r\nillegal elements 2.:  { 0, 1, 2, 10 }");

		list.stream().forEach(one -> System.out.print(one + " "));

	}
}
