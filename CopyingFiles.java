import java.io.*;
public class CopyingFiles {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\get it\\Desktop\\black.txt");
		File f2=new File("C:\\Users\\get it\\Desktop\\blac.txt");
		if(!f2.exists())
		{
			try{
				f.createNewFile();
				System.out.println("file created");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		try{
		FileInputStream f1=new FileInputStream(f);
		FileOutputStream f4=new FileOutputStream(f2);
		int i=f1.read();
		while(i!=-1)
		{
			f4.write((char)i);
			i=f1.read();
		}
		f1.close();
		f4.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			FileInputStream f5=new FileInputStream(f2);
			int i=f5.read();
			while(i!=-1)
			{
				System.out.print((char)i);
				i=f5.read();
			}
			f5.close();
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
