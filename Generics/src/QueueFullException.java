/**
 * 
 */

/**
 * @author evandavies
 *  An Exception for queue being full
 */
public class QueueFullException extends Exception {
	
	int size;
	
	QueueFullException(int s){
		size = s;
	}
	
	public String toString(){
		return "\nQueue is full.   Max sixe is " + size;
	}

}
