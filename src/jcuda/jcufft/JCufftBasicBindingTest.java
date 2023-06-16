package jcuda.jcufft;


/**
 * Basic test of the bindings of the JCufft class 
 */
public class JCufftBasicBindingTest
{
    public static void main(String[] args)
    {
        JCufftBasicBindingTest test = new JCufftBasicBindingTest();
        test.testJCufft();
        System.out.println(test.getClass().getName()+" Passed!");
    }


    public void testJCufft()
    {
        if(!BasicBindingTest.testBinding(JCufft.class))
          	throw new RuntimeException(this.getClass().getName()+" failed.");
    }
    
}
