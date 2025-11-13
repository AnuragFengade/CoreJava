 

public class inheritance {

	public static void main(String[] args) {
		/**
		 * Types of Inheritance:
		 * A)single level Inheritance.
		 * B)Multilevel I/H
		 * C)Hierarchical I/H
		 * D)Hybrid I/H.
		 * E)Multiple I/H.
		 * 
		 */
		
		Tiger shera=new Tiger();
		shera.hunt();
		shera.roar();
		shera.color();
		
		System.out.println(shera.huntcout);
		System.out.println(shera.teeth);
		
		shera.change("welcooomeeee");

	}

	@Override
	public String toString() {
		return "inheritance []";
	}
}

class  Maunsahari
{
	String  teeth="Large";
	public void hunt()
	{
		System.out.println("I am hunting");
	}
	
	public void roar()
	{
		System.out.println("I am roaring....");
	}
	public void change(String str3) {
		/**
		 *  Innovaccer =>  3+ years , into SDET.
		 */
		String str = str3;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			String str2 = null;
			if (str.charAt(i) == 'E' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'A'
					|| str.charAt(i) == 'I') {
				StringBuffer sb3 = new StringBuffer();

				str2 = sb3.append(str.charAt(i)).toString().toLowerCase();
				sb.append(str2);
			}
			else if (str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'a'
					|| str.charAt(i) == 'i') {
				StringBuffer sb3 = new StringBuffer();

				str2 = sb3.append(str.charAt(i)).toString().toUpperCase();
				sb.append(str2);
			} 
			
			else {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}

//one sub to one super =>Single level.
class Tiger extends Maunsahari
{
	
	//4=>reused
	//2=> added => extensibility.
	//6
	int huntcout=23;
	/**
	 * IS-A relation  Tiger IS-A Maunsahari
	 */
	
	public void color()
	{
		System.out.println("striped yellow...");
	}
}

//Single -Level
class Lion extends Maunsahari
{
	/**
	 * IS-A relation => Lion IS-A Maunsahari
	 */
}

