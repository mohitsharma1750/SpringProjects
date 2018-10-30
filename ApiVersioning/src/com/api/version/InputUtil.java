package com.api.version;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InputUtil {

	
	/*
	 * Input Utility method to prepare Mobile APi Latest Versions Map.
	 * 
	 */
	protected static void prepareMobileApiLatestVersionsMap(Map<String, String> apiVersionsMap, String[] splitted,
			Map<String, List<Boolean>> mobileApiVersioningMap, List<Boolean> latestList) {

		if (mobileApiVersioningMap.containsKey(splitted[0])) {
			latestList = mobileApiVersioningMap.get(splitted[0]);
			latestList.add(isLatestVersionPresent(splitted[2], splitted[1], apiVersionsMap));
			mobileApiVersioningMap.put(splitted[0], latestList);
		} else {
			latestList = new ArrayList<Boolean>();
			latestList.add(isLatestVersionPresent(splitted[2], splitted[1], apiVersionsMap));
			mobileApiVersioningMap.put(splitted[0], latestList);

		}
	}
	
	/*
	 * Input Utility Method to prepare Mobile API with LAtest Versions
	 * 
	 */

	protected static void prepareApiWithLatestVersions(Map<String, String> apiVersionsMap, String[] splitted) {
		if (apiVersionsMap.containsKey(splitted[1])) {
			int versionNumberValue = Integer.parseInt(splitted[2].replaceAll("[^0-9]", ""));
			int versionNumberValueAlreadyInMap = Integer
					.parseInt(apiVersionsMap.get(splitted[1]).replaceAll("[^0-9]", ""));
			if (versionNumberValue > versionNumberValueAlreadyInMap) {
				apiVersionsMap.put(splitted[1], splitted[2]);
			}

		} else {
			apiVersionsMap.put(splitted[1], splitted[2]);
		}
	}
	
	/*
	 * Method to check if the the latest Version is present or not
	 * 
	 */

	private static Boolean isLatestVersionPresent(String apiVersion, String apiName,
			Map<String, String> apiVersionsMap) {
		return apiVersionsMap.containsKey(apiName) && apiVersionsMap.get(apiName).equals(apiVersion);
	}
	
	

}