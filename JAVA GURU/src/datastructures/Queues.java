package datastructures;

import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Queues {

	public static void main(String[] args) {
		Queue<Phone> Q1 = new ArrayBlockingQueue<>(4); // Queue is an interface that follows FIFO when adding and
														// removing elements
		Queue<Phone> Q2 = new LinkedList<>();
		Queue<Phone> Q3 = new PriorityQueue<>(4); // Orders elements according to the supplied comparator or the
													// elements natural ordering.
		BlockingQueue<String> Q4 = new ArrayBlockingQueue<>(10);// BlockingQueue interface has methods which wait for
																// elements to appear or for
																// space to become available.
		Queue<SmallPhone> Q7 = new ArrayBlockingQueue<>(3);
		phoneMethod(Q1);
		System.out.println("\n");
		// phoneMethod(Q3);
		smallPhoneMethod(Q7);

	}

	public static void phoneMethod(Queue<Phone> col) {
		Phone ph1 = new Phone("Oppo a74", 2021);
		Phone ph2 = new Phone("Oppo Reno7", 2021);
		Phone ph3 = new Phone("Iphone 13", 2020);
		Phone ph4 = new Phone("Samsung note7", 2022);
		Phone ph5 = new Phone("Iphone 11", 2019);

		col.add(ph1); // used for inserting an element.
		col.add(ph2);
		col.add(ph3);
		col.add(ph4);
		System.out.println(col.element()); // Calls the first element in the queue.
		System.out.println("\n");
		try {
			col.add(ph5);
		} catch (IllegalStateException e) {
			System.out.println("Attempted to add more elements than than the specified size of the Queue");
		}

		for (Phone ph : col) {
			System.out.println(ph);
		}
		System.out.println("\n");
		Phone value; // Used to extract an element
		value = col.remove();
		col.remove();
		col.remove();
		for (Phone val : col) {
			System.out.println(val);
		}

	}

	public static void smallPhoneMethod(Queue<SmallPhone> col) {
		SmallPhone sm1 = new SmallPhone("Xiaomi", 2021);
		SmallPhone sm2 = new SmallPhone("Huwawei", 2019);
		SmallPhone sm3 = new SmallPhone("Nokia", 2018);
		SmallPhone sm4 = new SmallPhone("Infinix", 2016);

		col.offer(sm1);
		col.offer(sm3);
		col.offer(sm2);
		col.offer(sm4); // no exception throwed. returns false instead.
		for (Phone sm : col) {
			System.out.println(sm);
		}
		col.poll(); // removes an element and if it can it returns null.
		col.peek(); // returns an element and if it can it returns null.
	}
}

class Phone implements Comparable<Phone> {
	private String name;
	private int productionDate;

	public Phone(String name, int productionDate) {
		this.name = name;
		this.productionDate = productionDate;
	}

	public String toString() {
		return String.format("%s , %d", name, productionDate);
	}

	@Override
	public int compareTo(Phone o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class SmallPhone extends Phone {

	public SmallPhone(String name, int productionDate) {
		super(name, productionDate);

	}

}
