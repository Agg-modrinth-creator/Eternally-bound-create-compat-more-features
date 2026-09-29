/*    */ package dev.enjarai.collared.item.component;
/*    */ 
/*    */ import io.wispforest.endec.impl.StructEndecBuilder;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public final class CollarLinkComponent extends Record {
/*    */   private final UUID uuid;
/*    */   
/*  9 */   public CollarLinkComponent(UUID uuid) { this.uuid = uuid; } public final String toString() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> toString : (Ldev/enjarai/collared/item/component/CollarLinkComponent;)Ljava/lang/String;
/*    */     //   6: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*  9 */     //   0	7	0	this	Ldev/enjarai/collared/item/component/CollarLinkComponent; } public UUID uuid() { return this.uuid; }
/*    */   public final int hashCode() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> hashCode : (Ldev/enjarai/collared/item/component/CollarLinkComponent;)I
/*    */     //   6: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Ldev/enjarai/collared/item/component/CollarLinkComponent; } public final boolean equals(Object o) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: <illegal opcode> equals : (Ldev/enjarai/collared/item/component/CollarLinkComponent;Ljava/lang/Object;)Z
/*    */     //   7: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	8	0	this	Ldev/enjarai/collared/item/component/CollarLinkComponent;
/* 10 */     //   0	8	1	o	Ljava/lang/Object; } public static final StructEndec<CollarLinkComponent> ENDEC = StructEndecBuilder.of(BuiltInEndecs.UUID
/* 11 */       .fieldOf("uuid", CollarLinkComponent::uuid), CollarLinkComponent::new);
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\item\component\CollarLinkComponent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */