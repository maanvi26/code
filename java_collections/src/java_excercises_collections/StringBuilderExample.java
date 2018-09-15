package java_excercises_collections;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		
		char[] ch = {'r','h','p',' ','s','o','f','t' };
		StringBuilder sb = new StringBuilder(ch.length);
		
		String s = sb.append(ch).toString();
		System.out.println(s);
		
		/*char[] cArr = s.toCharArray();
		for(int i = (cArr.length - 1); i >= 0; i--) {
			System.out.print(cArr[i]);
		}*/
		
		String[] str = s.split("");
		for(int i = (str.length - 1); i >= 0; i--) {
			System.out.print(str[i]);
		}
		
		
	}

}
