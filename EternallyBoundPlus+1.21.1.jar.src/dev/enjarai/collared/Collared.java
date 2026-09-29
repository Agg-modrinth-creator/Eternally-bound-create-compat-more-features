/*    */ package dev.enjarai.collared;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import dev.enjarai.collared.item.ModItems;
/*    */ import dev.enjarai.collared.item.component.ModComponents;
/*    */ import dev.enjarai.collared.item.recipe.ModRecipes;
/*    */ import dev.enjarai.collared.net.ModNetworking;
/*    */ import net.fabricmc.api.ModInitializer;
/*    */ import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
/*    */ import net.minecraft.class_2168;
/*    */ import net.minecraft.class_2170;
/*    */ import net.minecraft.class_2960;
/*    */ import net.minecraft.class_7157;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ 
/*    */ public class Collared implements ModInitializer {
/* 17 */   public static final Logger LOGGER = LoggerFactory.getLogger("collared");
/*    */   public static final String MOD_ID = "collared";
/*    */   
/*    */   public void onInitialize() {
/* 21 */     ModItems.register();
/* 22 */     ModSounds.register();
/* 23 */     ModComponents.register();
/* 24 */     ModNetworking.register();
/* 25 */     ModRecipes.register();
/*    */     
/* 27 */     CommandRegistrationCallback.EVENT.register((commandDispatcher, commandRegistryAccess, registrationEnvironment) -> ModCommands.register(commandDispatcher));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static class_2960 id(String path) {
/* 33 */     return class_2960.method_60655("collared", path);
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\Collared.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */