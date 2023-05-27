package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {

        try(var context =
                    new AnnotationConfigApplicationContext(
                            GamingAppLauncherApplication.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

//        var game = new MarioGame();
//        var game = new SuperContraGame();
//        var game = new PacmanGame();  // 1: Object Creation

//        var gameRunner = new GameRunner(game);
          // 2: Object Creation + Wiring of Dependencies
          // Game is a Dependency of GameRunner

//        gameRunner.run();
    }
}
