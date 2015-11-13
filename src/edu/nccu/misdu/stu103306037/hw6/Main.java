package edu.nccu.misdu.stu103306037.hw6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		WebNode rootNode = new WebNode(new WebPage("Fang Yu",
				"http://www3.nccu.edu.tw/~yuf"));
//		WebTree tree = new WebTree(rootNode);
		rootNode.appendChild(new WebNode(new WebPage("Publication",
				" http://www3.nccu.edu.tw/~yuf/publication.htm")));
		rootNode.appendChild(new WebNode(new WebPage("Tool",
				"http://www3.nccu.edu.tw/~yuf/research_projects_and_tools.htm")));
		rootNode.children.get(1).appendChild(
				new WebNode(new WebPage("Stranger",
						"http://www.cs.ucsb.edu/~vlab/stranger/")));
		rootNode.children.get(1).appendChild(
				new WebNode(
						new WebPage("OpenWAVES", "http://www.openwaves.net")));
		rootNode.appendChild(new WebNode(new WebPage("Biography",
				"http://www3.nccu.edu.tw/~yuf/short_biography.htm")));
		// 繼續複製....

		WebTree tree = new WebTree(rootNode);

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			int numOfKeywords = sc.nextInt();
			ArrayList<Keyword> keywords = new ArrayList<>();
			for (int i = 0; i < numOfKeywords; i++) {
				String name = sc.next();
				double weight = sc.nextDouble();
				keywords.add(new Keyword(name, weight));

			}
			tree.postOrderNodeScore(keywords);
			tree.eulerTourPrint();
		}

	}
}
