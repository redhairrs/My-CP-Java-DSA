package com.Rishabh;

import java.util.ArrayList;
import java.util.Arrays;

public class maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        ArrayList<String> ans = pathlist("",3,3);
//        System.out.println(ans);

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[3][3];
//        pathRestrictions("", board, 0, 0);
//      ArrayList<String> ans =   pathDiagonal("",3,3);
//      System.out.println(ans);
        printpath("",0,0,path,1);
    }
    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r-1, c);
        }

        if (c > 1) {
            path(p + 'R', r, c-1);
        }
    }

    static ArrayList<String> pathlist(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1) {
            ans.addAll(pathlist(p + 'D', r-1, c));
        }

        if (c > 1) {
            ans.addAll(pathlist(p + 'R', r, c-1));
        }
        return ans;
    }

    static void printpath(String p, int r, int c,int[][] path,int  step) {
        if (r == 2 && c == 2) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        path[r][c] = step;

        if (r<2) {
            printpath(p + 'D', r+1, c,path,step+1);
        }

        if (c<2) {
            printpath(p + 'R', r, c+1,path,step+1);
        }
        path[r][c] = 0;
    }

    static ArrayList<String> pathDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1){
            //Angled (diagonal)
           list.addAll(pathDiagonal(p+"A", r-1,c-1));
        }
        if (r > 1) {
            list.addAll(pathDiagonal(p + 'D', r-1, c));
        }

        if (c > 1) {
           list.addAll(pathDiagonal(p + 'R', r, c-1));
        }
        return list;
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c+1);
        }
    }
}
