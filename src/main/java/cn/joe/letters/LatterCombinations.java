package cn.joe.letters;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author Joe
 *
 */
public abstract class LatterCombinations {

	public static String[] table = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public ArrayList<String> combinations(int[] number) {

		ArrayList<String> list = new ArrayList<>();

		Queue<String> q = new LinkedList<>();

		for (int index : number) {

			String val = getOneButtonsLatter(index);

			if (!"".equals(val)) {

				if (!q.isEmpty()) {

					int size = q.size();
					int ith = 0;

					while (size > ith) {
						String s = q.remove();
						for (int i = 0; i < val.length(); i++) {
							q.add(s + val.charAt(i));
						}
						ith++;
					}
				} else {

					for (int i = 0; i < val.length(); i++) {
						q.add(String.valueOf(val.charAt(i)));
					}
				}
			}

		}

		list.addAll(q);

		return list;
	}

	public abstract String getOneButtonsLatter(int index);

}
