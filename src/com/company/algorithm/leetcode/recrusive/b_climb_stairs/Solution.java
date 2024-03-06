package com.company.algorithm.leetcode.recrusive.b_climb_stairs;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int climbStairs(int n) {

        Map<Integer,Integer> map = new HashMap<>();

        if( n == 1) return 1;
        if( n == 2 ) return 2;
        if(map.get(n) != null){
            return map.get(n);
        }else{
            int result = climbStairs( n-1) + climbStairs( n-2);
            map.put(n,result);
            return result;
        }

    }
}