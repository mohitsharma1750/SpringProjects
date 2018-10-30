package com.api.version;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class OutputUtil {

	
	/*
	 * Util Method to check and Print the Latest Version of the Mobile App
	 * 
	 */
	
	protected static void getAppWithLatestVersions(Map<String, List<Boolean>> mobileApiVersioningMap,
			PrintWriter output) {
		mobileApiVersioningMap.forEach((apiName, versionList) -> {
			if (!versionList.contains(false)) {
				output.write(apiName);
			}

		});
	}
}
