package com.eljms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Context ctx = new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String, Strategy> strategyMap = new HashMap<>();
        strategyMap.put("st1", new StrategyImpl1());
        strategyMap.put("st2", new StrategyImpl2());
        strategyMap.put("st3", new StrategyImpl3());
        strategyMap.put("d", new DefaultStrategyImpl());

        while (true) {
            System.out.print("Donner votre stratégie: ");
            String st = scanner.nextLine();
            Strategy strategy = strategyMap.getOrDefault(st, new DefaultStrategyImpl());
            ctx.setStrategy(strategy);
            ctx.perform();
        }
    }
}
