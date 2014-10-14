package za.co.neilson.alarm.alert;

public class Equation {
	private Term test1;
	private Term test2;
	int x;
	private String operator;
	
	public Equation(int myx, int lvl){
		test1 = new Term();
		test2 = new Term();
		x = myx;
		if(lvl==3){
			operator = "/";
		}
		else{
			operator = "*";
		}
	}
	
	
	
	public float evaluate(){
		if( operator == "/"){
		return (float)(((test2.compute(x)*test1.computeDerivative(x)- test1.compute(x)*test2.computeDerivative(x))/(Math.pow(test2.compute(x),2))));
		}
		else{
			return (float)(test1.computeDerivative(x)*test2.compute(x)+test2.computeDerivative(x)*test1.compute(x));
		}
	}
	public String toString(){
		return test1.toString()+operator+test2.toString();
	}
}