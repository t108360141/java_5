import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
class sample
{
	public static void main(String[] args)
	{
		try
		{	
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("�g�J���ɮפ�����Ӧr��O");
			System.out.println(str1);
			System.out.println(str2);
			
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("��J��X���~");
		}
		
	}
}