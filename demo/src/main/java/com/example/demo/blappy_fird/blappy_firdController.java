package com.example.demo.blappy_fird;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;


@RestController
@RequestMapping("/play")
public class  blappy_firdController {


    private GameRunner gr;
    ArrayList<String> score;

    public blappy_firdController(GameRunner g) {

        this.gr = g;
        this.score = g.scores();
        System.out.println(g.scores());
    }

    @RequestMapping(value = "/scoreboard")
    public String scoreboard() {
        return "{name: ,current score: " + gr.getcScore() + ", high score: " + gr.gethScore() + "}";
    }
}












//
//
//
//@RestController
//@RequestMapping("/play")
//public class  blappy_firdController {
//
//    private GameRunner gr;
//    ArrayList<String> score;
//
//    public  blappy_firdController(GameRunner g) {
//
//        this.gr = g;
//        this.score = g.scores();
//        System.out.println(g.scores());
//    }
//
//    @RequestMapping(value = "/scoreboard", method = RequestMethod.GET, produces = "application/json")
//        public ArrayList<String> scoreboard(){
//
//        return score;
//        }
//
//
//
//}
//






/*@RestController
@RequestMapping("/play")
public class  blappy_firdController {

    //@RequestMapping(value = "/play", produces = "application/json")
    public int playing() {
        GameRunner gr = new GameRunner();
        gr.gethScore();

        return gr.gethScore();


    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public int getUSer() {
        GameRunner gr = new GameRunner();
        gr.gethScore();

        return gr.gethScore();

    }
}

*/





//    @RequestMapping("/play/score")
//    public void score() {
//        gr.gethScore();
//    }




//@RestController
//@RequestMapping("/game")
//public class blappy_firdController {
//
//    @RequestMapping("/play")
//    public void playing() {
//            GameRunner gr = new GameRunner();
//            gr.playIt();
//
//    }
//    @RequestMapping("/sore")
//    public void score() {
//        GameRunner gr = new GameRunner();
//        gr.playIt();
//
//    }
//
//}

