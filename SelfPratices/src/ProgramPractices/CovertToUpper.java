package ProgramPractices;

class Upper {
	char ch[];

	void setCharArray(char c[]) {
		ch = c;
	}

	void convertToUpper() {
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				int c = (int) ch[i] - 32;
				ch[i] = (char) c;
			}
		}
		System.out.println("After Convert to Upper");
		for(int i=0 ;i<ch.length ; i++) {
			System.out.println("Convert To Upper : "+i+"\s"+ch[i]);
		}
	}
}

public class CovertToUpper {
	public static void main(String x[]) {
		Upper up=new Upper();
	char ch[]=new char[] {'a','b','c','d'};
		up.setCharArray(ch);
		up.convertToUpper();
	}

}
