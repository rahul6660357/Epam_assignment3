package EpamAssignment2.Calculator;

import EpamAssignment2.Operations.Arithmeticoperations;

public class Calculator {
Arithmeticoperations ar;
public Calculator()
{
    ar = new Arithmeticoperations();
}
public float operation(char op,int x, int y )
{
    switch (op)
    {
        case '+':{
            return this.ar.Add(x,y);
        }
        case '-':{
            return this.ar.Subtract(x,y);
        }
        case '*':{
            return this.ar.Multiply(x,y);
        }
        case '/':{
            return this.ar.Divide(x,y);
        }
    }
    System.out.println("there is no operator found like this");
    return -1;
}
}
