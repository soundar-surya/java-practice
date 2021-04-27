class Test{

	int num;
	Test(int n){
		this.num = n;	
	}
}


public class Equals{
	int x;
	Equals(int n){
		this.x = n;
	}

	//@Override
	//public boolean equals(Equals e){
	//	System.out.println(getClass()+"---"+e.getClass());
	//	return false;
	//}

	public static void main(String[] args){
		Test t1 = new Test(1);
		Test t2 = new Test(1);
		System.out.println(t1.equals(t2));
		System.out.println(t1.hashCode()+"--"+t2.hashCode());
	}
}
