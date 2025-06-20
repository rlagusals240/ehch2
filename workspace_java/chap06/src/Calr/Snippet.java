package Calr;

public class Snippet {
	int[] a = {5, 8, 2};
	// 전통적인 for문
	for (int i = 0; i < a.length; i++) {
	    System.out.println("a[" + i + "] = " + a[i]);
	}
	// 향상된 for문 (for-each)
	for (int value : a) {
	    System.out.println(value);
	}
	
}

