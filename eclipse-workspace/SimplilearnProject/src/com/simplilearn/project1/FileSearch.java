package com.simplilearn.project1;

import java.io.*;
import java.util.*;

public class FileSearch {

	int a = 0;
	//boolean filepresent = true;

	void fileSearch() throws IOException {
		FileSearch fs = new FileSearch();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file to be searched.. ");
		String name = scan.nextLine();
		fs.findFile(name, new File("/Users/user/Desktop/testFolder/"));
	}

	public void findFile(String name, File file1) throws IOException {

		File[] list = file1.listFiles();
		if (list != null) {

			for (File file2 : list) {

				String loc = "/Users/user/Desktop/testFolder/";
				loc = loc + name;
				File finaLoc = new File(loc);

				if ((finaLoc.compareTo(file2)) == 0) {
					this.a = 1;

				}

			}
			if (a == 1) {
				System.out.println("File Found");
			} else {
				System.out.println("File not Found");
			}

		}

	}

}
