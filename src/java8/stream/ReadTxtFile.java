package java8.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ReadTxtFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("E:/Shafi.txt");
		
		try 
		{
			FileReader fr= new FileReader(file);
			int a;
			char ch[]= new char[34];
			int count=0;
			
			while((a=fr.read()) != -1)
			{
				System.out.print((char)a);
				ch[count]=(char)a;
				count++;
			}
			System.out.println();
			String stmt=new String(ch);
			System.out.println("-----------"+stmt);
			
			String arr[]= stmt.split(" ");
			
			List<String> list=Arrays.asList(arr);
			
			HashMap<String,Integer> map = new HashMap<>();
			
			int record=1;
			
			for(String ss:list)
			{
				if(map.containsKey(ss))
				{
					record++;
					map.put(ss,2);
				}
				else
				{
					map.put(ss,1);
				}
			}
			System.out.println("---Fila Values--"+map);
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		} 

	}

}
