/*    */ package dev.enjarai.collared;
/*    */ import net.minecraft.class_2378;
/*    */ import net.minecraft.class_2960;
/*    */ import net.minecraft.class_3414;
/*    */ import net.minecraft.class_5819;
/*    */ import net.minecraft.class_6575;
/*    */ import net.minecraft.class_7923;
/*    */ 
/*    */ public class ModSounds {
/* 10 */   public static final class_3414 COLLAR_BELL = register("collar_bell");
/*    */   
/*    */   private static class_3414 register(String path) {
/* 13 */     class_2960 id = Collared.id(path);
/* 14 */     return (class_3414)class_2378.method_10230(class_7923.field_41172, id, class_3414.method_47908(id));
/*    */   }
/*    */ 
/*    */   
/*    */   public static void register() {}
/*    */ 
/*    */   
/* 21 */   private static final class_5819 PITCH_RANDOM = (class_5819)new class_6575(-889275714L);
/*    */   
/*    */   public static float randomPitch(float start, float range) {
/* 24 */     return start - range + PITCH_RANDOM.method_43057() * range * 2.0F;
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\ModSounds.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */