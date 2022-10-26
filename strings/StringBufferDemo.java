package strings;

public class StringBufferDemo {
	public static void main(String args[]){ 
	 StringBuffer  sb=new StringBuffer("Hello"); 
     StringBuffer s=new  StringBuffer();
     StringBuffer s1=new StringBuffer(22);
     
     s1.append("Add any value jjdfejhhjhjkrjkejkjkrfk");
     sb.append("Java");//now original string is changed 
     System.out.println(sb);
     System.out.println(s1);
//     StringBuffer(): creates an empty string buffer with the initial capacity of 16.
//     StringBuffer(String str): creates a string buffer with the specified string.
//     StringBuffer(int capacity): creates an empty string buffer with the specified capacity as length.

     
     StringBuffer sb1=new StringBuffer("Hello "); 
     sb1.insert(2,"Java");                        //now original string is changed 
//     System.out.println(sb1);  
     
     
 
}
}
