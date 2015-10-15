/**
 * 
 */

/**
 * @author evandavies
 *
 */
public class GenQDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create an integer queue
		Integer iStore[] = new Integer[10];
		GenQueue<Integer> q = new GenQueue<Integer>(iStore);
		
		Integer iVal;
		
		System.out.println("Demonstrate a queue of integers.");
		try {
			for(int i=0; i<5; i++){
				System.out.println("Adding " + i + " to q.");
				q.put(i);; //add integer value to q
			}
		} 
		catch (QueueFullException exc){
			System.out.println(exc);
		}
		System.out.println();
		
		try {
			for(int i=0; i < 5; i++) {
				System.out.print("Getting next Integer from q: ");
				iVal = q.get();
				System.out.println(iVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
	}
}
