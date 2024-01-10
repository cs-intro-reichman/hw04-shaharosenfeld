public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        int[] test = allIndexOf("Hello worLd",'l');
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]);
        }
    }

    public static String capVowelsLowRest (String string) {
        String capVowel="";
        for (int i = 0; i < string.length(); i++)
        {
            if ((string.charAt(i) == 65) || (string.charAt(i) == 69) || (string.charAt(i) == 73) || (string.charAt(i) == 79) || (string.charAt(i) == 85)) {
                capVowel += (char)(string.charAt(i));
            }
            else if (string.charAt(i)>64 && string.charAt(i)<91) {
                capVowel += (char)(string.charAt(i)+32);
            }
            if ((string.charAt(i) == 97) || (string.charAt(i) == 101) || (string.charAt(i) == 105) || (string.charAt(i) == 111) || (string.charAt(i) == 117)) {
                capVowel += (char)(string.charAt(i)-32);
            }
            else if (string.charAt(i)>96 && string.charAt(i)<123) {
                capVowel += (char)(string.charAt(i));
            }  
            if ((string.charAt(i)>122) || (string.charAt(i)<97 && string.charAt(i)>90) || (string.charAt(i)<65)) {
                capVowel += (char)(string.charAt(i));
            } 
        }
        return capVowel;
    }

    public static String camelCase (String string) {
        String str = "";
        Boolean check = true;
        int startIndex = 0;
        while(check){
            if (string.charAt(startIndex) == 32) {
            startIndex++;
            }
            else{
                check = false;
            }
        }
        
        if (string.charAt(startIndex)>64 && string.charAt(startIndex)<91) {
            str += (char)(string.charAt(startIndex) + 32);
        }
        else
        {
            str += string.charAt(startIndex);
        }
        for (int i = startIndex+1; i < string.length(); i++) {
            if (string.charAt(i-1) == 32) {
                if (string.charAt(i)>96 && string.charAt(i)<123) {
                    str += (char)(string.charAt(i) - 32);
                }
                if (string.charAt(i)>64 && string.charAt(i)<91) {
                    str += (char)(string.charAt(i));
                }
            }
            else if(string.charAt(i) != 32){
                if (string.charAt(i)>96 && string.charAt(i)<123) {
                    str += string.charAt(i);
                }
                else{
                    str += (char)(string.charAt(i) + 32);
                }
            }
        }     
        
        return str;
    }

    public static int[] allIndexOf (String string, char chr) {
        int indexCounter = 0;
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)==chr) {
                indexCounter++;
            }
        }
        int[] indexOf = new int[indexCounter];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)==chr) {
                indexOf[j] = i;
                j++;
            }
        }


        return indexOf;
    }
}
