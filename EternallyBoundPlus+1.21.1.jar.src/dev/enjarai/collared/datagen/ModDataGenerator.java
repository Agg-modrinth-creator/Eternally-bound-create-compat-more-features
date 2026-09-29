/*    */ package dev.enjarai.collared.datagen;
/*    */ 
/*    */ import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
/*    */ import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
/*    */ 
/*    */ public class ModDataGenerator
/*    */   implements DataGeneratorEntrypoint {
/*    */   public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
/*  9 */     FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
/* 10 */     pack.addProvider(ModModelGenerator::new);
/* 11 */     pack.addProvider(ModTagGenerator::new);
/* 12 */     pack.addProvider(ModRecipeGenerator::new);
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\datagen\ModDataGenerator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */