public class SmallestLetter744 {
/*
 Solution Link
    https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1265183121/

   */
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < letters[mid]){
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        //condition violated , so we shld return first letter as letters wrap around, so we need to get 0 index,
        // so i.e. got by start % length or array
        return letters[start % letters.length];
    }


}
