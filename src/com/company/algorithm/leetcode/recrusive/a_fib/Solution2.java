package com.company.algorithm.leetcode.recrusive.a_fib;

import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int fib(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        return dp(map,n);
    }

    public int dp(Map<Integer,Integer> map, int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(map.get(n) != null){
            return map.get(n);
        }else{
            int result = dp(map,n - 1) + dp(map,n - 2);
            map.put(n,result);
            return result;
        }

    }
}