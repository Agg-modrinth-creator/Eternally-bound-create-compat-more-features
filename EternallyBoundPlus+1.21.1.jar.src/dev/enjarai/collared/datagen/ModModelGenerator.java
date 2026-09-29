/*    */ package dev.enjarai.collared.datagen;
/*    */ import dev.enjarai.collared.item.ModItems;
/*    */ import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
/*    */ import net.minecraft.class_1767;
/*    */ import net.minecraft.class_1792;
/*    */ import net.minecraft.class_4915;
/*    */ import net.minecraft.class_4943;
/*    */ 
/*    */ public class ModModelGenerator extends FabricModelProvider {
/*    */   public ModModelGenerator(FabricDataOutput output) {
/* 11 */     super(output);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void generateBlockStateModels(class_4910 blockStateModelGenerator) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void generateItemModels(class_4915 itemModelGenerator) {
/* 21 */     for (int i = 0; i < (class_1767.values()).length; i++) {
/* 22 */       itemModelGenerator.method_25733((class_1792)ModItems.COLOR_COLLARS[i], class_4943.field_22938);
/* 23 */       itemModelGenerator.method_25733((class_1792)ModItems.COLOR_BELL_COLLARS[i], class_4943.field_22938);
/* 24 */       itemModelGenerator.method_25733((class_1792)ModItems.COLOR_LEASHES[i], class_4943.field_22938);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\datagen\ModModelGenerator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */