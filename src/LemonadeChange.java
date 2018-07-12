public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        if (bills == null || bills.length == 0) {
            return false;
        }
        int tmp[] = new int[]{0, 0};
        for (int bill : bills) {
           if (bill == 5) {
               tmp[0]++;
           } else if (bill == 10) {
               if (tmp[0] == 0) {
                   return false;
               } else {
                   tmp[0]--;
                   tmp[1]++;
               }
           } else {
               if (tmp[1] == 0) {
                  if (tmp[0] < 3) {
                      return false;
                  } else {
                      tmp[0] -= 3;
                  }
               } else {
                   if (tmp[0] == 0) {
                       return false;
                   } else {
                       tmp[1]--;
                       tmp[0]--;
                   }
               }
           }
        }
        return true;
    }
}
