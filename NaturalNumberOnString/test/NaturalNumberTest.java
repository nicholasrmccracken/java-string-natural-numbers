import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * JUnit test fixture for {@code NaturalNumber}'s constructors and kernel
 * methods.
 *
 * @author Nicholas McCracken and Jack Mikesell
 *
 */
public abstract class NaturalNumberTest {

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @return the new number
     * @ensures constructorTest = 0
     */
    protected abstract NaturalNumber constructorTest();

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param i
     *            {@code int} to initialize from
     * @return the new number
     * @requires i >= 0
     * @ensures constructorTest = i
     */
    protected abstract NaturalNumber constructorTest(int i);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param s
     *            {@code String} to initialize from
     * @return the new number
     * @requires there exists n: NATURAL (s = TO_STRING(n))
     * @ensures s = TO_STRING(constructorTest)
     */
    protected abstract NaturalNumber constructorTest(String s);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     * @return the new number
     * @ensures constructorTest = n
     */
    protected abstract NaturalNumber constructorTest(NaturalNumber n);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @return the new number
     * @ensures constructorRef = 0
     */
    protected abstract NaturalNumber constructorRef();

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param i
     *            {@code int} to initialize from
     * @return the new number
     * @requires i >= 0
     * @ensures constructorRef = i
     */
    protected abstract NaturalNumber constructorRef(int i);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param s
     *            {@code String} to initialize from
     * @return the new number
     * @requires there exists n: NATURAL (s = TO_STRING(n))
     * @ensures s = TO_STRING(constructorRef)
     */
    protected abstract NaturalNumber constructorRef(String s);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     * @return the new number
     * @ensures constructorRef = n
     */
    protected abstract NaturalNumber constructorRef(NaturalNumber n);

    // TODO - add test cases for four constructors, multiplyBy10, divideBy10, isZero

    /*
     * Test cases for constructors
     */

