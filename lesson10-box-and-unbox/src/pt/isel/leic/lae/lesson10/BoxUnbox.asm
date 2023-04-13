Compiled from "BoxUnbox.java"
public class BoxUnbox {
  public BoxUnbox();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: bipush        10
       2: istore_1
       3: bipush        20
       5: invokestatic  #7                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       8: astore_2
       9: aload_2
      10: astore_3
      11: iload_1
      12: invokestatic  #7                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      15: astore_2
      16: aload_2
      17: invokevirtual #13                 // Method java/lang/Integer.intValue:()I
      20: istore_1
      21: iload_1
      22: invokestatic  #17                 // Method m:(I)V
      25: iload_1
      26: invokestatic  #7                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      29: invokestatic  #23                 // Method m1:(Ljava/lang/Integer;)V
      32: aload_2
      33: invokevirtual #13                 // Method java/lang/Integer.intValue:()I
      36: invokestatic  #17                 // Method m:(I)V
      39: aload_2
      40: invokestatic  #23                 // Method m1:(Ljava/lang/Integer;)V
      43: return

  static void m(int);
    Code:
       0: return

  static void m1(java.lang.Integer);
    Code:
       0: return
}
