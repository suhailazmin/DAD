import java.io.*;

class MyReader extends FileReader
{
	File file;
	char [] content = new char[1000];
	MyReader(File file) throws Exception
	{
		super(file);
		this.file = file;
	}

	MyReader(String filename) throws Exception
	{
		super(filename);
		file = new File(filename);
	}

	public String readContent() throws Exception
	{
		StringBuilder sb = new StringBuilder(); // StringBuilder to store the content of the file

	       try (BufferedReader br = new BufferedReader(this)) { // BufferedReader to read lines from the file
	          String line;
	          while ((line = br.readLine()) != null) { // Read lines until end of file
	              sb.append(line); // Append the line to the StringBuilder
            }	   
	    }

	        return sb.toString(); // Return the content as a String
	}

	public static void main(String [] args) throws 
     Exception
	{
		MyReader reader = new MyReader("Welcome.txt");
		System.out.println(reader.readContent());

	}

}