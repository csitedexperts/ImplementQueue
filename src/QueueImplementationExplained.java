
public class QueueImplementationExplained {

	public static void main(String[] args) {

		System.out.println("Queue Implementation Explained ....... ");

		Queue myq = new Queue();

		myq.enQueue(1, "AA");
		System.out.println("myq.top = " + myq.top);
		System.out.println("myq.tail = " + myq.tail);

		System.out.println("myq.top.next = " + myq.top.next);
		System.out.println("myq.tail.next = " + myq.tail.next);

		myq.enQueue(2, "BB");

		System.out.println("myq.top = " + myq.top);
		System.out.println("myq.tail = " + myq.tail);

		System.out.println("myq.top.next = " + myq.top.next);
		System.out.println("myq.tail.next = " + myq.tail.next);

		myq.enQueue(3, "CC");
		myq.enQueue(4, "DD");
		myq.enQueue(5, "EE");


		myq.displayAllNodes();

		myq.peek();

		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();

		myq.displayAllNodes();

	}

}
