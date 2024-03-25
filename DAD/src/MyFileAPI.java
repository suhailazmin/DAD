import java.io.*;

class MyFileAPI extends File
{
	MyFileAPI(String filename)
	{
		super(filename);
	}

	public static void main(String [] ar) throws Exception
	{
		MyFileAPI myfile = new MyFileAPI("My.txt");
		if(myfile.exists())
		{
			System.out.println("File Exists!");
		}
		else
		{
			System.out.println("File does not exist! Try another file name");
		}
	}

}