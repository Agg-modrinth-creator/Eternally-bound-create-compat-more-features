/*    */ package dev.enjarai.collared.item.component;
/*    */ 
/*    */ import io.wispforest.endec.StructEndec;
/*    */ import io.wispforest.endec.impl.StructEndecBuilder;
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_3532;
/*    */ import net.minecraft.class_591;
/*    */ import org.joml.Vector3f;
/*    */ 
/*    */ public final class SeatedComponent extends Record {
/*    */   private final float yaw;
/*    */   
/*    */   public final String toString() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> toString : (Ldev/enjarai/collared/item/component/SeatedComponent;)Ljava/lang/String;
/*    */     //   6: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Ldev/enjarai/collared/item/component/SeatedComponent;
/*    */   }
/*    */   
/* 19 */   public float yaw() { return this.yaw; }
/*    */   public final int hashCode() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> hashCode : (Ldev/enjarai/collared/item/component/SeatedComponent;)I
/*    */     //   6: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Ldev/enjarai/collared/item/component/SeatedComponent; } public final boolean equals(Object o) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: <illegal opcode> equals : (Ldev/enjarai/collared/item/component/SeatedComponent;Ljava/lang/Object;)Z
/*    */     //   7: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	8	0	this	Ldev/enjarai/collared/item/component/SeatedComponent;
/* 20 */     //   0	8	1	o	Ljava/lang/Object; } public SeatedComponent(float yaw) { this.yaw = yaw; }
/* 21 */    public static final StructEndec<SeatedComponent> ENDEC = StructEndecBuilder.of(StructEndec.FLOAT
/* 22 */       .fieldOf("yaw", SeatedComponent::yaw), SeatedComponent::new);
/*    */   
/*    */   @Nullable
/*    */   public static SeatedComponent of(class_1309 p) {
/* 26 */     class_1799 collarStack = SlotReference.of(p, "collar", 0).getStack();
/* 27 */     return (collarStack != null) ? (SeatedComponent)collarStack.method_57824(ModComponents.SEATED) : null;
/*    */   }
/*    */   public static boolean is(class_1309 p) {
/* 30 */     return (of(p) != null);
/*    */   }
/*    */   public static Runnable setSittingAnglesHotswappable(Supplier<class_591> modelSupplier) {
/* 33 */     class_591 model = modelSupplier.get();
/* 34 */     model.field_3397.method_33425(-1.5707964F, -0.62831855F, 0.0F);
/* 35 */     model.field_3392.method_33425(-1.5707964F, 0.62831855F, 0.0F);
/* 36 */     float bodyΘ = 0.5235988F;
/* 37 */     model.field_3391.method_33425(bodyΘ, 0.0F, 0.0F);
/* 38 */     float bodyHeight = 12.0F;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 61 */     float legOffset = bodyHeight * class_3532.method_15374(bodyΘ);
/*    */ 
/*    */ 
/*    */     
/* 65 */     float bodyAltitude = bodyHeight * class_3532.method_15362(bodyΘ);
/* 66 */     assert bodyAltitude < bodyHeight;
/* 67 */     float legShift = bodyHeight - bodyAltitude;
/* 68 */     model.field_3397.method_41920(new Vector3f(0.0F, -legShift, legOffset));
/* 69 */     model.field_3392.method_41920(new Vector3f(0.0F, -legShift, legOffset));
/* 70 */     float armΘ = 0.1308997F;
/* 71 */     float helpmeΘ = -0.2617994F;
/* 72 */     model.field_27433.method_33425(helpmeΘ, 0.0F, armΘ);
/* 73 */     model.field_3401.method_33425(helpmeΘ, 0.0F, -armΘ);
/*    */     
/* 75 */     float armDelta = 2.5F;
/* 76 */     float armPush = -0.5F;
/* 77 */     float armShift = -1.0F;
/* 78 */     model.field_27433.method_41920(new Vector3f(-armDelta, -armShift, -armPush));
/* 79 */     model.field_3401.method_41920(new Vector3f(armDelta, -armShift, -armPush));
/* 80 */     return () -> model.field_3483.method_41920(new Vector3f(0.0F, 0.0F, 0.5F));
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\item\component\SeatedComponent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */