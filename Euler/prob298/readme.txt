This should be a straight forward program for Java.

Psuedocode for main:

Begin

  init number_of_trials
  init score_diff = 0
  
  For i = 0 to number_of_trails:
      generate 50 random numbers
      init Larry_score = 0, Robin_score = 0
      For j = 1 to 50: 
          show number[j] to Larry and Robin
          
          if Larry knows number:
              Larry_score++
          else:
              Larry.Amnesia(number[j])
              
          if Robin knows number:
              Robin_score++
          else:
              Robin.Amnesia(number[j])
      
      End For
      score_diff = score_diff + abs(Robin_score - Larry_score)   
  End For
  
  Expected_val = score_diff/(50*number_of_trails)
  Return Expected_val
  
  From here, all that needs to be implemented is the person abstract class with
  an array of memory, methods for "knows" and "Amnesia".
