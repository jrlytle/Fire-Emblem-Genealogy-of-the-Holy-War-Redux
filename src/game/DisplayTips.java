package game;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author jrlytle
 */
public class DisplayTips
{
    double tipLength;
    double tipHeight;
    
    SkillTips sT = new SkillTips();
    public String getWeaponRank(int rank)
    {
        switch(rank + 1)
        {
            default: return "-";
            case 1: return "E";
            case 2: return "D";
            case 3: return "C";
            case 4: return "B";
            case 5: return "A";
            case 6: return "S";
        }
    }
    public void displayTips(boolean[] tips, Pane lowerScreen, character player)
    {
        if(tips[0])
        {
            CharacterDescriptions cD = new CharacterDescriptions();
            Text descriptionOne = new Text(cD.getCharacterDescription(player.getCharacterID(), 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(cD.getCharacterDescription(player.getCharacterID(), 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(0, 428, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(1, 429);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(1, 442);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[1])
        {
            ClassTips cT = new ClassTips();
            Text descriptionOne = new Text(cT.getClassDescription(player.getClassID(), 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(cT.getClassDescription(player.getClassID(), 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(125, 428, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(125, 428);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(125, 444);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[2])
        {
            Text descriptionOne = new Text("Current Level");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Max Level is " + player.getMaxLevel()); //Change in the future to get actual max level
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(316, 425, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(316, 425);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(316, 438);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[3])
        {
            Text descriptionOne = new Text("Current Experience");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Every 100 exp results in level up");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(222, 451, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(222, 451);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(222, 466);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[4])
        {
            Text descriptionOne = new Text("Current Hit Points / Max Hit Points");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("0 Hit Points results in Unit's death");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text("If Leader reaches 0 HP, it's Game Over");
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth()), descriptionThree.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(122, 477, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(122, 477);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(122, 492);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(122, 507);
            lowerScreen.getChildren().add(descriptionThree);
        }
        else if(tips[5])
        {
            Text descriptionOne = new Text("Range of movement per team's turn");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(195, 477, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(195, 477);
            lowerScreen.getChildren().add(descriptionOne);
        }
        if (tips[6])
        {
            double yAdj = tipHeight;
            Text descriptionOne = new Text(sT.getSkillTips(player.getSkills(0) - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getSkills(0) - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text(sT.getSkillTips(player.getSkills(0) - 1, 2));
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth()), descriptionThree.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
            if(!descriptionTwo.getText().equals(""))
            {
                tipHeight += descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            if (!descriptionThree.getText().equals(""))
            {
                tipHeight += descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            Rectangle r = new Rectangle(400 - tipLength, 487 - yAdj, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 487 - yAdj);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 504 - yAdj);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(400 - tipLength, 521 - yAdj);
            lowerScreen.getChildren().add(descriptionThree);
        }
        if (tips[7])
        {
            double yAdj = tipHeight;
            Text descriptionOne = new Text(sT.getSkillTips(player.getSkills(1) - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getSkills(1) - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text(sT.getSkillTips(player.getSkills(1) - 1, 2));
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth()), descriptionThree.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
            if(!descriptionTwo.getText().equals(""))
            {
                tipHeight += descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            if (!descriptionThree.getText().equals(""))
            {
                tipHeight += descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            Rectangle r = new Rectangle(400 - tipLength, 487 - yAdj, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 487 - yAdj);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 504 - yAdj);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(400 - tipLength, 521 - yAdj);
            lowerScreen.getChildren().add(descriptionThree);
        }
        if (tips[8])
        {
            double yAdj = tipHeight;
            Text descriptionOne = new Text(sT.getSkillTips(player.getSkills(2) - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getSkills(2) - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text(sT.getSkillTips(player.getSkills(2) - 1, 2));
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth()), descriptionThree.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
            if(!descriptionTwo.getText().equals(""))
            {
                tipHeight += descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            if (!descriptionThree.getText().equals(""))
            {
                tipHeight += descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            Rectangle r = new Rectangle(400 - tipLength, 487 - yAdj, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 487 - yAdj);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 504 - yAdj);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(400 - tipLength, 521 - yAdj);
            lowerScreen.getChildren().add(descriptionThree);
        }
        if (tips[9])
        {
            double yAdj = -43;
            Text descriptionOne = new Text(sT.getSkillTips(player.getSkills(3) - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getSkills(3) - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text(sT.getSkillTips(player.getSkills(3) - 1, 2));
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
            if(!descriptionTwo.getText().equals(""))
            {
                tipHeight += descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            if (!descriptionThree.getText().equals(""))
            {
                tipHeight += descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            Rectangle r = new Rectangle(400 - tipLength, 487 - yAdj, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 487 - yAdj);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 504 - yAdj);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(400 - tipLength, 521 - yAdj);
        }
        if (tips[10])
        {
            double yAdj = -43;
            Text descriptionOne = new Text(sT.getSkillTips(player.getSkills(4) - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getSkills(4) - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text(sT.getSkillTips(player.getSkills(4) - 1, 2));
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth()), descriptionThree.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
            if(!descriptionTwo.getText().equals(""))
            {
                tipHeight += descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            if (!descriptionThree.getText().equals(""))
            {
                tipHeight += descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            Rectangle r = new Rectangle(400 - tipLength, 487 - yAdj, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 487 - yAdj);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 504 - yAdj);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(400 - tipLength, 521 - yAdj);
            lowerScreen.getChildren().add(descriptionThree);
        }
        if (tips[11])
        {
            double yAdj = -43;
            Text descriptionOne = new Text(sT.getSkillTips(player.getSkills(5) - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getSkills(5) - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text(sT.getSkillTips(player.getSkills(5) - 1, 2));
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth()), descriptionThree.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
            if(!descriptionTwo.getText().equals(""))
            {
                tipHeight += descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            if (!descriptionThree.getText().equals(""))
            {
                tipHeight += descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            Rectangle r = new Rectangle(400 - tipLength, 487 - yAdj, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 487 - yAdj);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 504 - yAdj);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(400 - tipLength, 521 - yAdj);
        }
        else if(tips[12])
        {
            Text descriptionOne = new Text("Sword Rank: -, D, C, B, A, S");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Higher Rank means more Swords can be used");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 520, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 520);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 535);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[13])
        {
            Text descriptionOne = new Text("Lance Rank: -, D, C, B, A, S");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Higher Rank means more Lances can be used");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 520, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 520);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 535);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[14])
        {
            Text descriptionOne = new Text("Axe Rank: -, D, C, B, A, S");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Higher Rank means more Axes can be used");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 520, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 520);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 535);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[15])
        {
            Text descriptionOne = new Text("Bow Rank: -, D, C, B, A, S");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Higher Rank means more Bows can be used");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 520, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 520);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 535);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[16])
        {
            Text descriptionOne = new Text("Shuriken Rank: -, D, C, B, A, S");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Higher Rank means more Shuriken can be used");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 520, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 520);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 535);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[17])
        {
            Text descriptionOne = new Text("Staff Rank: -, D, C, B, A, S");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Higher Rank means more Staves can be used");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 520, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 520);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 535);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[18])
        {
            Text descriptionOne = new Text("Fire Rank: -, D, C, B, A, S");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Higher Rank means more Fire can be used");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 548, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 548);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 563);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[19])
        {
            Text descriptionOne = new Text("Thunder Rank: -, D, C, B, A, S");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Higher Rank means more Thunder can be used");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 548, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 548);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 563);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[20])
        {
            Text descriptionOne = new Text("Wind Rank: -, D, C, B, A, S");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Higher Rank means more Wind can be used");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 548, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 548);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 563);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[21])
        {
            Text descriptionOne = new Text("Light Rank: -, D, C, B, A, S");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Higher Rank means more Light can be used");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 548, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 548);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 563);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[22])
        {
            Text descriptionOne = new Text("Dark Rank: -, D, C, B, A, S");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Higher Rank means more Dark can be used");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 548, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 548);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 563);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[23])
        {
            Text descriptionOne = new Text("Other Rank: -, D, C, B, A, S");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Higher Rank means more Other can be used");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 548, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 548);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 563);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[24])
        {
            Text descriptionOne = new Text("The total power of unit");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("More attack equals more damage");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 515, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 515);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 530);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[25])
        {
            Text descriptionOne = new Text("Chance of attack dealing 3X damage");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Lowers based on enemy's Luck");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 515, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 515);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 530);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[26])
        {
            Text descriptionOne = new Text("Chance of striking the enemy (%)");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Lowers based on enemy's Avoid");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 542, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 542);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 557);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[27])
        {
            Text descriptionOne = new Text("Chance of dodging an attack (%)");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Negative avoid adds to enemy's Hit %");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(135, 542, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 542);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 557);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[28])
        {
            Text descriptionOne = new Text("Affects amount of damage done");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("by physical attacks");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(-5, 570, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(-5, 570);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(-5, 585);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[29])
        {
            Text descriptionOne = new Text("Affects amount of damage done");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("by magical attacks");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(-5, 591, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(-5, 591);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(-5, 606);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[30])
        {
            Text descriptionOne = new Text("Affects hit percentage, critical");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("and skill activation");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(-5, 612, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(-5, 612);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(-5, 627);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[31])
        {
            Text descriptionOne = new Text("Primary stat that affects avoid");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Can affect number of attacks");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(-5, 570, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(-5, 570);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(-5, 585);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[32])
        {
            Text descriptionOne = new Text("Secondary stat that affects avoid");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Lowers enemy's critical");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(-5, 591, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(-5, 591);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(-5, 606);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[33])
        {
            Text descriptionOne = new Text("Lowers damage taken by");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("physical attacks");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(-5, 612, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(-5, 612);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(-5, 627);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[34])
        {
            Text descriptionOne = new Text("Lowers damage taken by");
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("magical attacks");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            Rectangle r = new Rectangle(-5, 633, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(-5, 633);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(-5, 648);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[35])
        {
            //Stat Button
        }
        else if(tips[36] && player.getItem(0).getID() > 0)
        {
            Text descriptionOne = new Text(""); //Add method to give Text for weapons that have an additional description
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Rank: " + getWeaponRank(player.getItem(0).getRank()) + ", Mt: " + player.getItem(0).getMight() + ", Hit: " + player.getItem(0).getHit() + ", Crit: " + player.getItem(0).getCritical() + ", Range: " + player.getItem(0).getMinRange() + "~" + player.getItem(0).getMaxRange() + ", ");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text("Avoid: " + player.getItem(0).getBonusAvoid() + ", Crit Avoid: " + player.getItem(0).getBonusCritAvoid() + ", Kills: " + player.getItem(0).getKills());
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth()), descriptionThree.layoutBoundsProperty().get().getWidth());
            if(descriptionOne.getText().equals(""))
            {
                tipHeight = descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            Rectangle r = new Rectangle(135, 606 - tipHeight, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 591 - tipHeight);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 606 - tipHeight);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(135, 621 - tipHeight);
            lowerScreen.getChildren().add(descriptionThree);
        }
        else if(tips[37])
        {
            if(player.getItem(0).getEffectArmor() && !player.getItem(0).getEffectBeast() && !player.getItem(0).getEffectDragon() && !player.getItem(0).getEffectFlying() && !player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(0).getEffectArmor() && player.getItem(0).getEffectBeast() && !player.getItem(0).getEffectDragon() && !player.getItem(0).getEffectFlying() && !player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(0).getEffectArmor() && !player.getItem(0).getEffectBeast() && player.getItem(0).getEffectDragon() && !player.getItem(0).getEffectFlying() && !player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(0).getEffectArmor() && !player.getItem(0).getEffectBeast() && !player.getItem(0).getEffectDragon() && player.getItem(0).getEffectFlying() && !player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(0).getEffectArmor() && !player.getItem(0).getEffectBeast() && !player.getItem(0).getEffectDragon() && !player.getItem(0).getEffectFlying() && player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(0).getEffectArmor() && player.getItem(0).getEffectBeast() && !player.getItem(0).getEffectDragon() && !player.getItem(0).getEffectFlying() && !player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(0).getEffectArmor() && !player.getItem(0).getEffectBeast() && player.getItem(0).getEffectDragon() && !player.getItem(0).getEffectFlying() && !player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(0).getEffectArmor() && !player.getItem(0).getEffectBeast() && !player.getItem(0).getEffectDragon() && player.getItem(0).getEffectFlying() && !player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(0).getEffectArmor() && !player.getItem(0).getEffectBeast() && !player.getItem(0).getEffectDragon() && !player.getItem(0).getEffectFlying() && player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(0).getEffectArmor() && player.getItem(0).getEffectBeast() && player.getItem(0).getEffectDragon() && !player.getItem(0).getEffectFlying() && !player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(0).getEffectArmor() && player.getItem(0).getEffectBeast() && !player.getItem(0).getEffectDragon() && player.getItem(0).getEffectFlying() && !player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(0).getEffectArmor() && player.getItem(0).getEffectBeast() && !player.getItem(0).getEffectDragon() && !player.getItem(0).getEffectFlying() && player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(0).getEffectArmor() && !player.getItem(0).getEffectBeast() && player.getItem(0).getEffectDragon() && player.getItem(0).getEffectFlying() && !player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(0).getEffectArmor() && !player.getItem(0).getEffectBeast() && player.getItem(0).getEffectDragon() && !player.getItem(0).getEffectFlying() && player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(0).getEffectArmor() && !player.getItem(0).getEffectBeast() && !player.getItem(0).getEffectDragon() && player.getItem(0).getEffectFlying() && player.getItem(0).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 593);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 593, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
        }
        if (tips[38])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(0).getSkillOne() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(0).getSkillOne() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 580, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 580);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 596);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        if (tips[39])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(0).getSkillTwo() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(0).getSkillTwo() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 580, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 580);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 596);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        if (tips[40])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(0).getSkillThree() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(0).getSkillThree() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 580, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 580);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 596);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[41] && player.getItem(1).getID() > 0)
        {
            Text descriptionOne = new Text(""); //Add method to give Text for weapons that have an additional description
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Rank: " + getWeaponRank(player.getItem(1).getRank()) + ", Mt: " + player.getItem(1).getMight() + ", Hit: " + player.getItem(1).getHit() + ", Crit: " + player.getItem(1).getCritical() + ", Range: " + player.getItem(1).getMinRange() + "~" + player.getItem(1).getMaxRange() + ", ");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text("Avoid: " + player.getItem(1).getBonusAvoid() + ", Crit Avoid: " + player.getItem(1).getBonusCritAvoid() + ", Kills: " + player.getItem(1).getKills());
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth()), descriptionThree.layoutBoundsProperty().get().getWidth());
            if(descriptionOne.getText().equals(""))
            {
                tipHeight = descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            Rectangle r = new Rectangle(135, 627 - tipHeight, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 612 - tipHeight);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 627 - tipHeight);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(135, 642 - tipHeight);
            lowerScreen.getChildren().add(descriptionThree);
        }
        else if(tips[42])
        {
            if(player.getItem(1).getEffectArmor() && !player.getItem(1).getEffectBeast() && !player.getItem(1).getEffectDragon() && !player.getItem(1).getEffectFlying() && !player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(1).getEffectArmor() && player.getItem(1).getEffectBeast() && !player.getItem(1).getEffectDragon() && !player.getItem(1).getEffectFlying() && !player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(1).getEffectArmor() && !player.getItem(1).getEffectBeast() && player.getItem(1).getEffectDragon() && !player.getItem(1).getEffectFlying() && !player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(1).getEffectArmor() && !player.getItem(1).getEffectBeast() && !player.getItem(1).getEffectDragon() && player.getItem(1).getEffectFlying() && !player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(1).getEffectArmor() && !player.getItem(1).getEffectBeast() && !player.getItem(1).getEffectDragon() && !player.getItem(1).getEffectFlying() && player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(1).getEffectArmor() && player.getItem(1).getEffectBeast() && !player.getItem(1).getEffectDragon() && !player.getItem(1).getEffectFlying() && !player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(1).getEffectArmor() && !player.getItem(1).getEffectBeast() && player.getItem(1).getEffectDragon() && !player.getItem(1).getEffectFlying() && !player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(1).getEffectArmor() && !player.getItem(1).getEffectBeast() && !player.getItem(1).getEffectDragon() && player.getItem(1).getEffectFlying() && !player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(1).getEffectArmor() && !player.getItem(1).getEffectBeast() && !player.getItem(1).getEffectDragon() && !player.getItem(1).getEffectFlying() && player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(1).getEffectArmor() && player.getItem(1).getEffectBeast() && player.getItem(1).getEffectDragon() && !player.getItem(1).getEffectFlying() && !player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(1).getEffectArmor() && player.getItem(1).getEffectBeast() && !player.getItem(1).getEffectDragon() && player.getItem(1).getEffectFlying() && !player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(1).getEffectArmor() && player.getItem(1).getEffectBeast() && !player.getItem(1).getEffectDragon() && !player.getItem(1).getEffectFlying() && player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(1).getEffectArmor() && !player.getItem(1).getEffectBeast() && player.getItem(1).getEffectDragon() && player.getItem(1).getEffectFlying() && !player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(1).getEffectArmor() && !player.getItem(1).getEffectBeast() && player.getItem(1).getEffectDragon() && !player.getItem(1).getEffectFlying() && player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(1).getEffectArmor() && !player.getItem(1).getEffectBeast() && !player.getItem(1).getEffectDragon() && player.getItem(1).getEffectFlying() && player.getItem(1).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 614);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 614, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
        }
        if (tips[43])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(1).getSkillOne() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(1).getSkillOne() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 601, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 601);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 617);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        if (tips[44])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(1).getSkillTwo() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(1).getSkillTwo() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 601, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 601);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 617);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        if (tips[45])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(1).getSkillThree() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(1).getSkillThree() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 601, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 601);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 617);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[46] && player.getItem(2).getID() > 0)
        {
            Text descriptionOne = new Text(""); //Add method to give Text for weapons that have an additional description
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Rank: " + getWeaponRank(player.getItem(2).getRank()) + ", Mt: " + player.getItem(2).getMight() + ", Hit: " + player.getItem(2).getHit() + ", Crit: " + player.getItem(2).getCritical() + ", Range: " + player.getItem(2).getMinRange() + "~" + player.getItem(2).getMaxRange() + ", ");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text("Avoid: " + player.getItem(2).getBonusAvoid() + ", Crit Avoid: " + player.getItem(2).getBonusCritAvoid() + ", Kills: " + player.getItem(2).getKills());
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth()), descriptionThree.layoutBoundsProperty().get().getWidth());
            if(descriptionOne.getText().equals(""))
            {
                tipHeight = descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            Rectangle r = new Rectangle(135, 648 - tipHeight, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 633 - tipHeight);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 648 - tipHeight);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(135, 663 - tipHeight);
            lowerScreen.getChildren().add(descriptionThree);
        }
        else if(tips[47])
        {
            if(player.getItem(2).getEffectArmor() && !player.getItem(2).getEffectBeast() && !player.getItem(2).getEffectDragon() && !player.getItem(2).getEffectFlying() && !player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(2).getEffectArmor() && player.getItem(2).getEffectBeast() && !player.getItem(2).getEffectDragon() && !player.getItem(2).getEffectFlying() && !player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(2).getEffectArmor() && !player.getItem(2).getEffectBeast() && player.getItem(2).getEffectDragon() && !player.getItem(2).getEffectFlying() && !player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(2).getEffectArmor() && !player.getItem(2).getEffectBeast() && !player.getItem(2).getEffectDragon() && player.getItem(2).getEffectFlying() && !player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(2).getEffectArmor() && !player.getItem(2).getEffectBeast() && !player.getItem(2).getEffectDragon() && !player.getItem(2).getEffectFlying() && player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(2).getEffectArmor() && player.getItem(2).getEffectBeast() && !player.getItem(2).getEffectDragon() && !player.getItem(2).getEffectFlying() && !player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(2).getEffectArmor() && !player.getItem(2).getEffectBeast() && player.getItem(2).getEffectDragon() && !player.getItem(2).getEffectFlying() && !player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(2).getEffectArmor() && !player.getItem(2).getEffectBeast() && !player.getItem(2).getEffectDragon() && player.getItem(2).getEffectFlying() && !player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(2).getEffectArmor() && !player.getItem(2).getEffectBeast() && !player.getItem(2).getEffectDragon() && !player.getItem(2).getEffectFlying() && player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(2).getEffectArmor() && player.getItem(2).getEffectBeast() && player.getItem(2).getEffectDragon() && !player.getItem(2).getEffectFlying() && !player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(2).getEffectArmor() && player.getItem(2).getEffectBeast() && !player.getItem(2).getEffectDragon() && player.getItem(2).getEffectFlying() && !player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(2).getEffectArmor() && player.getItem(2).getEffectBeast() && !player.getItem(2).getEffectDragon() && !player.getItem(2).getEffectFlying() && player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(2).getEffectArmor() && !player.getItem(2).getEffectBeast() && player.getItem(2).getEffectDragon() && player.getItem(2).getEffectFlying() && !player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(2).getEffectArmor() && !player.getItem(2).getEffectBeast() && player.getItem(2).getEffectDragon() && !player.getItem(2).getEffectFlying() && player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(2).getEffectArmor() && !player.getItem(2).getEffectBeast() && !player.getItem(2).getEffectDragon() && player.getItem(2).getEffectFlying() && player.getItem(2).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 635);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 635, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
        }
        if (tips[48])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(2).getSkillOne() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(2).getSkillOne() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 622, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 622);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 638);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        if (tips[49])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(2).getSkillTwo() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(2).getSkillTwo() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 622, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 622);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 638);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        if (tips[50])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(2).getSkillThree() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(2).getSkillThree() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 622, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 622);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 638);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[51] && player.getItem(3).getID() > 0)
        {
            Text descriptionOne = new Text(""); //Add method to give Text for weapons that have an additional description
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Rank: " + getWeaponRank(player.getItem(3).getRank()) + ", Mt: " + player.getItem(3).getMight() + ", Hit: " + player.getItem(3).getHit() + ", Crit: " + player.getItem(3).getCritical() + ", Range: " + player.getItem(3).getMinRange() + "~" + player.getItem(3).getMaxRange() + ", ");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text("Avoid: " + player.getItem(3).getBonusAvoid() + ", Crit Avoid: " + player.getItem(3).getBonusCritAvoid() + ", Kills: " + player.getItem(3).getKills());
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth()), descriptionThree.layoutBoundsProperty().get().getWidth());
            if(descriptionOne.getText().equals(""))
            {
                tipHeight = descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            Rectangle r = new Rectangle(135, 669 - tipHeight, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 654 - tipHeight);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 669 - tipHeight);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(135, 684 - tipHeight);
            lowerScreen.getChildren().add(descriptionThree);
        }
        else if(tips[52])
        {
            if(player.getItem(3).getEffectArmor() && !player.getItem(3).getEffectBeast() && !player.getItem(3).getEffectDragon() && !player.getItem(3).getEffectFlying() && !player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(3).getEffectArmor() && player.getItem(3).getEffectBeast() && !player.getItem(3).getEffectDragon() && !player.getItem(3).getEffectFlying() && !player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(3).getEffectArmor() && !player.getItem(3).getEffectBeast() && player.getItem(3).getEffectDragon() && !player.getItem(3).getEffectFlying() && !player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(3).getEffectArmor() && !player.getItem(3).getEffectBeast() && !player.getItem(3).getEffectDragon() && player.getItem(3).getEffectFlying() && !player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(3).getEffectArmor() && !player.getItem(3).getEffectBeast() && !player.getItem(3).getEffectDragon() && !player.getItem(3).getEffectFlying() && player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(3).getEffectArmor() && player.getItem(3).getEffectBeast() && !player.getItem(3).getEffectDragon() && !player.getItem(3).getEffectFlying() && !player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(3).getEffectArmor() && !player.getItem(3).getEffectBeast() && player.getItem(3).getEffectDragon() && !player.getItem(3).getEffectFlying() && !player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(3).getEffectArmor() && !player.getItem(3).getEffectBeast() && !player.getItem(3).getEffectDragon() && player.getItem(3).getEffectFlying() && !player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(3).getEffectArmor() && !player.getItem(3).getEffectBeast() && !player.getItem(3).getEffectDragon() && !player.getItem(3).getEffectFlying() && player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(3).getEffectArmor() && player.getItem(3).getEffectBeast() && player.getItem(3).getEffectDragon() && !player.getItem(3).getEffectFlying() && !player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(3).getEffectArmor() && player.getItem(3).getEffectBeast() && !player.getItem(3).getEffectDragon() && player.getItem(3).getEffectFlying() && !player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(3).getEffectArmor() && player.getItem(3).getEffectBeast() && !player.getItem(3).getEffectDragon() && !player.getItem(3).getEffectFlying() && player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(3).getEffectArmor() && !player.getItem(3).getEffectBeast() && player.getItem(3).getEffectDragon() && player.getItem(3).getEffectFlying() && !player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(3).getEffectArmor() && !player.getItem(3).getEffectBeast() && player.getItem(3).getEffectDragon() && !player.getItem(3).getEffectFlying() && player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(3).getEffectArmor() && !player.getItem(3).getEffectBeast() && !player.getItem(3).getEffectDragon() && player.getItem(3).getEffectFlying() && player.getItem(3).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 656);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 656, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
        }
        if (tips[53])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(3).getSkillOne() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(3).getSkillOne() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 643, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 643);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 659);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        if (tips[54])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(3).getSkillTwo() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(3).getSkillTwo() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 643, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 643);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 659);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        if (tips[55])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(3).getSkillThree() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(3).getSkillThree() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 643, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 643);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 659);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[56] && player.getItem(4).getID() > 0)
        {
            Text descriptionOne = new Text(""); //Add method to give Text for weapons that have an additional description
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Rank: " + getWeaponRank(player.getItem(4).getRank()) + ", Mt: " + player.getItem(4).getMight() + ", Hit: " + player.getItem(4).getHit() + ", Crit: " + player.getItem(4).getCritical() + ", Range: " + player.getItem(4).getMinRange() + "~" + player.getItem(4).getMaxRange() + ", ");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text("Avoid: " + player.getItem(4).getBonusAvoid() + ", Crit Avoid: " + player.getItem(4).getBonusCritAvoid() + ", Kills: " + player.getItem(4).getKills());
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth()), descriptionThree.layoutBoundsProperty().get().getWidth());
            if(descriptionOne.getText().equals(""))
            {
                tipHeight = descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            Rectangle r = new Rectangle(135, 690 - tipHeight, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 675 - tipHeight);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 690 - tipHeight);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(135, 705 - tipHeight);
            lowerScreen.getChildren().add(descriptionThree);
        }
        else if(tips[57])
        {
            if(player.getItem(4).getEffectArmor() && !player.getItem(4).getEffectBeast() && !player.getItem(4).getEffectDragon() && !player.getItem(4).getEffectFlying() && !player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(4).getEffectArmor() && player.getItem(4).getEffectBeast() && !player.getItem(4).getEffectDragon() && !player.getItem(4).getEffectFlying() && !player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(4).getEffectArmor() && !player.getItem(4).getEffectBeast() && player.getItem(4).getEffectDragon() && !player.getItem(4).getEffectFlying() && !player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(4).getEffectArmor() && !player.getItem(4).getEffectBeast() && !player.getItem(4).getEffectDragon() && player.getItem(4).getEffectFlying() && !player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(4).getEffectArmor() && !player.getItem(4).getEffectBeast() && !player.getItem(4).getEffectDragon() && !player.getItem(4).getEffectFlying() && player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(4).getEffectArmor() && player.getItem(4).getEffectBeast() && !player.getItem(4).getEffectDragon() && !player.getItem(4).getEffectFlying() && !player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(4).getEffectArmor() && !player.getItem(4).getEffectBeast() && player.getItem(4).getEffectDragon() && !player.getItem(4).getEffectFlying() && !player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(4).getEffectArmor() && !player.getItem(4).getEffectBeast() && !player.getItem(4).getEffectDragon() && player.getItem(4).getEffectFlying() && !player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(4).getEffectArmor() && !player.getItem(4).getEffectBeast() && !player.getItem(4).getEffectDragon() && !player.getItem(4).getEffectFlying() && player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(4).getEffectArmor() && player.getItem(4).getEffectBeast() && player.getItem(4).getEffectDragon() && !player.getItem(4).getEffectFlying() && !player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(4).getEffectArmor() && player.getItem(4).getEffectBeast() && !player.getItem(4).getEffectDragon() && player.getItem(4).getEffectFlying() && !player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(4).getEffectArmor() && player.getItem(4).getEffectBeast() && !player.getItem(4).getEffectDragon() && !player.getItem(4).getEffectFlying() && player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(4).getEffectArmor() && !player.getItem(4).getEffectBeast() && player.getItem(4).getEffectDragon() && player.getItem(4).getEffectFlying() && !player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(4).getEffectArmor() && !player.getItem(4).getEffectBeast() && player.getItem(4).getEffectDragon() && !player.getItem(4).getEffectFlying() && player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(4).getEffectArmor() && !player.getItem(4).getEffectBeast() && !player.getItem(4).getEffectDragon() && player.getItem(4).getEffectFlying() && player.getItem(4).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 677);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 677, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
        }
        if (tips[58])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(4).getSkillOne() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(4).getSkillOne() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 664, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 664);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 680);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[59])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(4).getSkillTwo() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(4).getSkillTwo() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 664, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 664);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 680);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        if (tips[60])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(4).getSkillThree() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(4).getSkillThree() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 664, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 664);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 680);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[61] && player.getItem(5).getID() > 0)
        {
            Text descriptionOne = new Text(""); //Add method to give Text for weapons that have an additional description
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Rank: " + getWeaponRank(player.getItem(5).getRank()) + ", Mt: " + player.getItem(5).getMight() + ", Hit: " + player.getItem(5).getHit() + ", Crit: " + player.getItem(5).getCritical() + ", Range: " + player.getItem(5).getMinRange() + "~" + player.getItem(5).getMaxRange() + ", ");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text("Avoid: " + player.getItem(5).getBonusAvoid() + ", Crit Avoid: " + player.getItem(5).getBonusCritAvoid() + ", Kills: " + player.getItem(5).getKills());
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth()), descriptionThree.layoutBoundsProperty().get().getWidth());
            if(descriptionOne.getText().equals(""))
            {
                tipHeight = descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            Rectangle r = new Rectangle(135, 711 - tipHeight, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 696 - tipHeight);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 711 - tipHeight);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(135, 726 - tipHeight);
            lowerScreen.getChildren().add(descriptionThree);
        }
        else if(tips[62])
        {
            if(player.getItem(5).getEffectArmor() && !player.getItem(5).getEffectBeast() && !player.getItem(5).getEffectDragon() && !player.getItem(5).getEffectFlying() && !player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(5).getEffectArmor() && player.getItem(5).getEffectBeast() && !player.getItem(5).getEffectDragon() && !player.getItem(5).getEffectFlying() && !player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(5).getEffectArmor() && !player.getItem(5).getEffectBeast() && player.getItem(5).getEffectDragon() && !player.getItem(5).getEffectFlying() && !player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(5).getEffectArmor() && !player.getItem(5).getEffectBeast() && !player.getItem(5).getEffectDragon() && player.getItem(5).getEffectFlying() && !player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(5).getEffectArmor() && !player.getItem(5).getEffectBeast() && !player.getItem(5).getEffectDragon() && !player.getItem(5).getEffectFlying() && player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(5).getEffectArmor() && player.getItem(5).getEffectBeast() && !player.getItem(5).getEffectDragon() && !player.getItem(5).getEffectFlying() && !player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(5).getEffectArmor() && !player.getItem(5).getEffectBeast() && player.getItem(5).getEffectDragon() && !player.getItem(5).getEffectFlying() && !player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(5).getEffectArmor() && !player.getItem(5).getEffectBeast() && !player.getItem(5).getEffectDragon() && player.getItem(5).getEffectFlying() && !player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(5).getEffectArmor() && !player.getItem(5).getEffectBeast() && !player.getItem(5).getEffectDragon() && !player.getItem(5).getEffectFlying() && player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(5).getEffectArmor() && player.getItem(5).getEffectBeast() && player.getItem(5).getEffectDragon() && !player.getItem(5).getEffectFlying() && !player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(5).getEffectArmor() && player.getItem(5).getEffectBeast() && !player.getItem(5).getEffectDragon() && player.getItem(5).getEffectFlying() && !player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(5).getEffectArmor() && player.getItem(5).getEffectBeast() && !player.getItem(5).getEffectDragon() && !player.getItem(5).getEffectFlying() && player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(5).getEffectArmor() && !player.getItem(5).getEffectBeast() && player.getItem(5).getEffectDragon() && player.getItem(5).getEffectFlying() && !player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(5).getEffectArmor() && !player.getItem(5).getEffectBeast() && player.getItem(5).getEffectDragon() && !player.getItem(5).getEffectFlying() && player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(5).getEffectArmor() && !player.getItem(5).getEffectBeast() && !player.getItem(5).getEffectDragon() && player.getItem(5).getEffectFlying() && player.getItem(5).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 698);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 698, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
        }
        if (tips[63])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(5).getSkillOne() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(5).getSkillOne() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 685, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 685);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 701);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        if (tips[64])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(5).getSkillTwo() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(5).getSkillTwo() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 685, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 685);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 701);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        if (tips[65])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(5).getSkillOne() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(5).getSkillOne() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 685, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 685);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 701);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        else if(tips[66] && player.getItem(6).getID() > 0)
        {
            Text descriptionOne = new Text(""); //Add method to give Text for weapons that have an additional description
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text("Rank: " + getWeaponRank(player.getItem(6).getRank()) + ", Mt: " + player.getItem(6).getMight() + ", Hit: " + player.getItem(6).getHit() + ", Crit: " + player.getItem(6).getCritical() + ", Range: " + player.getItem(6).getMinRange() + "~" + player.getItem(6).getMaxRange() + ", ");
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            Text descriptionThree = new Text("Avoid: " + player.getItem(6).getBonusAvoid() + ", Crit Avoid: " + player.getItem(6).getBonusCritAvoid() + ", Kills: " + player.getItem(6).getKills());
            descriptionThree.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionThree.setFill(Color.WHITE);
            tipLength = Math.max(Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth()), descriptionThree.layoutBoundsProperty().get().getWidth());
            if(descriptionOne.getText().equals(""))
            {
                tipHeight = descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight() + descriptionThree.layoutBoundsProperty().get().getHeight();
            }
            Rectangle r = new Rectangle(135, 732 - tipHeight, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(135, 717 - tipHeight);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(135, 732 - tipHeight);
            lowerScreen.getChildren().add(descriptionTwo);
            descriptionThree.relocate(135, 747 - tipHeight);
            lowerScreen.getChildren().add(descriptionThree);
        }
        else if(tips[67])
        {
            if(player.getItem(6).getEffectArmor() && !player.getItem(6).getEffectBeast() && !player.getItem(6).getEffectDragon() && !player.getItem(6).getEffectFlying() && !player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(6).getEffectArmor() && player.getItem(6).getEffectBeast() && !player.getItem(6).getEffectDragon() && !player.getItem(6).getEffectFlying() && !player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(6).getEffectArmor() && !player.getItem(6).getEffectBeast() && player.getItem(6).getEffectDragon() && !player.getItem(6).getEffectFlying() && !player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(6).getEffectArmor() && !player.getItem(6).getEffectBeast() && !player.getItem(6).getEffectDragon() && player.getItem(6).getEffectFlying() && !player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(6).getEffectArmor() && !player.getItem(6).getEffectBeast() && !player.getItem(6).getEffectDragon() && !player.getItem(6).getEffectFlying() && player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(6).getEffectArmor() && player.getItem(6).getEffectBeast() && !player.getItem(6).getEffectDragon() && !player.getItem(6).getEffectFlying() && !player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Beast Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(6).getEffectArmor() && !player.getItem(6).getEffectBeast() && player.getItem(6).getEffectDragon() && !player.getItem(6).getEffectFlying() && !player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(6).getEffectArmor() && !player.getItem(6).getEffectBeast() && !player.getItem(6).getEffectDragon() && player.getItem(6).getEffectFlying() && !player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(player.getItem(6).getEffectArmor() && !player.getItem(6).getEffectBeast() && !player.getItem(6).getEffectDragon() && !player.getItem(6).getEffectFlying() && player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Armored & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(6).getEffectArmor() && player.getItem(6).getEffectBeast() && player.getItem(6).getEffectDragon() && !player.getItem(6).getEffectFlying() && !player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Dragon Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(6).getEffectArmor() && player.getItem(6).getEffectBeast() && !player.getItem(6).getEffectDragon() && player.getItem(6).getEffectFlying() && !player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(6).getEffectArmor() && player.getItem(6).getEffectBeast() && !player.getItem(6).getEffectDragon() && !player.getItem(6).getEffectFlying() && player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Beast & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(6).getEffectArmor() && !player.getItem(6).getEffectBeast() && player.getItem(6).getEffectDragon() && player.getItem(6).getEffectFlying() && !player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Flying Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(6).getEffectArmor() && !player.getItem(6).getEffectBeast() && player.getItem(6).getEffectDragon() && !player.getItem(6).getEffectFlying() && player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Dragon & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
            else if(!player.getItem(6).getEffectArmor() && !player.getItem(6).getEffectBeast() && !player.getItem(6).getEffectDragon() && player.getItem(6).getEffectFlying() && player.getItem(6).getEffectMonster())
            {
                Text descriptionOne = new Text("Strong Against Flying & Monster Units");
                descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
                descriptionOne.setFill(Color.WHITE);
                descriptionOne.relocate(225, 719);
                tipLength = descriptionOne.layoutBoundsProperty().get().getWidth();
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();
                Rectangle r = new Rectangle(225, 719, tipLength, tipHeight);
                r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
                lowerScreen.getChildren().add(r);
                lowerScreen.getChildren().add(descriptionOne);
            }
        }
        if (tips[68])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(6).getSkillOne() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(6).getSkillOne() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 706, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 706);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 722);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        if (tips[69])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(6).getSkillTwo() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(6).getSkillTwo() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 706, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 706);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 722);
            lowerScreen.getChildren().add(descriptionTwo);
        }
        if (tips[70])
        {
            Text descriptionOne = new Text(sT.getSkillTips(player.getItem(6).getSkillThree() - 1, 0));
            descriptionOne.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionOne.setFill(Color.WHITE);
            Text descriptionTwo = new Text(sT.getSkillTips(player.getItem(6).getSkillThree() - 1, 1));
            descriptionTwo.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
            descriptionTwo.setFill(Color.WHITE);
            tipLength = Math.max(descriptionOne.layoutBoundsProperty().get().getWidth(), descriptionTwo.layoutBoundsProperty().get().getWidth());
            if (!descriptionTwo.getText().equals(""))
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight() + descriptionTwo.layoutBoundsProperty().get().getHeight();
            }
            else
            {
                tipHeight = descriptionOne.layoutBoundsProperty().get().getHeight();

            }
            Rectangle r = new Rectangle(400 - tipLength, 706, tipLength, tipHeight);
            r.setFill(Color.color(0.0f, 0.0f, 0.0f, 0.5f));
            lowerScreen.getChildren().add(r);
            descriptionOne.relocate(400 - tipLength, 706);
            lowerScreen.getChildren().add(descriptionOne);
            descriptionTwo.relocate(400 - tipLength, 722);
            lowerScreen.getChildren().add(descriptionTwo);
        }
    }
}
