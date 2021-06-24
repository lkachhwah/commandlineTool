package com.json.db;

import javax.sql.CommonDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.json.db.subcommond.GitAddCommand;
import com.json.db.subcommond.GitCommand;

import picocli.CommandLine;

@SpringBootApplication
public class DbApplication implements CommandLineRunner{

	 public static void main(String[] args) {
	        SpringApplication.run(DbApplication.class, args);
	       
	        
	    }

	    private GitCommand gitCommand;
	    private GitAddCommand addCommand;
	   
	    @Autowired
	    public DbApplication(GitCommand gitCommand, GitAddCommand addCommand) {
	        this.gitCommand = gitCommand;
	        this.addCommand = addCommand;
	       
	    }

	    @Override
	    public void run(String... args) {
	        CommandLine commandLine = new CommandLine(gitCommand);
	        commandLine.addSubcommand("add", addCommand);
	        commandLine.parseWithHandler(new CommandLine.RunLast(), args);
	    }
}
