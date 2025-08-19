import fire_drill
import unittest



class TestValueError(unittest.TestCase):
    
    def test_if_the_funtion_raises_value_error(self):
       self.assertRaises(ValueError ,fire_drill.value_error_for_Int , "")








class TestForTaskOne(unittest.TestCase):
    
   def test_if_the_function_exist(self):
      fire_drill.task_one(20,10)

   def test_for_when_the_twice_is_greater_than_the_fathers_age(self):
      result = fire_drill.task_one(20,15)
      self.assertEqual(result , 10)
 
   def test_for_when_the_twice_the_less_than_the_fathers_age(self):
      result = fire_drill.task_one(30,12)
      self.assertEqual(result , 6)
 
   def test_for_when_the_twice_is_equal_to_the_fathers_age(self):
      result = fire_drill.task_one(30,15)
      self.assertEqual(result , 0)
 
   def test_for_valueError_for_decimal_numbers(self):
      self.assertRaises(ValueError, fire_drill.task_one, 1.5,3.5)  


   def test_for_value_error_when_the_user_inputs_a_string(self):
      self.assertRaises(ValueError,fire_drill.task_one, "","")
 
   def test_for_value_error_if_the_son_age_is_greater_than_the_fathers_age(self):
      self.assertRaises(ValueError,fire_drill.task_one, 20,30)
 

class TestAverage(unittest.TestCase):

   def test_if_the_function_returns_average(self):
       result = fire_drill.average(30,60,90)
       self.assertEqual(result , 60) 


class TestLetterGarde(unittest.TestCase):
   
   def test_if_the_function_return_the_right_grade(self):
     result = fire_drill.letter_grade(100)
     self.assertEqual(result , "A") 


   def test_if_the_function_returns_B_as_grade(self):
     result = fire_drill.letter_grade(80)
     self.assertEqual(result , "B") 


   def test_if_the_function_returns_C_as_the_grade(self):
     result = fire_drill.letter_grade(70)
     self.assertEqual(result , "C") 


   def test_if_the_function_returns_D_as_the_grade(self):
     result = fire_drill.letter_grade(65)
     self.assertEqual(result , "D") 

   def test_if_the_function_returns_E_as_the_grade(self):
     result = fire_drill.letter_grade(25)
     self.assertEqual(result , "F") 



class TestTaskTwo(unittest.TestCase):
  
    def test_the_function_is_accururate(self):
      result = fire_drill.task_two(30,60,90)
      self.assertEqual(result , "D")
   
    def test_for_value_error_when_its_not_an_int(self):
      self.assertRaises(ValueError , fire_drill.task_two, "", "", "")

    def test_for_value_error_when_its_not_a_float(self):
      self.assertRaises(ValueError , fire_drill.task_two, 0.1, 1.9, 8.6)



class TestTaskThree(unittest.TestCase):

  def test_if_the_function_exists(self):
     fire_drill.task_three(["amaka"])


  def test_if_the_function_is_correct(self):
     result = fire_drill.task_three(["jacob","samuel","Loveth","david","makaveli","Emma"])
     self.assertEqual(result , "jacob, samuel, and 4 others likes this")

  def test_for_Two_inputs(self):
     result = fire_drill.task_three(["jacob","samuel"])
     self.assertEqual(result , "jacob and samuel likes this")


  def test_for_one_inputs(self):
     result = fire_drill.task_three(["jacob"])
     self.assertEqual(result , "jacob likes this")


  def test_if_theirs_zero_inputs(self):
    result = fire_drill.task_three([])
    self.assertEqual(result , "no one likes this")


  def test_for_value_error_if_an_int_is_inputed(self):
    self.assertRaises(ValueError, fire_drill.task_three, 123) 


  def test_for_value_error_if_a_list_of_int_is_passed(self):
     self.assertRaises(ValueError, fire_drill.task_three, [23]) 







