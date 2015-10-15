/**
 * 
 */

/**
 * @author evan davies
 *  A Generic queue interface
 */
public interface IGenQ <T>{
	// define putter and getter for queue interface
	void put(T item) throws QueueFullException;
	
	T get() throws QueueEmptyException;

}
