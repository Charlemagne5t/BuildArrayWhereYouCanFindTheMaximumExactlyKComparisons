import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void numOfArraysTest1() {
        int n = 2;
        int m = 3;
        int k = 1;
        int expected = 6;
        int actual = new Solution().numOfArrays(n, m, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numOfArraysTest2() {
        int n = 5;
        int m = 2;
        int k = 3;
        int expected = 0;
        int actual = new Solution().numOfArrays(n, m, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numOfArraysTest3() {
        int n = 9;
        int m = 1;
        int k = 1;
        int expected = 1;
        int actual = new Solution().numOfArrays(n, m, k);

        Assert.assertEquals(expected, actual);
    }
}
