public class ExerciseStringBuilder {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder("Cats live");

        sb.setCharAt(0, 'r');
        // or
        // sb.replace(0, 1, "r");
        // but setCharAt is probably more efficient
        sb.append(" on ");
        
        System.out.println(sb);
        System.out.println();
        // System.out.println("sb: " + sb.toString() + sb.reverse());

         StringBuilder temp = new StringBuilder(sb);
         sb.append(temp.reverse());
         System.out.println("sb: " + sb);

         int doubleSpace = sb.indexOf("  ");

         sb.deleteCharAt(doubleSpace);
         sb.append(".").setCharAt(0, 'C');

         System.out.println("sb: " + sb);
    }
}
