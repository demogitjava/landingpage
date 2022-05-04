package de.jgsoftware.landingpage.config.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.io.IOException;


@ShellComponent
public interface i_shellcommands
{
    @ShellMethod("start h2 server --->  start h2 database")
    String startdatabase() throws IOException;

    @ShellMethod("install h2 databases from github with type command --->  idemodatabase getinstall")
    public String idemodatabase(String database);
}
