package com.api.version;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrepareInputImpl extends PrepareInput {

	public void prepareApiNameToLatestVersionMap(Scanner in, Map<String, String> apiVersionsMap) {
		/*
		 * Here We are reading the input Line one by One and preparing a map which
		 * contains all the latest Versions of the APIs,
		 * 
		 */
		while (in.hasNextLine()) {
			String line = in.nextLine();
			String[] splitted = line.split(",");
			InputUtil.prepareApiWithLatestVersions(apiVersionsMap, splitted);
		}
	}

	/*
	 * Preparing Map where Each Mobile App is setting the corresponding List whether
	 * It has Latest versions or not.
	 * 
	 */

	public void prepareMobileAppNameToLatestVersionMap(Map<String, List<Boolean>> mobileApiVersioningMap,
			List<Boolean> latestList, Map<String, String> apiVersionsMap) throws FileNotFoundException {
		Scanner in;
			in = new Scanner(new BufferedReader(
					new FileReader("/Users/mo/eclipse-workspace/ApiVersioning/src/resources/input.txt")));

			while (in.hasNextLine()) {
				String line = in.nextLine();
				String[] splitted = line.split(",");
				InputUtil.prepareMobileApiLatestVersionsMap(apiVersionsMap, splitted, mobileApiVersioningMap,
						latestList);
			}
	}

}
