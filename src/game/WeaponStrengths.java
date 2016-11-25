package game;

import javafx.scene.image.ImageView;
import weapons.item;

/**
 *
 * @author jrlytle
 */
public class WeaponStrengths
{
    public ImageView getWeaponStrengths(item weapon)
    {
        if(weapon.getEffectArmor() && !weapon.getEffectBeast() && !weapon.getEffectDragon() && !weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor.png");
        }
        if(!weapon.getEffectArmor() && weapon.getEffectBeast() && !weapon.getEffectDragon() && !weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Beast.png");
        }
        if(!weapon.getEffectArmor() && !weapon.getEffectBeast() && weapon.getEffectDragon() && !weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Dragon.png");
        }
        if(!weapon.getEffectArmor() && !weapon.getEffectBeast() && !weapon.getEffectDragon() && weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Flying.png");
        }
        if(!weapon.getEffectArmor() && !weapon.getEffectBeast() && !weapon.getEffectDragon() && !weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Revenant.png");
        }
        if(weapon.getEffectArmor() && weapon.getEffectBeast() && !weapon.getEffectDragon() && !weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Beast.png");
        }
        if(weapon.getEffectArmor() && !weapon.getEffectBeast() && weapon.getEffectDragon() && !weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Dragon.png");
        }
        if(weapon.getEffectArmor() && !weapon.getEffectBeast() && !weapon.getEffectDragon() && weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Flying.png");
        }
        if(weapon.getEffectArmor() && !weapon.getEffectBeast() && !weapon.getEffectDragon() && !weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Revenant.png");
        }
        if(!weapon.getEffectArmor() && weapon.getEffectBeast() && weapon.getEffectDragon() && !weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Beast_Dragon.png");
        }
        if(!weapon.getEffectArmor() && weapon.getEffectBeast() && !weapon.getEffectDragon() && weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Beast_Flying.png");
        }
        if(!weapon.getEffectArmor() && weapon.getEffectBeast() && !weapon.getEffectDragon() && !weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Beast_Revenant.png");
        }
        if(!weapon.getEffectArmor() && !weapon.getEffectBeast() && weapon.getEffectDragon() && weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Dragon_Flying.png");
        }
        if(!weapon.getEffectArmor() && !weapon.getEffectBeast() && weapon.getEffectDragon() && !weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Dragon_Revenant.png");
        }
        if(!weapon.getEffectArmor() && !weapon.getEffectBeast() && !weapon.getEffectDragon() && weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Flying_Revenant.png");
        }
        if(weapon.getEffectArmor() && weapon.getEffectBeast() && weapon.getEffectDragon() && !weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Beast_Dragon.png");
        }
        if(weapon.getEffectArmor() && weapon.getEffectBeast() && !weapon.getEffectDragon() && weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Beast_Flying.png");
        }
        if(weapon.getEffectArmor() && weapon.getEffectBeast() && !weapon.getEffectDragon() && !weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Beast_Revenant.png");
        }
        if(weapon.getEffectArmor() && !weapon.getEffectBeast() && weapon.getEffectDragon() && weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Dragon_Flying.png");
        }
        if(weapon.getEffectArmor() && !weapon.getEffectBeast() && weapon.getEffectDragon() && !weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Dragon_Revenant.png");
        }
        if(weapon.getEffectArmor() && !weapon.getEffectBeast() && !weapon.getEffectDragon() && weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Flying_Revenant.png");
        }
        if(!weapon.getEffectArmor() && weapon.getEffectBeast() && weapon.getEffectDragon() && weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Beast_Dragon_Flying.png");
        }
        if(!weapon.getEffectArmor() && weapon.getEffectBeast() && weapon.getEffectDragon() && !weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Beast_Dragon_Revenant.png");
        }
        if(!weapon.getEffectArmor() && weapon.getEffectBeast() && !weapon.getEffectDragon() && weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Beast_Flying_Revenant.png");
        }
        if(!weapon.getEffectArmor() && !weapon.getEffectBeast() && weapon.getEffectDragon() && weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Dragon_Flying_Revenant.png");
        }
        if(weapon.getEffectArmor() && weapon.getEffectBeast() && weapon.getEffectDragon() && weapon.getEffectFlying() && !weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Beast_Dragon_Flying.png");
        }
        if(weapon.getEffectArmor() && weapon.getEffectBeast() && weapon.getEffectDragon() && !weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Beast_Dragon_Revenant.png");
        }
        if(weapon.getEffectArmor() && weapon.getEffectBeast() && !weapon.getEffectDragon() && weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Beast_Flying_Revenant.png");
        }
        if(weapon.getEffectArmor() && !weapon.getEffectBeast() && weapon.getEffectDragon() && weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Dragon_Flying_Revenant.png");
        }
        if(!weapon.getEffectArmor() && weapon.getEffectBeast() && weapon.getEffectDragon() && weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Beast_Dragon_Flying_Revenant.png");
        }
        if(weapon.getEffectArmor() && weapon.getEffectBeast() && weapon.getEffectDragon() && weapon.getEffectFlying() && weapon.getEffectMonster())
        {
            return new ImageView("file:src/images/Armor_Beast_Dragon_Flying_Revenant.png");
        }
        return new ImageView("file:src/images/None.png");
    }
}
