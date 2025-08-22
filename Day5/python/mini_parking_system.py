new_list = []
for numbers in range(1,21):
  new_list.append(0)




def main_menu():
    menu_input = int(input("""

    Welcome to our parking space
    press -->
    1-> Book a space
    2-> Remove Space
    3-> exit
    """))
    position_of_spaces(new_list)
    match (menu_input):
      case 1: promptAddSpace()
      case 2: prompt_remove_space()
      case 3: print("GoodBye fam")

    









def promptAddSpace():
      print(number_of_spaces(new_list))
      add_input = int(input("Enter Number you want to occupy "))
      print(add_spaces(add_input))
      back_input = int(input("""
          press -->
        1-> Back to main Menu
        2-> Check available spaces
        3-> exit
        """))
      match(back_input):
       case 1: main_menu()
       case 2: 
               print (number_of_spaces(new_list))
               back_input = int(input("Press 1 for main Menu or 0 to exit"))
               match (back_input):
                  case 1: main_menu()
                  case 0: print("GoodBye fam")
       case 3: print("Bye for now")

















def prompt_remove_space():

    remove_input = int(input("Enter the space u want to remove"))
    print(remove_spaces(remove_input))
    back_input = int(input("""
     press -->
    1-> Back to main Menu
    2-> Check available spaces
    3-> exit
    """))
    match(back_input):
       case 1: main_menu()
       case 2: 
               print (number_of_spaces(new_list))
               back_input = int(input("Press 1 for main Menu or 0 to exit"))
               match (back_input):
                  case 1: main_menu()
                  case 0: print("GoodBye fam")
       case 3: print("Bye for now")
















def value_error_for_int(element):
   if type(element) != int:
     raise ValueError

def value_error_for_length_greater_than_20(element):
    if element > 20:
      raise ValueError


def value_error_for_list(element):
    if type(element) != list:
      raise ValueError




def remove_spaces(index_of_space):
    value_error_for_int(index_of_space)
    value_error_for_length_greater_than_20(index_of_space)
    new_list[index_of_space] = 0
    return "Removed Successfully!!"

def add_spaces(index_of_space):
  value_error_for_int(index_of_space)
  value_error_for_length_greater_than_20(index_of_space)
  if new_list[index_of_space] == 0:
     new_list[index_of_space] = 1
  else:
      return "The space is already occupied"

  return "Congrats you can go ahead"



def position_of_spaces(new_array):
  print("The available spaces are: \nspace:")
  count = 0
  for spaces in new_array:
     if spaces == 0:
      count+=1
      print(count,end=" ")


def number_of_spaces(new_array):
   value_error_for_list(new_array)
   for element in new_array:
    if type(element) != int:
       raise ValueError 
   
   count = 0
   for number in range(len(new_array)):
      if(new_array[number] == 0):
         count+=1
   if count == 0:
       return "There is no space"
    
   return "There are "+ str(count)+" spaces left"

    



main_menu()




