

public class App {
    public static void main(String[] args) throws Exception {
        // boolean test = 
        // System.out.println(xyBalance("bxyb"));
        // System.out.println(xyBalance("12xabxxydxyxyzz"));

        // System.out.println("Chocolate: " + repeatFront("Chocolate", 4));
        // System.out.println("Chocolate: " + repeatFront("xyz", 3));

        System.out.println("AAxyzBB: " + xyzMiddle("AAxyzBB"));
        System.out.println("AxyzBBB: " + xyzMiddle("AxyzBBB"));
        System.out.println("AxyzBBBB: " + xyzMiddle("AxyzBBBB"));
        System.out.println("AAAxyzB: " + xyzMiddle("AAAxyzB"));
        System.out.println("AAAAxyzBB: " + xyzMiddle("AAAAxyzBB"));
        System.out.println("AAAAAxyzBBB: " + xyzMiddle("AAAAAxyzBBB"));
        System.out.println("The next should be true unless noted otherwise");
        System.out.println("xyzAxyzBBB: " + xyzMiddle("xyzAxyzBBB"));
        System.out.println("xyzAxyzBxyz: " + xyzMiddle("xyzAxyzBxyz"));
        System.out.println("xyzxyzAxyzxyzxy: " + xyzMiddle("xyzxyzAxyzxyzxy") + " Should be false");
        System.out.println("xyzxyzxyzBxyzxyz: " + xyzMiddle("xyzxyzxyzBxyzxyz"));
        System.out.println("xyzxyzAxyzxyzxyz: " + xyzMiddle("xyzxyzAxyzxyzxyz"));
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

