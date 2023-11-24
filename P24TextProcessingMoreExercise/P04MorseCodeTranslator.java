package P24TextProcessingMoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> message = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < message.size(); i++) {

            String name = message.get(i);

            if (name.equals("|")) {
                sb.append(" ");

            }else if(name.equals(".-")) {
                sb.append("A");

            } else if (name.equals("-...")) {
                sb.append("B");

            } else if (name.equals("-.-.")) {
                sb.append("C");

            } else if (name.equals("-..")) {
                sb.append("D");

            } else if (name.equals(".")) {
                sb.append("E");

            } else if (name.equals("..-.")) {
                sb.append("F");

            } else if (name.equals("--.")) {
                sb.append("G");

            } else if (name.equals("....")) {
                sb.append("H");

            } else if (name.equals("..")) {
                sb.append("I");

            } else if (name.equals(".---")) {
                sb.append("J");

            } else if (name.equals("-.-")) {
                sb.append("K");

            } else if (name.equals(".-..")) {
                sb.append("L");

            } else if (name.equals("--")) {
                sb.append("M");
            } else if (name.equals("-.")) {
                sb.append("N");

            } else if (name.equals("---")) {
                sb.append("O");

            } else if (name.equals(".--.")) {
                sb.append("P");

            } else if (name.equals("--.-")) {
                sb.append("Q");

            } else if (name.equals(".-.")) {
                sb.append("R");

            } else if (name.equals("...")) {
                sb.append("S");

            }  else if (name.equals("-")) {
                sb.append("T");

            } else if (name.equals("..-")) {
                sb.append("U");

            }  else if (name.equals("...-")) {
                sb.append("V");

            } else if (name.equals(".--")) {
                sb.append("W");

            }  else if (name.equals("-..-")) {
                sb.append("X");

            } else if (name.equals("-.--")) {
                sb.append("Y");

            } else if (name.equals("--..")) {
                sb.append("Z");

            } else if (name.equals("-----")) {
                sb.append("0");

            } else if (name.equals(".----")) {
                sb.append("1");

            } else if (name.equals("..---")) {
                sb.append("2");

            } else if (name.equals("...--")) {
                sb.append("3");

            } else if (name.equals("....-")) {
                sb.append("4");

            } else if (name.equals(".....")) {
                sb.append("5");

            } else if (name.equals("-....")) {
                sb.append("6");

            } else if (name.equals("--...")) {
                sb.append("7");

            } else if (name.equals("---..")) {
                sb.append("8");

            } else if (name.equals("----.")) {
                sb.append("9");

            } else if (name.equals(".-...")) {
                sb.append("&");

            } else if (name.equals(".----.")) {
                sb.append("'");

            } else if (name.equals(".--.-.")) {
                sb.append("@");

            } else if (name.equals("-.--.-")) {
                sb.append(")");

            } else if (name.equals("-.--.")) {
                sb.append(")");

            } else if (name.equals("---...")) {
                sb.append(":");

            } else if (name.equals("--..--")) {
                sb.append(",");

            } else if (name.equals("-...-")) {
                sb.append("=");

            } else if (name.equals("-.-.--")) {
                sb.append("!");

            } else if (name.equals(".-.-.-")) {
                sb.append(".");

            } else if (name.equals("-....-")) {
                sb.append("-");

            } else if (name.equals("-..------")) {
                sb.append("*");

            } else if (name.equals("-..-.")) {
                sb.append("%");

            } else if (name.equals(".-.-.")) {
                sb.append("+");

            } else if (name.equals(".-..-.")) {
                sb.append("\"");

            } else if (name.equals("..--..")) {
                sb.append("?");

            } else if (name.equals("-..-..")) {
                sb.append("\\/");

            }

        }



        System.out.println(sb);


    }
}
