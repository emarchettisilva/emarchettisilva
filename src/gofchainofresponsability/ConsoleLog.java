/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofchainofresponsability;

/**
 *
 * @author emarchettisilva
 */
public class ConsoleLog extends AbstractLog {

    public ConsoleLog(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {		
        System.out.println("Console: " + message);
    }
}    