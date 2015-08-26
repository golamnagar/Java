package iOSNativeApp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV {
	  public static ArrayList<String[]> run(String filePath) {
//			String csvFile = "/Users/golamhassan/Documents/Insert.csv";
			String csvFile = filePath;
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
	 
		ArrayList<String[]> sampleOrders = new ArrayList<String[]>();
		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				
			        // use comma as separator
				String[] field = line.split(cvsSplitBy);
				sampleOrders.add(field);
//				for (int i = 0; i < field.length; i++) {
//					if (field[i] != "") {
//						System.out.println(field[i] + ", ");
//					}
//				}
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {			
			for (int i = 0; i < sampleOrders.size(); i++) {
				String[] order = sampleOrders.get(i);
				for (int j = 0; j < order.length; j++) {
					if (order[j] != "") {
//						System.out.println(order[j] + ", ");
					}
				}
			}
			
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	 
		System.out.println("Done");
		return sampleOrders;
	  }
}
