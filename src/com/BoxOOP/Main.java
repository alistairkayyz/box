package com.BoxOOP;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Box myBox1 = new Box(2,4,6);
        Box myBox2 = new Box(11.2,4.5,9);

        myBox1.getVol();
        myBox2.getVol();

        myBox1.display();
        myBox2.display();
    }
}