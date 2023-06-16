package jcuda.jcudnn;
/*
 * JCuda - Java bindings for CUDA
 *
 * http://www.jcuda.org
 */


/**
 * Basic test of the bindings of the JCudnn class 
 */
public class JCudnnBasicBindingTest
{
    public static void main(String[] args)
    {
        JCudnnBasicBindingTest test = new JCudnnBasicBindingTest();
        test.testJCudnn();
        System.out.println(test.getClass().getName()+" Passed!");
    }

  
    public void testJCudnn()
    {
        if(!BasicBindingTest.testBinding(JCudnn.class))
        	throw new RuntimeException(this.getClass().getName()+" failed.");
    }
    


}
