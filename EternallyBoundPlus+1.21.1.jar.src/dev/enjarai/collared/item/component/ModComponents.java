/*    */ package dev.enjarai.collared.item.component;
/*    */ import dev.enjarai.collared.Collared;
/*    */ import io.wispforest.endec.Endec;
/*    */ import java.util.function.UnaryOperator;
/*    */ import net.minecraft.class_9331;
/*    */ 
/*    */ public class ModComponents {
/*    */   public static final class_9331<CollarLinkComponent> COLLAR_LINK;
/*    */   
/*    */   static {
/* 11 */     COLLAR_LINK = register("collar_link", builder -> builder.endec((Endec)CollarLinkComponent.ENDEC).method_59871());
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     LEASH_MODE = register("leash_mode", builder -> builder.endec(LeashModeComponent.ENDEC).method_59871());
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 21 */     RESTRAINED = register("restrained", builder -> builder.endec(RestrainedComponent.ENDEC).method_59871());
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 26 */     SEATED = register("seated", builder -> builder.endec((Endec)SeatedComponent.ENDEC).method_59871());
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 31 */     GAGGED = register("gagged", builder -> builder.endec((Endec)GaggedComponent.ENDEC).method_59871());
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 36 */     LOCKED = register("locked", builder -> builder.endec((Endec)LockedComponent.ENDEC).method_59871());
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     COLLAR_SETTINGS = register("collar_settings", builder -> builder.endec((Endec)CollarSettingsComponent.ENDEC).method_59871());
/*    */   }
/*    */   public static final class_9331<LeashModeComponent> LEASH_MODE; public static final class_9331<RestrainedComponent> RESTRAINED; public static final class_9331<SeatedComponent> SEATED; public static final class_9331<GaggedComponent> GAGGED;
/*    */   public static final class_9331<LockedComponent> LOCKED;
/*    */   public static final class_9331<CollarSettingsComponent> COLLAR_SETTINGS;
/*    */   
/*    */   private static <T> class_9331<T> register(String id, UnaryOperator<class_9331.class_9332<T>> builderOperator) {
/* 48 */     return (class_9331<T>)class_2378.method_10230(class_7923.field_49658, Collared.id(id), ((class_9331.class_9332)builderOperator.apply(class_9331.method_57873())).method_57880());
/*    */   }
/*    */   
/*    */   public static void register() {}
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\item\component\ModComponents.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */