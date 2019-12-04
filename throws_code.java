package throws_codes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class throws_code {

	public void Readingfile() throws FileNotFoundException 
	{
		FileReader file=new FileReader("C:\\Users\\smita.patil\\Desktop\\test.txt");
		//file.read();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		throws_code t=new throws_code();
		t.Readingfile();
	}
}
