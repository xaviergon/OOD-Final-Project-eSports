/**
 * 
 */
package Observer;

/**
 * @author Xavier Gonzalez
 *
 */
public interface Subject {
	public void registerObs(Observer o);
	public void removeObs(Observer o);
	public void notifyObservers();
}
