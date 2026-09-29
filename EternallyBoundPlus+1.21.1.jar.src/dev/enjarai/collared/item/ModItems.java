/*     */ package dev.enjarai.collared.item;
/*     */ import dev.enjarai.collared.Collared;
/*     */ import dev.enjarai.collared.item.component.ModComponents;
/*     */ import dev.enjarai.collared.item.component.RestrainedComponent;
/*     */ import io.wispforest.accessories.api.slot.SlotReference;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
/*     */ import net.fabricmc.fabric.api.util.TriState;
/*     */ import net.minecraft.class_1282;
/*     */ import net.minecraft.class_1309;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_1761;
/*     */ import net.minecraft.class_1767;
/*     */ import net.minecraft.class_1792;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_2378;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_3222;
/*     */ import net.minecraft.class_6862;
/*     */ import net.minecraft.class_7923;
/*     */ import net.minecraft.class_7924;
/*     */ 
/*     */ public class ModItems {
/*  27 */   public static final int[] LEASH_COLORS = new int[] { 14606046, 16098372, 14650821, 6142424, 15649584, 12115049, 15971258, 7109507, 11644067, 6800051, 11032260, 6653891, 10574377, 9613119, 13981768, 3683919 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final CollarItem[] COLOR_COLLARS = new CollarItem[LEASH_COLORS.length];
/*  47 */   public static final CollarItem[] COLOR_BELL_COLLARS = new CollarItem[LEASH_COLORS.length];
/*  48 */   public static final LeashItem[] COLOR_LEASHES = new LeashItem[LEASH_COLORS.length];
/*     */   
/*  50 */   public static final List<CollarItem> COLLARS = new ArrayList<>();
/*  51 */   public static final List<LeashItem> LEASHES = new ArrayList<>(); public static final class_1761 ITEM_GROUP;
/*     */   
/*     */   static {
/*  54 */     class_1767[] colors = class_1767.values();
/*  55 */     for (int i = 0; i < LEASH_COLORS.length; i++) {
/*  56 */       class_1767 color = colors[i];
/*  57 */       COLOR_COLLARS[i] = register(color.method_7792() + "_collar", new CollarItem());
/*  58 */       COLOR_BELL_COLLARS[i] = register(color.method_7792() + "_bell_collar", new CollarItem());
/*  59 */       COLOR_LEASHES[i] = register(color.method_7792() + "_leash", new LeashItem(new class_1792.class_1793(), LEASH_COLORS[i]));
/*     */     } 
/*  61 */     COLLARS.addAll(Arrays.asList(COLOR_COLLARS));
/*  62 */     COLLARS.addAll(Arrays.asList(COLOR_BELL_COLLARS));
/*  63 */     LEASHES.addAll(Arrays.asList(COLOR_LEASHES));
/*     */ 
/*     */ 
/*     */     
/*  67 */     Objects.requireNonNull(COLOR_BELL_COLLARS[14]);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  74 */     ITEM_GROUP = FabricItemGroup.builder().method_47320(COLOR_BELL_COLLARS[14]::method_7854).method_47321((class_2561)class_2561.method_43471("collared.item_group")).method_47317((context, entries) -> { entries.method_45423(Arrays.<CollarItem>stream(COLOR_COLLARS).map(class_1792::method_7854).toList()); entries.method_45423(Arrays.<CollarItem>stream(COLOR_BELL_COLLARS).map(class_1792::method_7854).toList()); entries.method_45423(Arrays.<LeashItem>stream(COLOR_LEASHES).map(class_1792::method_7854).toList()); }).method_47324();
/*     */   }
/*  76 */   public static final class_6862<class_1792> LEASHES_TAG = class_6862.method_40092(class_7924.field_41197, Collared.id("leashes"));
/*  77 */   public static final class_6862<class_1792> COLLARS_TAG = class_6862.method_40092(class_7924.field_41197, Collared.id("collars"));
/*  78 */   public static final class_6862<class_1792> BELL_COLLARS_TAG = class_6862.method_40092(class_7924.field_41197, Collared.id("bell_collars"));
/*     */   
/*     */   private static <T extends class_1792> T register(String name, T item) {
/*  81 */     return (T)class_2378.method_10230((class_2378)class_7923.field_41178, Collared.id(name), item);
/*     */   }
/*     */   
/*     */   public static void register() {
/*  85 */     class_2378.method_10230(class_7923.field_44687, Collared.id("collared"), ITEM_GROUP);
/*     */     
/*  87 */     CanUnequipCallback.EVENT.register((stack, reference) -> {
/*     */           if (stack.method_31573(COLLARS_TAG)) {
/*     */             if (stack.method_57826(ModComponents.LOCKED)) {
/*     */               return TriState.FALSE;
/*     */             }
/*     */             
/*     */             CollarItem.sanitize(stack);
/*     */             
/*     */             reference.entity().method_18382();
/*     */           } 
/*     */           
/*     */           return TriState.DEFAULT;
/*     */         });
/* 100 */     OnDeathCallback.EVENT.register((currentState, entity, capability, damageSource, droppedStacks) -> {
/*     */           droppedStacks.forEach(());
/*     */ 
/*     */ 
/*     */           
/*     */           return TriState.DEFAULT;
/*     */         });
/*     */ 
/*     */ 
/*     */     
/* 110 */     ServerLivingEntityEvents.AFTER_DEATH.register((entity, damage) -> {
/*     */           if (!(entity instanceof class_1657)) {
/*     */             return;
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           entity.method_37908().method_18456().forEach(());
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 130 */     ServerPlayerEvents.LEAVE.register(player -> {
/*     */           class_1799 collarStack = SlotReference.of((class_1309)player, "collar", 0).getStack();
/*     */           if (collarStack == null || !collarStack.method_57826(ModComponents.RESTRAINED))
/*     */             return; 
/*     */           RestrainedComponent component = (RestrainedComponent)collarStack.method_57824(ModComponents.RESTRAINED);
/*     */           if (component.target().right().isPresent())
/*     */             collarStack.method_57381(ModComponents.RESTRAINED); 
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\item\ModItems.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */