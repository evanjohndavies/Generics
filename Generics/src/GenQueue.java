/**
 * 
 */

/**
 * @author evan davies
 *
 */

public class GenQueue<T> implements IGenQ<T> {
	private T q[]; // this array holds the queue
	private int putloc, getloc; // the put and get indices
	
	public GenQueue (T[] aRef) {
		q = aRef;
		putloc = getloc=0;
	}
	
	
	public void put(T item) throws QueueFullException {
		
		if (putloc == q.length)
			throw new QueueFullException(q.length);
		
		q[putloc++] = item;
		
	}
	

	public T get() throws QueueEmptyException {
		
		if (getloc ==putloc)
			throw new QueueEmptyException();
		
		return q[getloc++];
	}


}
