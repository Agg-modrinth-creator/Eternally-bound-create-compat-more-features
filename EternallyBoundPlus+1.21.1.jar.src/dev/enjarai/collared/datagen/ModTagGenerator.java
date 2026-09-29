/*    */ package dev.enjarai.collared.datagen;
/*    */ 
/*    */ import dev.enjarai.collared.item.ModItems;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
/*    */ import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
/*    */ import net.minecraft.class_1792;
/*    */ import net.minecraft.class_7225;
/*    */ import net.minecraft.class_7924;
/*    */ 
/*    */ public class ModTagGenerator
/*    */   extends FabricTagProvider<class_1792> {
/*    */   public ModTagGenerator(FabricDataOutput output, CompletableFuture<class_7225.class_7874> registriesFuture) {
/* 14 */     super(output, class_7924.field_41197, registriesFuture);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void method_10514(class_7225.class_7874 wrapperLookup) {
/* 19 */     getOrCreateTagBuilder(ModItems.BELL_COLLARS_TAG)
/* 20 */       .add((Object[])ModItems.COLOR_BELL_COLLARS);
/* 21 */     getOrCreateTagBuilder(ModItems.COLLARS_TAG)
/* 22 */       .add((Object[])ModItems.COLOR_COLLARS)
/* 23 */       .addTag(ModItems.BELL_COLLARS_TAG);
/* 24 */     getOrCreateTagBuilder(ModItems.LEASHES_TAG)
/* 25 */       .add((Object[])ModItems.COLOR_LEASHES);
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\datagen\ModTagGenerator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */