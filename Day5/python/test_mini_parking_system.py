import unittest
import mini_parking_system




class TestForRemoveSpace(unittest.TestCase):

   def test_if_the_function_exist(self):
     mini_parking_system.remove_spaces(1)

   def test_if_the_the_function_removes_spaces(self):
     result =  mini_parking_system.remove_spaces(6)
     self.assertEqual(result , "Removed Successfully!!")

   def test_for_value_error_for_string(self):
      self.assertRaises(ValueError , mini_parking_system.remove_spaces, "") 
 
   def test_for_value_error_for_number_greater_than_20(self):
      self.assertRaises(ValueError , mini_parking_system.add_spaces,22) 

   

class TestForAddSpace(unittest.TestCase):

    def test_if_the_function_is_correct(self):
     result =  mini_parking_system.add_spaces(6)
     self.assertEqual(result , "Congrats you can go ahead")
      
      
    def test_for_value_error_for_string_input(self):
      self.assertRaises(ValueError , mini_parking_system.add_spaces,"") 
  
    def test_for_value_error_for_int_greater_than_20(self):
      self.assertRaises(ValueError , mini_parking_system.add_spaces,22) 





class TestNumberOfSpaces(unittest.TestCase):

   def test_for_the_number_of_available_spaces(self):
     result = mini_parking_system.number_of_spaces([1,1,1,0,0,0,1,1,1])
     self.assertEqual(result , "There are 3 spaces left")

   def test_for_no_available_spaces(self):
     result = mini_parking_system.number_of_spaces([1,1,1,1,1,1,1,1,1])
     self.assertEqual(result , "There is no space")


   def test_for_value_error_if_the_user_inputs_a_non_list(self):
     self.assertRaises(ValueError , mini_parking_system.number_of_spaces, "")
  
   def test_for_value_error_if_the_length_is_more_than_20(self):
     self.assertRaises(ValueError , mini_parking_system.number_of_spaces, ["",""])































