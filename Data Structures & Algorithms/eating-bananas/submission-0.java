class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l = 1, r = 0;

        for(int i = 0;i<piles.length;i++){
            r = Math.max(r, piles[i]);
        }

        while(l<r){
            int mid = l + (r-l)/2;
            long hours = 0;

            for(int pile:piles){
                hours+= (pile + mid-1)/mid;
            }

            if(hours<=h){
                r = mid;
            }
            else
                l = mid + 1;
        }

        return l;
    }
}
