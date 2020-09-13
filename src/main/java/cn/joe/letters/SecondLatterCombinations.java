package cn.joe.letters;

/**
 * 
 * @author Joe
 *
 */
public class SecondLatterCombinations extends LatterCombinations {

	@Override
	public String getOneButtonsLatter(int index) {
		if (index > 99 || index < 0) {

			throw new IllegalArgumentException("Illegal param[" + index + "].Please control between 0-99");
		} else {
			if(index < table.length) {
				
				return table[index];
			}else {
				
				int tens = index / 10;
				int bits = index % 10;
				return table[tens] + table[bits];
			}
		}
	}

}
