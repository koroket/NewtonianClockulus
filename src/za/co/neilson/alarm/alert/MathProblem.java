package za.co.neilson.alarm.alert;

import java.util.ArrayList;
import java.util.Random;

public class MathProblem {

	Equation myeq;
	Term myterm;
	int level;
	int x;
	
	
//			if(combinedParts.get(i) == Operator.ADD){
//				answer = (Float)combinedParts.get(i-1) + (Float)combinedParts.get(i+1);
//			}else{
//				answer = (Float)combinedParts.get(i-1) - (Float)combinedParts.get(i+1);
//			}
//			for (int r = 0; r < 2; r++)
//				combinedParts.remove(i-1);
//			combinedParts.set(i-1, answer);
//		}
		
		
		
//		2 5 7 8 9 11
//		 + - * / -
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public MathProblem(int mylev)
	{
		x=((int)(Math.random()*9)) +1;
		level = mylev;
		if(level==3)
		{
			myeq = new Equation(x,3);
		}
		else if(level==2)
		{
			myeq = new Equation(x,2);
		}
		else
		{
			myterm = new Term();
		}
	}
	@Override
	
	public String toString() {
		if(level==3)
		{
			return "Derive: " + myeq.toString() +"at x = " + myeq.x + " to the nearest one's place";
			
		}
		else if(level==2)
		{
			return "Derive: " + myeq.toString() +"at x = " + myeq.x+ " to the nearest one's place";
			
		}
		else
		{
			return "Derive: " + myterm.toString() +"at x = " + x + " to the nearest one's place";
			
		}
		}

	public float getAnswer() {
		if(level==3)
		{

			if(myeq.evaluate()>0)
			{
				return (float)((int)(myeq.evaluate()+.5));
			}
			else 
			{
				return (float)((int)(myeq.evaluate()-.5));
			}
		}
		else if(level==2)
		{

			if(myeq.evaluate()>0)
			{
				return (float)((int)(myeq.evaluate()+.5));
			}
			else 
			{
				return (float)((int)(myeq.evaluate()-.5));
			}
		}
		else
		{
			if(myterm.computeDerivative(x)>0)
			{
				return (float)((int)(myterm.computeDerivative(x)+.5));
			}
			else 
			{
				return (float)((int)(myterm.computeDerivative(x)-.5));
			}
		}
	}

}
