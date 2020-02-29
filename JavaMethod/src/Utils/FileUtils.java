package Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.awt.List;
import java.io.BufferedReader;

public class FileUtils {
	
	
	private static String[] res;

	public static boolean readFile(String filePath, ArrayList arr){
		String str;
		// 获得文件输入
		try{
		FileInputStream file = new FileInputStream(filePath);
		InputStreamReader filebuf = new InputStreamReader(file);
		BufferedReader bf = new BufferedReader(filebuf);
		//System.out.println(bf.readLine());
		//System.out.println("file: "+ bf.readLine().split("\\[").toString());
		while((str=bf.readLine()) != null){
			// 读取文件
			res = str.split(" ");
			arr.addAll(Arrays.asList(res));
			//System.out.println(res[0]);
		}
		return true;
		}
		catch(IOException e){
			System.out.println(e);
			InputStream file = null;
			return false;
		}

	}
	
	public static void main(String[] args){
		ArrayList<String> l = new ArrayList<String>();
		boolean s = readFile("./src/Utils/a-tale-of-two-cities.txt", l);
		if (s == true){
			System.out.println(l);
			System.out.println(l.size());
		}
	}
}
