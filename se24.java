import java.util.*;
import java.lang.*;
class se25
{
  public static void main(String arg[])
   {
     try
         {
            String s="The char array equals";
            byte[] ba=s.getBytes();
	String s1=new String(ba);
	  System.out.println("this sample excerise is equal to "+ba);
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}