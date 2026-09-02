// LeetCode 735. Asteroid Collision
// https://leetcode.com/problems/asteroid-collision/description/

import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int curr: asteroids){
            boolean isAlive = true;

            while(!stack.isEmpty() && stack.peek() > 0 && curr < 0){
                int top = stack.peek();

                if(top < -curr){
                    stack.pop();
                }

                else if(top == -curr){
                    stack.pop();
                    isAlive = false;
                    break;
                }

                else{
                    isAlive = false;
                    break;
                }
            }

            if(isAlive){
                stack.push(curr);
            }

        }

        int ans[] = new int[stack.size()];

        for(int i = 0; i < stack.size(); i++){
            ans[i] = stack.get(i);
        }

        return ans;

    }
}