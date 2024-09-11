

public class App {
    public static void main(String[] args) throws Exception {
/*
        // boolean test = 
        // System.out.println(xyBalance("bxyb"));
        // System.out.println(xyBalance("12xabxxydxyxyzz"));

        // System.out.println("Chocolate: " + repeatFront("Chocolate", 4));
        // System.out.println("Chocolate: " + repeatFront("xyz", 3));

        // System.out.println("AAxyzBB: " + xyzMiddle("AAxyzBB"));
        // System.out.println("AxyzBBB: " + xyzMiddle("AxyzBBB"));
        // System.out.println("AxyzBBBB: " + xyzMiddle("AxyzBBBB"));
        // System.out.println("AAAxyzB: " + xyzMiddle("AAAxyzB"));
        // System.out.println("AAAAxyzBB: " + xyzMiddle("AAAAxyzBB"));
        // System.out.println("AAAAAxyzBBB: " + xyzMiddle("AAAAAxyzBBB"));
        // System.out.println("The next should be true unless noted otherwise");
        // System.out.println("xyzAxyzBBB: " + xyzMiddle("xyzAxyzBBB"));
        // System.out.println("xyzAxyzBxyz: " + xyzMiddle("xyzAxyzBxyz"));
        // System.out.println("xyzxyzAxyzxyzxy: " + xyzMiddle("xyzxyzAxyzxyzxy") + " Should be false");
        // System.out.println("xyzxyzxyzBxyzxyz: " + xyzMiddle("xyzxyzxyzBxyzxyz"));
        // System.out.println("xyzxyzAxyzxyzxyz: " + xyzMiddle("xyzxyzAxyzxyzxyz"));
        
        // System.out.println(oneTwo("abc"));
        // System.out.println(oneTwo("tca"));
        // System.out.println(oneTwo("tcagdo"));

        // System.out.println(plusOut("12xy34", "xy"));
        // System.out.println(plusOut("12xy34", "1"));
        // System.out.println(plusOut("12xy34xyabczy", "xy"));

        // System.out.println(bunnyEars(0));
        // System.out.println(bunnyEars(1));
        // System.out.println(bunnyEars(2));
*/
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
    }

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        } else {
            return fibonacci(n - 1) + n;
        }
    }

    public static int bunnyEars(int bunnies) {
        System.out.println("bunnies In: " + bunnies);
        if(bunnies == 0){
            return 0;
        } else {
           return 2 + bunnyEars(bunnies - 1);
        }
    }

    public static String plusOut(String str, String word){
        StringBuilder res = new StringBuilder();
        int wordLength = word.length();
        int i = 0;

        while (i < str.length()) {
            if (i <= str.length() - wordLength && str.substring(i, i + wordLength).equals(word)) {
                res.append(word);
                i += wordLength;
            } else {
                res.append('+');
                i++;
            }
        }
        return res.toString();
    }

    public static String oneTwo(String str){
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i + 2 < str.length(); i += 3) {
            res.append(str.charAt(i + 1))
                  .append(str.charAt(i + 2))
                  .append(str.charAt(i));
        }
        
        return res.toString();
    }

    public static boolean xyzMiddle(String str) {
        boolean res = false;
        int half = str.length() / 2;

        if(str.contains("xyz")){
            if(str.length() % 2 == 0){
                if(str.substring(half - 1, half + 2).equals("xyz") || str.substring(half - 2, half + 1).equals("xyz")){
                    res = true;
                }
            } else {
                if(str.substring(half -1, half + 2).equals("xyz")){
                    res = true;
                }
            }
        }
        return res;
    }

    public static String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ss = new StringBuilder(str);
        String temp;
        
        if(ss.length() != n){
            for(int i = 0; i < ss.length(); i++){    
                if(i == 0 && n == 0){
                  return "";
                }
                
                temp = ss.substring(0, n);
                ss.delete(n + 1, ss.length() - 1);
                sb.append(temp);
                n--;
            }
        } else {
            for(int i = 0; i < str.length(); i++){
                if(n == 0){
                  sb.append(ss.substring(0, 1));
                } else {
                  sb.append(ss.substring(0, n));
                }
                n--;
            }
        }
        
        return sb.toString();
    }

    public static boolean xyBalance(String str) {
        boolean res = false;

        if(!str.contains("x")){
            res = true;
          } else {
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == 'x'){
                  for(int j = i; j < str.length(); j++){
                    System.out.println(str.substring(j));
                    if(str.substring(j).contains("y")){
                        System.out.println("Here sb[j] contains y");
                        System.out.println(str.substring(j));
                        res = true;
                        if(!str.substring(j).contains("x")){
                            break;
                        }
                    } else {
                      res = false;
                    }
                  }
                }
              }
          }
        return res;
    }
}

