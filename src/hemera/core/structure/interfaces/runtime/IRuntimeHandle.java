package hemera.core.structure.interfaces.runtime;

/**
 * <code>IRuntimeHandle</code> defines the interface
 * of a handle unit that allows modules to perform
 * invocations on the hosting runtime environment.
 *
 * @author Yi Wang (Neakor)
 * @version 1.0.0
 */
public interface IRuntimeHandle {

	/**
	 * Shutdown the runtime environment thus shutting
	 * down the entire application system.
	 */
	public void shutdown();
}
