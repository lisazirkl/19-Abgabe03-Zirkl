package at.fhj.iit;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringStackTest
{
    public Stack s;
    
    @Before
    public void setup() throws Exception
    {
        s = new StringStack(5); // keep size of 5 !!
    }
    
    /**
     * tests if stack is empty after initialization
     * 
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception
    {
        assertTrue(s.isEmpty());
    }
    
    /**
     * tests if stack is empty after pushing
     * 
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception
    {
          s.push("hallo");
          assertFalse(s.isEmpty());
    }

    /**
     * tests push and pop function
     * 
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     * @throws Exception 
     */
    @Test
    public void testPushPop() throws Exception
    {
        s.push("hey");
        s.push("good morning");
        s.pop();
        s.pop();
        assertTrue(s.isEmpty());
    }
    @Test (expected=IllegalStateException.class)
    public void testPopTooMany() throws Exception
    {
        s.push("hallo");
        s.pop();
        s.pop();
    }
    @Test (expected=IllegalArgumentException.class)
    public void testStackCapacity() throws Exception
    {
        s = new StringStack(-2);
    }
    @Test (expected=IllegalStateException.class)
    public void testStackOverloaded() throws Exception
    {
        s.push("hallo");
        s.push("hey");
        s.push("bye");
        s.push("good morning");
        s.push("hi");
        s.push("goodbye");
    }

    
}
