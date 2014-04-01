package javatestprep;


public class JavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. promoting: byte, short, char, int, long; float & double
		//   Note: You can't specify byte literal
		tip.testIntegerPromotion();
	}

}
class tip{
	static byte b;
	static short s;
	static char c;
	static int i;
	static long l;
	static void testIntegerPromotion(){
		byte b=(byte) 0.5,b1=1,d,e=-128;
		short s=0, s1=32100,s3;
		char c=1,c2=65535;
		o.p(Byte.toString(b));
		o.p(""+tip.b);
	}	
}
class o {
	public static void p(String s){
		System.out.println(s);
	}
}
