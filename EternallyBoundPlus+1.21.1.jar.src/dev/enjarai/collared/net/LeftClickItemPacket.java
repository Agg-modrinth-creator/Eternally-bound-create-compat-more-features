/*    */ package dev.enjarai.collared.net;
/*    */ 
/*    */ import net.minecraft.class_1268;
/*    */ import net.minecraft.class_3222;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public final class LeftClickItemPacket extends Record {
/*    */   private final class_1268 hand;
/*    */   @Nullable
/*    */   private final class_243 pos;
/*    */   @Nullable
/*    */   private final Integer entityId;
/*    */   
/* 14 */   public LeftClickItemPacket(class_1268 hand, @Nullable class_243 pos, @Nullable Integer entityId) { this.hand = hand; this.pos = pos; this.entityId = entityId; } public final String toString() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> toString : (Ldev/enjarai/collared/net/LeftClickItemPacket;)Ljava/lang/String;
/*    */     //   6: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/* 14 */     //   0	7	0	this	Ldev/enjarai/collared/net/LeftClickItemPacket; } public class_1268 hand() { return this.hand; } public final int hashCode() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> hashCode : (Ldev/enjarai/collared/net/LeftClickItemPacket;)I
/*    */     //   6: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Ldev/enjarai/collared/net/LeftClickItemPacket; } public final boolean equals(Object o) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: <illegal opcode> equals : (Ldev/enjarai/collared/net/LeftClickItemPacket;Ljava/lang/Object;)Z
/*    */     //   7: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	8	0	this	Ldev/enjarai/collared/net/LeftClickItemPacket;
/* 14 */     //   0	8	1	o	Ljava/lang/Object; } @Nullable public class_243 pos() { return this.pos; } @Nullable public Integer entityId() { return this.entityId; }
/* 15 */    public static final StructEndec<LeftClickItemPacket> ENDEC = StructEndecBuilder.of(
/* 16 */       Endec.forEnum(class_1268.class).fieldOf("hand", LeftClickItemPacket::hand), MinecraftEndecs.VEC3D
/* 17 */       .nullableOf().fieldOf("pos", LeftClickItemPacket::pos), Endec.INT
/* 18 */       .nullableOf().fieldOf("entityId", LeftClickItemPacket::entityId), LeftClickItemPacket::new);
/*    */ 
/*    */ 
/*    */   
/*    */   public void handleServer(ServerAccess access) {
/* 23 */     class_3222 class_3222 = access.player();
/* 24 */     class_1799 stack = class_3222.method_5998(this.hand);
/* 25 */     class_1792 class_1792 = stack.method_7909(); if (class_1792 instanceof LeashItem) { LeashItem leftClickItem = (LeashItem)class_1792; if (!class_3222.method_7357().method_7904((class_1792)leftClickItem))
/* 26 */         leftClickItem.useLeash((class_1657)class_3222, this.hand, this.pos, (this.entityId == null) ? null : class_3222.method_37908().method_8469(this.entityId.intValue()));  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\net\LeftClickItemPacket.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */