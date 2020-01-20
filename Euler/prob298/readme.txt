This was a straight forward program for Java.

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
 
Varaibles in the Person class held the variables memory, which was a 2d array holding the numbers in memory and the turn that they were either introduced or the last time they were called. This makes the 'knows' function the main difference between the classes since it update the number of turns associated each number in memory. Amnesia finds the number that has the lowest turn number and replaces it.

Was a bit slow at 1,000,000,000 trails (37 minutes). Trials should be parallized for better performance because these trial can be done concurrently. 
