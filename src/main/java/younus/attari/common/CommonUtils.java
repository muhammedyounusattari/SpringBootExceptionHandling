/**

 * Program Name: CommonUtils
 * 
 * Program Description / functionality: This class is for common utils
 * 
 * Modules1 Impacted: 
 * 
 *  * Developer    Created             /Modified Date       Purpose
  *******************************************************************************
 * Gouri          10/03/2015 
 * 
 * * Associated Defects Raised : 
 *
 */

package younus.attari.common;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Files;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
//import com.cloudunion.common.CloudunionConstants;


public class CommonUtils {

	public static List<String> getErrorMessageList(List<FieldError> list) {

		List<String> errorsList = new ArrayList<String>();
		String errorDetails = null;
		for (FieldError currentFieldError : list) {
			errorDetails = currentFieldError.getDefaultMessage();
			errorDetails = errorDetails.replaceAll("field", currentFieldError.getField());
			errorsList.add(errorDetails);
		}
		return errorsList;
	}
	public static boolean isResult(List<?> list) {
		boolean isResult=false;
		 if (list != null && list.size() >0)
			 isResult=true;
		return isResult;
	}
	public static boolean isResult(Object object) {
		boolean isResult=false;
		 if (object != null)
			 isResult=true;
		return isResult;
	}
	public static boolean isResult(Map map) {
		boolean isResult=false;
		 if (map != null && map.size() >0)
			 isResult=true;
		return isResult;
	}
	public static ReturnResponse getHttpStatusResponse(String message, HttpStatus status, Object res,String errorCode) {
		ReturnResponse returnResponse = new ReturnResponse();
		returnResponse.setStatusMessage(message);
		returnResponse.setStatusCode(status.value() + "");
		returnResponse.setData(res);
		returnResponse.setErrorCode(errorCode);
		return returnResponse;
	}
	
	 public static void copyFileUsingJava7Files(File source, File dest) throws IOException {
	     Files.copy(source.toPath(), dest.toPath());
	 }

//	 public static String  refferalCode(int uId)
//	    {
//	    	int codeNumber=CloudunionConstants.TARGETED_CONSUMER-uId;
//	      int remender;
//	      String refferalCode=""; 
//	      char hex[]={'A', 'B', 'C', 'D', 'E', 'F',
//	              'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
//	              'S', 'T', 'U', 'W', 'X', 'Y', 'Z'};
//	     
//	      while(codeNumber>0)
//	      {
//	    	  remender=codeNumber%23; 
//	        refferalCode=hex[remender]+refferalCode; 
//	        codeNumber=codeNumber/23;
//	        
//	       
//	      }
//	      if(refferalCode.length()<6)
//	      {
//	    	  if(refferalCode.length()==0){
//	    	   		refferalCode= "AAAAAA";
//	    	            }
//	    	  else if(refferalCode.length()==1){
//	   		refferalCode= String.format("AAAAA%s",refferalCode);
//	            }
//	          else if(refferalCode.length()==2){
//	        	  refferalCode= String.format("AAAA%s",refferalCode);
//	            }
//	          else if(refferalCode.length()==3){
//	        	  refferalCode= String.format("AAA%s",refferalCode);
//	            }
//	          else if(refferalCode.length()==4){
//	        	  refferalCode= String.format("AA%s",refferalCode);
//	            }
//	          else if(refferalCode.length()==5){
//	       	refferalCode= String.format("A%s",refferalCode);
//	            }
//	      }
//		return refferalCode;
//	    }
	 
	 public static String getForamtNumber(BigDecimal number) {
		 NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
      return String.valueOf(nf1.format(number));

     }
	 public static String getForamtNumber(double number) {
		 NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
      return String.valueOf(nf1.format(number));

     }
	 public static String getForamtNumber(BigInteger number) {
		 NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
      return String.valueOf(nf1.format(number));

     }
	 public static String getForamtNumber(long number) {
		 NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
      return String.valueOf(nf1.format(number));

     }
	 public static String getForamtNumber(float number) {
		 NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
      return String.valueOf(nf1.format(number));

     }
	public static String getForamtNumber(String number) {
		 NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
	      return String.valueOf(nf1.format(number));
	}
	
	public static LinkedHashMap<Long, String> getRedeemPoint(BigDecimal points) {
		String dropDown="1";
		String pointInString=String.valueOf(points);
		int ddLength=pointInString.length()-2;
		for(int i = 1; i<=ddLength; i++){
				dropDown=dropDown+"0";
			}
		return prepareDDList(Long.parseLong(String.valueOf(points)), Integer.parseInt(dropDown));
	}
	public static LinkedHashMap<Long, String> prepareDDList (long pointsPassed, int min) {
		LinkedHashMap<Long, String> dropDown = new LinkedHashMap<Long,String>();
        long increments = min;
        long thresh = min * 10;
        long now = min;
        if (pointsPassed >= min) {
               while (now <= pointsPassed) {
              	 dropDown.put(now, CommonUtils.getForamtNumber(now));
                     now += increments;
                     if (now == thresh) {
                            increments = thresh;
                            thresh = thresh * 10;
                     }
               }
               // if the value is 35000 and above, but less than 40000, print 35000 also an option
               if ((now - (increments / 2)) <= pointsPassed) {
              	 	dropDown.put(Long.parseLong(String.valueOf((now - (increments / 2)))), CommonUtils.getForamtNumber((now - (increments / 2))));
               }
        } // else return emptyList
                      return dropDown;
 }
	
}
