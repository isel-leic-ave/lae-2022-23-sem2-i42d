Compiled from "prog.kt"
public final class ProgKt {
  public static final int sum(int, java.lang.Integer);
    Code:
       0: iload_0
       1: aload_1
       2: dup
       3: ifnull        12
       6: invokevirtual #13                 // Method java/lang/Integer.intValue:()I
       9: goto          14
      12: pop
      13: iconst_0
      14: iadd
      15: ireturn

  public static final java.lang.Integer xsum(int, java.lang.Integer);
    Code:
       0: aload_1
       1: ifnonnull     8
       4: aconst_null
       5: goto          17
       8: iload_0
       9: aload_1
      10: invokevirtual #13                 // Method java/lang/Integer.intValue:()I
      13: iadd
      14: invokestatic  #23                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      17: areturn

  public static final void showStudent(Student);
    Code:
       0: aload_0
       1: ldc           #28                 // String s
       3: invokestatic  #34                 // Method kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
       6: getstatic     #40                 // Field java/lang/System.out:Ljava/io/PrintStream;
       9: aload_0
      10: invokevirtual #46                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      13: return

  public static final void main();
    Code:
       0: iconst_3
       1: iconst_4
       2: invokestatic  #23                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       5: invokestatic  #51                 // Method sum:(ILjava/lang/Integer;)I
       8: istore_0
       9: getstatic     #40                 // Field java/lang/System.out:Ljava/io/PrintStream;
      12: iload_0
      13: invokevirtual #54                 // Method java/io/PrintStream.println:(I)V
      16: bipush        8
      18: aconst_null
      19: invokestatic  #51                 // Method sum:(ILjava/lang/Integer;)I
      22: istore_0
      23: getstatic     #40                 // Field java/lang/System.out:Ljava/io/PrintStream;
      26: iload_0
      27: invokevirtual #54                 // Method java/io/PrintStream.println:(I)V
      30: iconst_3
      31: iconst_4
      32: invokestatic  #23                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      35: invokestatic  #56                 // Method xsum:(ILjava/lang/Integer;)Ljava/lang/Integer;
      38: getstatic     #40                 // Field java/lang/System.out:Ljava/io/PrintStream;
      41: swap
      42: invokevirtual #46                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      45: bipush        8
      47: aconst_null
      48: invokestatic  #56                 // Method xsum:(ILjava/lang/Integer;)Ljava/lang/Integer;
      51: getstatic     #40                 // Field java/lang/System.out:Ljava/io/PrintStream;
      54: swap
      55: invokevirtual #46                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      58: new           #58                 // class Student
      61: dup
      62: iconst_2
      63: ldc           #60                 // String Bah
      65: invokespecial #64                 // Method Student."<init>":(ILjava/lang/String;)V
      68: astore_0
      69: aload_0
      70: invokestatic  #66                 // Method showStudent:(LStudent;)V
      73: return

  public static void main(java.lang.String[]);
    Code:
       0: invokestatic  #69                 // Method main:()V
       3: return
}
