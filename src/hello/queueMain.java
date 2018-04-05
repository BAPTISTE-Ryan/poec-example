package hello;

import java.util.LinkedList;
import java.util.Queue;

public class queueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Cat> catsQueue = new LinkedList<Cat>();
		
		Cat c1 = new Cat();
		System.out.println("c1\t"+c1);
		Cat c2 = new Cat();
		System.out.println("c2\t"+c2);
		Cat c3 = new Cat();
		System.out.println("c3\t"+c3);
		//catsQueue.add(c0);

		catsQueue.offer(c1);
		catsQueue.offer(c2);
		catsQueue.offer(c3);
		
		System.out.println("peek\t"+catsQueue.peek());
		System.out.println(catsQueue.size());
		System.out.println("poll\t"+catsQueue.remove());
		System.out.println("poll\t"+catsQueue.poll());
		System.out.println(catsQueue.size());
		System.out.println("poll\t"+catsQueue.poll());
		System.out.println(catsQueue.size());
		System.out.println("poll\t"+catsQueue.poll());
		System.out.println(catsQueue.size());
		System.out.println("poll\t"+catsQueue.poll());
		
	}

}
