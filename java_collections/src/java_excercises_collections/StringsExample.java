package java_excercises_collections;

public class StringsExample {
	
	public String[] stringSplit(String qaString) {
		
		String[] str = qaString.split("\\|");// \ is used as escape character for |
		
		return str;
	}
	
	public String[] stringReverse(String qaString) {
		
		String[] s = qaString.split("\\|");	
		String[] str1 = new String[s.length];
	
        for (int i = 0; i < s.length; i++) {
            str1[i]= new StringBuffer(s[i]).reverse().toString();
        }
		
		return str1;
	}
	
	public static void main(String[] args) {
		
		String qaString = "Anil|Kiran|Pavan|Madan|Sharath";
		String[] str,str1;
		StringsExample ob = new StringsExample();
		
		str = ob.stringSplit(qaString);
		for(String s: str)
			System.out.println(s);
		
		System.out.println(" ");
		str1 = ob.stringReverse(qaString);
		for(String s: str1)
			System.out.println(s);
	}
	
}
