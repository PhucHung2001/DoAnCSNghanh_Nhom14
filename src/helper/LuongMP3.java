/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 *
 * @author vietn
 */
public class LuongMP3 extends Thread{
    String URL;
    public LuongMP3(String name){
         this.URL=name;
    }
    
    @Override
    public void run() {
        try {
            while(true){
            FileInputStream fis = new FileInputStream(URL);
                Player playMP3 = new Player(fis);

           
                playMP3.play();
           }
            

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
