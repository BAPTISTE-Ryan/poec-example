package week3;

import hello.Article;

public class BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<Article> b = new Box<Article>();
		b.setElement(new Article("article",10));
		
		Box<String> b2 = new Box<String>();
		b2.setElement("string");

	}

}
