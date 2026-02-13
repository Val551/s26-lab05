package frogger;


/**
* Refactor Task 1.
*
* @author Zishen Wen (F22), Deyuan Chen (S22)
*/
public class Road {
   private final boolean[] occupied;


   public Road(boolean[] occupied) {
       this.occupied = occupied;
   }


   public boolean isOccupied(int position) {
       boolean[] occupied = this.occupied;
       return occupied[position];
   }
  
   public boolean isValid(int position) {
       if (position < 0) return false;
       boolean[] occupied = this.occupied;
       return position < occupied.length;
   }
}



