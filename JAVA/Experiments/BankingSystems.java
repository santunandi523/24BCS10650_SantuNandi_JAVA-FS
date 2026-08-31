// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      BankAccount var1 = new BankAccount("ACC-101", (double)500.0F);
      BankAccount var2 = new BankAccount("ACC-202", (double)200.0F);
      System.out.println("=== TEST 1: Successful Transfer ===");

      try {
         var1.transfer(var2, (double)150.0F);
         System.out.println("Acc1 Balance: $" + var1.getBalance());
         System.out.println("Acc2 Balance: $" + var2.getBalance());
      } catch (InsufficientFundsException var12) {
         System.out.println("Caught Expected Error: " + var12.getMessage());
      }

      System.out.println("\n=== TEST 2: Overdraft (Checked Exception) ===");

      try {
         var1.transfer(var2, (double)1000.0F);
      } catch (InsufficientFundsException var11) {
         System.out.println("Caught Checked Exception: " + var11.getMessage());
      }

      System.out.println("\n=== TEST 3: Negative Amount (Unchecked Exception) ===");

      try {
         var1.deposit((double)-50.0F);
      } catch (InvalidAmountException var9) {
         System.out.println("Caught Unchecked Exception: " + var9.getMessage());
      } finally {
         System.out.println("Cleanup / Always-executed code in main.");
      }

   }
}
