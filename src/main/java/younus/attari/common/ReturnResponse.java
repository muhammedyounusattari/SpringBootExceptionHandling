/**
 * Program Name: ReturnResponse
 * 
 * Program Description / functionality: This is the domain class for Cloudunion service
 * 
 * Modules Impacted:
 * 
 * 
 * * Developer Created /Modified Date Purpose
 *******************************************************************************
 * Gouri      10/03/2017
 * 
 * 
 * Associated Defects Raised :
 * 
 */

package younus.attari.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReturnResponse {

  private String errorCode;
  private Object data;
  private String statusCode;
  private String statusMessage;

  @JsonProperty(value = "_statusCode")
  public String getStatusCode() {
    return statusCode;
  }

  public String getErrorCode() {
    return errorCode;
  }

  @JsonProperty(value = "_statusMessage")
  public String getStatusMessage() {
    return statusMessage;
  }

  public Object getData() {
    return data;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public void setData(Object data) {
    this.data = data;
  }

}
