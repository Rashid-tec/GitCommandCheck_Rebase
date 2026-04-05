
public class MathmaticallOperation {
	
	public static void main(String[] args) {
		MathmaticallOperation s=new MathmaticallOperation();
		s.add(4, 6);
		System.out.println(s.subtract(9,3));
		System.out.println(s.multiple(4, 5));
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public int subtract(int a, int b){
	    return a - b;
	}
	public int multiple(int a,int b)
	{
		return a*b;
	}

}
