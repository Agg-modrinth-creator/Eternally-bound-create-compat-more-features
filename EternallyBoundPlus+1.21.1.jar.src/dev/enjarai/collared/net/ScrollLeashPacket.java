/*    */ package dev.enjarai.collared.net;
/*    */ 
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1799;
/*    */ 
/*    */ public final class ScrollLeashPacket extends Record {
/*    */   private final float amount;
/*    */   
/*  9 */   public ScrollLeashPacket(float amount) { this.amount = amount; } public final String toString() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> toString : (Ldev/enjarai/collared/net/ScrollLeashPacket;)Ljava/lang/String;
/*    */     //   6: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*  9 */     //   0	7	0	this	Ldev/enjarai/collared/net/ScrollLeashPacket; } public float amount() { return this.amount; }
/*    */   public final int hashCode() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> hashCode : (Ldev/enjarai/collared/net/ScrollLeashPacket;)I
/*    */     //   6: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Ldev/enjarai/collared/net/ScrollLeashPacket; }
/*    */   public final boolean equals(Object o) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: <illegal opcode> equals : (Ldev/enjarai/collared/net/ScrollLeashPacket;Ljava/lang/Object;)Z
/*    */     //   7: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	8	0	this	Ldev/enjarai/collared/net/ScrollLeashPacket;
/* 11 */     //   0	8	1	o	Ljava/lang/Object; } public void handleServer(ServerAccess access) { class_3222 player = access.player();
/*    */     
/* 13 */     handleCommon((class_1657)player); }
/*    */ 
/*    */   
/*    */   public void handleCommon(class_1657 player) {
/* 17 */     if (Math.abs(amount()) >= 1.0F) {
/* 18 */       class_1799 stack = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 24 */       if (player.method_6047().method_57826(ModComponents.LEASH_MODE)) {
/* 25 */         stack = player.method_6047();
/* 26 */       } else if (player.method_6079().method_57826(ModComponents.LEASH_MODE)) {
/* 27 */         stack = player.method_6079();
/*    */       } 
/*    */       
/* 30 */       if (stack != null)
/* 31 */         LeashItem.scrollLeash(player, stack, amount()); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\net\ScrollLeashPacket.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */