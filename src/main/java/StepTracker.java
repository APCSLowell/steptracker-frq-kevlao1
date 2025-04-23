import java.util.ArrayList;
public class StepTracker
{
 private int minSteps, numDays, totalSteps, numActive;
 public StepTracker(int a){minSteps = a; numDays = 0; totalSteps = 0; numActive = 0;}
 public int activeDays(){return numActive;}
 public void addDailySteps(int a){
 totalSteps+=a; numDays++;
  if(a >= minSteps){numActive++;}
 }
 public double averageSteps(){
  if(numDays == 0){return 0;}
   else return ((double)totalSteps)/numDays;
 }
} 
