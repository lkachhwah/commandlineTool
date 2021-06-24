package com.json.db.subcommond;


import org.springframework.stereotype.Component;
import picocli.CommandLine;

import static picocli.CommandLine.Command;
import static picocli.CommandLine.RunLast;

@Command(name = "bit")
@Component
public class GitCommand implements Runnable {
   /* public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(new GitCommand());
        commandLine.addSubcommand("add", new GitAddCommand());
        commandLine.parseWithHandler(new RunLast(), args);
    }*/

    @Override
    public void run() {
        System.out.println("The popular git command");
    }
}