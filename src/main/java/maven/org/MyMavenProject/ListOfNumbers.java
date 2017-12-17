package maven.org.MyMavenProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
	private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
    }
    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
        
            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " + list.get(i));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
    
    public void readList(){
    	File file = null;
    	BufferedReader reader = null;
    	
    	try {
    		file = new File("C:\readin.txt");
    		reader = new BufferedReader(new FileReader(file));
    		String value = null;
        	while ((value = reader.readLine()) != null) {
    			System.out.println(value);
    			list.add(Integer.valueOf(value));
    		}
        	for (Integer integer : list) {
    			System.out.println(integer);
    		}
		} catch (FileNotFoundException e) {
			
			
		} catch (IOException e) {
			
		} finally {
			try {
				reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
    	
    }
    
    public static void main(String[] args) {
    	ListOfNumbers numbers = new ListOfNumbers();
    	numbers.readList();
	}
}
