package com.Java8;



public class MaxStringLength {
	
	String[] words= {"Sun","moon","earth","venus","jupiter"};

	public String findMaxLength(String[] words) {
		int maxx=0;
		String m="";
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>=maxx) {
				maxx=words[i].length();
				m=words[i];
		}
		}
		return m;
}

}
