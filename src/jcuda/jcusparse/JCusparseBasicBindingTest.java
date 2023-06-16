/*
 * JCuda - Java bindings for CUDA
 *
 * http://www.jcuda.org
 */
package jcuda.jcusparse;


/**
 * Basic test of the bindings of the JCusparse class
 */
public class JCusparseBasicBindingTest
{
    public static void main(String[] args)
    {
        JCusparseBasicBindingTest test = new JCusparseBasicBindingTest();
        test.testJCusparse();
        System.out.println(test.getClass().getName()+" Passed!");
    }

    public void testJCusparse()
    {
        if(!BasicBindingTest.testBinding(JCusparse.class))
        	throw new RuntimeException(this.getClass().getName()+" failed.");
    }
    

}
