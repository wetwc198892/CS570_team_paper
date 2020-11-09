package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;

public class BoundedQueueTest
{ 

   @Test
   public void shouldAnswerWithTrue()
   {
       assertTrue( true );
   }

   @Test
   public void object_create() {
     // Arrange
     final int expected_length = 2;
     final int expected_size = 0;
     final int expected_back = 0;
     final int expected_front = 0;
     final int expected_capacity = 2;
 
     // Act
     BoundedQueue actual = new BoundedQueue(2);
 
     // Assert
     assertEquals(Array.getLength(actual.getElements()), expected_length);
     assertEquals(actual.getSize(), expected_size);
     assertEquals(actual.getBack(), expected_back);
     assertEquals(actual.getFront(), expected_front);
     assertEquals(actual.getCapacity(), expected_capacity);
   }    

   @Test
   public void enQueue_test ()
   {  
      BoundedQueue actual = new BoundedQueue(2);
      final int expected_size = 1;
      final int expected_elementBack = 2;
      final int expected_back = 1;
      actual.enQueue(2);
      assertEquals(actual.getBack(), expected_back);
      assertEquals(actual.getElements()[actual.getBack()-1], expected_elementBack);
      assertEquals(actual.getSize(), expected_size);
   }

   @Test
   public void deQueue_test ()
   {  
      BoundedQueue actual = new BoundedQueue(2);
      actual.enQueue(2);
      actual.enQueue(2);
      actual.deQueue();
      final int expected_size = 1;
      final int expected_front = 1;
      assertEquals(actual.getSize(), expected_size);
      assertEquals(actual.getFront(), expected_front);
   }
   
   @Test
   public void empty_test()
   {  
      BoundedQueue actual = new BoundedQueue(2);
      final boolean expected_size = true;
      assertEquals(actual.isEmpty(), expected_size);
   }

   @Test
   public void full_test()
   {  
      BoundedQueue actual = new BoundedQueue(2);
      final boolean expected_size = false;
      assertEquals(actual.isFull(), expected_size);
   }

   @Test
   public void toString_test()
   {  
      BoundedQueue actual = new BoundedQueue(2);
      actual.enQueue(2);
      actual.enQueue(2);
      final String expected_string = "[2, 2]";
      assertEquals(actual.toString(), expected_string);
   }
}