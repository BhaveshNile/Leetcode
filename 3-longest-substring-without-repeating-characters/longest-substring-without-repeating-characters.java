class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> counts = new HashMap<>();

        int leftIdx = 0;
        int rightIdx = 0;
        int maxLen = 0;

        while (rightIdx < s.length()) {
            char currentChar = s.charAt(rightIdx);

            counts.put(
                currentChar,
                counts.getOrDefault(currentChar, 0) + 1
            );

            while (counts.get(currentChar) > 1) {
                char charAtLeft = s.charAt(leftIdx);

                counts.put(
                    charAtLeft,
                    counts.get(charAtLeft) - 1
                );

                leftIdx++;
            }

            maxLen = Math.max(
                maxLen,
                rightIdx - leftIdx + 1
            );

            rightIdx++;
        }

        return maxLen;
    }
}