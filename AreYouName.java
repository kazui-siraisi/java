import java.*;
public class AreYouName 
{
	public static void main (String[] args)
	{
	System.out.println("あなたの名前を入力してください");
	BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
	try
		{
		String line = reader.readLine();
		System.out.println(line + "さん、こんにちわ");
		}
	}
}