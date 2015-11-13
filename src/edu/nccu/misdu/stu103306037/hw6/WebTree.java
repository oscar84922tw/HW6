package edu.nccu.misdu.stu103306037.hw6;

import java.io.IOException;
import java.util.ArrayList;

public class WebTree {
	public WebNode root;

	public WebTree(WebNode root) {
		this.root = root;

	}
	public void postOrderNodeScore(ArrayList<Keyword> keywords) throws IOException{
		root.calcNodeScore(keywords);
	}
	
	public void eulerTourPrint() {
		//To be...
	}
}
