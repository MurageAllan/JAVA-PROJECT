
public class NumericCast {

	public static void main(String[] args) {
		byte value = 8;
		short shortValue = 32767;
		int intValue = 888;
		long longValue = 888888888;
		
		float floatValue = 88.9f;
		double doubleValue = 88.88;
		
		//shortValue = (short)longValue;
		//System.out.println(shortValue);
		intValue = (int)doubleValue;
		System.out.println(intValue);
		intValue = (int)intValue;
		System.out.println(intValue);
		//System.out.println(Short.MAX_VALUE);
		//System.out.println(Long.MIN_VALUE);
	}

}
