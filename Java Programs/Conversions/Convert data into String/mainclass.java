import java.text.*; // Decimal Format

class mainclass { 
public static void main(String args[]) { 
	int a = 1234; 
	String str1 = Integer.toString(a); 
	String str2 = String.valueOf(a); 
	String str3 = new Integer(a).toString();
	
	DecimalFormat df = new DecimalFormat("#"); 
    String str4 = df.format(a);

    StringBuffer sb = new StringBuffer(); 
    sb.append(a); 
    String str5 = sb.toString();
	String str6 = new StringBuffer().append(a).toString();

    StringBuilder sbui = new StringBuilder(); 
    sbui.append(a); 
    String str7 = sb.toString();
    String str8 = new StringBuilder().append(a).toString();

    String str9 = Integer.toBinaryString(a); 
    String str10 = Integer.toOctalString(a);
    String str11 = Integer.toHexString(a);
    String str12 = Integer.toString(a, 7);

	} 
} 
