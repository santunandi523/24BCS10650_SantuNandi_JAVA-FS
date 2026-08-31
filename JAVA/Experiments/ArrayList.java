// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      ArrayList var2 = new ArrayList();
      LinkedList var3 = new LinkedList();

      for(int var4 = 0; var4 < 3; ++var4) {
         var2.add(new ArrayList());

         for(int var5 = 0; var5 < 3; ++var5) {
            ((ArrayList)var2.get(var4)).add(var1.nextInt());
         }
      }

      for(int var7 = 0; var7 < var2.size(); ++var7) {
         for(int var8 = 0; var8 < ((ArrayList)var2.get(var7)).size(); ++var8) {
            int var6 = (Integer)((ArrayList)var2.get(var7)).get(var8);
            if (var6 < 5) {
               var3.add(var6 * 2);
            }
         }
      }

      System.out.println(var2);
      System.out.println(var3);
   }
}
