import java.io.*;
class hello
{
	public static void main(String arg[])throws Exception

	{
		//System.out.println("hello world");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println(str);
	}
}