package Problems;

public class isBinary
{
  public static void main (String args[])
  {
      String str = "101";
      
      boolean isBin = isBinary(str);
      
      System.out.println(isBin);
  }

  static boolean isBinary (String str)
  {

    char[] charArray = str.toCharArray ();

  for (char e:charArray)
      {
	if (e == '1' || e == '0')
	  {

	  }
	else
	  {
	    return false;
	  }
      }


    return true;
  }
}
