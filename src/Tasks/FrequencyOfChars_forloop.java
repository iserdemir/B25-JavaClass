package Tasks;

public class FrequencyOfChars_forloop {
    public static void main(String[] args) {
        String str = "aabccd";
        int num = 0;
        for (char a = 'a'; a <= 'z'; a++) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == a) {
                    num++;
                }
            }
            if (num > 0) {
                System.out.print(a + "" + num);
                num = 0;
            }
        }

    }
}


       /* String str = "aabccd";
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        for (int a = 0; a<str.length(); a++){
            char x = str.charAt(a);
            if (x == 'a'){
                num1++;
            } if (x == 'b'){
                num2++;
            } if (x == 'c'){
                num3++;
            } if (x == 'd'){
                num4++;
            }

        } System.out.println("a"+num1+"b"+num2+"c" + num3 +"d"+num4);
    }
}*/
