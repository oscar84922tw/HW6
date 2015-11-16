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

		System.out.print("(" + root.webPage.name + "," +/* 分數計算*/ root.calcNodeScore());
		for (int i = 0; i < root.children.size(); i++) {
			System.out.println("	" + "(" + root.children.get(i).webPage.name
					+ "," + /* 分數計算*/ root.calcNodeScore(root.children));
			for (int j = 0; j < root.children.get(i).children.size(); j++) {
			System.out.println("		"+"("+root.children.get(i).children.get(j+","+ /* 分數計算*/ ));
			}
		}
	}
}
