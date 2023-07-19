package noweaponslow.patches;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.entity.mobs.PlayerMob;
import net.bytebuddy.asm.Advice;

@ModMethodPatch(target = PlayerMob.class, name = "getAttackingMovementMod", arguments = {})
public class NoWeaponSlowPatch {
    @Advice.OnMethodExit
    static void onExit(@Advice.Return(readOnly = false) float ret) {
        ret = 1.0f;
    };
}
