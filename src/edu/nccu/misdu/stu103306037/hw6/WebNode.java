package edu.nccu.misdu.stu103306037.hw6;

import java.io.IOException;
import java.util.ArrayList;

public class WebNode {
	public WebNode parent;
	public ArrayList<WebNode> children;
	public WebPage webPage;
	public double NodeScore;

	public WebNode(WebPage webpage) {
		this.webPage = webpage;
		this.children = new ArrayList<>();

	}

	public void appendChild(WebNode childNode) {
		childNode.parent = this;
		children.add(childNode);

	}

	public double calcNodeScore(ArrayList<Keyword> keywords) throws IOException {
		NodeScore = 0;
		for (WebNode child : children) {
			NodeScore += calcNodeScore(keywords);
		}
		NodeScore += webPage.calcScore(keywords);
		return NodeScore;
	}
}
