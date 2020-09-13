package cn.joe.letters;

/**
 * 
 * @author Joe
 *
 */
public class SimpleLatterCombinations extends LatterCombinations {

	@Override
	public String getOneButtonsLatter(int index) {

		if (index >= table.length || index < 0) {

			throw new IllegalArgumentException("Illegal param[" + index + "].Please control between 0-" + table.length);
		} else {

			return table[index];
		}
	}

}
