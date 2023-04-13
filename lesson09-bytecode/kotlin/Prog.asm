Classfile /Users/luisfalcao/Library/CloudStorage/OneDrive-InstitutoSuperiordeEngenhariadeLisboa/ISEL/Disciplinas/2022_2023/2022-2023VerLAE/Repositories/lae-2022-23-sem2-i42d-LF/lesson09-bytecode-and-box/01-bytecode/ProgKt.class
  Last modified Mar 29, 2023; size 1475 bytes
  SHA-256 checksum 84e77f8fc5f2ec3076689a119d4d81b89ec81ec64567336471add5f977940291
  Compiled from "prog.kt"
public final class ProgKt
  minor version: 0
  major version: 52
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ProgKt
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 4, attributes: 2
Constant pool:
   #1 = Utf8               ProgKt
   #2 = Class              #1             // ProgKt
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               foo
   #6 = Utf8               (II)I
   #7 = Utf8               c
   #8 = Utf8               I
   #9 = Utf8               a
  #10 = Utf8               b
  #11 = Utf8               or
  #12 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #13 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #14 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #15 = Utf8               alt
  #16 = String             #15            // alt
  #17 = Utf8               kotlin/jvm/internal/Intrinsics
  #18 = Class              #17            // kotlin/jvm/internal/Intrinsics
  #19 = Utf8               checkNotNullParameter
  #20 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
  #21 = NameAndType        #19:#20        // checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
  #22 = Methodref          #18.#21        // kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
  #23 = Utf8               $this$or
  #24 = Utf8               Ljava/lang/String;
  #25 = Utf8               java/lang/String
  #26 = Class              #25            // java/lang/String
  #27 = Utf8               main
  #28 = Utf8               ()V
  #29 = NameAndType        #5:#6          // foo:(II)I
  #30 = Methodref          #2.#29         // ProgKt.foo:(II)I
  #31 = Utf8               java/lang/System
  #32 = Class              #31            // java/lang/System
  #33 = Utf8               out
  #34 = Utf8               Ljava/io/PrintStream;
  #35 = NameAndType        #33:#34        // out:Ljava/io/PrintStream;
  #36 = Fieldref           #32.#35        // java/lang/System.out:Ljava/io/PrintStream;
  #37 = Utf8               java/io/PrintStream
  #38 = Class              #37            // java/io/PrintStream
  #39 = Utf8               println
  #40 = Utf8               (I)V
  #41 = NameAndType        #39:#40        // println:(I)V
  #42 = Methodref          #38.#41        // java/io/PrintStream.println:(I)V
  #43 = Utf8               ISEL
  #44 = String             #43            // ISEL
  #45 = NameAndType        #11:#12        // or:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #46 = Methodref          #2.#45         // ProgKt.or:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #47 = Utf8               (Ljava/lang/Object;)V
  #48 = NameAndType        #39:#47        // println:(Ljava/lang/Object;)V
  #49 = Methodref          #38.#48        // java/io/PrintStream.println:(Ljava/lang/Object;)V
  #50 = Utf8               str
  #51 = Utf8               ([Ljava/lang/String;)V
  #52 = NameAndType        #27:#28        // main:()V
  #53 = Methodref          #2.#52         // ProgKt.main:()V
  #54 = Utf8               args
  #55 = Utf8               [Ljava/lang/String;
  #56 = Utf8               Lkotlin/Metadata;
  #57 = Utf8               mv
  #58 = Integer            1
  #59 = Integer            8
  #60 = Integer            0
  #61 = Utf8               k
  #62 = Integer            2
  #63 = Utf8               xi
  #64 = Integer            48
  #65 = Utf8               d1
  #66 = Utf8               \u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007
  #67 = Utf8               d2
  #68 = Utf8
  #69 = Utf8               prog.kt
  #70 = Utf8               Code
  #71 = Utf8               LineNumberTable
  #72 = Utf8               LocalVariableTable
  #73 = Utf8               StackMapTable
  #74 = Utf8               RuntimeInvisibleAnnotations
  #75 = Utf8               RuntimeInvisibleParameterAnnotations
  #76 = Utf8               SourceFile
  #77 = Utf8               RuntimeVisibleAnnotations
{
  public static final int foo(int, int);
    descriptor: (II)I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: iconst_0
         1: istore_2
         2: iload_2
         3: iload_0
         4: iadd
         5: istore_2
         6: iload_2
         7: iload_1
         8: iadd
         9: istore_2
        10: iload_2
        11: ireturn
      LineNumberTable:
        line 2: 0
        line 3: 2
        line 4: 6
        line 5: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            2      10     2     c   I
            0      12     0     a   I
            0      12     1     b   I

  public static final java.lang.String or(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ldc           #16                 // String alt
         3: invokestatic  #22                 // Method kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
         6: aload_0
         7: dup
         8: ifnonnull     13
        11: pop
        12: aload_1
        13: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
      LineNumberTable:
        line 9: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0 $this$or   Ljava/lang/String;
            0      14     1   alt   Ljava/lang/String;
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #14()
          org.jetbrains.annotations.Nullable
      parameter 1:
        0: #13()
          org.jetbrains.annotations.NotNull

  public static final void main();
    descriptor: ()V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=0
         0: iconst_3
         1: iconst_4
         2: invokestatic  #30                 // Method foo:(II)I
         5: istore_0
         6: getstatic     #36                 // Field java/lang/System.out:Ljava/io/PrintStream;
         9: iload_0
        10: invokevirtual #42                 // Method java/io/PrintStream.println:(I)V
        13: iconst_5
        14: bipush        6
        16: invokestatic  #30                 // Method foo:(II)I
        19: istore_0
        20: getstatic     #36                 // Field java/lang/System.out:Ljava/io/PrintStream;
        23: iload_0
        24: invokevirtual #42                 // Method java/io/PrintStream.println:(I)V
        27: aconst_null
        28: astore_0
        29: aload_0
        30: ldc           #44                 // String ISEL
        32: invokestatic  #46                 // Method or:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        35: getstatic     #36                 // Field java/lang/System.out:Ljava/io/PrintStream;
        38: swap
        39: invokevirtual #49                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
        42: return
      LineNumberTable:
        line 13: 0
        line 14: 13
        line 16: 27
        line 17: 29
        line 18: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      14     0   str   Ljava/lang/String;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=0, locals=1, args_size=1
         0: invokestatic  #53                 // Method main:()V
         3: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  args   [Ljava/lang/String;
}
SourceFile: "prog.kt"
RuntimeVisibleAnnotations:
  0: #56(#57=[I#58,I#59,I#60],#61=I#62,#63=I#64,#65=[s#66],#67=[s#5,s#68,s#9,s#10,s#27,s#68,s#11,s#68,s#15])
    kotlin.Metadata(
      mv=[1,8,0]
      k=2
      xi=48
      d1=["\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007"]
      d2=["foo","","a","b","main","","or","","alt"]
    )
