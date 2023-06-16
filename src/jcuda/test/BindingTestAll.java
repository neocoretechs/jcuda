package jcuda.test;

import jcuda.jcublas.JCublasBasicBindingTest;
import jcuda.jcufft.JCufftBasicBindingTest;
import jcuda.jcurand.JCurandBasicBindingTest;
import jcuda.jcusolver.JCusolverBasicBindingTest;
import jcuda.jcusparse.JCusparseBasicBindingTest;

/**
 * Test all available bindings. Throws RuntimeException if any fail
 */
public class BindingTestAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JCublasBasicBindingTest.main(args);
		JCufftBasicBindingTest.main(args);
		JCurandBasicBindingTest.main(args);
		JCusolverBasicBindingTest.main(args);
		JCusparseBasicBindingTest.main(args);

	}

}
