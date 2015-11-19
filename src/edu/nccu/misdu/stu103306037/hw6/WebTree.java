package edu.nccu.misdu.stu103306037.hw6;

//import edu.nccu.misdu.stu103306037.hw6.Main;
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

	public void eulerTourPrint() {

		System.out.println("(" + root.webPage.name + ","
				+ /* 分數計算 */root.NodeScore);
		for (int i = 0; i < root.children.size(); i++) {
			System.out.println("\t" + "(" + root.children.get(i).webPage.name
					+ "," + /* 分數計算 */root.children.get(i).NodeScore);
			
			for (int j = 0; j < root.children.get(i).children.size(); j++) {
				System.out.println("\t\t" + "("
						+ root.children.get(i).children.get(j).webPage.name+ "," + root.children.get(i).webPage.score+")");
			}
			System.out.println("\t"+")");
		}
		System.out.println(")");
	}

//	public void eulerTourPrint() {
//		// print tree
//		int tabCounter = 0;
//		if (root.parent != null) {
//			tabCounter += 1;
//		}
//		System.out.print("(" + root.webPage.name + ","
//				+ root.webPage.score);
//		if (root.children.size() > 0) {
//			tabCounter += 1;
//			for (WebNode child : root.children) {
//				System.out.println("");
//				for (int i = 0; i < tabCounter; i++) {
//					System.out.print("\t");
//				}
//				tabCounter = 0;
//				eulerTourPrint();
//			}
//		} else {
//			System.out.print(")");
//			return;
//		}
//		System.out.println("");
//		for (int i = 0; i < tabCounter - 1; i++) {
//			System.out.print("\t");
//		}
//		System.out.print(")");
//	}
}
