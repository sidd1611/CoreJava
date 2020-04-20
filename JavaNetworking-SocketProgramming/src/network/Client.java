//Run this Client program in different JVM (different Eclipse window or different Command
//Prompt) than Server program

package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client
{
	private Socket s = null;
	//BufferedReader input = null;
	private DataInputStream input = null;
	private DataOutputStream out = null;
	
	@SuppressWarnings("deprecation")
	public Client(String address, int port)
	{
		try
		{
			s= new Socket(address, port);
			System.out.println("Connected....");
			
			//input = new BufferedReader(new InputStreamReader(System.in));
			input = new DataInputStream(System.in);
			
			out = new DataOutputStream(s.getOutputStream());
			
			String line = "";
			//keep reading until "Over" is input
			System.out.println("please enter the data: (enter 'Over' to stop entering)");
			while(!line.equalsIgnoreCase("Over"));
			{
				line = input.readLine();
				out.writeUTF(line);
				out.flush();
			}//end of loop
			
			input.close();
			out.close();
			s.close();
		}//end of try
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	 
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Client client = new Client("localhost", 50000);
		
	}
}