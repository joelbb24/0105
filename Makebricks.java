public class Makebricks {
    public boolean makeBricks(int small, int big, int goal) {
        if((big*5)<=goal)
        {
          if((goal-(big*5)) <= small)
            return true;
        }
        
        
        else if((goal - small) % 5 == 0)
          return true;
        
        else if((goal-small)%5 != 0)
            return false;
            
          
        else if((big*5) > goal)
        {
          int extra = (big*5) - goal;
          if(extra%5==0)
            return true;
          
          else if((goal - extra) < small)
            return true;
          
          else
            return false;
        }
        
        else
          return false;
          
        
        
        return false;
      }
      
}
