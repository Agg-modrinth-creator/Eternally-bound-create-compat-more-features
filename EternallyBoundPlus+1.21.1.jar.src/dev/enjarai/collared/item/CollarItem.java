/*     */ package dev.enjarai.collared.item;
/*     */ 
/*     */ import dev.enjarai.collared.ModSounds;
/*     */ import dev.enjarai.collared.item.component.CollarLinkComponent;
/*     */ import dev.enjarai.collared.item.component.CollarSettingsComponent;
/*     */ import dev.enjarai.collared.item.component.ModComponents;
/*     */ import dev.enjarai.collared.item.component.RestrainedComponent;
/*     */ import dev.ryanhcode.sable.companion.SableCompanion;
/*     */ import io.wispforest.accessories.api.AccessoriesCapability;
/*     */ import io.wispforest.accessories.api.AccessoryItem;
/*     */ import io.wispforest.accessories.api.DropRule;
/*     */ import io.wispforest.accessories.api.slot.SlotReference;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import java.util.function.BiConsumer;
/*     */ import net.minecraft.class_1282;
/*     */ import net.minecraft.class_1297;
/*     */ import net.minecraft.class_1309;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_1735;
/*     */ import net.minecraft.class_1792;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_1836;
/*     */ import net.minecraft.class_1937;
/*     */ import net.minecraft.class_2374;
/*     */ import net.minecraft.class_243;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_5536;
/*     */ import net.minecraft.class_5630;
/*     */ 
/*     */ public class CollarItem
/*     */   extends AccessoryItem {
/*     */   public CollarItem() {
/*  34 */     super((new class_1792.class_1793())
/*  35 */         .method_7889(1)
/*  36 */         .method_57349(ModComponents.COLLAR_SETTINGS, new CollarSettingsComponent()));
/*     */   }
/*     */   public static BiConsumer<CollarSettingsComponent, Boolean> collarScreenOpener;
/*     */   
/*     */   public void method_7851(class_1799 stack, class_1792.class_9635 context, List<class_2561> tooltip, class_1836 type) {
/*  41 */     if (!stack.method_57826(ModComponents.COLLAR_LINK)) {
/*  42 */       tooltip.add(class_2561.method_43471("collared.tooltip.unlinked").method_54663(7820663));
/*     */     } else {
/*     */       
/*  45 */       UUID link = ((CollarLinkComponent)stack.method_57824(ModComponents.COLLAR_LINK)).uuid();
/*  46 */       tooltip.add(class_2561.method_43471("collared.tooltip.linked").method_54663((int)link.getLeastSignificantBits()));
/*     */     } 
/*     */     
/*  49 */     if (stack.method_57826(ModComponents.LOCKED)) {
/*  50 */       tooltip.add(class_2561.method_43471("collared.tooltip.locked").method_54663(7820663));
/*     */     }
/*     */     
/*  53 */     super.method_7851(stack, context, tooltip, type);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canEquip(class_1799 stack, SlotReference reference) {
/*  58 */     AccessoriesCapability capability = reference.capability();
/*     */     
/*  60 */     if (capability == null) {
/*  61 */       return false;
/*     */     }
/*     */     
/*  64 */     int amount = capability.getEquipped(s -> s.method_7909() instanceof CollarItem).size();
/*     */     
/*  66 */     if (amount == 0) {
/*  67 */       return true;
/*     */     }
/*     */     
/*  70 */     if (amount == 1 && reference.getStack().method_7909() instanceof CollarItem) {
/*  71 */       return true;
/*     */     }
/*     */     
/*  74 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onEquip(class_1799 stack, SlotReference reference) {
/*  79 */     class_1309 class_1309 = reference.entity(); if (class_1309 instanceof class_1657) { class_1657 player = (class_1657)class_1309;
/*  80 */       CollarSettingsComponent settings = (CollarSettingsComponent)stack.method_57824(ModComponents.COLLAR_SETTINGS);
/*  81 */       if (settings != null) settings.applyAttributes(player);
/*     */        }
/*     */   
/*     */   }
/*     */   
/*     */   public void onUnequip(class_1799 stack, SlotReference reference) {
/*  87 */     class_1309 class_1309 = reference.entity(); if (class_1309 instanceof class_1657) { class_1657 player = (class_1657)class_1309;
/*  88 */       CollarSettingsComponent settings = (CollarSettingsComponent)stack.method_57824(ModComponents.COLLAR_SETTINGS);
/*  89 */       CollarSettingsComponent.removeAttributes(player); }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public DropRule getDropRule(class_1799 stack, SlotReference reference, class_1282 source) {
/*  95 */     if (stack.method_57826(ModComponents.LOCKED)) {
/*  96 */       return DropRule.KEEP;
/*     */     }
/*     */     
/*  99 */     return super.getDropRule(stack, reference, source);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean method_31566(class_1799 stack, class_1799 otherStack, class_1735 slot, class_5536 clickType, class_1657 player, class_5630 cursorStackReference) {
/* 104 */     class_1799 collarStack = SlotReference.of((class_1309)player, "collar", 0).getStack();
/* 105 */     if (!stack.method_57826(ModComponents.LOCKED) && stack == collarStack && clickType == class_5536.field_27014) {
/* 106 */       if (player.method_37908().method_8608()) {
/* 107 */         CollarSettingsComponent settings = (CollarSettingsComponent)collarStack.method_57824(ModComponents.COLLAR_SETTINGS);
/*     */         
/* 109 */         if (settings != null) {
/* 110 */           collarScreenOpener.accept(settings, Boolean.valueOf(collarStack.method_57826(ModComponents.COLLAR_LINK)));
/*     */         }
/*     */       } 
/* 113 */       return true;
/*     */     } 
/* 115 */     return super.method_31566(stack, otherStack, slot, clickType, player, cursorStackReference);
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick(class_1799 stack, SlotReference reference) {
/* 120 */     class_1937 world = reference.entity().method_37908();
/* 121 */     if (world.method_8608()) {
/*     */       return;
/*     */     }
/*     */     
/* 125 */     RestrainedComponent component = (RestrainedComponent)stack.method_57824(ModComponents.RESTRAINED);
/* 126 */     if (component == null) {
/*     */       return;
/*     */     }
/*     */     
/* 130 */     component.target().left().ifPresent(pos -> {
/*     */           pos = SableCompanion.INSTANCE.projectOutOfSubLevel(world, (class_2374)pos);
/*     */           
/*     */           if (SableCompanion.INSTANCE.isInPlotGrid(world, (class_2374)pos)) {
/*     */             stack.method_57381(ModComponents.RESTRAINED);
/*     */           }
/*     */         });
/* 137 */     component.target().right().ifPresent(uuid -> {
/*     */           class_1657 target = world.method_18470(uuid);
/*     */           if (target == null || !target.method_5805()) {
/*     */             stack.method_57381(ModComponents.RESTRAINED);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public static void playJingleQuestionMark(class_1309 entity, boolean server) {
/* 147 */     if (entity.accessoriesCapability() != null && entity.accessoriesCapability().isEquipped(i -> i.method_31573(ModItems.BELL_COLLARS_TAG))) {
/*     */       
/* 149 */       class_1657 player = (class_1657)entity; entity.method_37908().method_43129((!server && entity instanceof class_1657) ? player : null, (class_1297)entity, ModSounds.COLLAR_BELL, entity
/* 150 */           .method_5634(), 0.18F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void sanitize(class_1799 stack) {
/* 156 */     stack.method_57381(ModComponents.SEATED);
/* 157 */     if (!stack.method_57826(ModComponents.LOCKED)) {
/* 158 */       stack.method_57381(ModComponents.RESTRAINED);
/* 159 */       stack.method_57381(ModComponents.GAGGED);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\item\CollarItem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */