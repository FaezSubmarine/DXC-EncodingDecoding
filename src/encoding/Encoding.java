package encoding;

public class Encoding extends BaseEncoding {
	
	public boolean pickWhichEncode(char choice) {
		if(Character.toUpperCase(choice) == formerEncode ||
		   Character.toUpperCase(choice) == latterEncode) {
			encodeChoice = Character.toUpperCase(choice);
			return true;
		}
		return false;
	}
	
	public String encode(String plainText) {
		int encoding = encodeChoice == formerEncode? 1:5;
		
		StringBuilder result = new StringBuilder();
		result.append(encodeChoice);
		for(int i = 0;i<plainText.length();++i) {
			if(plainText.charAt(i)==' ') {
				result.append(" ");
				continue;
			}
			int ogIndex = getIndexChart().get(plainText.charAt(i));
			char newChar = getCharChart().get(loop(ogIndex-encoding));
			
			result.append(newChar);
		}
		
		return result.toString();
	}
	
}
