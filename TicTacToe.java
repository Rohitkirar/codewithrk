package codewithrk;

import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

public class TicTacToe {

    static void print_board(char[][] g_board) {
        for (int i = 0; i < g_board.length; i++) {
            for (int j = 0; j < g_board.length; j++) {
                System.out.print(g_board[i][j]);
            }
            System.out.println();
        }
    }

    static int gen_random() {
        int max = 9;
        int min = 1;
        int range = max - min + 1;
        int result = (int) (Math.random() * range) + min;
        return result;
    }

    static HashSet<Integer> ur_set = new HashSet<>();
    static HashSet<Integer> comp_set = new HashSet<>();

    static void place_holder(char[][] g_board, int position_in_board, String user) {
        char symbol = 'X';
        if (user.equals("You")) {
            symbol = 'X';
            ur_set.add(position_in_board);
        } else if (user.equals("Comp")) {
            symbol = 'O';
            comp_set.add(position_in_board);
        } else {
            System.out.println("Invalid user!");
        }
        switch (position_in_board) {
            case 1:
                g_board[0][0] = symbol;
                break;
            case 2:
                g_board[0][2] = symbol;
                break;
            case 3:
                g_board[0][4] = symbol;
                break;
            case 4:
                g_board[2][0] = symbol;
                break;
            case 5:
                g_board[2][2] = symbol;
                break;
            case 6:
                g_board[2][4] = symbol;
                break;
            case 7:
                g_board[4][0] = symbol;
                break;
            case 8:
                g_board[4][2] = symbol;
                break;
            case 9:
                g_board[4][4] = symbol;
                break;
            default:
                System.out.println("Invalid input!");
        }
        System.out.println();
        print_board(g_board);
    }

    static String checking_winner() {
        HashSet<Integer> r1 = new HashSet<>();
        r1.add(1);
        r1.add(2);
        r1.add(3);
        HashSet<Integer> r2 = new HashSet<>();
        r2.add(4);
        r2.add(5);
        r2.add(6);
        HashSet<Integer> r3 = new HashSet<>();
        r3.add(7);
        r3.add(8);
        r3.add(9);
        HashSet<Integer> c1 = new HashSet<>();
        c1.add(1);
        c1.add(4);
        c1.add(7);
        HashSet<Integer> c2 = new HashSet<>();
        c2.add(2);
        c2.add(5);
        c2.add(8);
        HashSet<Integer> c3 = new HashSet<>();
        c3.add(3);
        c3.add(6);
        c3.add(9);
        HashSet<Integer> d1 = new HashSet<>();
        d1.add(1);
        d1.add(5);
        d1.add(9);
        HashSet<Integer> d2 = new HashSet<>();
        d2.add(3);
        d2.add(5);
        d2.add(7);
        HashSet<HashSet> check = new HashSet<>();
        check.add(r1);
        check.add(r2);
        check.add(r3);
        check.add(c1);
        check.add(c2);
        check.add(c3);
        check.add(d1);
        check.add(d2);
        for (HashSet I : check) {
            if (ur_set.containsAll(I))
                return "YOU WON";

            else if (comp_set.containsAll(I))
                return "YOU LOSE";
        }
        if (ur_set.size() + comp_set.size() == 9)
            return "ITS DRAW";

        return "";
    }

    public static void main(String[] args) {
        char[][] g_board = {
                { ' ', '|', ' ', '|', ' ' },
                { '-', '-', '-', '-', '-' },
                { ' ', '|', ' ', '|', ' ' },
                { '-', '-', '-', '-', '-' },
                { ' ', '|', ' ', '|', ' ' }
        };
        print_board(g_board);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter position from 1 to 9 to print X : ");
            int user_input = scan.nextInt();
            while (ur_set.contains(user_input) || comp_set.contains(user_input)) {
                System.out.println("Position already taken, Enter again : ");
                user_input = scan.nextInt();
            }
            place_holder(g_board, user_input, "You");
            int comp_input = gen_random();
            while (comp_set.contains(comp_input) || ur_set.contains(comp_input)) {
                comp_input = gen_random();
            }
            place_holder(g_board, comp_input, "Comp");
            String res = checking_winner();
            if (res.length() > 0) {
                System.out.println(res);
                break;
            }
        }
    }
}