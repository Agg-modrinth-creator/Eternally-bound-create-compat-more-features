/*    */ package dev.enjarai.collared.net;
/*    */ 
/*    */ import net.minecraft.class_243;
/*    */ 
/*    */ public final class YankPacket extends Record {
/*    */   private final class_243 to;
/*    */   
/*  8 */   public YankPacket(class_243 to) { this.to = to; } public final String toString() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> toString : (Ldev/enjarai/collared/net/YankPacket;)Ljava/lang/String;
/*    */     //   6: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*  8 */     //   0	7	0	this	Ldev/enjarai/collared/net/YankPacket; } public class_243 to() { return this.to; }
/*    */   public final int hashCode() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> hashCode : (Ldev/enjarai/collared/net/YankPacket;)I
/*    */     //   6: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Ldev/enjarai/collared/net/YankPacket; } public final boolean equals(Object o) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: <illegal opcode> equals : (Ldev/enjarai/collared/net/YankPacket;Ljava/lang/Object;)Z
/*    */     //   7: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	8	0	this	Ldev/enjarai/collared/net/YankPacket;
/*  9 */     //   0	8	1	o	Ljava/lang/Object; } public static final StructEndec<YankPacket> ENDEC = StructEndecBuilder.of(MinecraftEndecs.VEC3D
/* 10 */       .fieldOf("to", YankPacket::to), YankPacket::new);
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\net\YankPacket.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */