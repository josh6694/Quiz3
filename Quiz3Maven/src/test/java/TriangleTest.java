import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
// import needed junit libraries 
public class TriangleTest {

	@Test
	public void test() {
		/// create test classes 
		Triangle test1=new Triangle(3,3,3);
		Triangle test2=new Triangle(1,3,3);
		Triangle test3=new Triangle(3,3,4);

		
		/// test .getArea method 
		assertTrue(test1.getArea()== 3.897114317029974);
		assertTrue(test2.getArea()== 1.479019945774904);
		assertTrue(test3.getArea()== 4.47213595499958);
		
		/// test .getPerimeter mehtod
		assertTrue(test1.getPerimeter()== 9);
		assertTrue(test2.getPerimeter()== 7);
		assertTrue(test3.getPerimeter()== 10);
		
	}

}
