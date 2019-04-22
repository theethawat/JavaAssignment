package javaam2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RightCorner extends JPanel {
    private Monster monster[];
    private Font f1 = new Font(Font.SANS_SERIF,Font.BOLD,18);

    public RightCorner(Monster monster[]){
        setBorder(new EmptyBorder(0,5,15,15));
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
        int i;
        JLabel head = new JLabel("Monster");
        head.setFont(f1);
        add(head);
        int monsterAmount = monster.length;
        invalidate();
        //Display Monster
        for (i = 0; i<monsterAmount ; i++){


            JLabel monsterLabel = new JLabel(new ImageIcon(getClass().getResource(monster[i].returnImage())));
            monsterLabel.setSize(2,2);
            JLabel monsterName = new JLabel("Name : "+monster[i].returnName());
            JLabel monsterInfo = new JLabel("Health : " + monster[i].returnHealth()+
                    " Damage:"+ monster[i].killDamage());
            JButton kill = new JButton("Kill");
            JLabel level = new JLabel("Level: "+monster[i].returnLevel());
            int finalI = i;
            kill.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    monster[finalI].killed();
                    if(monster[finalI].checkStatus() == false){
                       monsterInfo.setText("Dead");
                    }
                    else{
                        monsterInfo.setText(("Health : " + monster[finalI].returnHealth()+
                                " Damage:"+ monster[finalI].killDamage()));
                        monster[finalI].levelDown();
                        level.setText("Level: "+monster[finalI].returnLevel());
                    }

                    invalidate();
                }
            });

            add(monsterLabel);
            add(monsterName);
            add(monsterInfo);
            add(level);
            add(kill);
        }
    }

}
