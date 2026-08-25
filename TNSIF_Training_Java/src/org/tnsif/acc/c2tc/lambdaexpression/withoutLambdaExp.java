package org.tnsif.acc.c2tc.lambdaexpression;

interface Drawablee{  
    public void draw();  
}  
class test implements Drawablee {
	int width =10;
	public void draw()
	{
		System.out.println("Drawing "+width);
	}  
};  
public class withoutLambdaExp {  
    public static void main(String[] args) {    
        //without lambda, Drawable implementation using test class  
    	Drawablee d = new test();
        d.draw();  
    }  
} 