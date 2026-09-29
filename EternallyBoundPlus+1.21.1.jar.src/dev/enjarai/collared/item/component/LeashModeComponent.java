/*    */ package dev.enjarai.collared.item.component;
/*    */ 
/*    */ 
/*    */ public final class LeashModeComponent extends Record {
/*    */   private final LeashMode mode;
/*    */   
/*  7 */   public LeashModeComponent(LeashMode mode) { this.mode = mode; } public final String toString() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> toString : (Ldev/enjarai/collared/item/component/LeashModeComponent;)Ljava/lang/String;
/*    */     //   6: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*  7 */     //   0	7	0	this	Ldev/enjarai/collared/item/component/LeashModeComponent; } public LeashMode mode() { return this.mode; }
/*    */   public final int hashCode() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> hashCode : (Ldev/enjarai/collared/item/component/LeashModeComponent;)I
/*    */     //   6: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Ldev/enjarai/collared/item/component/LeashModeComponent; } public final boolean equals(Object o) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: <illegal opcode> equals : (Ldev/enjarai/collared/item/component/LeashModeComponent;Ljava/lang/Object;)Z
/*    */     //   7: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	8	0	this	Ldev/enjarai/collared/item/component/LeashModeComponent;
/*  8 */     //   0	8	1	o	Ljava/lang/Object; } public static final Endec<LeashModeComponent> ENDEC = (Endec<LeashModeComponent>)StructEndecBuilder.of(LeashMode.ENDEC
/*  9 */       .fieldOf("mode", LeashModeComponent::mode), LeashModeComponent::new);
/*    */ 
/*    */ 
/*    */   
/*    */   public LeashModeComponent next() {
/* 14 */     int i = this.mode.ordinal() + 1;
/* 15 */     if (i >= (LeashMode.values()).length) {
/* 16 */       i = 0;
/*    */     }
/* 18 */     return new LeashModeComponent(LeashMode.values()[i]);
/*    */   }
/*    */   
/*    */   public LeashModeComponent previous() {
/* 22 */     int i = this.mode.ordinal() - 1;
/* 23 */     if (i < 0) {
/* 24 */       i = (LeashMode.values()).length - 1;
/*    */     }
/* 26 */     return new LeashModeComponent(LeashMode.values()[i]);
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\item\component\LeashModeComponent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */