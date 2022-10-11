package encoding;

public class Decoding extends BaseEncoding {
	public String decode(String encodedText) {
		encodeChoice = encodedText.charAt(0);
		
		String actualEncodedText = encodedText.substring(1);
		
		StringBuilder result = new StringBuilder();
		for(int i = 0;i<actualEncodedText.length();++i) {
			if(actualEncodedText.charAt(i)==' ') {
				result.append(" ");
				continue;
			}
			int ogIndex = getIndexChart().get(actualEncodedText.charAt(i));
			char newChar = getCharChart().get(loop(ogIndex+encodingNum()));
			result.append(newChar);
		}
		return result.toString();
	}
}
