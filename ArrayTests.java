import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] inputT = { 3, 9 };
    int[] inputT2 = { 2, 4,6,8,10,12 };
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(inputT);
    ArrayExamples.reverseInPlace(inputT2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{9, 3}, inputT);
    assertArrayEquals(new int[]{12,10,8,6,4,2}, inputT2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] inputT = {2,1 };
    assertArrayEquals(new int[]{ 1,2}, ArrayExamples.reversed(inputT));
    int[] inputT2 = { 8,7,6,5,4,3,2,1};
    assertArrayEquals(new int[]{ 1,2,3,4,5,6,7,8}, ArrayExamples.reversed(inputT2));
  }
  public static void main (String[] args){ //command + ; f

  }
}
