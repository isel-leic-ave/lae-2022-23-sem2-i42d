Compiled from "BoxUnboxBenchmark.java"
public class pt.isel.leic.lae.BoxUnboxBenchmark {
  public pt.isel.leic.lae.BoxUnboxBenchmark();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return
    LineNumberTable:
      line 13: 0
    LocalVariableTable:
      Start  Length  Slot  Name   Signature
          0       5     0  this   Lpt/isel/leic/lae/BoxUnboxBenchmark;

  public void primitiveArray();
    Code:
       0: sipush        1000
       3: newarray       int
       5: astore_1
       6: iconst_0
       7: istore_2
       8: iload_2
       9: aload_1
      10: arraylength
      11: if_icmpge     24
      14: aload_1
      15: iload_2
      16: iload_2
      17: iastore
      18: iinc          2, 1
      21: goto          8
      24: return
    LineNumberTable:
      line 18: 0
      line 19: 6
      line 20: 14
      line 19: 18
      line 22: 24
    LocalVariableTable:
      Start  Length  Slot  Name   Signature
          8      16     2     i   I
          0      25     0  this   Lpt/isel/leic/lae/BoxUnboxBenchmark;
          6      19     1 intValues   [I

  public void boxedArray();
    Code:
       0: sipush        1000
       3: anewarray     #7                  // class java/lang/Integer
       6: astore_1
       7: iconst_0
       8: istore_2
       9: iload_2
      10: aload_1
      11: arraylength
      12: if_icmpge     28
      15: aload_1
      16: iload_2
      17: iload_2
      18: invokestatic  #9                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      21: aastore
      22: iinc          2, 1
      25: goto          9
      28: return
    LineNumberTable:
      line 26: 0
      line 27: 7
      line 28: 15
      line 27: 22
      line 31: 28
    LocalVariableTable:
      Start  Length  Slot  Name   Signature
          9      19     2     i   I
          0      29     0  this   Lpt/isel/leic/lae/BoxUnboxBenchmark;
          7      22     1 intValues   [Ljava/lang/Integer;
}
