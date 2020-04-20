//Run this Server program in different JVM (different Eclipse window or different Command
//Prompt) than Client program

package network;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	private Socket s = null;
	private ServerSocket server = null;
	private DataInputStream in = null;
	
	public Server(int port)
	{
		try
		{
			server = new ServerSocket(port);//ServerSocekt is a special type of socket that
			              //will only listen request coming on this socket. On receiving the
			              //request it will assign separate socket for that request and then
			              //will again start listening  for new requests.
			System.out.println("Server started");
		    System.out.println("Waiting for a client.....");
		    
		    s = server.accept();//On receiving the request, this method of ServerSocket class
		                        //will assign separate socket for each request 
		    System.out.println("Client accepted");
		    System.out.println("Waiting for data.....");
		    in = new DataInputStream(s.getInputStream());
		    
		    String line = "";
		    //read message from Client until "over" is not sent
		    while(!line.equalsIgnoreCase("Over"))
		    {
		    	line = in.readUTF();
		    	System.out.println(line);
		    }//end of loop
		    System.out.println("Closing Connection....");
		    s.close();
		    in.close();
		}//end of try
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}//end of Constructor
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Server server = new Server(50000);
	}
}
