import unittest
import grocery_store

class TestForAddItemFunction(unittest.TestCase):
    
     def test_if_the_function_exists(self):
        grocery_store.add_item("mango")

     def test_if_the_function_returns_an_array(self):
        result = grocery_store.add_item("orange")
        self.assertEqual(result , ["mango","orange"])

     def test_for_value_error_when_the_user_pass_in_a_number(self):
         self.assertRaises(ValueError, grocery_store.add_item, 123)

     def test_for_value_error_when_the_user_inputs_numbers_in_a_list(self):
          self.assertRaises(ValueError, grocery_store.add_item, [123])



class TestRevoveFunction(unittest.TestCase):
 
      def test_if_the_function_is_correct(self):
         result = grocery_store.remove_item("mango")
         self.assertEqual(result , ["orange"])


      def test_for_value_error_when_inputed_an_int(self):
          self.assertRaises(ValueError, grocery_store.remove_item, 234) 
  
      def test_for_value_error_when_inputed_an_int(self):
          self.assertRaises(ValueError, grocery_store.remove_item, [24]) 
  
 
      









