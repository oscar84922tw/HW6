package edu.nccu.misdu.stu103306037.hw6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		WebNode rootNode = new WebNode(new WebPage("Fang Yu",
				"http://www3.nccu.edu.tw/~yuf/"));
		rootNode.appendChild(new WebNode(new WebPage("Publication",
				"http://www3.nccu.edu.tw/~yuf/publications.htm")));
		rootNode.appendChild(new WebNode(new WebPage("Tool",
				"http://www3.nccu.edu.tw/~yuf/research_projects_and_tools.htm")));
		rootNode.children.get(1).appendChild(
				new WebNode(new WebPage("Strangers",
						"http://www.cs.ucsb.edu/~vlab/stranger/")));
		rootNode.children
				.get(1)
				.appendChild(
						new WebNode(
								new WebPage("The Little Boat",
										"http://140.119.19.93/data-structure/little-boat-correct.html")));
		rootNode.appendChild(new WebNode(new WebPage("Biography",
				"http://www3.nccu.edu.tw/~yuf/short_biography.htm")));
		rootNode.children.get(2)
				.appendChild(
						new WebNode(new WebPage("Vlab",
								"http://www.cs.ucsb.edu/~vlab")));
		rootNode.appendChild(new WebNode(new WebPage("Course",
				"http://www3.nccu.edu.tw/~yuf/course.htm")));
		// WebNode rootNode = new WebNode(new WebPage("Fang Yu",
		// "http://www3.nccu.edu.tw/~yuf"));
		// rootNode.appendChild(new WebNode(new WebPage("Publication",
		// " http://www3.nccu.edu.tw/~yuf/publication.htm")));
		// rootNode.appendChild(new WebNode(new WebPage("Tool",
		// "http://www3.nccu.edu.tw/~yuf/research_projects_and_tools.htm")));
		// rootNode.children.get(1).appendChild(
		// new WebNode(new WebPage("Stranger",
		// "http://www.cs.ucsb.edu/~vlab/stranger/")));
		// rootNode.children.get(1).appendChild(
		// new WebNode(
		// new WebPage("OpenWAVES", "http://www.openwaves.net")));
		// rootNode.appendChild(new WebNode(new WebPage("Biography",
		// "http://www3.nccu.edu.tw/~yuf/short_biography.htm")));
		// rootNode.children.get(2).appendChild(
		// new WebNode(
		// new WebPage("Vlab", " http://www.cs.ucsb.edu/~vlab")));
		// rootNode.appendChild(new WebNode(new WebPage("Course",
		// "http://www3.nccu.edu.tw/~yuf/course.htm")));

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
