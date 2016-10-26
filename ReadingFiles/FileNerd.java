import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileNerd {

	public static void main(String[] args) throws IOException {
		Scanner flTaker=new Scanner(new File("E:\\Workspace\\ReadingFiles\\NereData.txt"));
		int aa=-1;
		String xyz[]=new String[1000];
		
		while (flTaker.hasNextLine())
		{
			aa++;
			xyz[aa]=flTaker.nextLine();
		}
		flTaker.close();
		
		//String zyx[];
		for (int i=0;i<aa+1;i++)
		{
			String zyx[]=xyz[i].split(" ");
			if (zyx[0].equals("The"))
			{
				System.out.println(xyz[i]);
			}
			else
				continue;
		}
	}

}
