
new_list = []

def main_menu():
 menu = """

 Welcome to your grocery store :)
     what are we doing today

 1-> Add item
 2-> Remove
 3-> Show Avaliable item

 """
 print(menu)
 userInput = int(input("Enter a number: "))
 match userInput:
   case 1:
          add_input = input("what do u want to add: ")
          add_item(add_input)
   case 2:
          removeInput = input("what do u want to Remove: ")
          remove_item(removeInput)
   case 3:
          Show_items()
 
def value_error_for_string(element):
   if type(element) != str:
      raise ValueError


def add_item(item):
  value_error_for_string(item)
  new_list.append(item)
  print(f"{item} added sucsessfully")
  user_input = int(input("press 0 to go to main menu\npress 1 to exit "))
 
  match user_input:
    case 0:
           main_menu()
    case 1: 
           print("Goodbye")
  return new_list

def remove_item(item):
  if not any(item.lower() == elements.lower() for elements in new_list): 
    raise ValueError
  value_error_for_string(item)
  new_list.remove(item)
  print(f"{item} added sucsessfully")
  userInput = int(input("press 0 to go to main menu "))
  if userInput == 0:
        main_menu()

  return new_list

def Show_items():
   print("Your Available items are...")
   print()
   for numbers in range(len(new_list)):
      print(numbers + 1 ," ",new_list[numbers])
   userInput = int(input("press 0 to go to main menu"))
   if userInput == 0:
        main_menu()

main_menu()








