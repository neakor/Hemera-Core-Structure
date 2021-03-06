package hemera.core.structure.interfaces;

import hemera.core.structure.enumn.EHttpStatus;

import org.json.JSONObject;

/**
 * <code>IResponse</code> defines the interface of a
 * response type produced by <code>IProcessor</code>
 * after processing a request. It forms the processing
 * result into a <code>JSONObject</code>.
 *
 * @author Yi Wang (Neakor)
 * @version 1.0.0
 */
public interface IResponse {

	/**
	 * Retrieve the response in JSON format.
	 * @return The <code>JSONObject</code> response.
	 * @throws Exception If converting response to
	 * JSON format failed.
	 */
	public JSONObject toJSON() throws Exception;
	
	/**
	 * Retrieve the response status.
	 * @return The <code>EHttpStatus</code> value.
	 */
	public EHttpStatus getStatus();
}
