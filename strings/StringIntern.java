package strings;

public class StringIntern {
	public static void main(String args[])
    { 
        String s1=new String("example");//creating java string by new keyword 
        String internedString = s1.intern(); 
     // this will add the string to string constant pool.
        
        StringBuffer s = new StringBuffer("GeeksforGeeks");

        System.out.println(s1);
    }
}
