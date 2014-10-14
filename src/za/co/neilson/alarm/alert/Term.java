package za.co.neilson.alarm.alert;

public class Term {

	private int coeff;
	private int power;
	private String term;
	
	public Term()
	{
		
		
		coeff = (int)(Math.random()*10);
		if((int)(Math.random()*2)==0)
		{
			coeff*=-1;
		}
		
		power = (int)(Math.random()*10);
		if((int)(Math.random()*2)==0)
		{
			power*=-1;
		}
		
		int i = (int)(Math.random()*3);
		
		if(i==0)
		{
			term = "cos(";
		}
		else if(i==1)
		{
			term = "sin(";
		}
		else{
			term = "tan(";
		}
	}
	public float computeDerivative(int x){
		if(term == "sin("){
			return ((float) (power*coeff*Math.pow(x,power - 1)*Math.cos(coeff*Math.pow(x,power))));
		}
		else if(term == "tan("){
			return ((float) (power*coeff*Math.pow(x, power-1)*Math.pow(1/(Math.cos(coeff*Math.pow(x,power))), 2)));
		}
		else{
			return ((float) (-1*power*coeff*Math.pow(x,power - 1)*Math.sin(coeff*Math.pow(x,power))));
		}
	}
	public float compute(int x){
		if(term == "sin("){
			return ((float) (Math.sin (coeff*Math.pow(x,power))));
		}
		else if( term == "tan("){
			return ((float) (Math.tan(coeff*Math.pow(x, power))));
		}
		else{
			return ((float) (Math.cos (coeff*Math.pow(x,power))));
		}
		
	}
	public String toString()
	{
		return (term + coeff + "x^" + power + ')');
	}
	
	
}