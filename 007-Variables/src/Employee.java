
public class Employee {
	
	int empid;		//instance variable, will have default value 0 since it is int type, accessible to the whole class
	//initialization is not required for instance variable
	String name;   //instance variable
	
	static int count;    //global variable, declared inside class, can't be declared inside methods, default value 0
	
	void calculateAllowance() {
		double allowance;	//local variable, scope only within the function, no value assigned
		System.out.println(allowance);  //must be initialized before usage, not accessible outside
		System.out.println(empid);   //value 0
	}
	
	void calculateTax() {
		static int c=9;	//static not allowed inside method
		double tax=0;	//local variable value initialized
		System.out.println(tax);
	}
	
	void calculateIncentive(int extraHours) {	//parameter variable, scope limited to the method only, need not have initialized
		System.out.println(extraHours);
	}
	
	void test() {
		int x=90;
		if(x>50) {
			System.out.println("Qualified");
			int y=100;		//local variable, only accessible inside the if block
			System.out.println(y);
		}
		else
		{
			int y=200;
			System.out.println(y);
		}
	}
}