    /**
     * Test no argument constructor with no arguments.
     */
    @Test
    public final void testNoArgumentConstructor() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest();
        NaturalNumber nExpected = this.constructorRef();
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test integer argument constructor with n = 0.
     */
    @Test
    public final void testIntArgumentConstructorZero() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(0);
        NaturalNumber nExpected = this.constructorRef(0);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test integer argument constructor with n = 1.
     */
    @Test
    public final void testIntArgumentConstructorOne() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(1);
        NaturalNumber nExpected = this.constructorRef(1);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test integer argument constructor with n = 1234.
     */
    @Test
    public final void testIntArgumentConstructorFewDigits() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(1234);
        NaturalNumber nExpected = this.constructorRef(1234);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test integer argument constructor with n = 123456789.
     */
    @Test
    public final void testIntArgumentConstructorManyDigits() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(123456789);
        NaturalNumber nExpected = this.constructorRef(123456789);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test integer argument constructor with n = Integer.MAX_VALUE.
     */
    @Test
    public final void testIntArgumentConstructorMax() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(Integer.MAX_VALUE);
        NaturalNumber nExpected = this.constructorRef(Integer.MAX_VALUE);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test string argument constructor with n = "0".
     */
    @Test
    public final void testStringArgumentConstructorZero() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest("0");
        NaturalNumber nExpected = this.constructorRef("0");
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test string argument constructor with n = "1".
     */
    @Test
    public final void testStringArgumentConstructorOne() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest("1");
        NaturalNumber nExpected = this.constructorRef("1");
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test string argument constructor with n = "1234".
     */
    @Test
    public final void testStringArgumentConstructorSomeDigits() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest("1234");
        NaturalNumber nExpected = this.constructorRef("1234");
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test string argument constructor with n = "123456789".
     */
    @Test
    public final void testStringArgumentConstructorManyDigits() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest("123456789");
        NaturalNumber nExpected = this.constructorRef("123456789");
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test string argument constructor with n =
     * Integer.toString(Integer.MAX_VALUE).
     */
    @Test
    public final void testStringArgumentConstructorMax() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this
                .constructorTest(Integer.toString(Integer.MAX_VALUE));
        NaturalNumber nExpected = this
                .constructorRef(Integer.toString(Integer.MAX_VALUE));
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test string argument constructor with n =
     * Integer.toString(Integer.MAX_VALUE) * 10.
     */
    @Test
    public final void testStringArgumentConstructorOverMax() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this
                .constructorTest(Integer.toString(Integer.MAX_VALUE) + "0");
        NaturalNumber nExpected = this
                .constructorRef(Integer.toString(Integer.MAX_VALUE) + "0");
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test integer argument constructor with n = 0.
     */
    @Test
    public final void testNaturalNumberArgumentConstructorZero() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(new NaturalNumber2(0));
        NaturalNumber nExpected = this.constructorRef(new NaturalNumber2(0));
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test natural number argument constructor with n = 1.
     */
    @Test
    public final void testNaturalNumberArgumentConstructorOne() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(new NaturalNumber2(1));
        NaturalNumber nExpected = this.constructorRef(new NaturalNumber2(1));
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test natural number argument constructor with n = 1234.
     */
    @Test
    public final void testNaturalNumberArgumentConstructorSomeDigits() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(new NaturalNumber2(1234));
        NaturalNumber nExpected = this.constructorRef(new NaturalNumber2(1234));
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test natural number argument constructor with n = 123456789.
     */
    @Test
    public final void testNaturalNumberArgumentConstructorManyDigits() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(new NaturalNumber2(123456789));
        NaturalNumber nExpected = this
                .constructorRef(new NaturalNumber2(123456789));
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test natural number argument constructor with n = Integer.MAX_VALUE.
     */
    @Test
    public final void testNaturalNumberArgumentConstructorMax() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this
                .constructorTest(new NaturalNumber2(Integer.MAX_VALUE));
        NaturalNumber nExpected = this
                .constructorRef(new NaturalNumber2(Integer.MAX_VALUE));
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test multiplyBy10 with n = 0 and k = 0.
     */
    @Test
    public final void testMultiplyBy10ZeroArgumentZero() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(0);
        NaturalNumber nExpected = this.constructorRef(0);
        n.multiplyBy10(0);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test multiplyBy10 with n = 0 and k = 1.
     */
    @Test
    public final void testMultiplyBy10ZeroArgumentOne() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(0);
        NaturalNumber nExpected = this.constructorRef(1);
        n.multiplyBy10(1);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test multiplyBy10 with n = 0 and k = 9.
     */
    @Test
    public final void testMultiplyBy10ZeroArgumentNine() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(0);
        NaturalNumber nExpected = this.constructorRef(9);
        n.multiplyBy10(9);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test multiplyBy10 with n = 1 and k = 0.
     */
    @Test
    public final void testMultiplyBy10OneArgumentZero() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(1);
        NaturalNumber nExpected = this.constructorRef(10);
        n.multiplyBy10(0);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test multiplyBy10 with n = 1 and k = 1.
     */
    @Test
    public final void testMultiplyBy10OneArgumentOne() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(1);
        NaturalNumber nExpected = this.constructorRef(11);
        n.multiplyBy10(1);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test multiplyBy10 with n = 1 and k = 9.
     */
    @Test
    public final void testMultiplyBy10OneArgumentNine() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(1);
        NaturalNumber nExpected = this.constructorRef(19);
        n.multiplyBy10(9);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test multiplyBy10 with n = 1234 and k = 0.
     */
    @Test
    public final void testMultiplyBy10SomeDigitsArgumentZero() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(1234);
        NaturalNumber nExpected = this.constructorRef(1234000);
        n.multiplyBy10(0);
        n.multiplyBy10(0);
        n.multiplyBy10(0);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test multiplyBy10 with n = 123456789 and k = 0.
     */
    @Test
    public final void testMultiplyBy10ManyDigitsArgumentZero() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(123456789);
        NaturalNumber nExpected = this.constructorRef(1234567890);
        n.multiplyBy10(0);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test multiplyBy10 with n = Integer.MAX_VALUE and k = 0.
     */
    @Test
    public final void testMultiplyBy10MaxArgumentZero() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(Integer.MAX_VALUE);
        NaturalNumber nExpected = this
                .constructorRef(Integer.toString(Integer.MAX_VALUE) + "0");
        n.multiplyBy10(0);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test multiplyBy10 with n = Integer.MAX_VALUE and k = 9.
     */
    @Test
    public final void testMultiplyBy10MaxArgumentNine() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(Integer.MAX_VALUE);
        NaturalNumber nExpected = this
                .constructorRef(Integer.toString(Integer.MAX_VALUE) + "999");
        n.multiplyBy10(9);
        n.multiplyBy10(9);
        n.multiplyBy10(9);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
    }

    /**
     * Test divideBy10 with n = 0.
     */
    @Test
    public final void testDivideBy10Zero() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(0);
        NaturalNumber nExpected = this.constructorRef(0);
        int remainder = n.divideBy10();
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
        assertEquals(0, remainder);
    }

    /**
     * Test divideBy10 with n = 1.
     */
    @Test
    public final void testDivideBy10One() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(1);
        NaturalNumber nExpected = this.constructorRef(0);
        int remainder = n.divideBy10();
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
        assertEquals(1, remainder);
    }

    /**
     * Test divideBy10 with n = 9.
     */
    @Test
    public final void testDivideBy10Nine() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(9);
        NaturalNumber nExpected = this.constructorRef(0);
        int remainder = n.divideBy10();
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
        assertEquals(9, remainder);
    }

    /**
     * Test divideBy10 with n = 10.
     */
    @Test
    public final void testDivideBy10Ten() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(10);
        NaturalNumber nExpected = this.constructorRef(1);
        int remainder = n.divideBy10();
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
        assertEquals(0, remainder);
    }

    /**
     * Test divideBy10 with n = 1234.
     */
    @Test
    public final void testDivideBy10SomeDigits() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(1234);
        NaturalNumber nExpected = this.constructorRef(123);
        int remainder = n.divideBy10();
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
        assertEquals(4, remainder);
    }

    /**
     * Test divideBy10 with n = 123456789.
     */
    @Test
    public final void testDivideBy10ManyDigits() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(123456789);
        NaturalNumber nExpected = this.constructorRef(123456789);
        int remainder = n.divideBy10();
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
        assertEquals(9, remainder);
    }

    /**
     * Test divideBy10 with n = Integer.MAX_VALUE.
     */
    @Test
    public final void testDivideBy10Max() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(Integer.MAX_VALUE);
        NaturalNumber nExpected = this.constructorRef(214748364);
        int remainder = n.divideBy10();
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
        assertEquals(7, remainder);
    }

    /**
     * Test divideBy10 with n = Integer.MAX_VALUE * 10.
     */
    @Test
    public final void testDivideBy10OverMax() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this
                .constructorTest(Integer.toString(Integer.MAX_VALUE) + "0");
        NaturalNumber nExpected = this.constructorRef(2147483647);
        int remainder = n.divideBy10();
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(nExpected, n);
        assertEquals(0, remainder);
    }

    /**
     * Test isZero with n = 0.
     */
    @Test
    public final void testIsZeroZero() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(0);
        /*
         * Assert that values of variables match expectations
         */
        assertTrue(n.isZero());
    }

    /**
     * Test isZero with n = 1.
     */
    @Test
    public final void testIsZeroOne() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(1);
        /*
         * Assert that values of variables match expectations
         */
        assertTrue(!n.isZero());
    }

    /**
     * Test isZero with n = Integer.MAX_VALUE.
     */
    @Test
    public final void testIsZeroMax() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = this.constructorTest(Integer.MAX_VALUE);
        /*
         * Assert that values of variables match expectations
         */
        assertTrue(!n.isZero());
    }
}
