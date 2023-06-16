package jcuda.jcurand;


/**
 * Basic test of the bindings of the JCurand class 
 */
public class JCurandBasicBindingTest
{
    public static void main(String[] args)
    {
        JCurandBasicBindingTest test = new JCurandBasicBindingTest();
        test.testJCurand();
        System.out.println(test.getClass().getName()+" Passed!");
    }

    public void testJCurand()
    {
       if(!BasicBindingTest.testBinding(JCurand.class))
         	throw new RuntimeException(this.getClass().getName()+" failed.");
    }
    
}
