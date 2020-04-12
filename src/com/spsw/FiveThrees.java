package com.spsw;

public class FiveThrees {

	public static void main(String[] args) { 

		FiveThrees ft = new FiveThrees();
		ft.go(); 

	}

	public void go() {

		int n = 34588;
		int tgt = 33333; 
		int rem = 0;
		
		do {
			n++;
			rem = n - tgt;

		} while(!hasRepeats(n, rem));

		showMsg(String.format("Found result n=%d rm=%d", n, rem));

	}

	private boolean hasRepeats(int n, int rem) {
		boolean bRval = true; 
		int[] digits = new int[10]; // using indexes 1 through 9 

		String combo = String.format("%d%d", n, rem); 

		for (int x=0; x<combo.length(); x++) { 
			int idx = Integer.parseInt(combo.substring(x, x+1));
			digits[idx]++;

		}

		for (int x=1; x<10; x++)
			if(digits[x] != 1)
				bRval = false; 

		return bRval; 

	}

	private void testconvert(int n) {

		String ns = String.format("%d", n); 

		for (int i=0; i<5; i++) {
			showMsg(ns.substring(i,i+1)); 
			
		}

	}

	private void showMsg(String msg) {

		System.out.println(msg); 

	}
}