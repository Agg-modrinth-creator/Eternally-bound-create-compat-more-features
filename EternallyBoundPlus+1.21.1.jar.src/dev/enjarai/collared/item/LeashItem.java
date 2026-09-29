/*     */ package dev.enjarai.collared.item;
/*     */ import dev.enjarai.collared.LeashMode;
/*     */ import dev.enjarai.collared.item.component.CollarLinkComponent;
/*     */ import dev.enjarai.collared.item.component.CollarSettingsComponent;
/*     */ import dev.enjarai.collared.item.component.LeashModeComponent;
/*     */ import dev.enjarai.collared.item.component.ModComponents;
/*     */ import dev.enjarai.collared.net.BeginEditingCollarClientboundPacket;
/*     */ import dev.enjarai.collared.net.ModNetworking;
/*     */ import io.wispforest.accessories.api.slot.SlotReference;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import net.minecraft.class_124;
/*     */ import net.minecraft.class_1268;
/*     */ import net.minecraft.class_1269;
/*     */ import net.minecraft.class_1271;
/*     */ import net.minecraft.class_1297;
/*     */ import net.minecraft.class_1309;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_1735;
/*     */ import net.minecraft.class_1792;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_1836;
/*     */ import net.minecraft.class_1937;
/*     */ import net.minecraft.class_2394;
/*     */ import net.minecraft.class_2398;
/*     */ import net.minecraft.class_243;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_2583;
/*     */ import net.minecraft.class_3218;
/*     */ import net.minecraft.class_3417;
/*     */ import net.minecraft.class_5250;
/*     */ import net.minecraft.class_5536;
/*     */ import net.minecraft.class_5630;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ public class LeashItem extends class_1792 {
/*     */   public static Runnable modeScreenOpener;
/*     */   public final int color;
/*     */   
/*     */   public LeashItem(class_1792.class_1793 settings, int color) {
/*  41 */     super(settings.method_7889(1).method_57349(ModComponents.LEASH_MODE, new LeashModeComponent(LeashMode.YANK)));
/*  42 */     this.color = color;
/*     */   }
/*     */ 
/*     */   
/*     */   public class_1269 method_7847(class_1799 stack, class_1657 user, class_1309 entity, class_1268 hand) {
/*  47 */     if (!user.method_37908().method_8608() && !stack.method_57826(ModComponents.COLLAR_LINK)) {
/*  48 */       slot = SlotReference.of(entity, "collar", 0);
/*  49 */       collarStack = slot.getStack();
/*     */       
/*  51 */       if (entity instanceof class_1657) { player = entity; }
/*  52 */       else { return super.method_7847(stack, user, entity, hand); }
/*     */ 
/*     */       
/*  55 */       particlePos = entity.method_19538().method_1031(0.0D, 1.0D, 0.0D);
/*     */       
/*  57 */       if (collarStack == null || !collarStack.method_31573(ModItems.COLLARS_TAG) || collarStack.method_57826(ModComponents.COLLAR_LINK)) {
/*  58 */         ((class_3218)entity.method_37908()).method_14199((class_2394)class_2398.field_11251, ((class_243)particlePos).field_1352, ((class_243)particlePos).field_1351, ((class_243)particlePos).field_1350, 10, 0.3D, 0.3D, 0.3D, 0.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  63 */         user.method_7353((class_2561)class_2561.method_43469("collared.message.leash.invalid_collar", new Object[] { entity.method_5477() }).method_10862(class_2583.field_24360.method_10977(class_124.field_1080)), true);
/*  64 */         return class_1269.field_21466;
/*     */       } 
/*     */       
/*  67 */       if (!entity.method_5715()) {
/*  68 */         ((class_3218)entity.method_37908()).method_14199((class_2394)class_2398.field_11251, ((class_243)particlePos).field_1352, ((class_243)particlePos).field_1351, ((class_243)particlePos).field_1350, 10, 0.3D, 0.3D, 0.3D, 0.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  73 */         user.method_7353((class_2561)class_2561.method_43469("collared.message.leash.not_sneaking", new Object[] { entity.method_5477() }).method_10862(class_2583.field_24360.method_10977(class_124.field_1080)), true);
/*  74 */         return class_1269.field_21466;
/*     */       } 
/*     */       
/*  77 */       component = new CollarLinkComponent(UUID.randomUUID());
/*  78 */       user.method_5998(hand).method_57379(ModComponents.COLLAR_LINK, component);
/*  79 */       collarStack = collarStack.method_7972();
/*  80 */       collarStack.method_57379(ModComponents.COLLAR_LINK, component);
/*  81 */       slot.setStack((class_1799)collarStack);
/*     */       
/*  83 */       LeashMode.playSound((class_1657)player, class_3417.field_14762, 0.6F);
/*  84 */       LeashMode.playSound((class_1657)player, class_3417.field_46944, 0.4F);
/*  85 */       ((class_3218)entity.method_37908()).method_14199((class_2394)class_2398.field_11201, ((class_243)particlePos).field_1352, ((class_243)particlePos).field_1351, ((class_243)particlePos).field_1350, 10, 0.3D, 0.3D, 0.3D, 0.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  90 */       user.method_7353((class_2561)class_2561.method_43469("collared.message.leash.success", new Object[] { entity.method_5477() }).method_10862(class_2583.field_24360.method_10977(class_124.field_1080)), true);
/*  91 */       user.method_7357().method_7906(this, 10);
/*     */       
/*  93 */       return class_1269.field_5812;
/*     */     } 
/*     */     
/*  96 */     return super.method_7847(stack, user, entity, hand);
/*     */   }
/*     */ 
/*     */   
/*     */   public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
/* 101 */     stack = user.method_5998(hand);
/*     */     
/* 103 */     if (world.method_8608() && hand == class_1268.field_5808 && stack.method_57826(ModComponents.COLLAR_LINK)) {
/* 104 */       modeScreenOpener.run();
/*     */     }
/*     */     
/* 107 */     return class_1271.method_22431(stack);
/*     */   }
/*     */   
/*     */   public void useLeash(class_1657 user, class_1268 hand, @Nullable class_243 lookPos, @Nullable class_1297 lookEntity) {
/* 111 */     stack = user.method_5998(hand);
/*     */     
/* 113 */     if (!stack.method_57826(ModComponents.COLLAR_LINK)) {
/*     */       return;
/*     */     }
/* 116 */     mode = ((LeashModeComponent)stack.method_57824(ModComponents.LEASH_MODE)).mode();
/*     */     
/* 118 */     player = getCollaredPlayer(user.method_37908(), user, (class_1799)stack);
/*     */     
/* 120 */     if (player != null) {
/* 121 */       collarStack = SlotReference.of((class_1309)player, "collar", 0).getStack();
/*     */       
/* 123 */       if (mode.useLeash(user.method_37908(), user, (class_1657)player, (class_1799)stack, (class_1799)collarStack, lookPos, lookEntity))
/* 124 */         user.method_7357().method_7906(this, 10); 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static class_1657 getCollaredPlayer(class_1937 world, class_1657 user, class_1799 leashStack) {
/* 130 */     linkComponent = leashStack.method_57824(ModComponents.COLLAR_LINK);
/*     */     
/* 132 */     if (linkComponent != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 141 */       players = world.method_18456().stream().filter(p -> { collarStack = SlotReference.of((class_1309)p, "collar", 0).getStack(); if (collarStack == null) return false;  component = collarStack.method_57824(ModComponents.COLLAR_LINK); return (component == null) ? false : component.uuid().equals(linkComponent.uuid()); }).toList();
/*     */       
/* 143 */       if (players.isEmpty()) {
/* 144 */         if (!world.method_8608()) {
/* 145 */           user.method_7353((class_2561)class_2561.method_43471("collared.message.leash.not_online").method_10862(class_2583.field_24360.method_10977(class_124.field_1080)), true);
/*     */         }
/* 147 */         return null;
/*     */       } 
/*     */       
/* 150 */       player = players.getFirst();
/*     */     } 
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
/* 169 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean method_31566(class_1799 stack, class_1799 otherStack, class_1735 slot, class_5536 clickType, class_1657 player, class_5630 cursorStackReference) {
/* 174 */     if (clickType == class_5536.field_27014) {
/* 175 */       link = stack.method_57824(ModComponents.COLLAR_LINK);
/* 176 */       if (link != null) {
/* 177 */         v9 = player.method_37908(); if (v9 instanceof class_3218) { sw = v9;
/* 178 */           for (v9 = sw.method_18456().iterator(); v9.hasNext(); ) { collared = v9.next();
/* 179 */             collarStack = SlotReference.of((class_1309)collared, "collar", 0).getStack();
/* 180 */             if (collarStack == null)
/* 181 */               continue;  component = collarStack.method_57824(ModComponents.COLLAR_LINK);
/* 182 */             if (component == null || 
/* 183 */               !component.uuid().equals(link.uuid()))
/* 184 */               continue;  settings = collarStack.method_57824(ModComponents.COLLAR_SETTINGS);
/* 185 */             if (settings != null) {
/* 186 */               ModNetworking.CHANNEL.serverHandle(player).send((Record)new BeginEditingCollarClientboundPacket(link.uuid(), (CollarSettingsComponent)settings));
/*     */             } }
/*     */           
/* 189 */           return true; }
/*     */       
/*     */       } 
/*     */     } 
/* 193 */     return super.method_31566(stack, otherStack, slot, clickType, player, cursorStackReference);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void scrollLeash(class_1657 user, class_1799 stack, float scrollAmount) {
/* 198 */     mode = stack.method_57824(ModComponents.LEASH_MODE);
/*     */     
/* 200 */     player = getCollaredPlayer(user.method_37908(), user, stack);
/* 201 */     if (player == null) {
/*     */       return;
/*     */     }
/*     */     
/* 205 */     collarStack = SlotReference.of((class_1309)player, "collar", 0).getStack();
/* 206 */     restrained = collarStack.method_57824(ModComponents.RESTRAINED);
/* 207 */     if (restrained == null) {
/*     */       return;
/*     */     }
/*     */     
/* 211 */     isRestrained = (mode.mode() == LeashMode.RESTRAIN && restrained.target().left().isPresent()) ? 1 : 0;
/* 212 */     isFollowing = (mode.mode() == LeashMode.FOLLOW && restrained.target().right().isPresent()) ? 1 : 0;
/* 213 */     if (isRestrained == 0 && isFollowing == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 217 */     newRange = Math.clamp(Math.round(restrained.range() * 2.0D - scrollAmount) / 2.0D, 1.0D, 16.0D);
/* 218 */     restrained = restrained.withRange(newRange);
/* 219 */     collarStack.method_57379(ModComponents.RESTRAINED, restrained);
/*     */   }
/*     */ 
/*     */   
/*     */   public void method_7851(class_1799 stack, class_1792.class_9635 context, List<class_5250> tooltip, class_1836 type) {
/* 224 */     if (!stack.method_57826(ModComponents.COLLAR_LINK)) {
/* 225 */       tooltip.add(class_2561.method_43471("collared.tooltip.unlinked").method_54663(7820663));
/*     */     } else {
/*     */       
/* 228 */       link = ((CollarLinkComponent)stack.method_57824(ModComponents.COLLAR_LINK)).uuid();
/* 229 */       tooltip.add(class_2561.method_43471("collared.tooltip.linked").method_54663((int)link.getLeastSignificantBits()));
/*     */     } 
/*     */     
/* 232 */     super.method_7851(stack, context, tooltip, type);
/*     */   }
/*     */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\item\LeashItem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */