/*    */ package dev.enjarai.collared.net;
/*    */ 
/*    */ import dev.enjarai.collared.LeashMode;
/*    */ import net.minecraft.class_1799;
/*    */ 
/*    */ public final class SelectLeashModePacket extends Record {
/*    */   private final LeashMode mode;
/*    */   
/*  9 */   public SelectLeashModePacket(LeashMode mode) { this.mode = mode; } public final String toString() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> toString : (Ldev/enjarai/collared/net/SelectLeashModePacket;)Ljava/lang/String;
/*    */     //   6: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*  9 */     //   0	7	0	this	Ldev/enjarai/collared/net/SelectLeashModePacket; } public LeashMode mode() { return this.mode; }
/*    */   public final int hashCode() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> hashCode : (Ldev/enjarai/collared/net/SelectLeashModePacket;)I
/*    */     //   6: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Ldev/enjarai/collared/net/SelectLeashModePacket; }
/*    */   public final boolean equals(Object o) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: <illegal opcode> equals : (Ldev/enjarai/collared/net/SelectLeashModePacket;Ljava/lang/Object;)Z
/*    */     //   7: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	8	0	this	Ldev/enjarai/collared/net/SelectLeashModePacket;
/* 11 */     //   0	8	1	o	Ljava/lang/Object; } public void handleServer(ServerAccess access) { class_1799 stack = access.player().method_6047();
/* 12 */     if (!stack.method_31573(ModItems.LEASHES_TAG)) {
/*    */       return;
/*    */     }
/*    */     
/* 16 */     stack.method_57379(ModComponents.LEASH_MODE, new LeashModeComponent(this.mode)); }
/*    */ 
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\net\SelectLeashModePacket.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */