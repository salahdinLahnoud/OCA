
public class DeclareClassMembers {
	public static void main(String args[]){
		T scm = new T();	
		
		scm.a = 2;
		
		System.out.println("Test a : " + scm.a);
		
	}	
}

class T{

    int a = 1; 
	int b = 3;
	
}
