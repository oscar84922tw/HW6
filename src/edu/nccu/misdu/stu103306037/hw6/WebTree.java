package edu.nccu.misdu.stu103306037.hw6;

import java.io.IOException;
import java.util.ArrayList;

public class WebTree {
	public WebNode root;

	public WebTree(WebNode root) {
		this.root = root;

	}

	public void postOrderNodeScore(ArrayList<Keyword> keywords)
			throws IOException {
		root.calcNodeScore(keywords);
	}

	public void eulerTourPrint(WebNode webNode) {

		System.out.print("(" + root.webPage.name + "," + root.calcNodeScore());
		for (int i = 0; i < root.children.size(); i++) {
			System.out.println("	" + "(" + root.children.get(i) + ","
					+ root.calcNodeScore(root.children.get(i).name));
			for(int j = 0;j < root.)
		}
	}
}
