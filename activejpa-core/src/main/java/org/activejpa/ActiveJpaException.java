/**
 * 
 */
package org.activejpa;

/**
 * @author ganeshs
 *
 */
public class ActiveJpaException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ActiveJpaException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public ActiveJpaException(String message) {
		super(message);
	}
}
