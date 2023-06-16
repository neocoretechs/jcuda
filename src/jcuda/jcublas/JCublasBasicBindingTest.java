package jcuda.jcublas;
/*
 * JCuda - Java bindings for CUDA
 *
 * http://www.jcuda.org
 */


/**
 * Basic test of the bindings of the JCublas and JCublas2 class 
 */
public class JCublasBasicBindingTest
{
    public static void main(String[] args)
    {
        JCublasBasicBindingTest test = new JCublasBasicBindingTest();
        test.testJCublas();
        test.testJCublas2();
        System.out.println(test.getClass().getName()+" Passed!");
    }

  
    public void testJCublas()
    {
        if(!BasicBindingTest.testBinding(JCublas.class))
        	throw new RuntimeException(this.getClass().getName()+" failed.");
    }
    

    public void testJCublas2()
    {
        if(!BasicBindingTest.testBinding(JCublas2.class))
          	throw new RuntimeException(this.getClass().getName()+" failed.");
    }

}
