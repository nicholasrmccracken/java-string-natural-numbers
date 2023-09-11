import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumberSecondary;

/**
 * {@code NaturalNumber} represented as a {@code String} with implementations of
 * primary methods.
 *
 * @convention <pre>
 * [all characters of $this.rep are '0' through '9']  and
 * [$this.rep does not start with '0']
 * </pre>
 * @correspondence <pre>
 * this = [if $this.rep = "" then 0
 *         else the decimal number whose ordinary depiction is $this.rep]
 * </pre>
 *
 * @author Nicholas McCracken and Jack Mikesell
 *
 */
public class NaturalNumber3 extends NaturalNumberSecondary {

    /*
     * Private members --------------------------------------------------------
     */

    /**
     * Representation of {@code this}.
     */
    private String rep;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.rep = "";
    }

    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public NaturalNumber3() {
        this.createNewRep();
    }

    /**
     * Constructor from {@code int}.
     *
     * @param i
     *            {@code int} to initialize from
     */
    public NaturalNumber3(int i) {
        assert i >= 0 : "Violation of: i >= 0";

        this.rep = Integer.toString(i);

    }

    /**
     * Constructor from {@code String}.
     *
     * @param s
     *            {@code String} to initialize from
     */
    public NaturalNumber3(String s) {
        assert s != null : "Violation of: s is not null";
        assert s.matches("0|[1-9]\\d*") : ""
                + "Violation of: there exists n: NATURAL (s = TO_STRING(n))";

        this.rep = s;

    }

    /**
     * Constructor from {@code NaturalNumber}.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     */
    public NaturalNumber3(NaturalNumber n) {
        assert n != null : "Violation of: n is not null";

        this.rep = n.toString();

    }

    /*
     * Standard methods -------------------------------------------------------
     */

    @Override
    public final NaturalNumber newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final void transferFrom(NaturalNumber source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof NaturalNumber3 : ""
                + "Violation of: source is of dynamic type NaturalNumberExample";
        /*
         * This cast cannot fail since the assert above would have stopped
         * execution in that case.
         */
        NaturalNumber3 localSource = (NaturalNumber3) source;
        this.rep = localSource.rep;
        localSource.createNewRep();
    }

    /*
     * Kernel methods ---------------------------------------------------------
     */

    @Override
    public final void multiplyBy10(int k) {
        assert 0 <= k : "Violation of: 0 <= k";
        assert k < RADIX : "Violation of: k < 10";

        // if the current rep is 0, clear it
        if (this.rep != null) {
            if (this.rep.equals("0")) {
                this.rep = "";
            }

            // add the digit to the end of the rep
            this.rep = this.rep.concat(Integer.toString(k));
        }

    }

    @Override
    public final int divideBy10() {

        // make character to return at the end
        char c = '0';

        // if the rep is only one digit, get that digit and take it out of rep
        if (this.rep != null) {
            if (this.rep.length() == 1) {
                c = this.rep.charAt(0);
                this.rep = "";

                /*
                 * If rep has multiple digits, make rep a substring of all but
                 * the last digit, and make c the last digit of the original
                 * string.
                 */
            } else if (this.rep.length() > 1) {
                c = this.rep.charAt(this.rep.length() - 1);
                this.rep = this.rep.substring(0, this.rep.length() - 1);
            }
        }
        // convert the character into an int and return it
        return Character.getNumericValue(c);

    }

    @Override
    public final boolean isZero() {

        // if rep is 0, clear it
        if (this.rep.equals("0")) {
            this.rep = "";
        }

        // if there is nothing in rep, it is 0. Otherwise isZero will return false
        return this.rep.isEmpty();
    }

}
