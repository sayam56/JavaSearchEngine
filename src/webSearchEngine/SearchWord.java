package webSearchEngine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchWord {
	static ArrayList<String> key = new ArrayList<String>();
	static HashMap<String, Integer> numbers = new HashMap<String, Integer>();
	// Positions and Occurrences of the words
		public static int wordSearch(String data, String word, String fileName) {
			int counter = 0;

			int offset = 0;
			webSearchEngine.BoyerMoore boyerMoore = new webSearchEngine.BoyerMoore(word);

			for (int location = 0; location <= data.length(); location += offset + word.length()) {
				offset = boyerMoore.search(word, data.substring(location));
				if ((offset + location) < data.length()) {
					counter++;
				}
			}
			if (counter != 0) {
				System.out.println("Found in HTML file --> " + fileName+" --> "+counter+" times"); // Founded from which HTML file..
				System.out.println("-------------------------------------------------");
			}
			return counter;
		}

		// Merge-sort for ranking of the pages
		public static void rankFiles(Hashtable<?, Integer> files, int occur) {

			// Transfer as List and sort it
			ArrayList<Map.Entry<?, Integer>> fileList = new ArrayList<Map.Entry<?, Integer>>(files.entrySet());

			Collections.sort(fileList, new Comparator<Map.Entry<?, Integer>>() {

				public int compare(Map.Entry<?, Integer> obj1, Map.Entry<?, Integer> obj2) {
					return obj1.getValue().compareTo(obj2.getValue());
				}
			});

			Collections.reverse(fileList);

			if (occur != 0) {
				
				System.out.println("------Top 5 search results -----");

				int noOfFetch = 5;
				int j = 0;
				int i=1;
				while (fileList.size() > j && noOfFetch > 0) {
					
					
					if(fileList.get(j).getKey()!=null) {
					System.out.println("(" + i + ") " + fileList.get(j).getKey());
					j++;
					i++;
					}
					noOfFetch--;
					
				}
			} 

		}

		

}
