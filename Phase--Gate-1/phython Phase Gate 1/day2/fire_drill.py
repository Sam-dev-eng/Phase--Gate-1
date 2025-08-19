
def value_error_for_Int(element):
   if type(element) != int:
      raise ValueError

def value_error_for_string(element):
   if type(element) != str:
      raise ValueError

def value_error_for_list(element):
   if type(element) != list:
      raise ValueError



def task_one(fathers_age, son_age):
  value_error_for_Int(fathers_age)
  value_error_for_Int(son_age)
  if son_age > fathers_age:
    raise ValueError  
  if son_age * 2 < fathers_age:
    return fathers_age - son_age * 2 
  else:
    return son_age * 2 - fathers_age


def average(first_number, second_number, third_number):
   sum = first_number + second_number + third_number
   return sum / 3


def letter_grade(score):
    if 90 <= score <= 100:
      return "A"
    elif 80 <= score < 90:
      return "B"
    elif 70 <= score < 80:
      return "C"
    elif 60 <= score < 70:
      return "D"
    elif 0 <= score < 60:
      return "F"
   

def task_two(first_number, second_number, third_number):
   value_error_for_Int(first_number)
   value_error_for_Int(second_number)
   value_error_for_Int(third_number)
   average_number = average(first_number, second_number, third_number)
   scores = letter_grade(average_number)
   return scores




def task_three(list_of_arrays):
  value_error_for_list(list_of_arrays)
  for elements in list_of_arrays:
   value_error_for_string(elements)
  if len(list_of_arrays) == 0:
    return "no one likes this"

  elif len(list_of_arrays) == 1:
    return list_of_arrays[0]+ " likes this" 
  
  elif len(list_of_arrays) == 2:
    return list_of_arrays[0]+ " and " + list_of_arrays[1]+ " likes this"
  else:
   line = ""
   for numbers in range(len(list_of_arrays)):
     if numbers == 2:
       break
     line = line + list_of_arrays[numbers] + ", "
   
  return line + "and " + str(len(list_of_arrays) - 2) + " others likes this"





def task_four(milesPerGallon ,numberOfGallonLeft,numberOfmilesAway):

 return numberOfGallonLeft * milesPerGallon >= numberOfmilesAway












