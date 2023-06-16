/*
 * JCuda - Java bindings for CUDA
 *
 * http://www.jcuda.org
 */

package jcuda.jcusolver;


/**
 * Basic test of the bindings of the JCusolverDn, 
 * JCusolverSp and JCusolverRf classes
 */
public class JCusolverBasicBindingTest
{
    public static void main(String[] args)
    {
        JCusolverBasicBindingTest test = new JCusolverBasicBindingTest();
        test.testJCusolverDn();
        test.testJCusolverSp();
        test.testJCusolverRf();
        System.out.println(test.getClass().getName()+" Passed!");
    }


    public void testJCusolverDn()
    {
        if(!BasicBindingTest.testBinding(JCusolverDn.class))
          	throw new RuntimeException(this.getClass().getName()+" failed.");
    }
    

    public void testJCusolverSp()
    {
        if(!BasicBindingTest.testBinding(JCusolverSp.class))
          	throw new RuntimeException(this.getClass().getName()+" failed.");
    }


    public void testJCusolverRf()
    {
        if(!BasicBindingTest.testBinding(JCusolverRf.class))
          	throw new RuntimeException(this.getClass().getName()+" failed.");
    }

}
