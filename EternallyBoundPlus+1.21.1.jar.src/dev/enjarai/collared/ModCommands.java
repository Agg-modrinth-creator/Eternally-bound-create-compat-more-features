/*    */ package dev.enjarai.collared;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import dev.enjarai.collared.item.ModItems;
/*    */ import dev.enjarai.collared.item.component.ModComponents;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_2168;
/*    */ import net.minecraft.class_2170;
/*    */ import net.minecraft.class_2186;
/*    */ import net.minecraft.class_2561;
/*    */ import net.minecraft.class_3222;
/*    */ 
/*    */ public class ModCommands {
/*    */   public static void register(CommandDispatcher<class_2168> dispatcher) {
/* 18 */     dispatcher.register((LiteralArgumentBuilder)class_2170.method_9247("collar")
/* 19 */         .then(((LiteralArgumentBuilder)class_2170.method_9247("unlock")
/* 20 */           .requires(source -> source.method_9259(2)))
/* 21 */           .then(class_2170.method_9244("player", (ArgumentType)class_2186.method_9305())
/* 22 */             .executes(ModCommands::rescuePet))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int rescuePet(CommandContext<class_2168> context) throws CommandSyntaxException {
/* 29 */     class_3222 player = class_2186.method_9315(context, "player");
/*    */     
/* 31 */     class_1799 collarStack = SlotReference.of((class_1309)player, "collar", 0).getStack();
/* 32 */     if (collarStack == null || !collarStack.method_31573(ModItems.COLLARS_TAG) || !collarStack.method_57826(ModComponents.LOCKED)) {
/* 33 */       ((class_2168)context.getSource()).method_9213((class_2561)class_2561.method_43471("collared.command.unlock.no_collar"));
/* 34 */       return 0;
/*    */     } 
/*    */     
/* 37 */     collarStack.method_57381(ModComponents.LOCKED);
/* 38 */     ((class_2168)context.getSource()).method_45068((class_2561)class_2561.method_43471("collared.command.unlock.success"));
/* 39 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\ModCommands.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */