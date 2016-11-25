package game;

import functions.*;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author jrlytle
 */
public class DrawStatScreen
{
    ImageView nameBar;
    double tipLength;
    double tipHeight;
    boolean bloodButton = true;
    boolean mapButton = true;
    boolean[] tips = new boolean[100];

    public void resetArray(boolean[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = false;
        }
    }
    public void statScreen(Pane lowerScreen, character player)
    {
        Attack a = new Attack();
        Avoid av = new Avoid();
        CharacterName cN = new CharacterName();
        ClassName clN = new ClassName();
        Critical c = new Critical();
        equippedWeapon eW = new equippedWeapon();
        Hit h = new Hit();
        maxStats mX = new maxStats();
        SkillImage sI = new SkillImage();
        WeaponName wN = new WeaponName();
        WeaponStrengths wS = new WeaponStrengths();
        //----------------------------------------------------------------------
        ImageView statScreen = new ImageView("file:src/images/stat_screen.png");
        ImageView classNameBar = new ImageView("file:src/images/Class_Name.png");
        ImageView levelBar = new ImageView("file:src/images/Level_Bar.png");
        ImageView expBar = new ImageView("file:src/images/EXP_Bar.png");
        ImageView hpBar = new ImageView("file:src/images/hpBar.png");
        ImageView movBar = new ImageView("file:src/images/movBar.png");
        //----------------------------------------------------------------------
        ImageView skillOneBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView skillOne;
        ImageView skillTwoBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView skillTwo;
        ImageView skillThreeBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView skillThree;
        ImageView skillFourBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView skillFour;
        ImageView skillFiveBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView skillFive;
        ImageView skillSixBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView skillSix;
        //----------------------------------------------------------------------
        ImageView swordEXPBar = new ImageView("file:src/images/Sword_EXP_Bar.png");
        ImageView lanceEXPBar = new ImageView("file:src/images/Lance_EXP_Bar.png");
        ImageView axeEXPBar = new ImageView("file:src/images/Axe_EXP_Bar.png");
        ImageView bowEXPBar = new ImageView("file:src/images/Bow_EXP_Bar.png");
        ImageView shurikenEXPBar = new ImageView("file:src/images/Shuriken_EXP_Bar.png");
        ImageView staffEXPBar = new ImageView("file:src/images/Staff_EXP_Bar.png");
        ImageView fireEXPBar = new ImageView("file:src/images/Fire_EXP_Bar.png");
        ImageView thunderEXPBar = new ImageView("file:src/images/Thunder_EXP_Bar.png");
        ImageView windEXPBar = new ImageView("file:src/images/Wind_EXP_Bar.png");
        ImageView lightEXPBar = new ImageView("file:src/images/Light_EXP_Bar.png");
        ImageView darkEXPBar = new ImageView("file:src/images/Dark_EXP_Bar.png");
        ImageView otherEXPBar = new ImageView("file:src/images/Other_EXP_Bar.png");
        //----------------------------------------------------------------------
        ImageView attackBar = new ImageView("file:src/images/Attack_Bar.png");
        ImageView criticalBar = new ImageView("file:src/images/Critical_Bar.png");
        ImageView hitBar = new ImageView("file:src/images/Hit_Bar.png");
        ImageView avoidBar = new ImageView("file:src/images/Avoid_Bar.png");
        //----------------------------------------------------------------------
        ImageView itemOneBar = new ImageView("file:src/images/Item_Bar.png");
        ImageView itemOneStrengthsBar = new ImageView("file:src/images/Strengths_Bar.png");
        ImageView itemOneStrengths;
        ImageView itemOneSkillOneBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemOneSkillOne;
        ImageView itemOneSkillTwoBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemOneSkillTwo;
        ImageView itemOneSkillThreeBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemOneSkillThree;
        //----------------------------------------------------------------------
        ImageView itemTwoBar = new ImageView("file:src/images/Item_Bar.png");
        ImageView itemTwoStrengthsBar = new ImageView("file:src/images/Strengths_Bar.png");
        ImageView itemTwoStrengths;
        ImageView itemTwoSkillOneBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemTwoSkillOne;
        ImageView itemTwoSkillTwoBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemTwoSkillTwo;
        ImageView itemTwoSkillThreeBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemTwoSkillThree;
        //----------------------------------------------------------------------
        ImageView itemThreeBar = new ImageView("file:src/images/Item_Bar.png");
        ImageView itemThreeStrengthsBar = new ImageView("file:src/images/Strengths_Bar.png");
        ImageView itemThreeStrengths;
        ImageView itemThreeSkillOneBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemThreeSkillOne;
        ImageView itemThreeSkillTwoBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemThreeSkillTwo;
        ImageView itemThreeSkillThreeBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemThreeSkillThree;
        //----------------------------------------------------------------------
        ImageView itemFourBar = new ImageView("file:src/images/Item_Bar.png");
        ImageView itemFourStrengthsBar = new ImageView("file:src/images/Strengths_Bar.png");
        ImageView itemFourStrengths;
        ImageView itemFourSkillOneBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemFourSkillOne;
        ImageView itemFourSkillTwoBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemFourSkillTwo;
        ImageView itemFourSkillThreeBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemFourSkillThree;
        //----------------------------------------------------------------------
        ImageView itemFiveBar = new ImageView("file:src/images/Item_Bar.png");
        ImageView itemFiveStrengthsBar = new ImageView("file:src/images/Strengths_Bar.png");
        ImageView itemFiveStrengths;
        ImageView itemFiveSkillOneBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemFiveSkillOne;
        ImageView itemFiveSkillTwoBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemFiveSkillTwo;
        ImageView itemFiveSkillThreeBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemFiveSkillThree;
        //----------------------------------------------------------------------
        ImageView itemSixBar = new ImageView("file:src/images/Item_Bar.png");
        ImageView itemSixStrengthsBar = new ImageView("file:src/images/Strengths_Bar.png");
        ImageView itemSixStrengths;
        ImageView itemSixSkillOneBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemSixSkillOne;
        ImageView itemSixSkillTwoBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemSixSkillTwo;
        ImageView itemSixSkillThreeBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemSixSkillThree;
        //----------------------------------------------------------------------
        ImageView itemSevenBar = new ImageView("file:src/images/Item_Bar.png");
        ImageView itemSevenStrengthsBar = new ImageView("file:src/images/Strengths_Bar.png");
        ImageView itemSevenStrengths;
        ImageView itemSevenSkillOneBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemSevenSkillOne;
        ImageView itemSevenSkillTwoBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemSevenSkillTwo;
        ImageView itemSevenSkillThreeBar = new ImageView("file:src/images/Item_Skill_Bar.png");
        ImageView itemSevenSkillThree;
        //----------------------------------------------------------------------
        ImageView strengthBar = new ImageView("file:src/images/Strength_Bar.png");
        ImageView magicBar = new ImageView("file:src/images/Magic_Bar.png");
        ImageView skillBar = new ImageView("file:src/images/Skill_Bar.png");
        ImageView speedBar = new ImageView("file:src/images/Speed_Bar.png");
        ImageView luckBar = new ImageView("file:src/images/Luck_Bar.png");
        ImageView defenseBar = new ImageView("file:src/images/Defense_Bar.png");
        ImageView resistanceBar = new ImageView("file:src/images/Resistance_Bar.png");
        ImageView statButton = new ImageView("file:src/images/Stat_Button.png");
        ImageView rating = new ImageView("file:src/images/Rating.png");
        //----------------------------------------------------------------------
        //Left/Right Arrow
        ImageView activeBloodButton = new ImageView("file:src/images/bloodType_active.png");
        ImageView deactiveBloodButton = new ImageView("file:src/images/bloodType_deactive.png");
        ImageView unit = new ImageView("file:src/images/unit.png");
        ImageView backup = new ImageView("file:src/images/backup.png");
        ImageView mapActive = new ImageView("file:src/images/map_active.png");
        ImageView mapDeactive = new ImageView("file:src/images/map_deactive.png");
        
        ImageView bloodWheel = new ImageView("file:src/images/bloodtype.png");
        
        //----------------------------------------------------------------------
        if (bloodButton && mapButton)
        {
            double charLength;
            statScreen.setCache(true);
            statScreen.relocate(5, 395); //Assign statScreen Location
            lowerScreen.getChildren().add(statScreen); //Add stat screen to Lower Screen Pane

            switch (player.getTeam()) //Get name bar, depends on team
            {
                case 0: nameBar = new ImageView("images/Blue_Background.png");
                    break; //Blue Team, Player
                case 1: nameBar = new ImageView("images/Green_Background.png");
                    break; //Green Team, NPC, ally to player
                case 2: nameBar = new ImageView("images/Red_Background.png");
                    break; //Red Team, primary enemy
                case 3: nameBar = new ImageView("images/Yellow_Background.png");
                    break; //Yellow Team, secondary enemy, cannot be attacked by player
            }
            nameBar.relocate(6, 398); //Assign nameBar Location
            lowerScreen.getChildren().add(nameBar); //Add Name Bar to Lower Screen Pane

            String characterName = cN.getCharName(player.getCharacterID()); //Set String for Character Name
            Text charName = new Text(characterName); //Add String to Text object charName
            charName.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Set Color for charName (Light Tan)
            charName.setFont(Font.font("Lucida Calligraphy", 17)); //Set Font for charName
            charLength = charName.layoutBoundsProperty().get().getWidth(); //Get charName Length in Pixels based on Font size and type
            charName.relocate(5 + (149 - charLength) / 2, 402); //Assign charName Location
            lowerScreen.getChildren().add(charName); //Add charName to Lower Screen Pane

            classNameBar.relocate(157, 400); //Assign classNameBar Location
            lowerScreen.getChildren().add(classNameBar); //Add classNameBar to Lower Screen Pane

            String cName = clN.getClassName(player.classID); //Set String for Character Class Name
            Text className = new Text(cName); //Add String to Text object className
            className.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Set Color for className (Dark Tan)
            className.setFont(Font.font("Lucida Calligraphy", 17)); //Set Font for className
            charLength = className.layoutBoundsProperty().get().getWidth(); //Get className Length in Pixels based on Font size and type
            className.relocate(162 + (184 - charLength) / 2, 402); //Assign className Location
            lowerScreen.getChildren().add(className); //Add className to Lower Screen Pane

            levelBar.relocate(347, 400); //Assign levelBar Location
            lowerScreen.getChildren().add(levelBar); //Add levelBar to Lower Screen Pane

            String lvl = Integer.toString(player.getLevel()); //Set String for Character Level
            Text charLevel = new Text(lvl); //Add String to Text object charLevel
            charLevel.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Set Color for charLevel (Dark Tan)
            charLevel.setFont(Font.font("Calibri", FontWeight.BOLD, 22)); //Set Font for charLevel
            charLength = charLevel.layoutBoundsProperty().get().getWidth(); //Get charLevel Length in Pixels based on Font size and Type
            charLevel.relocate(377 + (25 - charLength) / 2, 402);
            lowerScreen.getChildren().add(charLevel); //Add charLevel to Lower Screen Pane

            expBar.relocate(326, 426); //Assign expBar Location
            lowerScreen.getChildren().add(expBar); //Add expBar to Lower Screen Pane

            String exp = Integer.toString(player.getEXP()); //Set String for Character EXP
            Text charEXP = new Text(exp); //Add String to Text object charEXP
            charEXP.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Set Color for charEXP (Dark Tan)
            charEXP.setFont(Font.font("Calibri", FontWeight.BOLD, 22)); //Set Font for charEXP
            charLength = charEXP.layoutBoundsProperty().get().getWidth(); //Get charEXP Length in Pixels based on Font size and type
            charEXP.relocate(377 + (25 - charLength) / 2, 428);
            lowerScreen.getChildren().add(charEXP); //Add charEXP to Lower Screen Pane

            hpBar.relocate(153, 428); //Assign hpBar Location
            lowerScreen.getChildren().add(hpBar); //Add hpBar to Lower Screen Pane

            String hp = Integer.toString(player.getCurrentStats(0) + player.getBonusStat(0)) + " / "; //Set String for HP (Current HP), will need to add in for bonus HP
            Text charHP = new Text(hp); //Add String to Text object charHP
            charHP.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Set Color for charHP (Light Tan)
            charHP.setFont(Font.font("Arial", 30)); //Set Font for charHP
            charLength = charHP.layoutBoundsProperty().get().getWidth(); //Get charHP Length in Pixels based on Font size and type

            String mxhp = Integer.toString(player.getCurrentStats(1) + player.getBonusStat(0)); //Set Endind String for HP (Maximum HP), will need to add in for bonus HP
            Text charMHP = new Text(mxhp); //Add String to Text object charMHP
            if (player.getBonusStat(0) > 0)
            {
                charMHP.setFill(Color.BLUE);
            }
            if (player.getBonusStat(0) < 0)
            {
                charMHP.setFill(Color.RED);
            }
            if (player.getBonusStat(0) == 0)
            {
                charMHP.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Set Color for charHP (Light Tan)
            }
            charMHP.setFont(Font.font("Arial", 18)); //Set Font for charMHP
            charLength += charMHP.layoutBoundsProperty().get().getWidth(); //Add in charMHP Length in Pixels based on Font size and type

            charHP.relocate(195 + (120 - charLength) / 2, 435); //Assign charHP Location
            lowerScreen.getChildren().add(charHP); //Add charHP to Lower Screen Pane

            charMHP.relocate(251 + (120 - charLength) / 2, 442); //Assign charMHP Location
            lowerScreen.getChildren().add(charMHP); //Add charMHP to Lower Screen Pane

            movBar.relocate(326, 452); //Assign movBar Location
            lowerScreen.getChildren().add(movBar); //Add movBar to Lower Screen Pane

            String mov = Integer.toString(player.getCurrentStats(9)); //Set String for mov, will need to add in for bonus movement
            Text charMov = new Text(mov); //Add String to Text object charMov
            charMov.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Set Color for charMov (Dark Tan)
            charMov.setFont(Font.font("Calibri", FontWeight.BOLD, 22)); //Set Font for charMov
            charLength = charMov.layoutBoundsProperty().get().getWidth(); //Get charMov Length in Pixels based on Font size and type
            charMov.relocate(377 + (25 - charLength) / 2, 453); //Assign charMov Location
            lowerScreen.getChildren().add(charMov); //Add charMov to Lower Screen Pane
            //----------------------------------------------------------------------
            swordEXPBar.relocate(150, 551); //Assign swordEXPBar Location
            lowerScreen.getChildren().add(swordEXPBar); //Add swordEXPBar to Lower Screen Pane

            Rectangle swordEXP;
            Text swordLetter;
            //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
            if (player.getWeaponEXP(0) <= 0)
            {
                swordEXP = new Rectangle(149, 573, 0, 0);
                swordLetter = new Text("-");
            }
            else if (player.getWeaponEXP(0) > 0 && player.getWeaponEXP(0) < 30)
            {
                swordEXP = new Rectangle(149, 573, player.getWeaponEXP(0) * 31 / 30, 3);
                swordLetter = new Text("E");
            }
            else if (player.getWeaponEXP(0) >= 30 && player.getWeaponEXP(0) < 70)
            {
                swordEXP = new Rectangle(149, 573, (player.getWeaponEXP(0) - 30) * 31 / 39, 3);
                swordLetter = new Text("D");
            }
            else if (player.getWeaponEXP(0) >= 70 && player.getWeaponEXP(0) < 120)
            {
                swordEXP = new Rectangle(149, 573, (player.getWeaponEXP(0) - 70) * 31 / 49, 3);
                swordLetter = new Text("C");
            }
            else if (player.getWeaponEXP(0) >= 120 && player.getWeaponEXP(0) < 180)
            {
                swordEXP = new Rectangle(149, 573, (player.getWeaponEXP(0) - 120) * 31 / 59, 3);
                swordLetter = new Text("B");
            }
            else if (player.getWeaponEXP(0) >= 180 && player.getWeaponEXP(0) < 250)
            {
                swordEXP = new Rectangle(149, 573, (player.getWeaponEXP(0) - 180) * 31 / 69, 3);
                swordLetter = new Text("A");
            }
            else
            {
                swordEXP = new Rectangle(149, 573, 31, 3);
                swordLetter = new Text("S");
            }
            swordLetter.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Dark Tan
            swordLetter.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            swordLetter.relocate(172, 552);
            lowerScreen.getChildren().add(swordLetter);
            switch (player.getTeam())
            {
                case 0: swordEXP.setFill(Color.BLUE);
                    break;
                case 1: swordEXP.setFill(Color.GREEN);
                    break;
                case 2: swordEXP.setFill(Color.RED);
                    break;
                case 3: swordEXP.setFill(Color.YELLOW);
                    break;
            }
            lowerScreen.getChildren().add(swordEXP);

            lanceEXPBar.relocate(184, 551); //Assign lanceEXPBar Location
            lowerScreen.getChildren().add(lanceEXPBar); //Add lanceEXPBar to Lower Screen Pane

            Rectangle lanceEXP;
            Text lanceLetter;
            //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
            if (player.getWeaponEXP(1) <= 0)
            {
                lanceEXP = new Rectangle(183, 573, 0, 0);
                lanceLetter = new Text("-");
            }
            else if (player.getWeaponEXP(1) > 0 && player.getWeaponEXP(1) < 30)
            {
                lanceEXP = new Rectangle(183, 573, player.getWeaponEXP(1) * 31 / 30, 3);
                lanceLetter = new Text("E");
            }
            else if (player.getWeaponEXP(1) >= 30 && player.getWeaponEXP(1) < 70)
            {
                lanceEXP = new Rectangle(183, 573, (player.getWeaponEXP(1) - 30) * 31 / 39, 3);
                lanceLetter = new Text("D");
            }
            else if (player.getWeaponEXP(1) >= 70 && player.getWeaponEXP(1) < 120)
            {
                lanceEXP = new Rectangle(183, 573, (player.getWeaponEXP(1) - 70) * 31 / 49, 3);
                lanceLetter = new Text("C");
            }
            else if (player.getWeaponEXP(1) >= 120 && player.getWeaponEXP(1) < 180)
            {
                lanceEXP = new Rectangle(183, 573, (player.getWeaponEXP(1) - 120) * 31 / 59, 3);
                lanceLetter = new Text("B");
            }
            else if (player.getWeaponEXP(1) >= 180 && player.getWeaponEXP(1) < 250)
            {
                lanceEXP = new Rectangle(183, 573, (player.getWeaponEXP(1) - 180) * 31 / 69, 3);
                lanceLetter = new Text("A");
            }
            else
            {
                lanceEXP = new Rectangle(183, 573, 31, 3);
                lanceLetter = new Text("S");
            }
            lanceLetter.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Dark Tan
            lanceLetter.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            lanceLetter.relocate(206, 552);
            lowerScreen.getChildren().add(lanceLetter);
            switch (player.getTeam())
            {
                case 0: lanceEXP.setFill(Color.BLUE);
                    break;
                case 1: lanceEXP.setFill(Color.GREEN);
                    break;
                case 2: lanceEXP.setFill(Color.RED);
                    break;
                case 3: lanceEXP.setFill(Color.YELLOW);
                    break;
            }
            lowerScreen.getChildren().add(lanceEXP);

            axeEXPBar.relocate(218, 551); //Assign axeEXPBar Location
            lowerScreen.getChildren().add(axeEXPBar); //Add axeEXPBar to Lower Screen Pane

            Rectangle axeEXP;
            Text axeLetter;
            //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
            if (player.getWeaponEXP(2) <= 0)
            {
                axeEXP = new Rectangle(217, 573, 0, 0);
                axeLetter = new Text("-");
            }
            else if (player.getWeaponEXP(2) > 0 && player.getWeaponEXP(2) < 30)
            {
                axeEXP = new Rectangle(217, 573, player.getWeaponEXP(2) * 31 / 30, 3);
                axeLetter = new Text("E");
            }
            else if (player.getWeaponEXP(2) >= 30 && player.getWeaponEXP(2) < 70)
            {
                axeEXP = new Rectangle(217, 573, (player.getWeaponEXP(2) - 30) * 31 / 39, 3);
                axeLetter = new Text("D");
            }
            else if (player.getWeaponEXP(2) >= 70 && player.getWeaponEXP(2) < 120)
            {
                axeEXP = new Rectangle(217, 573, (player.getWeaponEXP(2) - 70) * 31 / 49, 3);
                axeLetter = new Text("C");
            }
            else if (player.getWeaponEXP(2) >= 120 && player.getWeaponEXP(2) < 180)
            {
                axeEXP = new Rectangle(217, 573, (player.getWeaponEXP(2) - 120) * 31 / 59, 3);
                axeLetter = new Text("B");
            }
            else if (player.getWeaponEXP(2) >= 180 && player.getWeaponEXP(2) < 250)
            {
                axeEXP = new Rectangle(217, 573, (player.getWeaponEXP(2) - 180) * 31 / 69, 3);
                axeLetter = new Text("A");
            }
            else
            {
                axeEXP = new Rectangle(217, 573, 31, 3);
                axeLetter = new Text("S");
            }
            axeLetter.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Dark Tan
            axeLetter.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            axeLetter.relocate(240, 552);
            lowerScreen.getChildren().add(axeLetter);
            switch (player.getTeam())
            {
                case 0: axeEXP.setFill(Color.BLUE);
                    break;
                case 1: axeEXP.setFill(Color.GREEN);
                    break;
                case 2: axeEXP.setFill(Color.RED);
                    break;
                case 3: axeEXP.setFill(Color.YELLOW);
                    break;
            }
            lowerScreen.getChildren().add(axeEXP);

            bowEXPBar.relocate(252, 551); //Assign bowEXPBar Location
            lowerScreen.getChildren().add(bowEXPBar); //Add bowEXPBar to Lower Screen Pane

            Rectangle bowEXP;
            Text bowLetter;
            //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
            if (player.getWeaponEXP(3) <= 0)
            {
                bowEXP = new Rectangle(251, 573, 0, 0);
                bowLetter = new Text("-");
            }
            else if (player.getWeaponEXP(3) > 0 && player.getWeaponEXP(3) < 30)
            {
                bowEXP = new Rectangle(251, 573, player.getWeaponEXP(3) * 31 / 30, 3);
                bowLetter = new Text("E");
            }
            else if (player.getWeaponEXP(3) >= 30 && player.getWeaponEXP(3) < 70)
            {
                bowEXP = new Rectangle(251, 573, (player.getWeaponEXP(3) - 30) * 31 / 39, 3);
                bowLetter = new Text("D");
            }
            else if (player.getWeaponEXP(3) >= 70 && player.getWeaponEXP(3) < 120)
            {
                bowEXP = new Rectangle(251, 573, (player.getWeaponEXP(3) - 70) * 31 / 49, 3);
                bowLetter = new Text("C");
            }
            else if (player.getWeaponEXP(3) >= 120 && player.getWeaponEXP(3) < 180)
            {
                bowEXP = new Rectangle(251, 573, (player.getWeaponEXP(3) - 120) * 31 / 59, 3);
                bowLetter = new Text("B");
            }
            else if (player.getWeaponEXP(3) >= 180 && player.getWeaponEXP(3) < 250)
            {
                bowEXP = new Rectangle(251, 573, (player.getWeaponEXP(3) - 180) * 31 / 69, 3);
                bowLetter = new Text("A");
            }
            else
            {
                bowEXP = new Rectangle(251, 573, 31, 3);
                bowLetter = new Text("S");
            }
            bowLetter.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Dark Tan
            bowLetter.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            bowLetter.relocate(274, 552);
            lowerScreen.getChildren().add(bowLetter);
            switch (player.getTeam())
            {
                case 0: bowEXP.setFill(Color.BLUE);
                    break;
                case 1: bowEXP.setFill(Color.GREEN);
                    break;
                case 2: bowEXP.setFill(Color.RED);
                    break;
                case 3: bowEXP.setFill(Color.YELLOW);
                    break;
            }
            lowerScreen.getChildren().add(bowEXP);

            shurikenEXPBar.relocate(286, 551); //Assign shurikenEXPBar Location
            lowerScreen.getChildren().add(shurikenEXPBar); //Add shurikenEXPBar to Lower Screen Pane

            Rectangle shurikenEXP;
            Text shurikenLetter;
            //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
            if (player.getWeaponEXP(4) <= 0)
            {
                shurikenEXP = new Rectangle(285, 573, 0, 0);
                shurikenLetter = new Text("-");
            }
            else if (player.getWeaponEXP(4) > 0 && player.getWeaponEXP(4) < 30)
            {
                shurikenEXP = new Rectangle(285, 573, player.getWeaponEXP(4) * 31 / 30, 3);
                shurikenLetter = new Text("E");
            }
            else if (player.getWeaponEXP(4) >= 30 && player.getWeaponEXP(4) < 70)
            {
                shurikenEXP = new Rectangle(285, 573, (player.getWeaponEXP(4) - 30) * 31 / 39, 3);
                shurikenLetter = new Text("D");
            }
            else if (player.getWeaponEXP(4) >= 70 && player.getWeaponEXP(4) < 120)
            {
                shurikenEXP = new Rectangle(285, 573, (player.getWeaponEXP(4) - 70) * 31 / 49, 3);
                shurikenLetter = new Text("C");
            }
            else if (player.getWeaponEXP(4) >= 120 && player.getWeaponEXP(4) < 180)
            {
                shurikenEXP = new Rectangle(285, 573, (player.getWeaponEXP(4) - 120) * 31 / 59, 3);
                shurikenLetter = new Text("B");
            }
            else if (player.getWeaponEXP(4) >= 180 && player.getWeaponEXP(4) < 250)
            {
                shurikenEXP = new Rectangle(285, 573, (player.getWeaponEXP(4) - 180) * 31 / 69, 3);
                shurikenLetter = new Text("A");
            }
            else
            {
                shurikenEXP = new Rectangle(285, 573, 31, 3);
                shurikenLetter = new Text("S");
            }
            shurikenLetter.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Dark Tan
            shurikenLetter.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            shurikenLetter.relocate(309, 552);
            lowerScreen.getChildren().add(shurikenLetter);
            switch (player.getTeam())
            {
                case 0: shurikenEXP.setFill(Color.BLUE);
                    break;
                case 1: shurikenEXP.setFill(Color.GREEN);
                    break;
                case 2: shurikenEXP.setFill(Color.RED);
                    break;
                case 3: shurikenEXP.setFill(Color.YELLOW);
                    break;
            }
            lowerScreen.getChildren().add(shurikenEXP);

            staffEXPBar.relocate(320, 551); //Assign staffEXPBar Location
            lowerScreen.getChildren().add(staffEXPBar); //Add staffEXPBar to Lower Screen Pane

            Rectangle staffEXP;
            Text staffLetter;
            //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
            if (player.getWeaponEXP(5) <= 0)
            {
                staffEXP = new Rectangle(320, 573, 0, 0);
                staffLetter = new Text("-");
            }
            else if (player.getWeaponEXP(5) > 0 && player.getWeaponEXP(5) < 30)
            {
                staffEXP = new Rectangle(320, 573, player.getWeaponEXP(5) * 31 / 30, 3);
                staffLetter = new Text("E");
            }
            else if (player.getWeaponEXP(5) >= 30 && player.getWeaponEXP(5) < 70)
            {
                staffEXP = new Rectangle(320, 573, (player.getWeaponEXP(5) - 30) * 31 / 39, 3);
                staffLetter = new Text("D");
            }
            else if (player.getWeaponEXP(5) >= 70 && player.getWeaponEXP(5) < 120)
            {
                staffEXP = new Rectangle(320, 573, (player.getWeaponEXP(5) - 70) * 31 / 49, 3);
                staffLetter = new Text("C");
            }
            else if (player.getWeaponEXP(5) >= 120 && player.getWeaponEXP(5) < 180)
            {
                staffEXP = new Rectangle(320, 573, (player.getWeaponEXP(5) - 120) * 31 / 59, 3);
                staffLetter = new Text("B");
            }
            else if (player.getWeaponEXP(5) >= 180 && player.getWeaponEXP(5) < 250)
            {
                staffEXP = new Rectangle(320, 573, (player.getWeaponEXP(5) - 180) * 31 / 69, 3);
                staffLetter = new Text("A");
            }
            else
            {
                staffEXP = new Rectangle(320, 573, 31, 3);
                staffLetter = new Text("S");
            }
            staffLetter.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Dark Tan
            staffLetter.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            staffLetter.relocate(343, 552);
            lowerScreen.getChildren().add(staffLetter);
            switch (player.getTeam())
            {
                case 0: staffEXP.setFill(Color.BLUE);
                    break;
                case 1: staffEXP.setFill(Color.GREEN);
                    break;
                case 2: staffEXP.setFill(Color.RED);
                    break;
                case 3: staffEXP.setFill(Color.YELLOW);
                    break;
            }
            lowerScreen.getChildren().add(staffEXP);

            fireEXPBar.relocate(150, 579); //Assign fireEXPBar Location
            lowerScreen.getChildren().add(fireEXPBar); //Add fireEXPBar to Lower Screen Pane

            Rectangle fireEXP;
            Text fireLetter;
            //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
            if (player.getWeaponEXP(6) <= 0)
            {
                fireEXP = new Rectangle(149, 600, 0, 0);
                fireLetter = new Text("-");
            }
            else if (player.getWeaponEXP(6) > 0 && player.getWeaponEXP(6) < 30)
            {
                fireEXP = new Rectangle(149, 600, player.getWeaponEXP(6) * 31 / 30, 3);
                fireLetter = new Text("E");
            }
            else if (player.getWeaponEXP(6) >= 30 && player.getWeaponEXP(6) < 70)
            {
                fireEXP = new Rectangle(149, 600, (player.getWeaponEXP(6) - 30) * 31 / 39, 3);
                fireLetter = new Text("D");
            }
            else if (player.getWeaponEXP(6) >= 70 && player.getWeaponEXP(6) < 120)
            {
                fireEXP = new Rectangle(149, 600, (player.getWeaponEXP(6) - 70) * 31 / 49, 3);
                fireLetter = new Text("C");
            }
            else if (player.getWeaponEXP(6) >= 120 && player.getWeaponEXP(6) < 180)
            {
                fireEXP = new Rectangle(149, 600, (player.getWeaponEXP(6) - 120) * 31 / 59, 3);
                fireLetter = new Text("B");
            }
            else if (player.getWeaponEXP(6) >= 180 && player.getWeaponEXP(6) < 250)
            {
                fireEXP = new Rectangle(149, 600, (player.getWeaponEXP(6) - 180) * 31 / 69, 3);
                fireLetter = new Text("A");
            }
            else
            {
                fireEXP = new Rectangle(149, 600, 31, 3);
                fireLetter = new Text("S");
            }
            fireLetter.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Dark Tan
            fireLetter.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            fireLetter.relocate(172, 580);
            lowerScreen.getChildren().add(fireLetter);
            switch (player.getTeam())
            {
                case 0: fireEXP.setFill(Color.BLUE);
                    break;
                case 1: fireEXP.setFill(Color.GREEN);
                    break;
                case 2: fireEXP.setFill(Color.RED);
                    break;
                case 3: fireEXP.setFill(Color.YELLOW);
                    break;
            }
            lowerScreen.getChildren().add(fireEXP);

            thunderEXPBar.relocate(184, 579); //Assign thunderEXPBar Location
            lowerScreen.getChildren().add(thunderEXPBar); //Add thunderEXPBar to Lower Screen Pane

            Rectangle thunderEXP;
            Text thunderLetter;
            //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
            if (player.getWeaponEXP(7) <= 0)
            {
                thunderEXP = new Rectangle(183, 600, 0, 0);
                thunderLetter = new Text("-");
            }
            else if (player.getWeaponEXP(7) > 0 && player.getWeaponEXP(7) < 30)
            {
                thunderEXP = new Rectangle(183, 600, player.getWeaponEXP(7) * 31 / 30, 3);
                thunderLetter = new Text("E");
            }
            else if (player.getWeaponEXP(7) >= 30 && player.getWeaponEXP(7) < 70)
            {
                thunderEXP = new Rectangle(183, 600, (player.getWeaponEXP(7) - 30) * 31 / 39, 3);
                thunderLetter = new Text("D");
            }
            else if (player.getWeaponEXP(7) >= 70 && player.getWeaponEXP(7) < 120)
            {
                thunderEXP = new Rectangle(183, 600, (player.getWeaponEXP(7) - 70) * 31 / 49, 3);
                thunderLetter = new Text("C");
            }
            else if (player.getWeaponEXP(7) >= 120 && player.getWeaponEXP(7) < 180)
            {
                thunderEXP = new Rectangle(183, 600, (player.getWeaponEXP(7) - 120) * 31 / 59, 3);
                thunderLetter = new Text("B");
            }
            else if (player.getWeaponEXP(7) >= 180 && player.getWeaponEXP(7) < 250)
            {
                thunderEXP = new Rectangle(183, 600, (player.getWeaponEXP(7) - 180) * 31 / 69, 3);
                thunderLetter = new Text("A");
            }
            else
            {
                thunderEXP = new Rectangle(183, 600, 31, 3);
                thunderLetter = new Text("S");
            }
            thunderLetter.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Dark Tan
            thunderLetter.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            thunderLetter.relocate(206, 580);
            lowerScreen.getChildren().add(thunderLetter);
            switch (player.getTeam())
            {
                case 0: thunderEXP.setFill(Color.BLUE);
                    break;
                case 1: thunderEXP.setFill(Color.GREEN);
                    break;
                case 2: thunderEXP.setFill(Color.RED);
                    break;
                case 3: thunderEXP.setFill(Color.YELLOW);
                    break;
            }
            lowerScreen.getChildren().add(thunderEXP);

            windEXPBar.relocate(218, 579); //Assign windEXPBar Location
            lowerScreen.getChildren().add(windEXPBar); //Add windEXPBar to Lower Screen Pane

            Rectangle windEXP;
            Text windLetter;
            //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
            if (player.getWeaponEXP(8) <= 0)
            {
                windEXP = new Rectangle(217, 600, 0, 0);
                windLetter = new Text("-");
            }
            else if (player.getWeaponEXP(8) > 0 && player.getWeaponEXP(8) < 30)
            {
                windEXP = new Rectangle(217, 600, player.getWeaponEXP(8) * 31 / 30, 3);
                windLetter = new Text("E");
            }
            else if (player.getWeaponEXP(8) >= 30 && player.getWeaponEXP(8) < 70)
            {
                windEXP = new Rectangle(217, 600, (player.getWeaponEXP(8) - 30) * 31 / 39, 3);
                windLetter = new Text("D");
            }
            else if (player.getWeaponEXP(8) >= 70 && player.getWeaponEXP(8) < 120)
            {
                windEXP = new Rectangle(217, 600, (player.getWeaponEXP(8) - 70) * 31 / 49, 3);
                windLetter = new Text("C");
            }
            else if (player.getWeaponEXP(8) >= 120 && player.getWeaponEXP(8) < 180)
            {
                windEXP = new Rectangle(217, 600, (player.getWeaponEXP(8) - 120) * 31 / 59, 3);
                windLetter = new Text("B");
            }
            else if (player.getWeaponEXP(8) >= 180 && player.getWeaponEXP(8) < 250)
            {
                windEXP = new Rectangle(217, 600, (player.getWeaponEXP(8) - 180) * 31 / 69, 3);
                windLetter = new Text("A");
            }
            else
            {
                windEXP = new Rectangle(217, 600, 31, 3);
                windLetter = new Text("S");
            }
            windLetter.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Dark Tan
            windLetter.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            windLetter.relocate(240, 580);
            lowerScreen.getChildren().add(windLetter);
            switch (player.getTeam())
            {
                case 0: windEXP.setFill(Color.BLUE);
                    break;
                case 1: windEXP.setFill(Color.GREEN);
                    break;
                case 2: windEXP.setFill(Color.RED);
                    break;
                case 3: windEXP.setFill(Color.YELLOW);
                    break;
            }
            lowerScreen.getChildren().add(windEXP);

            lightEXPBar.relocate(252, 579); //Assign lightEXPBar Location
            lowerScreen.getChildren().add(lightEXPBar); //Add lightEXPBar to Lower Screen Pane

            Rectangle lightEXP;
            Text lightLetter;
            //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
            if (player.getWeaponEXP(9) <= 0)
            {
                lightEXP = new Rectangle(251, 600, 0, 0);
                lightLetter = new Text("-");
            }
            else if (player.getWeaponEXP(9) > 0 && player.getWeaponEXP(9) < 30)
            {
                lightEXP = new Rectangle(251, 600, player.getWeaponEXP(9) * 31 / 30, 3);
                lightLetter = new Text("E");
            }
            else if (player.getWeaponEXP(9) >= 30 && player.getWeaponEXP(9) < 70)
            {
                lightEXP = new Rectangle(251, 600, (player.getWeaponEXP(9) - 30) * 31 / 39, 3);
                lightLetter = new Text("D");
            }
            else if (player.getWeaponEXP(9) >= 70 && player.getWeaponEXP(9) < 120)
            {
                lightEXP = new Rectangle(251, 600, (player.getWeaponEXP(9) - 70) * 31 / 49, 3);
                lightLetter = new Text("C");
            }
            else if (player.getWeaponEXP(9) >= 120 && player.getWeaponEXP(9) < 180)
            {
                lightEXP = new Rectangle(251, 600, (player.getWeaponEXP(9) - 120) * 31 / 59, 3);
                lightLetter = new Text("B");
            }
            else if (player.getWeaponEXP(9) >= 180 && player.getWeaponEXP(9) < 250)
            {
                lightEXP = new Rectangle(251, 600, (player.getWeaponEXP(9) - 180) * 31 / 69, 3);
                lightLetter = new Text("A");
            }
            else
            {
                lightEXP = new Rectangle(251, 600, 31, 3);
                lightLetter = new Text("S");
            }
            lightLetter.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Dark Tan
            lightLetter.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            lightLetter.relocate(274, 580);
            lowerScreen.getChildren().add(lightLetter);
            switch (player.getTeam())
            {
                case 0: lightEXP.setFill(Color.BLUE);
                    break;
                case 1: lightEXP.setFill(Color.GREEN);
                    break;
                case 2: lightEXP.setFill(Color.RED);
                    break;
                case 3: lightEXP.setFill(Color.YELLOW);
                    break;
            }
            lowerScreen.getChildren().add(lightEXP);

            darkEXPBar.relocate(286, 579); //Assign darkEXPBar Location
            lowerScreen.getChildren().add(darkEXPBar); //Add darkEXPBar to Lower Screen Pane

            Rectangle darkEXP;
            Text darkLetter;
            //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
            if (player.getWeaponEXP(10) <= 0)
            {
                darkEXP = new Rectangle(285, 600, 0, 0);
                darkLetter = new Text("-");
            }
            else if (player.getWeaponEXP(10) > 0 && player.getWeaponEXP(10) < 30)
            {
                darkEXP = new Rectangle(285, 600, player.getWeaponEXP(10) * 31 / 30, 3);
                darkLetter = new Text("E");
            }
            else if (player.getWeaponEXP(10) >= 30 && player.getWeaponEXP(10) < 70)
            {
                darkEXP = new Rectangle(285, 600, (player.getWeaponEXP(10) - 30) * 31 / 39, 3);
                darkLetter = new Text("D");
            }
            else if (player.getWeaponEXP(10) >= 70 && player.getWeaponEXP(10) < 120)
            {
                darkEXP = new Rectangle(285, 600, (player.getWeaponEXP(10) - 70) * 31 / 49, 3);
                darkLetter = new Text("C");
            }
            else if (player.getWeaponEXP(10) >= 120 && player.getWeaponEXP(10) < 180)
            {
                darkEXP = new Rectangle(285, 600, (player.getWeaponEXP(10) - 120) * 31 / 59, 3);
                darkLetter = new Text("B");
            }
            else if (player.getWeaponEXP(10) >= 180 && player.getWeaponEXP(10) < 250)
            {
                darkEXP = new Rectangle(285, 600, (player.getWeaponEXP(10) - 180) * 31 / 69, 3);
                darkLetter = new Text("A");
            }
            else
            {
                darkEXP = new Rectangle(285, 600, 31, 3);
                darkLetter = new Text("S");
            }
            darkLetter.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Dark Tan
            darkLetter.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            darkLetter.relocate(309, 580);
            lowerScreen.getChildren().add(darkLetter);
            switch (player.getTeam())
            {
                case 0: darkEXP.setFill(Color.BLUE);
                    break;
                case 1: darkEXP.setFill(Color.GREEN);
                    break;
                case 2: darkEXP.setFill(Color.RED);
                    break;
                case 3: darkEXP.setFill(Color.YELLOW);
                    break;
            }
            lowerScreen.getChildren().add(darkEXP);

            otherEXPBar.relocate(320, 579); //Assign otherEXPBar Location
            lowerScreen.getChildren().add(otherEXPBar); //Add otherEXPBar to Lower Screen Pane

            Rectangle otherEXP;
            Text otherLetter;
            //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
            if (player.getWeaponEXP(11) <= 0)
            {
                otherEXP = new Rectangle(320, 600, 0, 0);
                otherLetter = new Text("-");
            }
            else if (player.getWeaponEXP(11) > 0 && player.getWeaponEXP(11) < 30)
            {
                otherEXP = new Rectangle(320, 600, player.getWeaponEXP(11) * 31 / 30, 3);
                otherLetter = new Text("E");
            }
            else if (player.getWeaponEXP(11) >= 30 && player.getWeaponEXP(11) < 70)
            {
                otherEXP = new Rectangle(320, 600, (player.getWeaponEXP(11) - 30) * 31 / 39, 3);
                otherLetter = new Text("D");
            }
            else if (player.getWeaponEXP(11) >= 70 && player.getWeaponEXP(11) < 120)
            {
                otherEXP = new Rectangle(320, 600, (player.getWeaponEXP(11) - 70) * 31 / 49, 3);
                otherLetter = new Text("C");
            }
            else if (player.getWeaponEXP(11) >= 120 && player.getWeaponEXP(11) < 180)
            {
                otherEXP = new Rectangle(320, 600, (player.getWeaponEXP(11) - 120) * 31 / 59, 3);
                otherLetter = new Text("B");
            }
            else if (player.getWeaponEXP(11) >= 180 && player.getWeaponEXP(11) < 250)
            {
                otherEXP = new Rectangle(320, 600, (player.getWeaponEXP(11) - 180) * 31 / 69, 3);
                otherLetter = new Text("A");
            }
            else
            {
                otherEXP = new Rectangle(320, 600, 31, 3);
                otherLetter = new Text("S");
            }
            otherLetter.setFill(Color.color(0.2745098039f, 0.1215686275f, 0.0745098039f)); //Dark Tan
            otherLetter.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            otherLetter.relocate(343, 580);
            lowerScreen.getChildren().add(otherLetter);
            switch (player.getTeam())
            {
                case 0: otherEXP.setFill(Color.BLUE);
                    break;
                case 1: otherEXP.setFill(Color.GREEN);
                    break;
                case 2: otherEXP.setFill(Color.RED);
                    break;
                case 3: otherEXP.setFill(Color.YELLOW);
                    break;
            }
            lowerScreen.getChildren().add(otherEXP);
            //----------------------------------------------------------------------
            skillOneBar.relocate(354, 490); //Assign skillOneBar Location
            lowerScreen.getChildren().add(skillOneBar); //Add skillOneBar to Lower Screen Pane

            skillOne = sI.getWeaponSkills(player.getSkills(0)); //Get image for Skill One
            skillOne.relocate(355, 491); //Assign skillOne Location
            lowerScreen.getChildren().add(skillOne); //Add skillOne to Lower Screen Pane

            skillTwoBar.relocate(375, 490); //Assign skillTwoBar Location
            lowerScreen.getChildren().add(skillTwoBar); //Add skillTwoBar to Lower Screen Pane

            skillTwo = sI.getWeaponSkills(player.getSkills(1)); //Get image for Skill Two
            skillTwo.relocate(376, 491); //Assign skillTwo Location
            lowerScreen.getChildren().add(skillTwo); //Add skillTwo to Lower Screen Pane

            skillThreeBar.relocate(396, 490); //Assign skillThreeBar Location
            lowerScreen.getChildren().add(skillThreeBar); //Add skillThreeBar to Lower Screen Pane

            skillThree = sI.getWeaponSkills(player.getSkills(2)); //Get image for Skill Three
            skillThree.relocate(397, 491); //Assign skillThree Location
            lowerScreen.getChildren().add(skillThree); //Add skillThree to Lower Screen Pane

            skillFourBar.relocate(354, 512); //Assign skillFourBar Location
            lowerScreen.getChildren().add(skillFourBar); //Add skillFourBar to Lower Screen Pane

            skillFour = sI.getWeaponSkills(player.getSkills(3)); //Get image for Skill Four
            skillFour.relocate(354, 513); //Assign skillFour Location
            lowerScreen.getChildren().add(skillFour); //Add skillFour to Lower Screen Pane

            skillFiveBar.relocate(375, 512); //Assign skillFiveBar Location
            lowerScreen.getChildren().add(skillFiveBar); //Add skillFiveBar to Lower Screen Pane

            skillFive = sI.getWeaponSkills(player.getSkills(4)); //Get image for Skill Five
            skillFive.relocate(376, 513); //Assign skillFive Location
            lowerScreen.getChildren().add(skillFive); //Add skillFive to Lower Scren Pane

            skillSixBar.relocate(396, 512); //Assign skillSixBar Location
            lowerScreen.getChildren().add(skillSixBar); //Add skillSixBar to Lower Screen Pane

            skillSix = sI.getWeaponSkills(player.getSkills(5)); //Get image for Skill Six
            skillSix.relocate(397, 513); //Assign skillSix Location
            lowerScreen.getChildren().add(skillSix); //Add skillSix to Lower Screen Bar
            //----------------------------------------------------------------------
            attackBar.relocate(151, 491); //Assign attackBar Location
            lowerScreen.getChildren().add(attackBar); //Add attackBar to Lower Screen Pane

            String attack = Integer.toString(a.getAttack(eW.getEquippedWeapon(player.getItems()), player.getAllCurrentStats(), player.getAllBonusStats()));
            Text charAttack = new Text(attack);
            charAttack.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Light Tan
            charAttack.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            charLength = charAttack.layoutBoundsProperty().get().getWidth();
            charAttack.relocate(187 + (55 - charLength) / 2, 495);
            lowerScreen.getChildren().add(charAttack);

            criticalBar.relocate(245, 491); //Assign criticalBar Location
            lowerScreen.getChildren().add(criticalBar); //Add criticalBar to Lower Screen Pane

            String critical = Integer.toString(c.getCritical(eW.getEquippedWeapon(player.getItems()), player.getCurrentStats(4), player.getBonusStat(3), player.getSkillList(), player.getKills()));
            Text charCritical = new Text(critical);
            charCritical.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Light Tan
            charCritical.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            charLength = charCritical.layoutBoundsProperty().get().getWidth();
            charCritical.relocate(272 + (55 - charLength) / 2, 495);
            lowerScreen.getChildren().add(charCritical);

            hitBar.relocate(151, 517); //Assign hitBar Location
            lowerScreen.getChildren().add(hitBar); //Add hitBar to Lower Screen Pane

            String hit = Integer.toString(h.getHit(eW.getEquippedWeapon(player.getItems()), player.getCurrentStats(4), player.getBonusStat(3), player.getCurrentStats(6), player.getBonusStat(5), player.getSkillList()));
            Text charHit = new Text(hit);
            charHit.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Light Tan
            charHit.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            charLength = charHit.layoutBoundsProperty().get().getWidth();
            charHit.relocate(187 + (55 - charLength) / 2, 522);
            lowerScreen.getChildren().add(charHit);

            avoidBar.relocate(245, 517); //Assign avoidBar Location
            lowerScreen.getChildren().add(avoidBar); //Add avoidBar to Lower Screen Pane

            String avoid = Integer.toString(av.getAvoid(player.getCurrentStats(5), player.getBonusStat(4), player.getCurrentStats(6), player.getBonusStat(5), player.getAllSkills()));
            Text charAvoid = new Text(avoid);
            charAvoid.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Light Tan
            charAvoid.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            charLength = charAvoid.layoutBoundsProperty().get().getWidth();
            charAvoid.relocate(272 + (55 - charLength) / 2, 522);
            lowerScreen.getChildren().add(charAvoid);
            //----------------------------------------------------------------------
            //Item One Start
            itemOneBar.relocate(150, 611); //Assign itemOneBar Location
            lowerScreen.getChildren().add(itemOneBar); //Add itemOneBar to Lower Screen Pane

            String i1 = wN.getWeaponName(player.getItem(0).getID()); //Set String for i1 (Item One Name)
            Text itemOne = new Text(i1); //Add String to Text object itemOne
            itemOne.setFill(Color.color(0.7607843137f, 0.4745098039f, 0.1568627415f)); //Set Color for itemOne (Dark Tan)
            itemOne.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for itemOne
            itemOne.relocate(177, 612); //Assign itemOne Location
            lowerScreen.getChildren().add(itemOne); //Add itemOne to Lower Screen Pane

            itemOneStrengthsBar.relocate(320, 611); //Assign itemOneStrengths Location
            lowerScreen.getChildren().add(itemOneStrengthsBar); //Add itemOneStrengthsBar to Lower Screen Pane

            itemOneStrengths = wS.getWeaponStrengths(player.getItem(0));
            itemOneStrengths.relocate(321, 612);
            lowerScreen.getChildren().add(itemOneStrengths);

            itemOneSkillOneBar.relocate(354, 611); //Assign itemOneSkillOneBar Location
            lowerScreen.getChildren().add(itemOneSkillOneBar); //Add itemOneSkillOneBar to Lower Screen Pane

            itemOneSkillOne = sI.getWeaponSkills(player.getItem(0).getSkillOne());
            itemOneSkillOne.relocate(355, 612);
            lowerScreen.getChildren().add(itemOneSkillOne);

            itemOneSkillTwoBar.relocate(375, 611); //Assign itemOneSkillTwoBar Location
            lowerScreen.getChildren().add(itemOneSkillTwoBar); //Add itemOneSkillTwoBar to Lower Screen Pane

            itemOneSkillTwo = sI.getWeaponSkills(player.getItem(0).getSkillTwo());
            itemOneSkillTwo.relocate(376, 612);
            lowerScreen.getChildren().add(itemOneSkillTwo);

            itemOneSkillThreeBar.relocate(396, 611); //Assign itemOneSkillThree Location
            lowerScreen.getChildren().add(itemOneSkillThreeBar); //Add itemOneSkillThreeBar to Lower Screen Pane

            itemOneSkillThree = sI.getWeaponSkills(player.getItem(0).getSkillThree());
            itemOneSkillThree.relocate(397, 612);
            lowerScreen.getChildren().add(itemOneSkillThree);
            //Item One End
            //----------------------------------------------------------------------
            //Item Two Start
            itemTwoBar.relocate(150, 632); //Assign itemTwoBar Location
            lowerScreen.getChildren().add(itemTwoBar); //Add itemTwoBar to Lower Screen Pane

            String i2 = wN.getWeaponName(player.getItem(1).getID()); //Set String for i2 (Item Two Name)
            Text itemTwo = new Text(i2); //Add String to Text object itemTwo
            itemTwo.setFill(Color.color(0.7607843137f, 0.4745098039f, 0.1568627415f)); //Set Color for itemTwo (Dark Tan)
            itemTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for itemTwo
            itemTwo.relocate(177, 633); //Assign itemTwo Location
            lowerScreen.getChildren().add(itemTwo); //Add itemTwo to Lower Screen Pane

            itemTwoStrengthsBar.relocate(320, 632); //Assign itemTwoStrengthsBar Location
            lowerScreen.getChildren().add(itemTwoStrengthsBar); //Add itemTwoStrengthsBar to Lower Screen Pane

            itemTwoStrengths = wS.getWeaponStrengths(player.getItem(1));
            itemTwoStrengths.relocate(321, 633);
            lowerScreen.getChildren().add(itemTwoStrengths);

            itemTwoSkillOneBar.relocate(354, 632); //Assign itemTwoSkillOneBar Location
            lowerScreen.getChildren().add(itemTwoSkillOneBar); //Add itemTwoSkillOneBar to Lower Screen Pane

            itemTwoSkillOne = sI.getWeaponSkills(player.getItem(1).getSkillOne());
            itemTwoSkillOne.relocate(355, 633);
            lowerScreen.getChildren().add(itemTwoSkillOne);

            itemTwoSkillTwoBar.relocate(375, 632); //Assign itemTwoSkillTwoBar Location
            lowerScreen.getChildren().add(itemTwoSkillTwoBar); //Add itemTwoSkillTwoBar to Lower Screen Pane

            itemTwoSkillTwo = sI.getWeaponSkills(player.getItem(1).getSkillTwo());
            itemTwoSkillTwo.relocate(376, 633);
            lowerScreen.getChildren().add(itemTwoSkillTwo);

            itemTwoSkillThreeBar.relocate(396, 632); //Assign itemTwoSkillThreeBar Location
            lowerScreen.getChildren().add(itemTwoSkillThreeBar); //Add itemTwoSkillThreeBar to Lower Screen Pane

            itemTwoSkillThree = sI.getWeaponSkills(player.getItem(1).getSkillThree());
            itemTwoSkillThree.relocate(397, 633);
            lowerScreen.getChildren().add(itemTwoSkillThree);
            //Item Two End
            //----------------------------------------------------------------------
            //Item Three Start
            itemThreeBar.relocate(150, 653); //Assign itemThreeBar Location
            lowerScreen.getChildren().add(itemThreeBar); //Add itemThreeBar to Lower Screen Pane

            String i3 = wN.getWeaponName(player.getItem(2).getID()); //Set String for i3 (Item Three Name)
            Text itemThree = new Text(i3); //Add String to Text object itemThree
            itemThree.setFill(Color.color(0.7607843137f, 0.4745098039f, 0.1568627415f)); //Set Color for itemThree (Dark Tan)
            itemThree.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for itemThree
            itemThree.relocate(177, 654); //Assign itemThree Location
            lowerScreen.getChildren().add(itemThree); //Add itemThree to Lower Screen Pane

            itemThreeStrengthsBar.relocate(320, 653); //Assign itemThreeStrengthsBar Location
            lowerScreen.getChildren().add(itemThreeStrengthsBar); //Add itemThreeStrengthsBar to Lower Screen Pane

            itemThreeStrengths = wS.getWeaponStrengths(player.getItem(2));
            itemThreeStrengths.relocate(321, 654);
            lowerScreen.getChildren().add(itemThreeStrengths);

            itemThreeSkillOneBar.relocate(354, 653); //Assign itemThreeSkillOneBar Location
            lowerScreen.getChildren().add(itemThreeSkillOneBar); //Add itemThreeSkillOneBar to Lower Screen Pane

            itemThreeSkillOne = sI.getWeaponSkills(player.getItem(2).getSkillOne());
            itemThreeSkillOne.relocate(355, 655);
            lowerScreen.getChildren().add(itemThreeSkillOne);

            itemThreeSkillTwoBar.relocate(375, 653); //Assign itemThreeSkillTwoBar Location
            lowerScreen.getChildren().add(itemThreeSkillTwoBar); //Add itemThreeSkillTwoBar to Lower Screen Pane

            itemThreeSkillTwo = sI.getWeaponSkills(player.getItem(2).getSkillTwo());
            itemThreeSkillTwo.relocate(376, 654);
            lowerScreen.getChildren().add(itemThreeSkillTwo);

            itemThreeSkillThreeBar.relocate(396, 653); //Assign itemThreeSkillThreeBar Location
            lowerScreen.getChildren().add(itemThreeSkillThreeBar); //Add itemThreeSkillThreeBar to Lower Screen Pane

            itemThreeSkillThree = sI.getWeaponSkills(player.getItem(2).getSkillThree());
            itemThreeSkillThree.relocate(397, 654);
            lowerScreen.getChildren().add(itemThreeSkillThree);
            //Item Three End
            //----------------------------------------------------------------------
            //Item Four Start
            itemFourBar.relocate(150, 674); //Assign itemFourBar Location
            lowerScreen.getChildren().add(itemFourBar); //Add itemFourBar to Lower Screen Pane

            String i4 = wN.getWeaponName(player.getItem(3).getID()); //Set String for i4 (Item Four Name)
            Text itemFour = new Text(i4); //Add String to Text object itemFour
            itemFour.setFill(Color.color(0.7607843137f, 0.4745098039f, 0.1568627415f)); //Set Color for itemFour (Dark Tan)
            itemFour.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for itemFour
            itemFour.relocate(177, 675); //Assign itemFour Location
            lowerScreen.getChildren().add(itemFour); //Add itemFour to Lower Screen Pane

            itemFourStrengthsBar.relocate(320, 674); //Assign itemFourStrengthsBar Location
            lowerScreen.getChildren().add(itemFourStrengthsBar); //Add itemFourStrengthsBar to Lower Screen Pane

            itemFourStrengths = wS.getWeaponStrengths(player.getItem(3));
            itemFourStrengths.relocate(321, 675);
            lowerScreen.getChildren().add(itemFourStrengths);

            itemFourSkillOneBar.relocate(354, 674); //Assign itemFourSkillOneBar Location
            lowerScreen.getChildren().add(itemFourSkillOneBar); //Add itemFourSkillOneBar to Lower Screen Pane

            itemFourSkillOne = sI.getWeaponSkills(player.getItem(3).getSkillOne());
            itemFourSkillOne.relocate(355, 675);
            lowerScreen.getChildren().add(itemFourSkillOne);

            itemFourSkillTwoBar.relocate(375, 674); //Assign itemFourSkillTwoBar Location
            lowerScreen.getChildren().add(itemFourSkillTwoBar); //Add itemFourSkillTwoBar to Lower Screen Pane

            itemFourSkillTwo = sI.getWeaponSkills(player.getItem(3).getSkillTwo());
            itemFourSkillTwo.relocate(376, 675);
            lowerScreen.getChildren().add(itemFourSkillTwo);

            itemFourSkillThreeBar.relocate(396, 674); //Assign itemFourSkillThreeBar Location
            lowerScreen.getChildren().add(itemFourSkillThreeBar); //Add itemFourSkillThreeBar to Lower Screen Pane

            itemFourSkillThree = sI.getWeaponSkills(player.getItem(3).getSkillThree());
            itemFourSkillThree.relocate(397, 675);
            lowerScreen.getChildren().add(itemFourSkillThree);
            //Item Four End
            //----------------------------------------------------------------------
            //Item Five Start
            itemFiveBar.relocate(150, 695); //Assign itemFiveBar Location
            lowerScreen.getChildren().add(itemFiveBar); //Add itemFiveBar to Lower Screen Pane

            String i5 = wN.getWeaponName(player.getItem(4).getID()); //Set String for i5 (Item Five Name)
            Text itemFive = new Text(i5); //Add String to Text object itemFive
            itemFive.setFill(Color.color(0.7607843137f, 0.4745098039f, 0.1568627415f)); //Set Color for itemFive (Dark Tan)
            itemFive.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for itemFive
            itemFive.relocate(177, 696); //Assign itemFive Location
            lowerScreen.getChildren().add(itemFive); //Add itemFive to Lower Screen Pane

            itemFiveStrengthsBar.relocate(320, 695); //Assign itemFiveStrengths Location
            lowerScreen.getChildren().add(itemFiveStrengthsBar); //Add itemFiveStrengthsBar to Lower Screen Pane

            itemFiveStrengths = wS.getWeaponStrengths(player.getItem(4));
            itemFiveStrengths.relocate(321, 696);
            lowerScreen.getChildren().add(itemFiveStrengths);

            itemFiveSkillOneBar.relocate(354, 695); //Assign itemFiveSkillOneBar Location
            lowerScreen.getChildren().add(itemFiveSkillOneBar); //Add itemFiveSkillOneBar to Lower Screen Pane

            itemFiveSkillOne = sI.getWeaponSkills(player.getItem(4).getSkillOne());
            itemFiveSkillOne.relocate(355, 696);
            lowerScreen.getChildren().add(itemFiveSkillOne);

            itemFiveSkillTwoBar.relocate(375, 695); //Assign itemFiveSkillTwoBar Location
            lowerScreen.getChildren().add(itemFiveSkillTwoBar); //Add itemFiveSkillTwoBar to Lower Screen Pane

            itemFiveSkillTwo = sI.getWeaponSkills(player.getItem(4).getSkillTwo());
            itemFiveSkillTwo.relocate(376, 696);
            lowerScreen.getChildren().add(itemFiveSkillTwo);

            itemFiveSkillThreeBar.relocate(396, 695); //Assign itemFiveSkillThreeBar Location
            lowerScreen.getChildren().add(itemFiveSkillThreeBar); //Add itemFiveSkillThreeBar to Lower Screen Pane

            itemFiveSkillThree = sI.getWeaponSkills(player.getItem(4).getSkillThree());
            itemFiveSkillThree.relocate(397, 696);
            lowerScreen.getChildren().add(itemFiveSkillThree);
            //Item Five End
            //----------------------------------------------------------------------
            //Item Six Start
            itemSixBar.relocate(150, 716); //Assign itemSixBar Location
            lowerScreen.getChildren().add(itemSixBar); //Add itemSixBar to Lower Screen Pane

            String i6 = wN.getWeaponName(player.getItem(5).getID()); //Set String for i6 (Item Six Name)
            Text itemSix = new Text(i6); //Add String to Text object itemSix
            itemSix.setFill(Color.color(0.7607843137f, 0.4745098039f, 0.1568627415f)); //Set Color for itemSix (Dark Tan)
            itemSix.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for itemSix
            itemSix.relocate(177, 717); //Assign itemSix Location
            lowerScreen.getChildren().add(itemSix); //Add itemSix to Lower Screen Pane

            itemSixStrengthsBar.relocate(320, 716); //Assign itemSixStrengthsBar Location
            lowerScreen.getChildren().add(itemSixStrengthsBar); //Add itemSixStrengthsBar to Lower Screen Pane

            itemSixStrengths = wS.getWeaponStrengths(player.getItem(5));
            itemSixStrengths.relocate(321, 717);
            lowerScreen.getChildren().add(itemSixStrengths);

            itemSixSkillOneBar.relocate(354, 716); //Assign itemSixSkillOneBar Location
            lowerScreen.getChildren().add(itemSixSkillOneBar); //Add itemSixSkillOneBar to Lower Screen Pane

            itemSixSkillOne = sI.getWeaponSkills(player.getItem(5).getSkillOne());
            itemSixSkillOne.relocate(355, 717);
            lowerScreen.getChildren().add(itemSixSkillOne);

            itemSixSkillTwoBar.relocate(375, 716); //Assign itemSixSkillTwoBar Location
            lowerScreen.getChildren().add(itemSixSkillTwoBar); //Add itemSixSkillTwoBar to Lower Screen Pane

            itemSixSkillTwo = sI.getWeaponSkills(player.getItem(5).getSkillTwo());
            itemSixSkillTwo.relocate(376, 717);
            lowerScreen.getChildren().add(itemSixSkillTwo);

            itemSixSkillThreeBar.relocate(396, 716); //Assign itemSixSkillThreeBar Location
            lowerScreen.getChildren().add(itemSixSkillThreeBar); //Add itemSixSkillThreeBar to Lower Screen Pane

            itemSixSkillThree = sI.getWeaponSkills(player.getItem(5).getSkillThree());
            itemSixSkillThree.relocate(397, 717);
            lowerScreen.getChildren().add(itemSixSkillThree);
            //Item Six End
            //----------------------------------------------------------------------
            //Item Seven Start
            itemSevenBar.relocate(150, 737); //Assign itemSevenBar Location
            lowerScreen.getChildren().add(itemSevenBar); //Add itemSevenBar to Lower Screen Pane

            String i7 = wN.getWeaponName(player.getItem(6).getID()); //Set String for i7 (Item Seven Name)
            Text itemSeven = new Text(i7); //Add String to Text object itemSeven
            itemSeven.setFill(Color.color(0.7607843137f, 0.4745098039f, 0.1568627415f)); //Set Color for itemSeven (Dark Tan)
            itemSeven.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for itemSeven
            itemSeven.relocate(177, 738); //Assign itemSeven Location
            lowerScreen.getChildren().add(itemSeven); //Add itemSeven to Lower Screen Pane

            itemSevenStrengthsBar.relocate(320, 737); //Assign itemSevenStrengthsBar Location
            lowerScreen.getChildren().add(itemSevenStrengthsBar); //Add itemSevenStrengthsBar to Lower Screen Pane

            itemSevenStrengths = wS.getWeaponStrengths(player.getItem(6));
            itemSevenStrengths.relocate(321, 738);
            lowerScreen.getChildren().add(itemSevenStrengths);

            itemSevenSkillOneBar.relocate(354, 737); //Assign itemSevenSkillOneBar Location
            lowerScreen.getChildren().add(itemSevenSkillOneBar); //Add itemSevenSkillOneBar to Lower Screen Pane

            itemSevenSkillOne = sI.getWeaponSkills(player.getItem(6).getSkillOne());
            itemSevenSkillOne.relocate(355, 738);
            lowerScreen.getChildren().add(itemSevenSkillOne);

            itemSevenSkillTwoBar.relocate(375, 737); //Assign itemSevenSkillTwoBar Location
            lowerScreen.getChildren().add(itemSevenSkillTwoBar); //Add itemSevenSkillTwoBar to Lower Screen Pane

            itemSevenSkillTwo = sI.getWeaponSkills(player.getItem(6).getSkillTwo());
            itemSevenSkillTwo.relocate(376, 738);
            lowerScreen.getChildren().add(itemSevenSkillTwo);

            itemSevenSkillThreeBar.relocate(396, 737); //Assign itemSevenSkillThreeBar Location
            lowerScreen.getChildren().add(itemSevenSkillThreeBar); //Add itemSevenSkillThreeBar to Lower Screen Pane

            itemSevenSkillThree = sI.getWeaponSkills(player.getItem(6).getSkillThree());
            itemSevenSkillThree.relocate(397, 738);
            lowerScreen.getChildren().add(itemSevenSkillThree);
            //Item Seven End
            //----------------------------------------------------------------------
            strengthBar.relocate(9, 602); //Assign strengthBar Location
            lowerScreen.getChildren().add(strengthBar); //Add strengthBar to Lower Screen Pane

            String str = Integer.toString(player.getCurrentStats(2) + player.getBonusStat(1)); //Set String for strength
            Text charStr = new Text(str); //Add String to Text object charStr
            if (player.getBonusStat(1) > 0)
            {
                if (player.getCurrentStats(2) < mX.getMaxStats(player.classID, 1))
                {
                    charStr.setFill(Color.BLUE);
                }
                else
                {
                    charStr.setFill(Color.color(0.1960784314f, 0.58823529411f, 0.1960784314f)); //Darker Green
                }
            }
            if (player.getBonusStat(1) < 0)
            {
                if (player.getCurrentStats(2) < mX.getMaxStats(player.classID, 1))
                {
                    charStr.setFill(Color.RED);
                }
                else
                {
                    charStr.setFill(Color.color(0.58823529411f, 0.1960784314f, 0.1960784314f)); //Darker Red
                }
            }
            if (player.getBonusStat(1) == 0)
            {
                if (player.getCurrentStats(2) < mX.getMaxStats(player.classID, 1))
                {
                    charStr.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Set Color for charStr (Light Tan)
                }
                else
                {
                    charStr.setFill(Color.GREEN);
                }
            }
            charStr.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for charStr
            charStr.relocate(55, 604); //Assign charStr Location
            lowerScreen.getChildren().add(charStr); //Add charStr to Lower Screen Pane
            //----------------------------------------------------------------------
            magicBar.relocate(9, 622); //Assign magicBar Location
            lowerScreen.getChildren().add(magicBar); //Add magicBar to Lower Screen Pane

            String mag = Integer.toString(player.getCurrentStats(3) + player.getBonusStat(2)); //Set String for magic
            Text charMag = new Text(mag); //Add String to Text object charMag
            if (player.getBonusStat(2) > 0)
            {
                if (player.getCurrentStats(3) < mX.getMaxStats(player.classID, 2))
                {
                    charMag.setFill(Color.BLUE);
                }
                else
                {
                    charMag.setFill(Color.color(0.1960784314f, 0.58823529411f, 0.1960784314f)); //Darker Green
                }
            }
            if (player.getBonusStat(2) < 0)
            {
                if (player.getCurrentStats(3) < mX.getMaxStats(player.classID, 2))
                {
                    charMag.setFill(Color.RED);
                }
                else
                {
                    charMag.setFill(Color.color(0.58823529411f, 0.1960784314f, 0.1960784314f)); //Darker Red
                }
            }
            if (player.getBonusStat(2) == 0)
            {
                if (player.getCurrentStats(3) < mX.getMaxStats(player.classID, 2))
                {
                    charMag.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Set Color charMag (Light Tan)
                }
                else
                {
                    charMag.setFill(Color.GREEN);
                }
            }
            charMag.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for charMag
            charMag.relocate(55, 624); //Assign charMag Location
            lowerScreen.getChildren().add(charMag); //Add charMag to Lower Screen Pane
            //----------------------------------------------------------------------
            skillBar.relocate(9, 642); //Assign skillBar Location
            lowerScreen.getChildren().add(skillBar); //Add skillBar to Lower Screen Pane

            String skl = Integer.toString(player.getCurrentStats(4) + player.getBonusStat(3));  //Set String for skill
            Text charSkl = new Text(skl); //Add String to Text object charSkl
            if (player.getBonusStat(3) > 0)
            {
                if (player.getCurrentStats(4) < mX.getMaxStats(player.classID, 3))
                {
                    charSkl.setFill(Color.BLUE);
                }
                else
                {
                    charSkl.setFill(Color.color(0.1960784314f, 0.58823529411f, 0.1960784314f)); //Darker Green
                }
            }
            if (player.getBonusStat(3) < 0)
            {
                if (player.getCurrentStats(4) < mX.getMaxStats(player.classID, 3))
                {
                    charSkl.setFill(Color.RED);
                }
                else
                {
                    charSkl.setFill(Color.color(0.58823529411f, 0.1960784314f, 0.1960784314f)); //Darker Red
                }
            }
            if (player.getBonusStat(3) == 0)
            {
                if (player.getCurrentStats(4) < mX.getMaxStats(player.classID, 3))
                {
                    charSkl.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Set Color charSkl (Light Tan)
                }
                else
                {
                    charSkl.setFill(Color.GREEN);
                }
            }
            charSkl.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for charSkl
            charSkl.relocate(55, 644); //Assign charSkl Location
            lowerScreen.getChildren().add(charSkl); //Add charSkl to Lower Screen Pane
            //----------------------------------------------------------------------
            speedBar.relocate(78, 602); //Assign speedBar Location
            lowerScreen.getChildren().add(speedBar); //Add speedBar to Lower Screen Pane

            String spd = Integer.toString(player.getCurrentStats(5) + player.getBonusStat(4)); //Set String for speed
            Text charSpd = new Text(spd); //Add String to Text object charSpd
            if (player.getBonusStat(4) > 0)
            {
                if (player.getCurrentStats(5) < mX.getMaxStats(player.classID, 4))
                {
                    charSpd.setFill(Color.BLUE);
                }
                else
                {
                    charSpd.setFill(Color.color(0.1960784314f, 0.58823529411f, 0.1960784314f)); //Darker Green
                }
            }
            if (player.getBonusStat(4) < 0)
            {
                if (player.getCurrentStats(5) < mX.getMaxStats(player.classID, 4))
                {
                    charSpd.setFill(Color.RED);
                }
                else
                {
                    charSpd.setFill(Color.color(0.58823529411f, 0.1960784314f, 0.1960784314f)); //Darker Red
                }
            }
            if (player.getBonusStat(4) == 0)
            {
                if (player.getCurrentStats(5) < mX.getMaxStats(player.classID, 4))
                {
                    charSpd.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Set Color charSpd (Light Tan)
                }
                else
                {
                    charSpd.setFill(Color.GREEN);
                }
            }
            charSpd.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for charSpd
            charSpd.relocate(124, 604); //Assign charSpd Location
            lowerScreen.getChildren().add(charSpd); //Add charSpd to Lower Screen Pane
            //----------------------------------------------------------------------
            luckBar.relocate(78, 622); //Assign luckBar Location
            lowerScreen.getChildren().add(luckBar); //Add luckBar to Lower Screen Pane

            String luk = Integer.toString(player.getCurrentStats(6) + player.getBonusStat(5)); //Set String for luck
            Text charLuk = new Text(luk); //Add String to Text object charLuk
            if (player.getBonusStat(5) > 0)
            {
                if (player.getCurrentStats(6) < mX.getMaxStats(player.classID, 5))
                {
                    charLuk.setFill(Color.BLUE);
                }
                else
                {
                    charLuk.setFill(Color.color(0.1960784314f, 0.58823529411f, 0.1960784314f)); //Darker Green
                }
            }
            if (player.getBonusStat(5) < 0)
            {
                if (player.getCurrentStats(6) < mX.getMaxStats(player.classID, 5))
                {
                    charLuk.setFill(Color.RED);
                }
                else
                {
                    charLuk.setFill(Color.color(0.58823529411f, 0.1960784314f, 0.1960784314f)); //Darker Red
                }
            }
            if (player.getBonusStat(5) == 0)
            {
                if (player.getCurrentStats(6) < mX.getMaxStats(player.classID, 5))
                {
                    charLuk.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Set Color charLuk (Light Tan)
                }
                else
                {
                    charLuk.setFill(Color.GREEN);
                }
            }
            charLuk.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for charLuk
            charLuk.relocate(124, 624); //Assign charLuk Location
            lowerScreen.getChildren().add(charLuk); //Add charLuk to Lower Screen Pane
            //----------------------------------------------------------------------
            defenseBar.relocate(78, 642);
            lowerScreen.getChildren().add(defenseBar);

            String def = Integer.toString(player.getCurrentStats(7) + player.getBonusStat(6)); //Set String for defense
            Text charDef = new Text(def); //Add String to Text object charDef
            if (player.getBonusStat(6) > 0)
            {
                if (player.getCurrentStats(7) < mX.getMaxStats(player.classID, 6))
                {
                    charDef.setFill(Color.BLUE);
                }
                else
                {
                    charDef.setFill(Color.color(0.1960784314f, 0.58823529411f, 0.1960784314f)); //Darker Green
                }
            }
            if (player.getBonusStat(6) < 0)
            {
                if (player.getCurrentStats(7) < mX.getMaxStats(player.classID, 6))
                {
                    charDef.setFill(Color.RED);
                }
                else
                {
                    charDef.setFill(Color.color(0.58823529411f, 0.1960784314f, 0.1960784314f)); //Darker Red
                }
            }
            if (player.getBonusStat(6) == 0)
            {
                if (player.getCurrentStats(7) < mX.getMaxStats(player.classID, 6))
                {
                    charDef.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Set Color charDef (Light Tan)
                }
                else
                {
                    charDef.setFill(Color.GREEN);
                }
            }
            charDef.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for charLuk
            charDef.relocate(124, 644); //Assign charDef Location
            lowerScreen.getChildren().add(charDef); //Add charDef to Lower Screen Pane
            //----------------------------------------------------------------------
            resistanceBar.relocate(78, 662);
            lowerScreen.getChildren().add(resistanceBar);

            String res = Integer.toString(player.getCurrentStats(8) + player.getBonusStat(7)); //Set String for resistance
            Text charRes = new Text(res); //Add String to Text object charRes
            if (player.getBonusStat(7) > 0)
            {
                if (player.getCurrentStats(8) < mX.getMaxStats(player.classID, 6))
                {
                    charRes.setFill(Color.BLUE);
                }
                else
                {
                    charRes.setFill(Color.color(0.1960784314f, 0.58823529411f, 0.1960784314f)); //Darker Green
                }
            }
            if (player.getBonusStat(7) < 0)
            {
                if (player.getCurrentStats(8) < mX.getMaxStats(player.classID, 6))
                {
                    charRes.setFill(Color.RED);
                }
                else
                {
                    charRes.setFill(Color.color(0.58823529411f, 0.1960784314f, 0.1960784314f)); //Darker Red
                }
            }
            if (player.getBonusStat(7) == 0)
            {
                if (player.getCurrentStats(8) < mX.getMaxStats(player.classID, 6))
                {
                    charRes.setFill(Color.color(0.9529411764f, 0.8549019607f, 0.662745098f)); //Set Color charRes (Light Tan)
                }
                else
                {
                    charRes.setFill(Color.GREEN);
                }
            }
            charRes.setFont(Font.font("Calibri", FontWeight.BOLD, 16)); //Set Font for charRes
            charRes.relocate(124, 664); //Assign to charRes Location
            lowerScreen.getChildren().add(charRes); //Add charRes to Lower Screen Pane
            //----------------------------------------------------------------------
            statButton.relocate(25, 662);
            lowerScreen.getChildren().add(statButton);
            Object[] tipOptions = new Object[] //Need to look into combining charHP and charMHP into one object if possible
            {
                charName, nameBar, className, classNameBar, charLevel, levelBar,
                charEXP, expBar, charHP, hpBar, charMov, movBar,
                skillOne, skillOneBar, skillTwo, skillTwoBar, skillThree, skillThreeBar,
                skillFour, skillFourBar, skillFive, skillFiveBar, skillSix, skillSixBar,
                swordEXP, swordEXPBar, lanceEXP, lanceEXPBar, axeEXP, axeEXPBar,
                bowEXP, bowEXPBar, shurikenEXP, shurikenEXPBar, staffEXP, staffEXPBar,
                fireEXP, fireEXPBar, thunderEXP, thunderEXPBar, windEXP, windEXPBar,
                lightEXP, lightEXPBar, darkEXP, darkEXPBar, otherEXP, otherEXPBar,
                charAttack, attackBar, charCritical, criticalBar, charHit, hitBar,
                charAvoid, avoidBar, charStr, strengthBar, charMag, magicBar,
                charSkl, skillBar, charSpd, speedBar, charLuk, luckBar,
                charDef, defenseBar, charRes, resistanceBar, statButton, statButton, //<- Repeated on purpose
                itemOne, itemOneBar, itemOneStrengths, itemOneStrengthsBar, itemOneSkillOne, itemOneSkillOneBar,
                itemOneSkillTwo, itemOneSkillTwoBar, itemOneSkillThree, itemOneSkillThreeBar, itemTwo, itemTwoBar,
                itemTwoStrengths, itemTwoStrengthsBar, itemTwoSkillOne, itemTwoSkillOneBar, itemTwoSkillTwo, itemTwoSkillTwoBar,
                itemTwoSkillThree, itemTwoSkillThreeBar, itemThree, itemThreeBar, itemThreeStrengths, itemThreeStrengthsBar,
                itemThreeSkillOne, itemThreeSkillOneBar, itemThreeSkillTwo, itemThreeSkillTwoBar, itemThreeSkillThree, itemThreeSkillThreeBar,
                itemFour, itemFourBar, itemFourStrengths, itemFourStrengthsBar, itemFourSkillOne, itemFourSkillOneBar,
                itemFourSkillTwo, itemFourSkillTwoBar, itemFourSkillThree, itemFourSkillThreeBar, itemFive, itemFiveBar,
                itemFiveStrengths, itemFiveStrengthsBar, itemFiveSkillOne, itemFiveSkillOneBar, itemFiveSkillTwo, itemFiveSkillTwoBar,
                itemFiveSkillThree, itemFiveSkillThreeBar, itemSix, itemSixBar, itemSixStrengths, itemSixStrengthsBar,
                itemSixSkillOne, itemSixSkillOneBar, itemSixSkillTwo, itemSixSkillTwoBar, itemSixSkillThree, itemSixSkillThreeBar,
                itemSeven, itemSevenBar, itemSevenStrengths, itemSevenStrengthsBar, itemSevenSkillOne, itemSevenSkillOneBar,
                itemSevenSkillTwo, itemSevenSkillTwoBar, itemSevenSkillThree, itemSevenSkillThreeBar //24
            };
            lowerScreen.addEventFilter(MouseEvent.MOUSE_CLICKED, (MouseEvent event)
                    -> 
                    {
                        //Create a lowerScreen Mouse Filter to ignore lower screen and focus on objects
                    }
            );
            final EventHandler<InputEvent> filter = (InputEvent event)
                    -> 
                    {
                        Object name = event.getSource();
                        resetArray(tips);
                        for (int i = 0; i < tipOptions.length; i++)
                        {
                            if (name == tipOptions[i])
                            {
                                tips[i / 2] = true;
                            }
                        }
                        if (name == activeBloodButton)
                        {
                            bloodButton = true;
                        }
                        if (name == deactiveBloodButton)
                        {
                            bloodButton = false;
                        }
                        if (name == mapActive)
                        {
                            mapButton = true;
                        }
                        if (name == mapDeactive)
                        {
                            mapButton = false;
                        }
                        event.consume();
            } //Create a Event Handler for all other objects
                    ;
            
            nameBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charName.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            classNameBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            className.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            levelBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charLevel.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            expBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charEXP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            hpBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charHP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charMHP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            movBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charMov.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            //----------------------------------------------------------------------
            swordEXPBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            swordEXP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            lanceEXPBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            lanceEXP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            axeEXPBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            axeEXP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            bowEXPBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            bowEXP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            shurikenEXPBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            shurikenEXP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            staffEXPBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            staffEXP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            fireEXPBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            fireEXP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            thunderEXPBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            thunderEXP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            windEXPBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            windEXP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            lightEXPBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            lightEXP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            darkEXPBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            darkEXP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            otherEXPBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            otherEXP.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            //----------------------------------------------------------------------
            skillOneBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            skillOne.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            skillTwoBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            skillTwo.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            skillThreeBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            skillThree.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            skillFourBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            skillFour.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            skillFiveBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            skillFive.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            skillSixBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            skillSix.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            //----------------------------------------------------------------------
            attackBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charAttack.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            criticalBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charCritical.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            hitBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charHit.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            avoidBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charAvoid.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            //----------------------------------------------------------------------
            strengthBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charStr.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            magicBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charMag.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            skillBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charSkl.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            speedBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charSpd.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            luckBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charLuk.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            defenseBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charDef.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            resistanceBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            charRes.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            statButton.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            //----------------------------------------------------------------------
            itemOneBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemOne.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemOneStrengthsBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemOneSkillOneBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemOneSkillOne.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemOneSkillTwoBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemOneSkillTwo.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemOneSkillThreeBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemOneSkillThree.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            //----------------------------------------------------------------------
            itemTwoBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemTwo.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemTwoStrengthsBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemTwoSkillOneBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemTwoSkillOne.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemTwoSkillTwoBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemTwoSkillTwo.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemTwoSkillThreeBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemTwoSkillThree.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            //----------------------------------------------------------------------
            itemThreeBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemThree.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemThreeStrengthsBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemThreeSkillOneBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemThreeSkillOne.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemThreeSkillTwoBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemThreeSkillTwo.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemThreeSkillThreeBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemThreeSkillThree.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            //----------------------------------------------------------------------
            itemFourBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFour.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFourStrengthsBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFourSkillOneBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFourSkillOne.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFourSkillTwoBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFourSkillTwo.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFourSkillThreeBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFourSkillThree.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            //----------------------------------------------------------------------
            itemFiveBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFive.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFiveStrengthsBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFiveSkillOneBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFiveSkillOne.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFiveSkillTwoBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFiveSkillTwo.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFiveSkillThreeBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemFiveSkillThree.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            //----------------------------------------------------------------------
            itemSixBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSix.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSixStrengthsBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSixSkillOneBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSixSkillOne.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSixSkillTwoBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSixSkillTwo.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSixSkillThreeBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSixSkillThree.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            //----------------------------------------------------------------------
            itemSevenBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSeven.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSevenStrengthsBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSevenSkillOneBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSevenSkillOne.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSevenSkillTwoBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSevenSkillTwo.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSevenSkillThreeBar.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            itemSevenSkillThree.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
            //----------------------------------------------------------------------
        }
        if (bloodButton)
        {
            deactiveBloodButton.relocate(446, 455);
            lowerScreen.getChildren().add(deactiveBloodButton);
        }
        else
        {
           
            activeBloodButton.relocate(446, 455);
            lowerScreen.getChildren().add(activeBloodButton);
            bloodWheel.relocate(5, 395);
            lowerScreen.getChildren().add(bloodWheel);
            for (int i = 0; i < 13; i++)
            {
                Arc arc1 = new Arc();
                arc1.relocate(213, 579);
                double angle = 360.0 / 13.0;
                arc1.setStartAngle(i * angle);
                double width = (player.getBloodTypePercent(i) * 144 / 24);
                arc1.setRadiusX(width);
                arc1.setRadiusY(width);
                arc1.setLength(angle);
                arc1.setType(ArcType.ROUND);
                switch (player.getTeam())
                {
                    case 0: arc1.setFill(Color.color(0.0f, 0.0f, 1.0f, 0.5f));
                        break;
                    case 1: arc1.setFill(Color.color(0.0f, 1.0f, 0.0f, 0.5f));
                        break;
                    case 2: arc1.setFill(Color.color(1.0f, 0.0f, 0.0f, 0.5f));
                        break;
                    case 3: arc1.setFill(Color.color(1.0f, 1.0f, 0.0f, 0.5f));
                        break;
                }
                lowerScreen.getChildren().add(arc1);
            }
        }
        
        unit.relocate(427, 494); //Connect toggle between unit and backup when pair up feature is done
        lowerScreen.getChildren().add(unit);

        backup.relocate(433, 609);
        lowerScreen.getChildren().add(backup);

        if (mapButton)
        {
            mapDeactive.relocate(446, 724);
            lowerScreen.getChildren().add(mapDeactive);
        }
        else
        {
            mapActive.relocate(446, 724);
            lowerScreen.getChildren().add(mapActive);
        }
        final EventHandler<InputEvent> filter = (InputEvent event)
                -> 
                {
                    Object name = event.getSource();
                    if (name == activeBloodButton)
                    {
                        bloodButton = true;
                    }
                    if (name == deactiveBloodButton)
                    {
                        bloodButton = false;
                        mapButton = true;
                    }
                    if (name == mapActive)
                    {
                        mapButton = true;
                    }
                    if (name == mapDeactive)
                    {
                        mapButton = false;
                        bloodButton = true;
                    }
                    if(name == bloodWheel)
                    {
                        //May change to a button to bring up blood stats
                    }
                    event.consume();
        } //Create a Event Handler for all other constant toggle objects
                ;
        activeBloodButton.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
        deactiveBloodButton.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
        unit.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
        backup.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
        mapActive.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
        mapDeactive.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
        bloodWheel.addEventFilter(MouseEvent.MOUSE_PRESSED, filter);
    }
}
