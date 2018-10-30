package com.api.version;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public abstract class PrepareInput {
	
	protected void prepare(Scanner in, Map<String, List<Boolean>> mobileApiVersioningMap,
			List<Boolean> latestList, Map<String, String> apiVersionsMap) throws FileNotFoundException {
			
		prepareApiNameToLatestVersionMap(in, apiVersionsMap);		
		prepareMobileAppNameToLatestVersionMap(mobileApiVersioningMap, latestList, apiVersionsMap);

		
	}

	public abstract void prepareMobileAppNameToLatestVersionMap(Map<String, List<Boolean>> mobileApiVersioningMap,
			List<Boolean> latestList, Map<String, String> apiVersionsMap) throws FileNotFoundException ;

	public abstract void prepareApiNameToLatestVersionMap(Scanner in, Map<String, String> apiVersionsMap) ;



}
