/*    */ package dev.enjarai.collared.item.recipe;
/*    */ 
/*    */ import dev.enjarai.collared.Collared;
/*    */ import net.minecraft.class_1860;
/*    */ import net.minecraft.class_1866;
/*    */ import net.minecraft.class_2378;
/*    */ import net.minecraft.class_7923;
/*    */ 
/*    */ 
/*    */ public class ModRecipes
/*    */ {
/* 12 */   public static final class_1866<DyeablesRecipe> COLLAR = register("dye_collar", new class_1866(Collar::new));
/*    */   
/* 14 */   public static final class_1866<DyeablesRecipe> BELL_COLLAR = register("dye_bell_collar", new class_1866(BellCollar::new));
/*    */   
/* 16 */   public static final class_1866<DyeablesRecipe> LEASH = register("dye_leash", new class_1866(Leash::new));
/*    */   
/*    */   static <S extends net.minecraft.class_1865<T>, T extends class_1860<?>> S register(String id, S serializer) {
/* 19 */     return (S)class_2378.method_10230(class_7923.field_41189, Collared.id(id), serializer);
/*    */   }
/*    */   
/*    */   public static void register() {}
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\item\recipe\ModRecipes.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */