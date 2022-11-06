package leetcode.editor.en.p205_isomorphic_strings;

// P205_IsomorphicStrings

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, String> map1 = new HashMap<>();
        Map<Character, String> map2 = new HashMap<>();
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            map1.putIfAbsent(s.charAt(i), Integer.toString(i));
            a.append(map1.get(s.charAt(i))).append(map1.get(s.charAt(i)));
        }
        for (int i = 0; i < s.length(); i++) {
            map2.putIfAbsent(t.charAt(i), Integer.toString(i));
            b.append(map2.get(t.charAt(i))).append(map2.get(t.charAt(i)));
        }
        return a.compareTo(b) == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
