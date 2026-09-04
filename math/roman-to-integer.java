class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> value = new HashMap();

        value.put('I', 1);
        value.put('V', 5);
        value.put('X', 10);
        value.put('L', 50);
        value.put('C', 100);
        value.put('D', 500);
        value.put('M', 1000);

         int num = 0;

        for(int i = 0; i < s.length(); i++) {
            int current = value.get(s.charAt(i));
            if(i + 1 < s.length() && current < value.get(s.charAt(i + 1))) {
                num += (value.get(s.charAt(i + 1)) - current);
                i++;
            } else
                num += current;
        } 
    
        return num;

    }
    

}