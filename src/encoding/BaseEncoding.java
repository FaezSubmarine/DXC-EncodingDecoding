package encoding;

import java.util.HashMap;
public class BaseEncoding {
	static final char formerEncode = 'B';
	static final char latterEncode = 'F';
	
	protected char encodeChoice;
	
	private static HashMap<Integer,Character> charChart;
	private static HashMap<Character,Integer> indexChart;

	public HashMap<Integer,Character> getCharChart() {
		return charChart;
	}
	public HashMap<Character,Integer> getIndexChart() {
		return indexChart;
	}
	protected int encodingNum() {
		 return encodeChoice == formerEncode? 1:5;
	}
	protected int loop(int subject) {
		if(subject<0) {
			return 44+subject;
		}
		else if(subject>=44) {
			return subject-44;
		}
		return subject;
	}
	static {
		charChart = new HashMap<Integer,Character>();
		indexChart = new HashMap<Character, Integer>();
		for(int i = 0;i<=43;++i) {
			if(i<=25) {
				charChart.put(i, (char)(65+i));
				indexChart.put((char)(65+i), i);
			}
			else if(i<=35){
				charChart.put(i, (char)(48+(i-26)));
				indexChart.put((char)(48+(i-26)), i);
			}
			else {
				charChart.put(i, (char)(40+(i-36)));
				indexChart.put((char)(40+(i-36)), i);
			}
		}
	}
}
