// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;
import java.util.Stack;

public class Undo {
   Stack<String> undoStack = new Stack();
   Stack<String> redoStack = new Stack();

   public Undo() {
   }

   public void action(String var1) {
      System.out.println("Action: " + var1);
      this.undoStack.push(var1);
      this.redoStack.clear();
      print(this.undoStack, this.redoStack);
   }

   public void undo() {
      if (this.undoStack.isEmpty()) {
         System.out.println("Nothing to undo.");
      } else {
         this.redoStack.push((String)this.undoStack.pop());
      }

      print(this.undoStack, this.redoStack);
   }

   public void redo() {
      if (this.redoStack.isEmpty()) {
         System.out.println("Nothing to redo.");
      } else {
         this.undoStack.push((String)this.redoStack.pop());
      }

      print(this.undoStack, this.redoStack);
   }

   public static void print(Stack<String> var0, Stack<String> var1) {
      System.out.print("Stack Undo: ");

      for(String var3 : var0) {
         System.out.print(var3 + " ");
      }

      System.out.println();
      System.out.print("Stack Redo: ");

      for(String var5 : var1) {
         System.out.print(var5 + " ");
      }

      System.out.println();
   }

   public static void main(String[] var0) {
      Undo var1 = new Undo();
      Scanner var2 = new Scanner(System.in);

      while(true) {
         System.out.println("---------------------------------");
         System.out.println("Ketikkan teks sebagai command.");
         System.out.println("Ketik U untuk melakukan Undo");
         System.out.println("Ketik R untuk melakukan Redo");
         System.out.println("Ketik X untuk mengakhiri program.");
         System.out.print("Command: ");
         String var3 = var2.nextLine();
         if (var3.equalsIgnoreCase("x")) {
            var2.close();
            System.out.println("Program selesai.");
            return;
         }

         if (var3.equalsIgnoreCase("u")) {
            var1.undo();
         } else if (var3.equalsIgnoreCase("r")) {
            var1.redo();
         } else {
            var1.action(var3);
         }
      }
   }
}
